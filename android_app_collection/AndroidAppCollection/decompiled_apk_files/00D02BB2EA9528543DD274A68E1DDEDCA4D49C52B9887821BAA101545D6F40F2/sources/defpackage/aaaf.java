package defpackage;
/* compiled from: PG */
/* renamed from: aaaf  reason: default package */
/* loaded from: classes2.dex */
public final class aaaf {
    private final dzsj<bgdt> a;
    private final dzsj<bgea> b;
    private final dzsj<begg> c;
    private final dzsj<bego> d;

    public aaaf(dzsj<bgdt> dzsjVar, dzsj<bgea> dzsjVar2, dzsj<begg> dzsjVar3, dzsj<bego> dzsjVar4) {
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

    public final aaae a(bwrs<ilo> bwrsVar, aaag aaagVar) {
        b(bwrsVar, 1);
        b(aaagVar, 2);
        bgdt a = this.a.a();
        b(a, 3);
        bgea a2 = this.b.a();
        b(a2, 4);
        begg a3 = this.c.a();
        b(a3, 5);
        bego a4 = this.d.a();
        b(a4, 6);
        return new aaae(bwrsVar, aaagVar, a, a2, a3, a4);
    }
}
