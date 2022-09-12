package defpackage;
/* compiled from: PG */
/* renamed from: bqag  reason: default package */
/* loaded from: classes4.dex */
public final class bqag {
    private final dzsj<dxio<akpm>> a;
    private final dzsj<bnyo> b;
    private final dzsj<cqat> c;
    private final dzsj<bvrb> d;

    public bqag(dzsj<dxio<akpm>> dzsjVar, dzsj<bnyo> dzsjVar2, dzsj<cqat> dzsjVar3, dzsj<bvrb> dzsjVar4) {
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

    public final bqaf a(bqad bqadVar) {
        b(bqadVar, 1);
        dxio a = ((dxjh) this.a).a();
        b(a, 2);
        bnyo a2 = this.b.a();
        b(a2, 3);
        cqat a3 = this.c.a();
        b(a3, 4);
        bvrb a4 = this.d.a();
        b(a4, 5);
        return new bqaf(bqadVar, a, a2, a3, a4);
    }
}
