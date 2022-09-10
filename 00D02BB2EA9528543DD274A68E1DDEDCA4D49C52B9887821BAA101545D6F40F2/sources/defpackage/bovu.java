package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bovu  reason: default package */
/* loaded from: classes3.dex */
public final class bovu {
    public final dzsj<bvrb> a;
    public final dzsj<acwo> b;
    public final dzsj<Activity> c;
    public final dzsj<bbul> d;
    public final dzsj<akfa> e;
    public final dzsj<bbtk> f;

    public bovu(dzsj<bvrb> dzsjVar, dzsj<acwo> dzsjVar2, dzsj<Activity> dzsjVar3, dzsj<bbul> dzsjVar4, dzsj<akfa> dzsjVar5, dzsj<bbtk> dzsjVar6) {
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
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
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
