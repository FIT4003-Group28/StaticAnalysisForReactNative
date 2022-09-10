package defpackage;

import android.app.Activity;
import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: bksw  reason: default package */
/* loaded from: classes3.dex */
public class bksw {
    public final dzsj<Activity> a;
    public final dzsj<Resources> b;
    public final dzsj<btvo> c;
    public final dzsj<cqhn> d;
    public final dzsj<cqhu> e;
    public final dzsj<bktc> f;
    public final dzsj<bksi> g;
    public final dzsj<bksl> h;
    public final dzsj<bkpk> i;

    public bksw(dzsj<Activity> dzsjVar, dzsj<Resources> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<cqhn> dzsjVar4, dzsj<cqhu> dzsjVar5, dzsj<bktc> dzsjVar6, dzsj<bksi> dzsjVar7, dzsj<bksl> dzsjVar8, dzsj<bkpk> dzsjVar9) {
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
