package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bddt  reason: default package */
/* loaded from: classes3.dex */
public final class bddt {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<cqkj> c;
    public final dzsj<ccst> d;
    public final dzsj<bvrb> e;
    public final dzsj<gfw> f;

    public bddt(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cqkj> dzsjVar3, dzsj<ccst> dzsjVar4, dzsj<bvrb> dzsjVar5, dzsj<gfw> dzsjVar6) {
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
