package defpackage;
/* compiled from: PG */
/* renamed from: cbxu  reason: default package */
/* loaded from: classes4.dex */
public class cbxu {
    private final dzsj<gga> a;

    public cbxu(dzsj<gga> dzsjVar) {
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

    public final cbxt a(cbrx cbrxVar, cbss cbssVar) {
        b(cbrxVar, 1);
        b(cbssVar, 2);
        gga a = this.a.a();
        b(a, 3);
        return new cbxt(cbrxVar, cbssVar, a);
    }
}
