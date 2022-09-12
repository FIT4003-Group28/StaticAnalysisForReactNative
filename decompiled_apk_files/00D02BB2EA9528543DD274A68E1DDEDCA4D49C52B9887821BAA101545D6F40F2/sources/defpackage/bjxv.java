package defpackage;
/* compiled from: PG */
/* renamed from: bjxv  reason: default package */
/* loaded from: classes3.dex */
public class bjxv {
    private final dzsj<gga> a;

    public bjxv(dzsj<gga> dzsjVar) {
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

    public final bjxu a(ilo iloVar, djag djagVar, String str, boolean z) {
        gga a = this.a.a();
        b(a, 1);
        b(iloVar, 2);
        b(djagVar, 3);
        b(str, 4);
        return new bjxu(a, iloVar, djagVar, str, z);
    }
}
