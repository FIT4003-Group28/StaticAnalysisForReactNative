package defpackage;
/* compiled from: PG */
/* renamed from: bhuh  reason: default package */
/* loaded from: classes3.dex */
public class bhuh {
    private final dzsj<btvo> a;
    private final dzsj<bhhf> b;
    private final dzsj<bhtz> c;
    private final dzsj<cjcw> d;

    public bhuh(dzsj<btvo> dzsjVar, dzsj<bhhf> dzsjVar2, dzsj<bhtz> dzsjVar3, dzsj<cjcw> dzsjVar4) {
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

    public final bhug a(cdjd cdjdVar, dvxh dvxhVar, boolean z, bwrs<ilo> bwrsVar, cjcs cjcsVar) {
        b(cdjdVar, 1);
        b(dvxhVar, 2);
        b(bwrsVar, 4);
        b(cjcsVar, 5);
        btvo a = this.a.a();
        b(a, 6);
        bhhf a2 = this.b.a();
        b(a2, 7);
        bhtz a3 = this.c.a();
        b(a3, 8);
        cjcw a4 = this.d.a();
        b(a4, 9);
        return new bhug(cdjdVar, dvxhVar, z, bwrsVar, cjcsVar, a, a2, a3, a4);
    }
}
