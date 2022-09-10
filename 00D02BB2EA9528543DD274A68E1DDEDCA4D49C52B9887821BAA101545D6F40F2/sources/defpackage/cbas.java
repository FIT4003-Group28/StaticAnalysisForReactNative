package defpackage;
/* compiled from: PG */
/* renamed from: cbas  reason: default package */
/* loaded from: classes4.dex */
public final class cbas {
    public final dzsj<cbbc> a;
    public final dzsj<cqhn> b;
    public final dzsj<gga> c;
    public final dzsj<cbqd> d;

    public cbas(dzsj<cbbc> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<gga> dzsjVar3, dzsj<cbqd> dzsjVar4) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
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
