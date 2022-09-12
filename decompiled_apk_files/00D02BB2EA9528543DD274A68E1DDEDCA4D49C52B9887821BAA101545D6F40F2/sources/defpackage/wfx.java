package defpackage;
/* compiled from: PG */
/* renamed from: wfx  reason: default package */
/* loaded from: classes7.dex */
public class wfx {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<dxio<axwy>> c;
    public final dzsj<dxio<wgb>> d;
    public final dzsj<cjqq> e;
    public final dzsj<cjqy> f;
    public final dzsj<wdw> g;
    public final dzsj<ania> h;

    public wfx(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<dxio<axwy>> dzsjVar3, dzsj<dxio<wgb>> dzsjVar4, dzsj<cjqq> dzsjVar5, dzsj<cjqy> dzsjVar6, dzsj<wdw> dzsjVar7, dzsj<ania> dzsjVar8) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
        a(dzsjVar8, 8);
        this.h = dzsjVar8;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
