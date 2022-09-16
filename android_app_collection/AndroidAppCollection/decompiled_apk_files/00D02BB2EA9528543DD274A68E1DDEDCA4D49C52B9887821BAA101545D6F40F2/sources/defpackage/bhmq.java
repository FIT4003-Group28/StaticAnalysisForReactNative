package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bhmq  reason: default package */
/* loaded from: classes3.dex */
public class bhmq {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<vtn> c;
    public final dzsj<dxio<qbt>> d;
    public final dzsj<bhml> e;
    public final dzsj<btvo> f;

    public bhmq(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<vtn> dzsjVar3, dzsj<dxio<qbt>> dzsjVar4, dzsj<bhml> dzsjVar5, dzsj<btvo> dzsjVar6) {
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
