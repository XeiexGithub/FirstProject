package frc.robot.subsystems.turning;

public interface TurningIO {
    public static class SwerveData {
        double positionRad = 0;
    }

    public default void updateData(SwerveData data){
    };

    public default void setVoltage(double volts){
    };
}
