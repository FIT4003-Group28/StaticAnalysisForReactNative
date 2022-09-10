package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: afpc  reason: default package */
/* loaded from: classes.dex */
public final class afpc {
    public final dzsj<Activity> a;
    public final dzsj<cqkj> b;
    public final dzsj<dxio<afwr>> c;
    public final dzsj<dxio<arfm>> d;
    public final dzsj<dxio<abwo>> e;
    public final dzsj<dxio<bwsh>> f;
    public final dzsj<dxio<bzmm>> g;
    public final dzsj<bvjj> h;
    public final dzsj<cqhn> i;
    public final dzsj<btvo> j;

    public afpc(dzsj<Activity> dzsjVar, dzsj<cqkj> dzsjVar2, dzsj<dxio<afwr>> dzsjVar3, dzsj<dxio<arfm>> dzsjVar4, dzsj<dxio<abwo>> dzsjVar5, dzsj<dxio<bwsh>> dzsjVar6, dzsj<dxio<bzmm>> dzsjVar7, dzsj<bvjj> dzsjVar8, dzsj<cqhn> dzsjVar9, dzsj<btvo> dzsjVar10) {
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
        a(dzsjVar10, 10);
        this.j = dzsjVar10;
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
