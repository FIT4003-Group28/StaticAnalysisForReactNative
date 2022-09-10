package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aurg  reason: default package */
/* loaded from: classes2.dex */
public class aurg {
    public final dzsj<cqat> a;
    public final dzsj<gga> b;
    public final dzsj<auhi> c;
    public final dzsj<Executor> d;
    public final dzsj<auon> e;
    public final dzsj<dxio<afha>> f;
    public final dzsj<dxio<ache>> g;

    public aurg(dzsj<cqat> dzsjVar, dzsj<gga> dzsjVar2, dzsj<auhi> dzsjVar3, dzsj<Executor> dzsjVar4, dzsj<auon> dzsjVar5, dzsj<dxio<afha>> dzsjVar6, dzsj<dxio<ache>> dzsjVar7) {
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
