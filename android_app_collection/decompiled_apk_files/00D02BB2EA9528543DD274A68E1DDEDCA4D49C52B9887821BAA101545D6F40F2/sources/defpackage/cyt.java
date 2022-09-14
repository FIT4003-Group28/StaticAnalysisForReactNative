package defpackage;
/* compiled from: PG */
/* renamed from: cyt  reason: default package */
/* loaded from: classes5.dex */
public class cyt {
    private final dzsj<gga> a;
    private final dzsj<cyi> b;
    private final dzsj<isd> c;

    public cyt(dzsj<gga> dzsjVar, dzsj<cyi> dzsjVar2, dzsj<isd> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
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

    public final cys a() {
        gga a = this.a.a();
        b(a, 1);
        cyi a2 = this.b.a();
        b(a2, 2);
        isd a3 = this.c.a();
        b(a3, 3);
        return new cys(a, a2, a3);
    }
}
