package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bxcu  reason: default package */
/* loaded from: classes4.dex */
public class bxcu {
    public final dzsj<Activity> a;
    public final dzsj<dxio<afha>> b;
    public final dzsj<cafi> c;
    public final dzsj<cqat> d;
    public final dzsj<cjmt> e;
    public final dzsj<bwzj> f;

    public bxcu(dzsj<Activity> dzsjVar, dzsj<dxio<afha>> dzsjVar2, dzsj<cafi> dzsjVar3, dzsj<cqat> dzsjVar4, dzsj<cjmt> dzsjVar5, dzsj<bwzj> dzsjVar6) {
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
