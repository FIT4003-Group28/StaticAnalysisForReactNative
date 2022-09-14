package defpackage;
/* compiled from: PG */
/* renamed from: cdi  reason: default package */
/* loaded from: classes.dex */
public abstract class cdi {
    public static final cdi a = new cdd();
    public static final cdi b = new cdg();
    public static final cdi c = new cde();
    public static final cdi d;
    public static final cdi e;
    public static final cdi f;
    public static final btz<cdi> g;
    static final boolean h;

    static {
        cdf cdfVar = new cdf();
        d = cdfVar;
        e = new cdh();
        f = cdfVar;
        g = btz.b("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", cdfVar);
        h = true;
    }

    public abstract float a(int i, int i2, int i3, int i4);

    public abstract int b(int i, int i2, int i3, int i4);
}
