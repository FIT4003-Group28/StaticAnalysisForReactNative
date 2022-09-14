package defpackage;
/* compiled from: PG */
/* renamed from: qgk  reason: default package */
/* loaded from: classes7.dex */
public final class qgk implements qgl {
    private final dzsj<vnq> a;
    private final dzsj<btrm> b;

    public qgk(dzsj<vnq> dzsjVar, dzsj<btrm> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
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

    @Override // defpackage.qgl
    public final /* bridge */ /* synthetic */ akvo a(vwm vwmVar, qhq qhqVar, qhq qhqVar2, qgn qgnVar) {
        vnq a = this.a.a();
        b(a, 1);
        btrm a2 = this.b.a();
        b(a2, 2);
        b(vwmVar, 3);
        b(qhqVar, 4);
        b(qhqVar2, 5);
        b(qgnVar, 6);
        return new qgj(a, a2, vwmVar, qhqVar, qhqVar2, qgnVar);
    }
}
