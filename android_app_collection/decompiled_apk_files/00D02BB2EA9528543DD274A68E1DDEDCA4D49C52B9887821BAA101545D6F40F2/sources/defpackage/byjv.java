package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: byjv  reason: default package */
/* loaded from: classes4.dex */
public class byjv {
    public final dzsj<Activity> a;
    public final dzsj<bvjj> b;
    public final dzsj<dxio<afha>> c;
    public final dzsj<cqat> d;

    public byjv(dzsj<Activity> dzsjVar, dzsj<bvjj> dzsjVar2, dzsj<dxio<afha>> dzsjVar3, dzsj<cqat> dzsjVar4) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
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
