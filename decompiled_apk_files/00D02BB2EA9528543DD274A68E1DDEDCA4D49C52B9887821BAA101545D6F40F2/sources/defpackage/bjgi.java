package defpackage;
/* compiled from: PG */
/* renamed from: bjgi  reason: default package */
/* loaded from: classes3.dex */
public class bjgi {
    private final dzsj<gdc> a;

    public bjgi(dzsj<gdc> dzsjVar) {
        c(dzsjVar, 1);
        this.a = dzsjVar;
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

    public final bjgh a(bwrs<ilo> bwrsVar) {
        gdc a = this.a.a();
        c(a, 1);
        c(bwrsVar, 2);
        ilo c = bwrsVar.c();
        dbsk.s(c);
        return new bjgh(a, c);
    }

    public final bjgh b(ilo iloVar) {
        gdc a = this.a.a();
        c(a, 1);
        c(iloVar, 2);
        return new bjgh(a, iloVar);
    }
}
