package defpackage;
/* compiled from: PG */
/* renamed from: betm  reason: default package */
/* loaded from: classes3.dex */
public class betm {
    private final dzsj<gga> a;
    private final dzsj<beqf> b;
    private final dzsj<btvo> c;
    private final dzsj<betk> d;

    public betm(dzsj<gga> dzsjVar, dzsj<beqf> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<betk> dzsjVar4) {
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

    public final betl a(ccln cclnVar, bwrs<ilo> bwrsVar, boolean z, @dzsi beqn beqnVar, int i) {
        gga a = this.a.a();
        b(a, 1);
        beqf a2 = this.b.a();
        b(a2, 2);
        btvo a3 = this.c.a();
        b(a3, 3);
        betk a4 = this.d.a();
        b(a4, 4);
        b(cclnVar, 5);
        b(bwrsVar, 6);
        return new betl(a, a2, a3, a4, cclnVar, bwrsVar, z, beqnVar, i);
    }
}
