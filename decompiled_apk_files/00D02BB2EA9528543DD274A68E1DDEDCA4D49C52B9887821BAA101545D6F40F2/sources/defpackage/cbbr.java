package defpackage;
/* compiled from: PG */
/* renamed from: cbbr  reason: default package */
/* loaded from: classes4.dex */
public final class cbbr {
    public final dzsj<cbbc> a;
    public final dzsj<cqhn> b;
    public final dzsj<cbqd> c;
    public final dzsj<gga> d;

    public cbbr(dzsj<cbbc> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cbqd> dzsjVar3, dzsj<gga> dzsjVar4) {
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
