package defpackage;
/* compiled from: PG */
/* renamed from: beya  reason: default package */
/* loaded from: classes3.dex */
public class beya {
    private final dzsj<btvo> a;
    private final dzsj<btrg> b;
    private final dzsj<axwi> c;

    public beya(dzsj<btvo> dzsjVar, dzsj<btrg> dzsjVar2, dzsj<axwi> dzsjVar3) {
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

    public final bexz a(@dzsi bexy bexyVar) {
        btvo a = this.a.a();
        b(a, 1);
        btrg a2 = this.b.a();
        b(a2, 2);
        axwi a3 = this.c.a();
        b(a3, 3);
        return new bexz(a, a2, a3, bexyVar);
    }
}
