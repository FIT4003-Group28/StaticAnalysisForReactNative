package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: bzvi  reason: default package */
/* loaded from: classes4.dex */
public final class bzvi {
    public final dzsj<Application> a;
    public final dzsj<auoi> b;
    public final dzsj<bzux> c;
    public final dzsj<bzvr> d;
    public final dzsj<dxio<auui>> e;
    public final dzsj<dxio<bzuv>> f;
    public final dzsj<dxio<bzvz>> g;
    public final dzsj<cjqy> h;
    public final dzsj<cpv> i;

    public bzvi(dzsj<Application> dzsjVar, dzsj<auoi> dzsjVar2, dzsj<bzux> dzsjVar3, dzsj<bzvr> dzsjVar4, dzsj<dxio<auui>> dzsjVar5, dzsj<dxio<bzuv>> dzsjVar6, dzsj<dxio<bzvz>> dzsjVar7, dzsj<cjqy> dzsjVar8, dzsj<cpv> dzsjVar9) {
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
        a(dzsjVar9, 9);
        this.i = dzsjVar9;
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
