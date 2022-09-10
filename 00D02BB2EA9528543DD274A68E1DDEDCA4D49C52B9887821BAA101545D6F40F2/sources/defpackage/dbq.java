package defpackage;
/* compiled from: PG */
/* renamed from: dbq  reason: default package */
/* loaded from: classes5.dex */
public final class dbq {
    public final dzsj<dbo> a;
    public final dzsj<dol> b;
    public final dzsj<djo> c;
    public final dzsj<dbm> d;
    public final dzsj<dnj> e;
    public final dzsj<btrm> f;

    public dbq(dzsj<dbo> dzsjVar, dzsj<dol> dzsjVar2, dzsj<djo> dzsjVar3, dzsj<dbm> dzsjVar4, dzsj<dnj> dzsjVar5, dzsj<btrm> dzsjVar6) {
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
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
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
