package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: byjr  reason: default package */
/* loaded from: classes4.dex */
public class byjr {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<dxio<akfa>> c;
    public final dzsj<dxio<axwq>> d;
    public final dzsj<dxio<axwy>> e;
    public final dzsj<bvjj> f;
    public final dzsj<cqat> g;

    public byjr(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<dxio<akfa>> dzsjVar3, dzsj<dxio<axwq>> dzsjVar4, dzsj<dxio<axwy>> dzsjVar5, dzsj<bvjj> dzsjVar6, dzsj<cqat> dzsjVar7) {
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
