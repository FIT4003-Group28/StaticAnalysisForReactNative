package defpackage;
/* compiled from: PG */
/* renamed from: bkaa  reason: default package */
/* loaded from: classes3.dex */
public final class bkaa {
    private final dzsj<cqhn> a;

    public bkaa(dzsj<cqhn> dzsjVar) {
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

    public final bjzz a(bwrs<ilo> bwrsVar, ddde dddeVar) {
        b(this.a.a(), 1);
        b(bwrsVar, 2);
        b(dddeVar, 3);
        return new bjzz(bwrsVar, dddeVar);
    }
}
