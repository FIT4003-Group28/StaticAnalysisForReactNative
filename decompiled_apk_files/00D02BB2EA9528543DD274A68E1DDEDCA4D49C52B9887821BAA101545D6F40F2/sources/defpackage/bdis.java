package defpackage;
/* compiled from: PG */
/* renamed from: bdis  reason: default package */
/* loaded from: classes3.dex */
public class bdis {
    private final dzsj<gga> a;
    private final dzsj<cqhn> b;

    public bdis(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2) {
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

    public final bdir a(dwfl dwflVar, int i, bdhf bdhfVar, boolean z, bdip bdipVar) {
        gga a = this.a.a();
        b(a, 1);
        cqhn a2 = this.b.a();
        b(a2, 2);
        b(dwflVar, 3);
        b(bdhfVar, 5);
        b(bdipVar, 7);
        return new bdir(a, a2, dwflVar, i, bdhfVar, z, bdipVar);
    }
}
