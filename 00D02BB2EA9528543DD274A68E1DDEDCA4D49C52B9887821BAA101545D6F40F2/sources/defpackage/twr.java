package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: twr  reason: default package */
/* loaded from: classes7.dex */
public class twr {
    public final dzsj<Activity> a;
    public final dzsj<vpd> b;
    public final dzsj<vtn> c;

    public twr(dzsj<Activity> dzsjVar, dzsj<vpd> dzsjVar2, dzsj<vtn> dzsjVar3) {
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
