package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: abuf  reason: default package */
/* loaded from: classes2.dex */
public class abuf {
    public final dzsj<Activity> a;
    public final dzsj<dxio<abfa>> b;
    public final dzsj<dxio<abfb>> c;

    public abuf(dzsj<Activity> dzsjVar, dzsj<dxio<abfa>> dzsjVar2, dzsj<dxio<abfb>> dzsjVar3) {
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
