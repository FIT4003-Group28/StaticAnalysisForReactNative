package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bxqs  reason: default package */
/* loaded from: classes4.dex */
public final class bxqs {
    public final dzsj<Activity> a;
    public final dzsj<dxio<glj>> b;

    public bxqs(dzsj<Activity> dzsjVar, dzsj<dxio<glj>> dzsjVar2) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
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
