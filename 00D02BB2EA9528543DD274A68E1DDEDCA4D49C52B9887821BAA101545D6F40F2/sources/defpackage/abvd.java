package defpackage;
/* compiled from: PG */
/* renamed from: abvd  reason: default package */
/* loaded from: classes2.dex */
public final class abvd {
    private final dzsj<gga> a;
    private final dzsj<dxio<axwy>> b;
    private final dzsj<dxio<afha>> c;
    private final dzsj<cqat> d;

    public abvd(dzsj<gga> dzsjVar, dzsj<dxio<axwy>> dzsjVar2, dzsj<dxio<afha>> dzsjVar3, dzsj<cqat> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
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

    public final abvc a(djrm djrmVar, @dzsi acwt acwtVar, ddho ddhoVar, boolean z, absg absgVar) {
        gga a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        cqat a4 = this.d.a();
        b(a4, 4);
        b(djrmVar, 5);
        b(ddhoVar, 7);
        b(absgVar, 9);
        return new abvc(a, a2, a3, a4, djrmVar, acwtVar, ddhoVar, z, absgVar);
    }
}
