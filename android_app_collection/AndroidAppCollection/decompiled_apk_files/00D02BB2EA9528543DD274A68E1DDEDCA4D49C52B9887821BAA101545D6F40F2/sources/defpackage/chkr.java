package defpackage;
/* compiled from: PG */
/* renamed from: chkr  reason: default package */
/* loaded from: classes4.dex */
public final class chkr {
    public final dzsj<btvo> a;
    public final dzsj<chjx> b;
    public final dzsj<chkd> c;
    public final dzsj<chiu> d;

    public chkr(dzsj<btvo> dzsjVar, dzsj<chjx> dzsjVar2, dzsj<chkd> dzsjVar3, dzsj<chiu> dzsjVar4) {
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
