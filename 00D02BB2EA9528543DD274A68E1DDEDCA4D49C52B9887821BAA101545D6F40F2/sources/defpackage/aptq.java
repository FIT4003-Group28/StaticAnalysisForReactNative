package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: aptq  reason: default package */
/* loaded from: classes2.dex */
public final class aptq {
    public final dzsj<Application> a;
    public final dzsj<gga> b;
    public final dzsj<apup> c;
    public final dzsj<bbtk> d;
    public final dzsj<bbtt> e;
    public final dzsj<bbut> f;

    public aptq(dzsj<Application> dzsjVar, dzsj<gga> dzsjVar2, dzsj<apup> dzsjVar3, dzsj<bbtk> dzsjVar4, dzsj<bbtt> dzsjVar5, dzsj<bbut> dzsjVar6) {
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
