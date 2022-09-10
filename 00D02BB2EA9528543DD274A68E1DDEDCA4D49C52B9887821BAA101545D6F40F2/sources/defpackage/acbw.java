package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: acbw  reason: default package */
/* loaded from: classes2.dex */
public final class acbw {
    public final dzsj<Application> a;
    public final dzsj<acbi> b;
    public final dzsj<accn> c;
    public final dzsj<cqhn> d;
    public final dzsj<acbg> e;
    public final dzsj<acek> f;
    public final dzsj<cqhu> g;
    public final dzsj<bckz> h;

    public acbw(dzsj<Application> dzsjVar, dzsj<acbi> dzsjVar2, dzsj<accn> dzsjVar3, dzsj<cqhn> dzsjVar4, dzsj<acbg> dzsjVar5, dzsj<acek> dzsjVar6, dzsj<cqhu> dzsjVar7, dzsj<bckz> dzsjVar8) {
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
