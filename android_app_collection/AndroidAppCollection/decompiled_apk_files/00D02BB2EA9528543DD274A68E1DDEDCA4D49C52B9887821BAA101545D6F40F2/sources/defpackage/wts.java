package defpackage;
/* compiled from: PG */
/* renamed from: wts  reason: default package */
/* loaded from: classes7.dex */
public class wts {
    private final dzsj<vwv> a;
    private final dzsj<vxa> b;
    private final dzsj<ahjq> c;
    private final dzsj<dxio<ascb>> d;
    private final dzsj<dxio<vzi>> e;

    public wts(dzsj<vwv> dzsjVar, dzsj<vxa> dzsjVar2, dzsj<ahjq> dzsjVar3, dzsj<dxio<ascb>> dzsjVar4, dzsj<dxio<vzi>> dzsjVar5) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
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

    public final wtr a(amub amubVar) {
        vwv a = this.a.a();
        b(a, 1);
        vxa a2 = this.b.a();
        b(a2, 2);
        ahjq a3 = this.c.a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        dxio a5 = ((dxjh) this.e).a();
        b(a5, 5);
        b(amubVar, 6);
        return new wtr(a, a2, a3, a4, a5, amubVar);
    }
}
