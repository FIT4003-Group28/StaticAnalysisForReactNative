package defpackage;
/* compiled from: PG */
/* renamed from: baih  reason: default package */
/* loaded from: classes3.dex */
public final class baih {
    private final dzsj<cqat> a;
    private final dzsj<cqhn> b;
    private final dzsj<bvsl> c;
    private final dzsj<gga> d;
    private final dzsj<ahjq> e;
    private final dzsj<dxio<begg>> f;
    private final dzsj<dxio<axwo>> g;
    private final dzsj<dxio<axwy>> h;

    public baih(dzsj<cqat> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bvsl> dzsjVar3, dzsj<gga> dzsjVar4, dzsj<ahjq> dzsjVar5, dzsj<dxio<begg>> dzsjVar6, dzsj<dxio<axwo>> dzsjVar7, dzsj<dxio<axwy>> dzsjVar8) {
        d(dzsjVar, 1);
        this.a = dzsjVar;
        d(dzsjVar2, 2);
        this.b = dzsjVar2;
        d(dzsjVar3, 3);
        this.c = dzsjVar3;
        d(dzsjVar4, 4);
        this.d = dzsjVar4;
        d(dzsjVar5, 5);
        this.e = dzsjVar5;
        d(dzsjVar6, 6);
        this.f = dzsjVar6;
        d(dzsjVar7, 7);
        this.g = dzsjVar7;
        d(dzsjVar8, 8);
        this.h = dzsjVar8;
    }

    private static <T> void d(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final baig a(baal baalVar, boolean z, ddho ddhoVar, ddho ddhoVar2) {
        cqat a = this.a.a();
        d(a, 1);
        d(this.b.a(), 2);
        bvsl a2 = this.c.a();
        d(a2, 3);
        gga a3 = this.d.a();
        d(a3, 4);
        ahjq a4 = this.e.a();
        d(a4, 5);
        dxio a5 = ((dxjh) this.f).a();
        d(a5, 6);
        dxio a6 = ((dxjh) this.g).a();
        d(a6, 7);
        d(baalVar, 8);
        d(ddhoVar, 10);
        d(ddhoVar2, 11);
        return new baig(a, a2, a3, a4, a5, a6, baalVar, z, ddhoVar, ddhoVar2);
    }

    public final baig b(azxk azxkVar, boolean z, ddho ddhoVar, ddho ddhoVar2) {
        cqat a = this.a.a();
        d(a, 1);
        d(this.b.a(), 2);
        bvsl a2 = this.c.a();
        d(a2, 3);
        gga a3 = this.d.a();
        d(a3, 4);
        ahjq a4 = this.e.a();
        d(a4, 5);
        dxio a5 = ((dxjh) this.f).a();
        d(a5, 6);
        d(azxkVar, 7);
        d(ddhoVar, 9);
        d(ddhoVar2, 10);
        return new baig(a, a2, a3, a4, a5, azxkVar, z, ddhoVar, ddhoVar2);
    }

    public final baig c(azva azvaVar, boolean z, ddho ddhoVar, ddho ddhoVar2) {
        cqat a = this.a.a();
        d(a, 1);
        d(this.b.a(), 2);
        bvsl a2 = this.c.a();
        d(a2, 3);
        gga a3 = this.d.a();
        d(a3, 4);
        ahjq a4 = this.e.a();
        d(a4, 5);
        dxio a5 = ((dxjh) this.f).a();
        d(a5, 6);
        dxio a6 = ((dxjh) this.h).a();
        d(a6, 7);
        d(azvaVar, 8);
        d(ddhoVar, 10);
        d(ddhoVar2, 11);
        return new baig(a, a2, a3, a4, a5, a6, azvaVar, z, ddhoVar, ddhoVar2);
    }
}
