package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: cczk  reason: default package */
/* loaded from: classes4.dex */
public class cczk {
    public final dzsj<btvo> a;
    public final dzsj<Application> b;

    public cczk(dzsj<btvo> dzsjVar, dzsj<Application> dzsjVar2) {
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
