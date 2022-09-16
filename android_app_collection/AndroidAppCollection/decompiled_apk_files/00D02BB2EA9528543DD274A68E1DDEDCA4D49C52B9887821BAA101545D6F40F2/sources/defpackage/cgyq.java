package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cgyq  reason: default package */
/* loaded from: classes4.dex */
public class cgyq {
    public final dzsj<Activity> a;
    public final dzsj<btvo> b;
    public final dzsj<gga> c;
    public final dzsj<axwy> d;
    public final dzsj<cjqy> e;
    public final dzsj<dxio<afha>> f;

    public cgyq(dzsj<Activity> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<gga> dzsjVar3, dzsj<axwy> dzsjVar4, dzsj<cjqy> dzsjVar5, dzsj<dxio<afha>> dzsjVar6) {
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
