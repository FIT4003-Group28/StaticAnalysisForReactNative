package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bsih  reason: default package */
/* loaded from: classes4.dex */
public class bsih {
    public final dzsj<Activity> a;
    public final dzsj<aenp> b;
    public final dzsj<aehr> c;
    public final dzsj<aeol> d;
    public final dzsj<cqat> e;
    public final dzsj<cqkj> f;
    public final dzsj<btvo> g;
    public final dzsj<cqhu> h;
    public final dzsj<aeqi> i;

    public bsih(dzsj<Activity> dzsjVar, dzsj<aenp> dzsjVar2, dzsj<aehr> dzsjVar3, dzsj<aeol> dzsjVar4, dzsj<cqat> dzsjVar5, dzsj<cqkj> dzsjVar6, dzsj<btvo> dzsjVar7, dzsj<cqhu> dzsjVar8, dzsj<aeqi> dzsjVar9) {
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
