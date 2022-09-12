package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahfv  reason: default package */
/* loaded from: classes2.dex */
public class ahfv {
    public final dzsj<gga> a;
    public final dzsj<cjqq> b;
    public final dzsj<bbdv> c;
    public final dzsj<dxio<bsvm>> d;
    public final dzsj<Executor> e;
    public final dzsj<cjqy> f;

    public ahfv(dzsj<gga> dzsjVar, dzsj<cjqq> dzsjVar2, dzsj<bbdv> dzsjVar3, dzsj<dxio<bsvm>> dzsjVar4, dzsj<Executor> dzsjVar5, dzsj<cjqy> dzsjVar6) {
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
