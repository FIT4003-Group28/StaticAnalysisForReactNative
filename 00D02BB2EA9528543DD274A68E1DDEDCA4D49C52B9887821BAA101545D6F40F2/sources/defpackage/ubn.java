package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ubn  reason: default package */
/* loaded from: classes7.dex */
public final class ubn {
    public final dzsj<Activity> a;
    public final dzsj<twk> b;
    public final dzsj<tur> c;
    public final dzsj<sux> d;
    public final dzsj<cqat> e;

    public ubn(dzsj<Activity> dzsjVar, dzsj<twk> dzsjVar2, dzsj<tur> dzsjVar3, dzsj<sux> dzsjVar4, dzsj<cqat> dzsjVar5) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
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
