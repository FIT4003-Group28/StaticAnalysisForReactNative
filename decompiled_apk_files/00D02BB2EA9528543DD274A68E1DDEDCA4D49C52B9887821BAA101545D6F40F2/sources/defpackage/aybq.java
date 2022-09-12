package defpackage;
/* compiled from: PG */
/* renamed from: aybq  reason: default package */
/* loaded from: classes3.dex */
public final class aybq {
    private final dzsj<gga> a;
    private final dzsj<bbtu> b;
    private final dzsj<dxio<bdhl>> c;

    public aybq(dzsj<gga> dzsjVar, dzsj<bbtu> dzsjVar2, dzsj<dxio<bdhl>> dzsjVar3) {
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

    public final aybp a(baal baalVar, bnju bnjuVar) {
        gga a = this.a.a();
        b(a, 1);
        bbtu a2 = this.b.a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        b(baalVar, 4);
        return new aybp(a, a2, a3, baalVar, bnjuVar);
    }
}
