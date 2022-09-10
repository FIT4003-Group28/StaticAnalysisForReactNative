package defpackage;
/* compiled from: PG */
/* renamed from: ckau  reason: default package */
/* loaded from: classes4.dex */
public final class ckau {
    public static final dbty<cqiw<bhtu>> a = new cjzz();
    public static final dbty<cqiw<bwod>> b = new ckaa();
    public static final dbty<cqiw<jam>> c = new ckab();
    public static final dbty<cqiw<zej>> d = new ckac();
    public static final dbty<cqiw<yyb>> e = new ckad();
    public static final dbty<cqiw<oxo>> f = new ckae();
    public static final dbty<cqiw<oxn>> g = new ckaf();
    public static final dbty<cqiw<oxy>> h = new ckag();
    public static final dbty<cqiw<oxl>> i = new ckah();
    public static final dbty<cqiw<jbj>> j = new cjzx();
    public static final dbty<cqiw<izm>> k = new cjzy();
    public static final dbty<cqiw<izm>> l = dbud.a(cjzw.a);

    public static <V extends cqkp> cqiw<V> a(Object obj) {
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("No layout for: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
