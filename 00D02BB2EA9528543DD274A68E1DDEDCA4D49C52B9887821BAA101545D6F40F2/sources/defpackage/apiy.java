package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: apiy  reason: default package */
/* loaded from: classes2.dex */
public class apiy {
    public final dzsj<angv> a;
    public final dzsj<cqat> b;
    public final dzsj<cqhn> c;
    public final dzsj<gga> d;
    public final dzsj<dxio<angp>> e;
    public final dzsj<bmnj> f;
    public final dzsj<Executor> g;
    public final dzsj<anhg> h;
    public final dzsj<begg> i;

    public apiy(dzsj<angv> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<gga> dzsjVar4, dzsj<dxio<angp>> dzsjVar5, dzsj<bmnj> dzsjVar6, dzsj<Executor> dzsjVar7, dzsj<anhg> dzsjVar8, dzsj<begg> dzsjVar9) {
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
