package defpackage;
/* compiled from: PG */
/* renamed from: bmmu  reason: default package */
/* loaded from: classes3.dex */
public class bmmu {
    private final dzsj<gga> a;
    private final dzsj<dxio<afha>> b;
    private final dzsj<bmms> c;
    private final dzsj<dxio<begg>> d;

    public bmmu(dzsj<gga> dzsjVar, dzsj<dxio<afha>> dzsjVar2, dzsj<bmms> dzsjVar3, dzsj<dxio<begg>> dzsjVar4) {
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

    public final bmmt a(bwrs<ilo> bwrsVar, boolean z) {
        gga a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        bmms a3 = this.c.a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        b(bwrsVar, 5);
        return new bmmt(a, a2, a3, a4, bwrsVar, z);
    }
}
