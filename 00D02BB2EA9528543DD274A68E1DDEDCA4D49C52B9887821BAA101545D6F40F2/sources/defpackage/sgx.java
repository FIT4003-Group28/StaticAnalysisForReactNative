package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: sgx  reason: default package */
/* loaded from: classes7.dex */
public final class sgx {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<qqh> c;
    public final dzsj<sfd> d;
    public final dzsj<eeu> e;
    public final dzsj<shc> f;
    public final dzsj<sgt> g;
    public final dzsj<dxio<ckcw>> h;
    public final dzsj<dxio<bvjj>> i;
    public final dzsj<ros> j;
    public final dzsj<btvo> k;

    public sgx(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<qqh> dzsjVar3, dzsj<sfd> dzsjVar4, dzsj<eeu> dzsjVar5, dzsj<shc> dzsjVar6, dzsj<sgt> dzsjVar7, dzsj<dxio<ckcw>> dzsjVar8, dzsj<dxio<bvjj>> dzsjVar9, dzsj<ros> dzsjVar10, dzsj<btvo> dzsjVar11) {
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
        a(dzsjVar11, 11);
        this.k = dzsjVar11;
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
