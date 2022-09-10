package defpackage;
/* compiled from: PG */
/* renamed from: bpzb  reason: default package */
/* loaded from: classes4.dex */
public final class bpzb {
    private final dzsj<akox> a;
    private final dzsj<alec> b;
    private final dzsj<akpq> c;
    private final dzsj<akzh> d;

    public bpzb(dzsj<akox> dzsjVar, dzsj<alec> dzsjVar2, dzsj<akpq> dzsjVar3, dzsj<akzh> dzsjVar4) {
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

    public final bpza a(bqgw bqgwVar, bpyy bpyyVar) {
        b(bqgwVar, 1);
        b(bpyyVar, 2);
        akox a = this.a.a();
        b(a, 3);
        alec a2 = this.b.a();
        b(a2, 4);
        akpq a3 = this.c.a();
        b(a3, 5);
        akzh a4 = this.d.a();
        b(a4, 6);
        return new bpza(bqgwVar, bpyyVar, a, a2, a3, a4);
    }
}
