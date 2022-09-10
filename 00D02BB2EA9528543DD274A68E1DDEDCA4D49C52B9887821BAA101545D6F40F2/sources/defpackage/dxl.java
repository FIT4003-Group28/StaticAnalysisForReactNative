package defpackage;
/* compiled from: PG */
/* renamed from: dxl  reason: default package */
/* loaded from: classes6.dex */
public final class dxl implements czy {
    private final dzsj<dxk> a;

    public dxl(dzsj<dxk> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
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

    @Override // defpackage.czy
    public final /* bridge */ /* synthetic */ czx a(gga ggaVar, czh czhVar) {
        dxk a = this.a.a();
        b(a, 1);
        b(ggaVar, 2);
        b(czhVar, 3);
        return new dxh(a, ggaVar, czhVar);
    }
}
