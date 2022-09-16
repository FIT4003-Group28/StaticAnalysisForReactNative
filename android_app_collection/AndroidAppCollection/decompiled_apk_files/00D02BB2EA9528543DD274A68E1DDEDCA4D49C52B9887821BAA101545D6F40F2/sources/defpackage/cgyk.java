package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cgyk  reason: default package */
/* loaded from: classes4.dex */
public final class cgyk {
    public final dzsj<Activity> a;
    public final dzsj<buke> b;
    public final dzsj<cgen> c;
    public final dzsj<cgum> d;

    public cgyk(dzsj<Activity> dzsjVar, dzsj<buke> dzsjVar2, dzsj<cgen> dzsjVar3, dzsj<cgum> dzsjVar4) {
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
