package defpackage;
/* compiled from: PG */
/* renamed from: blkr  reason: default package */
/* loaded from: classes3.dex */
public class blkr {
    public static final blkq a(String str, dbsg<djck> dbsgVar, Iterable<drew> iterable, boolean z, dbsg<CharSequence> dbsgVar2) {
        b(str, 1);
        b(dbsgVar, 2);
        b(iterable, 3);
        b(dbsgVar2, 5);
        return new blkq(str, dbsgVar, iterable, z, dbsgVar2);
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
}
