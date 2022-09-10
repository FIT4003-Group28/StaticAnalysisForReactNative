package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: bepl  reason: default package */
/* loaded from: classes3.dex */
public final class bepl {
    public final dzsj<beor> a;
    public final dzsj<Application> b;
    public final dzsj<apny> c;
    public final dzsj<dxio<beii>> d;
    public final dzsj<benm> e;
    public final dzsj<bgyg> f;
    public final dzsj<cqhn> g;
    public final dzsj<czsx> h;
    public final dzsj<czsy> i;
    public final dzsj<bvrb> j;

    public bepl(dzsj<beor> dzsjVar, dzsj<Application> dzsjVar2, dzsj<apny> dzsjVar3, dzsj<dxio<beii>> dzsjVar4, dzsj<benm> dzsjVar5, dzsj<bgyg> dzsjVar6, dzsj<cqhn> dzsjVar7, dzsj<czsx> dzsjVar8, dzsj<czsy> dzsjVar9, dzsj<bvrb> dzsjVar10) {
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

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
