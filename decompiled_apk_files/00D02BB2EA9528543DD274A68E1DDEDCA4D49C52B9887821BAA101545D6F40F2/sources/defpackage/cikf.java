package defpackage;
/* compiled from: PG */
/* renamed from: cikf  reason: default package */
/* loaded from: classes4.dex */
public final class cikf {
    public final dzsj<chyy> a;
    public final dzsj<aybq> b;
    public final dzsj<bnjv> c;
    public final dzsj<begg> d;

    public cikf(dzsj<chyy> dzsjVar, dzsj<aybq> dzsjVar2, dzsj<bnjv> dzsjVar3, dzsj<begg> dzsjVar4) {
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
