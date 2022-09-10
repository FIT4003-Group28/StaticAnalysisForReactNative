package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: aula  reason: default package */
/* loaded from: classes2.dex */
public final class aula {
    public final dzsj<dxio<akfa>> a;
    public final dzsj<aunx> b;
    public final dzsj<auhz> c;
    public final dzsj<auso> d;
    public final dzsj<ault> e;
    public final dzsj<Application> f;

    public aula(dzsj<dxio<akfa>> dzsjVar, dzsj<aunx> dzsjVar2, dzsj<auhz> dzsjVar3, dzsj<auso> dzsjVar4, dzsj<ault> dzsjVar5, dzsj<Application> dzsjVar6) {
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
