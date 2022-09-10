package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bidl  reason: default package */
/* loaded from: classes3.dex */
public class bidl {
    public final dzsj<Activity> a;
    public final dzsj<axrx> b;
    public final dzsj<axru> c;
    public final dzsj<axwq> d;
    public final dzsj<ckcw> e;
    public final dzsj<akfa> f;
    public final dzsj<bvrb> g;
    public final dzsj<dxio<afha>> h;

    public bidl(dzsj<Activity> dzsjVar, dzsj<axrx> dzsjVar2, dzsj<axru> dzsjVar3, dzsj<axwq> dzsjVar4, dzsj<ckcw> dzsjVar5, dzsj<akfa> dzsjVar6, dzsj<bvrb> dzsjVar7, dzsj<dxio<afha>> dzsjVar8) {
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
