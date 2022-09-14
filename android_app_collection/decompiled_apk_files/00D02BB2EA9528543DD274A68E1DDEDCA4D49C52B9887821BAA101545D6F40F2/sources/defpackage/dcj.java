package defpackage;
/* compiled from: PG */
/* renamed from: dcj  reason: default package */
/* loaded from: classes5.dex */
public final class dcj implements czy {
    private final dzsj<dci> a;

    public dcj(dzsj<dci> dzsjVar) {
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
        dci a = this.a.a();
        b(a, 1);
        b(ggaVar, 2);
        b(czhVar, 3);
        return new dcg(a, ggaVar, czhVar);
    }
}
