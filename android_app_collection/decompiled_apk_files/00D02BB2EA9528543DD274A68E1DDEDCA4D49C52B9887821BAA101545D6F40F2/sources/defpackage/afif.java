package defpackage;
/* compiled from: PG */
/* renamed from: afif  reason: default package */
/* loaded from: classes2.dex */
public enum afif {
    HAZARD_CONSTRUCTION("hazard_type", 11),
    HAZARD_VEHICLE("hazard_type", 9),
    HAZARD_OBJECT_ON_ROAD("hazard_type", 12),
    ROAD_CLOSURE_PARTIAL("road_closure", 2),
    ROAD_CLOSURE_FULL("road_closure", 1);
    
    public final String f;
    public final int g;

    afif(String str, int i) {
        this.f = str;
        this.g = i;
    }
}
