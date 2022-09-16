package defpackage;
/* compiled from: PG */
/* renamed from: aywv  reason: default package */
/* loaded from: classes3.dex */
public final class aywv {
    public final dzsj<gga> a;
    public final dzsj<cjqy> b;
    public final dzsj<jmx> c;

    public aywv(dzsj<gga> dzsjVar, dzsj<cjqy> dzsjVar2, dzsj<jmx> dzsjVar3) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
