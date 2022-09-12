package com.google.android.apps.gmm.directions.maneuvers;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Maneuvers$RoundaboutManeuver extends Maneuvers$Maneuver {
    public final dpdp e;

    public Maneuvers$RoundaboutManeuver(dgau dgauVar, dpdn dpdnVar, dpdp dpdpVar, boolean z, int i) {
        super(dgauVar, dpdnVar, z, i);
        this.e = dpdpVar;
    }

    public Maneuvers$RoundaboutManeuver(dpdn dpdnVar, dpdp dpdpVar, boolean z, int i) {
        this(dgau.ROUNDABOUT_ENTER_AND_EXIT, dpdnVar, dpdpVar, z, i);
    }
}
