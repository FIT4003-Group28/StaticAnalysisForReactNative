package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: qyq  reason: default package */
/* loaded from: classes7.dex */
public class qyq {
    public final dzsj<Application> a;
    public final dzsj<qyh> b;
    public final dzsj<bsvm> c;
    public final dzsj<dxio<axwy>> d;
    public final dzsj<axws> e;
    public final dzsj<dxio<bvjj>> f;
    public final dzsj<dxio<cqat>> g;
    public final dzsj<Executor> h;
    public final dzsj<qyg> i;
    public final dzsj<btvo> j;
    public final dzsj<dxio<afha>> k;

    public qyq(dzsj<Application> dzsjVar, dzsj<qyh> dzsjVar2, dzsj<bsvm> dzsjVar3, dzsj<dxio<axwy>> dzsjVar4, dzsj<axws> dzsjVar5, dzsj<dxio<bvjj>> dzsjVar6, dzsj<dxio<cqat>> dzsjVar7, dzsj<Executor> dzsjVar8, dzsj<qyg> dzsjVar9, dzsj<btvo> dzsjVar10, dzsj<dxio<afha>> dzsjVar11) {
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
