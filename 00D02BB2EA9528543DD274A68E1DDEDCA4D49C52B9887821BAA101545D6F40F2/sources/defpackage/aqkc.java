package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aqkc  reason: default package */
/* loaded from: classes2.dex */
public class aqkc {
    public final dzsj<Activity> a;
    public final dzsj<apzy> b;
    public final dzsj<cqhn> c;
    public final dzsj<aqeh> d;
    public final dzsj<aqgo> e;
    public final dzsj<dxio<aqps>> f;
    public final dzsj<dxio<aqov>> g;
    public final dzsj<dxio<apyu>> h;
    public final dzsj<dxio<aqkt>> i;
    public final dzsj<dxio<apyz>> j;
    public final dzsj<dxio<akfa>> k;
    public final dzsj<dxio<aprv>> l;

    public aqkc(dzsj<Activity> dzsjVar, dzsj<apzy> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<aqeh> dzsjVar4, dzsj<aqgo> dzsjVar5, dzsj<dxio<aqps>> dzsjVar6, dzsj<dxio<aqov>> dzsjVar7, dzsj<dxio<apyu>> dzsjVar8, dzsj<dxio<aqkt>> dzsjVar9, dzsj<dxio<apyz>> dzsjVar10, dzsj<dxio<akfa>> dzsjVar11, dzsj<dxio<aprv>> dzsjVar12) {
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
        a(dzsjVar12, 12);
        this.l = dzsjVar12;
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
