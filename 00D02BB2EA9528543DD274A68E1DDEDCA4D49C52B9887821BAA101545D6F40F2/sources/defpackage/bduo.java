package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: bduo  reason: default package */
/* loaded from: classes3.dex */
public final class bduo {
    public final dzsj<Application> a;
    public final dzsj<dxio<btvo>> b;
    public final dzsj<dxio<bbul>> c;
    public final dzsj<dxio<gdc>> d;
    public final dzsj<dxio<cjqy>> e;
    public final dzsj<cjnf> f;
    public final dzsj<dxio<jlp>> g;

    public bduo(dzsj<Application> dzsjVar, dzsj<dxio<btvo>> dzsjVar2, dzsj<dxio<bbul>> dzsjVar3, dzsj<dxio<gdc>> dzsjVar4, dzsj<dxio<cjqy>> dzsjVar5, dzsj<cjnf> dzsjVar6, dzsj<dxio<jlp>> dzsjVar7) {
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
