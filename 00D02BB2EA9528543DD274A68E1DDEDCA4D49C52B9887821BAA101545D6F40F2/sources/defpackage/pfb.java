package defpackage;
/* compiled from: PG */
/* renamed from: pfb  reason: default package */
/* loaded from: classes7.dex */
public final class pfb<V> {
    public static final pfb<dfoe> a = new pfb<>(pfa.PLACE_VIEWS, dfoe.class);
    public static final pfb<dfoq> b;
    public final pfa c;
    public final Class<V> d;

    static {
        new pfb(pfa.RECENT_SEARCHES_ZERO_SUGGEST, dpte.class);
        b = new pfb<>(pfa.VIEWPORT_UPDATES, dfoq.class);
    }

    public pfb(pfa pfaVar, Class<V> cls) {
        this.c = pfaVar;
        this.d = cls;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(valueOf2);
        return sb.toString();
    }
}
