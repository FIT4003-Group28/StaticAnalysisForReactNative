package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ucn  reason: default package */
/* loaded from: classes7.dex */
public final class ucn {
    public final dzsj<Activity> a;
    public final dzsj<ubw> b;
    public final dzsj<cqhn> c;
    public final dzsj<uch> d;
    public final dzsj<uck> e;
    public final dzsj<uca> f;
    public final dzsj<ucq> g;
    public final dzsj<tur> h;

    public ucn(dzsj<Activity> dzsjVar, dzsj<ubw> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<uch> dzsjVar4, dzsj<uck> dzsjVar5, dzsj<uca> dzsjVar6, dzsj<ucq> dzsjVar7, dzsj<tur> dzsjVar8) {
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
