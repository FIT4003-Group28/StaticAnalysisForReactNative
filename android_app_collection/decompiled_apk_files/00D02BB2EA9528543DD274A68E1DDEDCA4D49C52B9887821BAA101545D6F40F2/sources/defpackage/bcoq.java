package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bcoq  reason: default package */
/* loaded from: classes3.dex */
public final class bcoq {
    public final dzsj<bcms> a;
    public final dzsj<Activity> b;
    public final dzsj<akfa> c;
    public final dzsj<dxio<afha>> d;

    public bcoq(dzsj<bcms> dzsjVar, dzsj<Activity> dzsjVar2, dzsj<akfa> dzsjVar3, dzsj<dxio<afha>> dzsjVar4) {
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
