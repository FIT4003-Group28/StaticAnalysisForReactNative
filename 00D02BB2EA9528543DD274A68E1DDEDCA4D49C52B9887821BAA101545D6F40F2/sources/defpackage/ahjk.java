package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ahjk  reason: default package */
/* loaded from: classes2.dex */
public final class ahjk {
    public final dzsj<Activity> a;
    public final dzsj<ahas> b;
    public final dzsj<ahbd> c;
    public final dzsj<ahht> d;
    public final dzsj<dxio<afzv>> e;
    public final dzsj<ahfo> f;
    public final dzsj<ahjn> g;

    public ahjk(dzsj<Activity> dzsjVar, dzsj<ahas> dzsjVar2, dzsj<ahbd> dzsjVar3, dzsj<ahht> dzsjVar4, dzsj<dxio<afzv>> dzsjVar5, dzsj<ahfo> dzsjVar6, dzsj<ahjn> dzsjVar7) {
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
