package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btmu  reason: default package */
/* loaded from: classes4.dex */
public enum btmu {
    COMPLETE(0.0f, 0, ckip.s, ckip.t, true),
    MODERATE(0.5f, 1, ckip.u, ckip.v, true),
    BACKGROUND(1.0f, 2, ckip.w, ckip.x, true),
    UI_HIDDEN(1.0f, 3, ckip.y, ckip.z, true),
    RUNNING_CRITICAL(0.0f, 4, ckip.A, ckip.B, false),
    RUNNING_LOW(0.5f, 5, ckip.C, ckip.D, false),
    RUNNING_MODERATE(0.7f, 6, ckip.E, ckip.F, false),
    THRESHOLD_REACHED(0.8f, 7, ckip.G, ckip.H, false);
    
    public final float i;
    public final int j;
    public final ckgz k;
    public final ckgz l;
    public final boolean m;

    btmu(float f, int i, ckgz ckgzVar, ckgz ckgzVar2, boolean z) {
        this.i = f;
        this.j = i;
        this.k = ckgzVar;
        this.l = ckgzVar2;
        this.m = z;
    }
}
