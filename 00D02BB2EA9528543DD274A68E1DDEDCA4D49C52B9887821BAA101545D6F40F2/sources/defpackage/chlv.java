package defpackage;
/* compiled from: PG */
/* renamed from: chlv  reason: default package */
/* loaded from: classes4.dex */
public final class chlv {
    public final dzsj<cchz> a;
    public final dzsj<btvo> b;
    public final dzsj<chjx> c;
    public final dzsj<chkd> d;
    public final dzsj<chiu> e;

    public chlv(dzsj<cchz> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<chjx> dzsjVar3, dzsj<chkd> dzsjVar4, dzsj<chiu> dzsjVar5) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
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
