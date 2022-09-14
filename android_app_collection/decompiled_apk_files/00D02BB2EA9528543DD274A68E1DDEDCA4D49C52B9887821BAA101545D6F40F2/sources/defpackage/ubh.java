package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ubh  reason: default package */
/* loaded from: classes7.dex */
public final class ubh {
    public final dzsj<Activity> a;
    public final dzsj<twn> b;
    public final dzsj<cqat> c;
    public final dzsj<vxw> d;
    public final dzsj<vxv> e;
    public final dzsj<zuz> f;
    public final dzsj<tur> g;
    public final dzsj<sux> h;

    public ubh(dzsj<Activity> dzsjVar, dzsj<twn> dzsjVar2, dzsj<cqat> dzsjVar3, dzsj<vxw> dzsjVar4, dzsj<vxv> dzsjVar5, dzsj<zuz> dzsjVar6, dzsj<tur> dzsjVar7, dzsj<sux> dzsjVar8) {
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
