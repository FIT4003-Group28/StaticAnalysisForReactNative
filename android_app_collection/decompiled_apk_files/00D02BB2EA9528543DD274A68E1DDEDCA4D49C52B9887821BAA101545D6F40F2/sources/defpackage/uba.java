package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: uba  reason: default package */
/* loaded from: classes7.dex */
public final class uba {
    public final dzsj<Activity> a;
    public final dzsj<afha> b;
    public final dzsj<tur> c;

    public uba(dzsj<Activity> dzsjVar, dzsj<afha> dzsjVar2, dzsj<tur> dzsjVar3) {
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
