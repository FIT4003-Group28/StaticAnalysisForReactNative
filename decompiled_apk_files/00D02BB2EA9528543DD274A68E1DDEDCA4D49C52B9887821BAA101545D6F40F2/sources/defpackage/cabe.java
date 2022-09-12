package defpackage;
/* compiled from: PG */
/* renamed from: cabe  reason: default package */
/* loaded from: classes4.dex */
public final class cabe {
    public final dzsj<cael> a;
    public final dzsj<cabi> b;
    public final dzsj<cacd> c;
    public final dzsj<cbqg> d;

    public cabe(dzsj<cael> dzsjVar, dzsj<cabi> dzsjVar2, dzsj<cacd> dzsjVar3, dzsj<cbqg> dzsjVar4) {
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
