package github.devhrytsan.radialhotbar.utils;

public class MathUtils {

    public static double RelativeAngle(double xA, double yA, double xB, double yB) {
        double atan2 = Math.atan2(yB - yA, xB - xA);
        double angle = Math.toDegrees(atan2);
        //angle = 360 - angle;

        return normalizeAngle(angle);
    }

    public static boolean isAngleBetween(double target, double start, double end) {
        target = normalizeAngle(target);
        start = normalizeAngle(start);
        end = normalizeAngle(end);

        // Determine if the range wraps around the 0/360
        if (start < end) {
            return target >= start && target < end;
        } else {
            return target >= start || target < end;
        }
    }

    public static double normalizeAngle(double angle) {
        angle %= 360;
        if (angle < 0) {
            angle += 360;
        }
        return angle;
    }

    public static double calculateDistanceBetweenPoints(
            double x1,
            double y1,
            double x2,
            double y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }
    public static boolean betweenTwoValues(double variable, double minValueInclusive, double maxValueInclusive) {
        return variable >= minValueInclusive && variable <= maxValueInclusive;
    }
}
