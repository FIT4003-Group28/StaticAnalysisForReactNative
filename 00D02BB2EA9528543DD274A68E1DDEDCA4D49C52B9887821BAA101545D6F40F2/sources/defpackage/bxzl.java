package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bxzl  reason: default package */
/* loaded from: classes4.dex */
public final class bxzl {
    public final dzsj<btrm> a;
    public final dzsj<cvv> b;
    public final dzsj<dxio<nut>> c;
    public final dzsj<dxio<ckcw>> d;
    public final dzsj<btvo> e;
    public final dzsj<Activity> f;
    public final dzsj<cyt> g;

    public bxzl(dzsj<btrm> dzsjVar, dzsj<cvv> dzsjVar2, dzsj<dxio<nut>> dzsjVar3, dzsj<dxio<ckcw>> dzsjVar4, dzsj<btvo> dzsjVar5, dzsj<Activity> dzsjVar6, dzsj<cyt> dzsjVar7) {
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
