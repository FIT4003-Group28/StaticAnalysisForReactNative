package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: brcb  reason: default package */
/* loaded from: classes4.dex */
public final class brcb {
    public final dzsj<brat> a;
    public final dzsj<gga> b;
    public final dzsj<bwqv> c;
    public final dzsj<aehr> d;
    public final dzsj<aeht> e;
    public final dzsj<bsma> f;
    public final dzsj<dxio<abfg>> g;
    public final dzsj<dxio<akox>> h;
    public final dzsj<dxio<Executor>> i;
    public final dzsj<brlk> j;

    public brcb(dzsj<brat> dzsjVar, dzsj<gga> dzsjVar2, dzsj<bwqv> dzsjVar3, dzsj<aehr> dzsjVar4, dzsj<aeht> dzsjVar5, dzsj<bsma> dzsjVar6, dzsj<dxio<abfg>> dzsjVar7, dzsj<dxio<akox>> dzsjVar8, dzsj<dxio<Executor>> dzsjVar9, dzsj<brlk> dzsjVar10) {
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
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
        a(dzsjVar8, 8);
        this.h = dzsjVar8;
        a(dzsjVar9, 9);
        this.i = dzsjVar9;
        a(dzsjVar10, 10);
        this.j = dzsjVar10;
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
