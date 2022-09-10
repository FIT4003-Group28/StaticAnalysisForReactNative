package defpackage;
/* compiled from: PG */
/* renamed from: cdem  reason: default package */
/* loaded from: classes4.dex */
public class cdem {
    private final dzsj<gga> a;

    public cdem(dzsj<gga> dzsjVar) {
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

    public final cdel a(cdbb cdbbVar, cdek cdekVar, cdai cdaiVar) {
        b(cdbbVar, 1);
        b(cdekVar, 2);
        b(cdaiVar, 3);
        gga a = this.a.a();
        b(a, 4);
        return new cdel(cdbbVar, cdekVar, cdaiVar, a);
    }
}
