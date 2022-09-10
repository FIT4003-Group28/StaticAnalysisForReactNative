package defpackage;
/* compiled from: PG */
/* renamed from: beor  reason: default package */
/* loaded from: classes3.dex */
public class beor {
    private final dzsj<bmdq> a;
    private final dzsj<dxio<beii>> b;
    private final dzsj<cqhn> c;
    private final dzsj<cqhu> d;
    private final dzsj<ff> e;
    private final dzsj<bgym> f;

    public beor(dzsj<bmdq> dzsjVar, dzsj<dxio<beii>> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<cqhu> dzsjVar4, dzsj<ff> dzsjVar5, dzsj<bgym> dzsjVar6) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
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

    public final beoq a(String str, @dzsi Integer num, @dzsi bwrs<bvrt<benb>> bwrsVar, dgfy dgfyVar, bwrs<ilo> bwrsVar2, @dzsi Integer num2, boolean z) {
        bmdq a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        cqhn a3 = this.c.a();
        b(a3, 3);
        cqhu a4 = this.d.a();
        b(a4, 4);
        ff ffVar = (ff) ((dxjd) this.e).a;
        b(ffVar, 5);
        bgym a5 = this.f.a();
        b(a5, 6);
        b(str, 7);
        b(dgfyVar, 10);
        b(bwrsVar2, 11);
        return new beoq(a, a2, a3, a4, ffVar, a5, str, num, bwrsVar, dgfyVar, bwrsVar2, num2, z);
    }
}
