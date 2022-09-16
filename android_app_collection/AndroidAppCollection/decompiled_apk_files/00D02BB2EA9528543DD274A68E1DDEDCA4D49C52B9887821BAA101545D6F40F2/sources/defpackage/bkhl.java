package defpackage;
/* compiled from: PG */
/* renamed from: bkhl  reason: default package */
/* loaded from: classes3.dex */
public class bkhl {
    private final dzsj<dxio<aesb>> a;
    private final dzsj<dxio<boxa>> b;
    private final dzsj<dxio<apun>> c;
    private final dzsj<btvo> d;
    private final dzsj<bhat> e;

    public bkhl(dzsj<dxio<aesb>> dzsjVar, dzsj<dxio<boxa>> dzsjVar2, dzsj<dxio<apun>> dzsjVar3, dzsj<btvo> dzsjVar4, dzsj<bhat> dzsjVar5) {
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

    public final bkhk a(bwrs<ilo> bwrsVar, dobf dobfVar, apum apumVar, ddho ddhoVar, int i, CharSequence charSequence) {
        dxio a = ((dxjh) this.a).a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        btvo a4 = this.d.a();
        b(a4, 4);
        bhat a5 = this.e.a();
        b(a5, 5);
        b(bwrsVar, 6);
        b(dobfVar, 7);
        b(apumVar, 8);
        b(ddhoVar, 9);
        b(charSequence, 11);
        return new bkhk(a, a2, a3, a4, a5, bwrsVar, dobfVar, apumVar, ddhoVar, i, charSequence);
    }
}
