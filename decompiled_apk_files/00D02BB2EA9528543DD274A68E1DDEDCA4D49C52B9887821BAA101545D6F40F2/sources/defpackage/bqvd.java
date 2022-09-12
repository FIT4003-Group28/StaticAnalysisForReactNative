package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bqvd  reason: default package */
/* loaded from: classes4.dex */
public class bqvd {
    public final dzsj<Activity> a;
    public final dzsj<cqkj> b;
    public final dzsj<btvo> c;
    public final dzsj<bqse> d;
    public final dzsj<cqhn> e;

    public bqvd(dzsj<Activity> dzsjVar, dzsj<cqkj> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<bqse> dzsjVar4, dzsj<cqhn> dzsjVar5) {
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
