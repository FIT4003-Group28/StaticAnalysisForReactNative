package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cgtx  reason: default package */
/* loaded from: classes4.dex */
public final class cgtx {
    public final dzsj<Activity> a;
    public final dzsj<btpc> b;
    public final dzsj<cgen> c;

    public cgtx(dzsj<Activity> dzsjVar, dzsj<btpc> dzsjVar2, dzsj<cgen> dzsjVar3) {
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
