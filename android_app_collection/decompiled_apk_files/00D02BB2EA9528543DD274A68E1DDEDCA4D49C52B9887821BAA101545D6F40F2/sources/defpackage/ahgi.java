package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ahgi  reason: default package */
/* loaded from: classes2.dex */
public final class ahgi {
    public final dzsj<Activity> a;
    public final dzsj<ahas> b;
    public final dzsj<ahht> c;
    public final dzsj<dxio<afzv>> d;
    public final dzsj<dxio<axwy>> e;
    public final dzsj<ahbd> f;
    public final dzsj<ahfo> g;

    public ahgi(dzsj<Activity> dzsjVar, dzsj<ahas> dzsjVar2, dzsj<ahht> dzsjVar3, dzsj<dxio<afzv>> dzsjVar4, dzsj<dxio<axwy>> dzsjVar5, dzsj<ahbd> dzsjVar6, dzsj<ahfo> dzsjVar7) {
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
