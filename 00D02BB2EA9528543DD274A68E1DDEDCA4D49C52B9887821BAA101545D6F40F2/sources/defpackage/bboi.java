package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bboi  reason: default package */
/* loaded from: classes3.dex */
public final class bboi {
    public final dzsj<gga> a;
    public final dzsj<btvo> b;
    public final dzsj<dxio<bsvm>> c;
    public final dzsj<dxio<bbdv>> d;
    public final dzsj<dxio<angp>> e;
    public final dzsj<Executor> f;
    public final dzsj<bbnl> g;

    public bboi(dzsj<gga> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<dxio<bsvm>> dzsjVar3, dzsj<dxio<bbdv>> dzsjVar4, dzsj<dxio<angp>> dzsjVar5, dzsj<Executor> dzsjVar6, dzsj<bbnl> dzsjVar7) {
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
