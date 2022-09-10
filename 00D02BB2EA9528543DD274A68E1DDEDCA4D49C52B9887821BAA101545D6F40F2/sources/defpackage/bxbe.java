package defpackage;
/* compiled from: PG */
/* renamed from: bxbe  reason: default package */
/* loaded from: classes4.dex */
public final class bxbe {
    private final dzsj<bwsh> a;
    private final dzsj<btvo> b;
    private final dzsj<dxio<bwuy>> c;

    public bxbe(dzsj<bwsh> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<dxio<bwuy>> dzsjVar3) {
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

    public final bxbd a(ddho ddhoVar) {
        bwsh a = this.a.a();
        b(a, 1);
        btvo a2 = this.b.a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        b(ddhoVar, 4);
        return new bxbd(a, a2, a3, ddhoVar);
    }
}
