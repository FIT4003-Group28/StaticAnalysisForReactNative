package defpackage;
/* compiled from: PG */
/* renamed from: ixb  reason: default package */
/* loaded from: classes6.dex */
public class ixb {
    private final dzsj<bhhf> a;
    private final dzsj<ff> b;
    private final dzsj<aput> c;

    public ixb(dzsj<bhhf> dzsjVar, dzsj<ff> dzsjVar2, dzsj<aput> dzsjVar3) {
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

    public final ixa a(bwrs<ilo> bwrsVar, cdjd cdjdVar) {
        b(bwrsVar, 1);
        b(cdjdVar, 2);
        bhhf a = this.a.a();
        b(a, 3);
        ff ffVar = (ff) ((dxjd) this.b).a;
        b(ffVar, 4);
        aput a2 = this.c.a();
        b(a2, 5);
        return new ixa(bwrsVar, cdjdVar, a, ffVar, a2);
    }
}
