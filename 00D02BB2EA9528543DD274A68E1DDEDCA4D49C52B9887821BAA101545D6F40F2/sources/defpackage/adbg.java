package defpackage;
/* compiled from: PG */
/* renamed from: adbg  reason: default package */
/* loaded from: classes.dex */
public final class adbg {
    private final dzsj<dxio<akla>> a;
    private final dzsj<acyr> b;
    private final dzsj<btvo> c;
    private final dzsj<cbqg> d;
    private final dzsj<cbea> e;

    public adbg(dzsj<dxio<akla>> dzsjVar, dzsj<acyr> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<cbqg> dzsjVar4, dzsj<cbea> dzsjVar5) {
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

    public final adbf a(dpwr dpwrVar, absg absgVar) {
        b(dpwrVar, 1);
        b(absgVar, 2);
        dxio a = ((dxjh) this.a).a();
        b(a, 3);
        acyr a2 = this.b.a();
        b(a2, 4);
        btvo a3 = this.c.a();
        b(a3, 5);
        cbqg a4 = this.d.a();
        b(a4, 6);
        cbea a5 = this.e.a();
        b(a5, 7);
        return new adbf(dpwrVar, absgVar, a, a2, a3, a4, a5);
    }
}
