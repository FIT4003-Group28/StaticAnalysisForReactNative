package defpackage;
/* compiled from: PG */
/* renamed from: adfg  reason: default package */
/* loaded from: classes.dex */
public final class adfg {
    private final dzsj<acyr> a;
    private final dzsj<dxio<aeaa>> b;
    private final dzsj<adfq> c;

    public adfg(dzsj<acyr> dzsjVar, dzsj<dxio<aeaa>> dzsjVar2, dzsj<adfq> dzsjVar3) {
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

    public final adff a(abse abseVar) {
        acyr a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        adfq a3 = this.c.a();
        b(a3, 3);
        b(abseVar, 4);
        return new adff(a, a2, a3, abseVar);
    }
}
