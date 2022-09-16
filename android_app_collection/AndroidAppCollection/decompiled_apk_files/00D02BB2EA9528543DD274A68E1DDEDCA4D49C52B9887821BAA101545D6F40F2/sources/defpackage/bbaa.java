package defpackage;
/* compiled from: PG */
/* renamed from: bbaa  reason: default package */
/* loaded from: classes3.dex */
public final class bbaa {
    private final dzsj<gga> a;
    private final dzsj<begg> b;
    private final dzsj<bfcd> c;
    private final dzsj<bnhs> d;

    public bbaa(dzsj<gga> dzsjVar, dzsj<begg> dzsjVar2, dzsj<bfcd> dzsjVar3, dzsj<bnhs> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final bazz a(baal baalVar, bexz bexzVar) {
        gga a = this.a.a();
        b(a, 1);
        begg a2 = this.b.a();
        b(a2, 2);
        bfcd a3 = this.c.a();
        b(a3, 3);
        bnhs a4 = this.d.a();
        b(a4, 4);
        b(baalVar, 5);
        b(bexzVar, 6);
        return new bazz(a, a2, a3, a4, baalVar, bexzVar);
    }
}
