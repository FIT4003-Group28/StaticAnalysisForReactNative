package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: aojt  reason: default package */
/* loaded from: classes2.dex */
public class aojt {
    public final dzsj<fd> a;
    public final dzsj<bbut> b;
    public final dzsj<Application> c;
    public final dzsj<Boolean> d;
    public final dzsj<aogw> e;
    public final dzsj<gga> f;

    public aojt(dzsj<fd> dzsjVar, dzsj<bbut> dzsjVar2, dzsj<Application> dzsjVar3, dzsj<Boolean> dzsjVar4, dzsj<aogw> dzsjVar5, dzsj<gga> dzsjVar6) {
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
