package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: wrp  reason: default package */
/* loaded from: classes7.dex */
public final class wrp {
    public final dzsj<Activity> a;
    public final dzsj<dxio<qbt>> b;
    public final dzsj<begg> c;
    public final dzsj<axwy> d;
    public final dzsj<dxio<afha>> e;
    public final dzsj<vtn> f;
    public final dzsj<btvo> g;
    public final dzsj<axyp> h;

    public wrp(dzsj<Activity> dzsjVar, dzsj<dxio<qbt>> dzsjVar2, dzsj<begg> dzsjVar3, dzsj<axwy> dzsjVar4, dzsj<dxio<afha>> dzsjVar5, dzsj<vtn> dzsjVar6, dzsj<btvo> dzsjVar7, dzsj<axyp> dzsjVar8) {
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
