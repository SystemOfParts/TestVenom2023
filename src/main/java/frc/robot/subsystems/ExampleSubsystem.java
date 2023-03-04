// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.playingwithfusion.CANVenom;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private final CANVenom venom1;
  private final CANVenom venom2;
  private final CANVenom venom3;
  private final CANVenom venom4;
  private final CANVenom venom5;

  public ExampleSubsystem() {
    venom1 = new CANVenom(6);
    venom2 = new CANVenom(7);
    venom3 = new CANVenom(8);
    venom4 = new CANVenom(9);
    venom5 = new CANVenom(10);
  }


  public void exampleCommand() {
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public CommandBase exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          venom1.set(0.25);
          venom2.set(0.25);
          venom3.set(0.25);
          venom4.set(0.25);
          venom5.set(0.25);
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
