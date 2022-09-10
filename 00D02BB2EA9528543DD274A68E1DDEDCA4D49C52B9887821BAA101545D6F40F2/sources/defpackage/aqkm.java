package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aqkm  reason: default package */
/* loaded from: classes2.dex */
public final class aqkm {
    public final dzsj<Activity> a;
    public final dzsj<aqru> b;
    public final dzsj<aqci> c;
    public final dzsj<apyx> d;

    public aqkm(dzsj<Activity> dzsjVar, dzsj<aqru> dzsjVar2, dzsj<aqci> dzsjVar3, dzsj<apyx> dzsjVar4) {
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
