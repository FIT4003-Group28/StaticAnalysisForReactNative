package defpackage;
/* compiled from: PG */
/* renamed from: tmi  reason: default package */
/* loaded from: classes7.dex */
public final class tmi {
    private final dzsj<wuw> a;

    public tmi(dzsj<wuw> dzsjVar) {
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

    public final tmh a(tlv tlvVar, dbsg<amve> dbsgVar) {
        wuw a = this.a.a();
        b(a, 1);
        b(tlvVar, 2);
        b(dbsgVar, 3);
        return new tmh(a, tlvVar, dbsgVar);
    }
}
