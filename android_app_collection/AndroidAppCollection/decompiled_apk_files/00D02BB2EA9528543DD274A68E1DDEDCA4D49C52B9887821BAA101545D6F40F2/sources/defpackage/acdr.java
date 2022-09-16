package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: acdr  reason: default package */
/* loaded from: classes2.dex */
public final class acdr {
    public final dzsj<Application> a;
    public final dzsj<dxio<akvz>> b;
    public final dzsj<amfi> c;

    public acdr(dzsj<Application> dzsjVar, dzsj<dxio<akvz>> dzsjVar2, dzsj<amfi> dzsjVar3) {
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
