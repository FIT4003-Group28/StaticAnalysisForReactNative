package defpackage;
/* compiled from: PG */
/* renamed from: bcri  reason: default package */
/* loaded from: classes3.dex */
public final class bcri {
    private final dzsj<gga> a;
    private final dzsj<bwqv> b;
    private final dzsj<dxio<afha>> c;

    public bcri(dzsj<gga> dzsjVar, dzsj<bwqv> dzsjVar2, dzsj<dxio<afha>> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
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

    public final bcrh a(bbvn bbvnVar, btvo btvoVar, @dzsi ilo iloVar) {
        gga a = this.a.a();
        b(a, 1);
        bwqv a2 = this.b.a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        b(bbvnVar, 4);
        b(btvoVar, 5);
        return new bcrh(a, a2, a3, bbvnVar, btvoVar, iloVar);
    }
}
