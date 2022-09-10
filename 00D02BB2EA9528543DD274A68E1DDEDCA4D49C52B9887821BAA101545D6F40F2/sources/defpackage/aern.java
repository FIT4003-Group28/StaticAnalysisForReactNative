package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aern  reason: default package */
/* loaded from: classes2.dex */
public final class aern {
    public final dzsj<Activity> a;
    public final dzsj<eeu> b;
    public final dzsj<bvjj> c;
    public final dzsj<ache> d;
    public final dzsj<araj> e;
    public final dzsj<arag> f;
    public final dzsj<aesb> g;
    public final dzsj<begg> h;
    public final dzsj<cqg> i;
    public final dzsj<btvo> j;

    public aern(dzsj<Activity> dzsjVar, dzsj<eeu> dzsjVar2, dzsj<bvjj> dzsjVar3, dzsj<ache> dzsjVar4, dzsj<araj> dzsjVar5, dzsj<arag> dzsjVar6, dzsj<aesb> dzsjVar7, dzsj<begg> dzsjVar8, dzsj<cqg> dzsjVar9, dzsj<btvo> dzsjVar10) {
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
