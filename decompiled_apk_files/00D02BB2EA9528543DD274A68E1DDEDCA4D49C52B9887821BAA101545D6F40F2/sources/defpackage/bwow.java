package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bwow  reason: default package */
/* loaded from: classes4.dex */
public class bwow {
    public final dzsj<eeu> a;
    public final dzsj<Activity> b;
    public final dzsj<glj> c;
    public final dzsj<brba> d;
    public final dzsj<ascb> e;

    public bwow(dzsj<eeu> dzsjVar, dzsj<Activity> dzsjVar2, dzsj<glj> dzsjVar3, dzsj<brba> dzsjVar4, dzsj<ascb> dzsjVar5) {
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
