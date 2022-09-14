package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bfmr  reason: default package */
/* loaded from: classes3.dex */
public final class bfmr {
    public final dzsj<dxio<begg>> a;
    public final dzsj<cqat> b;
    public final dzsj<Activity> c;

    public bfmr(dzsj<dxio<begg>> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<Activity> dzsjVar3) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
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
