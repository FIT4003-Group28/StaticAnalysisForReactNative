package defpackage;
/* compiled from: PG */
/* renamed from: cpsn  reason: default package */
/* loaded from: classes5.dex */
public final class cpsn {
    public static final cpsn a = new cpsn(0.0f);
    public static final cpsn b = new cpsn(0.5f);
    private final float c;

    static {
        new cpsn(-0.5f);
    }

    public cpsn(float f) {
        boolean z = false;
        if (f >= -1.0f && f <= 1.0f) {
            z = true;
        }
        cpwl.c(z, "rangeBandConfigPercent needs to be between -1 and 1");
        this.c = f;
    }

    public final <D> float a(cpso<D> cpsoVar, D d) {
        return cpsoVar.s(d) + (cpsoVar.l() * this.c);
    }
}
