package com.google.android.apps.gmm.directions.maneuvers;
/* compiled from: PG */
/* loaded from: classes5.dex */
class Maneuvers$BaseTurnManeuver extends Maneuvers$Maneuver {
    private final dpdp e;

    public Maneuvers$BaseTurnManeuver(dgau dgauVar, dpdn dpdnVar, dpdp dpdpVar, boolean z, int i) {
        super(dgauVar, dpdnVar, z, i);
        this.e = dpdpVar;
    }

    @Override // com.google.android.apps.gmm.directions.maneuvers.Maneuvers$Maneuver
    public final boolean a(dgau dgauVar, dpdn dpdnVar, dpdp dpdpVar, int i) {
        return this.e == dpdpVar && super.a(dgauVar, dpdnVar, dpdpVar, i);
    }
}
