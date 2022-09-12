package defpackage;
/* compiled from: PG */
/* renamed from: ckpu  reason: default package */
/* loaded from: classes.dex */
public final class ckpu extends ckox {
    private final dzsj<ckmm> a;
    private final dzsj<ckov> b;

    public ckpu(dzsj<ckmm> dzsjVar, dzsj<ckov> dzsjVar2) {
        c(dzsjVar, 1);
        this.a = dzsjVar;
        c(dzsjVar2, 2);
        this.b = dzsjVar2;
    }

    private static <T> void c(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    @Override // defpackage.ckox
    public final /* bridge */ /* synthetic */ ckoy a(ckpa ckpaVar, dszg dszgVar, ckow ckowVar, boolean z, boolean z2, boolean z3, boolean z4) {
        c(ckpaVar, 1);
        c(dszgVar, 2);
        c(ckowVar, 3);
        ckmm a = this.a.a();
        c(a, 9);
        return new ckpt(ckpaVar, dszgVar, ckowVar, z, z2, z3, z4, a, this.b);
    }
}
