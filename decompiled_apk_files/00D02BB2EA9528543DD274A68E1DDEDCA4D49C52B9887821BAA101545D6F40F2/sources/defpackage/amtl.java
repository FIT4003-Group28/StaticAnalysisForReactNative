package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amtl  reason: default package */
/* loaded from: classes2.dex */
public enum amtl {
    DISTANCE_FROM_START_METERS(amtj.a, true),
    ETA_SECONDS(amtk.a, false);
    
    public final boolean c;
    private final dbrn<amti, Integer> d;

    amtl(dbrn dbrnVar, boolean z) {
        this.d = dbrnVar;
        this.c = z;
    }

    public final double a(amti amtiVar) {
        return this.d.a(amtiVar).intValue();
    }
}
