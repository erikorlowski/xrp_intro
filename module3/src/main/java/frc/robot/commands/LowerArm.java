// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Arm;

public class LowerArm extends Command {
  Arm arm = RobotContainer.arm;

  public LowerArm() {
    addRequirements(arm);
  }

  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    arm.setArmAngle(0);
  }

  @Override
  public void end(boolean interrupted) {}
  @Override
  public boolean isFinished() {return false;}
}

