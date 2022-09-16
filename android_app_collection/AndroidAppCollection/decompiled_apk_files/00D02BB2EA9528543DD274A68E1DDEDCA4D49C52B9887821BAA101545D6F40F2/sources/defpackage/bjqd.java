package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bjqd  reason: default package */
/* loaded from: classes3.dex */
public final class bjqd {
    public final dzsj<gga> a;
    public final dzsj<Resources> b;
    public final dzsj<cqhn> c;
    public final dzsj<dxio<cqhu>> d;
    public final dzsj<bjph> e;
    public final dzsj<bjnh> f;
    public final dzsj<bjnr> g;
    public final dzsj<bjoq> h;
    public final dzsj<cchz> i;
    public final dzsj<Executor> j;

    public bjqd(dzsj<gga> dzsjVar, dzsj<Resources> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<dxio<cqhu>> dzsjVar4, dzsj<bjph> dzsjVar5, dzsj<bjnh> dzsjVar6, dzsj<bjnr> dzsjVar7, dzsj<bjoq> dzsjVar8, dzsj<cchz> dzsjVar9, dzsj<Executor> dzsjVar10) {
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
