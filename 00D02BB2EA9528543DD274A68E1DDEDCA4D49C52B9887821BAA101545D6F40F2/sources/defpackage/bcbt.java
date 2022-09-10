package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bcbt  reason: default package */
/* loaded from: classes3.dex */
public final class bcbt {
    public final dzsj<Activity> a;
    public final dzsj<btvo> b;
    public final dzsj<bckv> c;
    public final dzsj<bcmv> d;
    public final dzsj<bcoi> e;
    public final dzsj<bcol> f;
    public final dzsj<bcot> g;
    public final dzsj<bcoq> h;

    public bcbt(dzsj<Activity> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<bckv> dzsjVar3, dzsj<bcmv> dzsjVar4, dzsj<bcoi> dzsjVar5, dzsj<bcol> dzsjVar6, dzsj<bcot> dzsjVar7, dzsj<bcoq> dzsjVar8) {
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
