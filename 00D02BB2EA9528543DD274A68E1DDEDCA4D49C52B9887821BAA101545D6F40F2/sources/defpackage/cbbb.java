package defpackage;
/* compiled from: PG */
/* renamed from: cbbb  reason: default package */
/* loaded from: classes4.dex */
public final class cbbb {
    public final dzsj<cqhn> a;
    public final dzsj<cjqy> b;
    public final dzsj<gga> c;
    public final dzsj<cqkj> d;

    public cbbb(dzsj<cqhn> dzsjVar, dzsj<cjqy> dzsjVar2, dzsj<gga> dzsjVar3, dzsj<cqkj> dzsjVar4) {
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
