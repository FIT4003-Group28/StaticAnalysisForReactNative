package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class EarthPose {
    private final double altitudeMeters;
    private final Quaternion eusQGlCamera;
    private final double headingAccuracyDegrees;
    private final double headingDegrees;
    private final double latitudeDegrees;
    private final double locationAccuracyMeters;
    private final double longitudeDegrees;
    private final int poseConfidence;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum EarthPoseConfidence {
        LEVEL_0(0),
        LEVEL_1(1),
        LEVEL_2(2),
        LEVEL_3(3),
        LEVEL_4(4);
        
        final int nativeCode;

        EarthPoseConfidence(int i) {
            this.nativeCode = i;
        }

        static EarthPoseConfidence forNumber(int i) {
            EarthPoseConfidence[] values;
            for (EarthPoseConfidence earthPoseConfidence : values()) {
                if (earthPoseConfidence.nativeCode == i) {
                    return earthPoseConfidence;
                }
            }
            StringBuilder sb = new StringBuilder(66);
            sb.append("Unexpected value for native EarthPoseConfidence, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public boolean isAtLeast(EarthPoseConfidence earthPoseConfidence) {
            return this.nativeCode >= earthPoseConfidence.nativeCode;
        }
    }

    public EarthPose(double d, double d2, double d3, double d4) {
        this(d, d2, d3, d4, 0, dcyn.a, dcyn.a, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    public double getAltitudeMeters() {
        return this.altitudeMeters;
    }

    public EarthPoseConfidence getConfidence() {
        return EarthPoseConfidence.forNumber(this.poseConfidence);
    }

    public float[] getDisplayOrientedQuaternion() {
        Quaternion quaternion = this.eusQGlCamera;
        return new float[]{quaternion.x, quaternion.y, quaternion.z, quaternion.w};
    }

    public double getHeadingAccuracyDegrees() {
        return this.headingAccuracyDegrees;
    }

    public double getHeadingDegrees() {
        return this.headingDegrees;
    }

    public double getLatitudeDegrees() {
        return this.latitudeDegrees;
    }

    public double getLocationAccuracyMeters() {
        return this.locationAccuracyMeters;
    }

    public double getLongitudeDegrees() {
        return this.longitudeDegrees;
    }

    public EarthPose(double d, double d2, double d3, double d4, int i, double d5, double d6, float f, float f2, float f3, float f4) {
        this.latitudeDegrees = d;
        this.longitudeDegrees = d2;
        this.altitudeMeters = d3;
        this.headingDegrees = d4;
        this.poseConfidence = i;
        this.headingAccuracyDegrees = d5;
        this.locationAccuracyMeters = d6;
        this.eusQGlCamera = new Quaternion(f, f2, f3, f4);
    }
}
