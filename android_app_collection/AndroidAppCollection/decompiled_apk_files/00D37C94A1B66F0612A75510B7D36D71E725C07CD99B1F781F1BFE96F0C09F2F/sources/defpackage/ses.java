package defpackage;
/* compiled from: PG */
/* renamed from: ses  reason: default package */
/* loaded from: classes4.dex */
public final class ses {
    public static final ses a = new ses(0.0f);
    private final float b;

    static {
        new ses(0.5f);
        new ses(-0.5f);
    }

    public ses(float f) {
        boolean z = false;
        if (f >= -1.0f && f <= 1.0f) {
            z = true;
        }
        sho.a(z, "rangeBandConfigPercent needs to be between -1 and 1");
        this.b = f;
    }

    public final float a(set setVar, Object obj) {
        return setVar.a(obj) + (setVar.c() * this.b);
    }
}
