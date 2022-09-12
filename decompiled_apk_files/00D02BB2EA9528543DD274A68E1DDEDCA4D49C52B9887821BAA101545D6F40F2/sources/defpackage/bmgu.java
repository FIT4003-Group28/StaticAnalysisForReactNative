package defpackage;
/* compiled from: PG */
/* renamed from: bmgu  reason: default package */
/* loaded from: classes3.dex */
public class bmgu {
    private final dzsj<gga> a;
    private final dzsj<bwqv> b;
    private final dzsj<bmez> c;
    private final dzsj<bmfg> d;

    public bmgu(dzsj<gga> dzsjVar, dzsj<bwqv> dzsjVar2, dzsj<bmez> dzsjVar3, dzsj<bmfg> dzsjVar4) {
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

    public final bmgt a(bwrs<ilo> bwrsVar, bmfa bmfaVar, cjtd cjtdVar) {
        b(bwrsVar, 1);
        b(bmfaVar, 2);
        b(cjtdVar, 3);
        gga a = this.a.a();
        b(a, 4);
        bwqv a2 = this.b.a();
        b(a2, 5);
        bmez a3 = this.c.a();
        b(a3, 6);
        bmfg a4 = this.d.a();
        b(a4, 7);
        return new bmgt(bwrsVar, bmfaVar, cjtdVar, a, a2, a3, a4);
    }
}
