package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: adlh  reason: default package */
/* loaded from: classes.dex */
public final class adlh {
    public final dzsj<dxio<abwo>> a;
    public final dzsj<Activity> b;
    public final dzsj<cqhn> c;

    public adlh(dzsj<dxio<abwo>> dzsjVar, dzsj<Activity> dzsjVar2, dzsj<cqhn> dzsjVar3) {
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
