package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqjh  reason: default package */
/* loaded from: classes2.dex */
public class aqjh {
    public final dzsj<Activity> a;
    public final dzsj<apzy> b;
    public final dzsj<Executor> c;
    public final dzsj<dxio<aprv>> d;
    public final dzsj<dxio<auur>> e;
    public final dzsj<dxio<aqru>> f;
    public final dzsj<dxio<aqrl>> g;
    public final dzsj<dxio<auhi>> h;
    public final dzsj<dxio<aqav>> i;
    public final dzsj<dxio<apyu>> j;
    public final dzsj<dxio<aqgo>> k;
    public final dzsj<dxio<aqwq>> l;
    public final dzsj<dxio<aqrp>> m;
    public final dzsj<dxio<aqpe>> n;
    public final dzsj<dxio<aqci>> o;
    public final dzsj<dxio<apyz>> p;

    public aqjh(dzsj<Activity> dzsjVar, dzsj<apzy> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<dxio<aprv>> dzsjVar4, dzsj<dxio<auur>> dzsjVar5, dzsj<dxio<aqru>> dzsjVar6, dzsj<dxio<aqrl>> dzsjVar7, dzsj<dxio<auhi>> dzsjVar8, dzsj<dxio<aqav>> dzsjVar9, dzsj<dxio<apyu>> dzsjVar10, dzsj<dxio<aqgo>> dzsjVar11, dzsj<dxio<aqwq>> dzsjVar12, dzsj<dxio<aqrp>> dzsjVar13, dzsj<dxio<aqpe>> dzsjVar14, dzsj<dxio<aqci>> dzsjVar15, dzsj<dxio<apyz>> dzsjVar16) {
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
        a(dzsjVar13, 13);
        this.m = dzsjVar13;
        a(dzsjVar14, 14);
        this.n = dzsjVar14;
        a(dzsjVar15, 15);
        this.o = dzsjVar15;
        a(dzsjVar16, 16);
        this.p = dzsjVar16;
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
