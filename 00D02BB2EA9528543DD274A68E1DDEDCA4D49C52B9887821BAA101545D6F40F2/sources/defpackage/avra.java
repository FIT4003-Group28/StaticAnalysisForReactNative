package defpackage;
/* compiled from: PG */
/* renamed from: avra  reason: default package */
/* loaded from: classes3.dex */
public final class avra {
    public final dzsj<avop> a;
    public final dzsj<dehq> b;
    public final dzsj<avqf> c;
    public final dzsj<avrd> d;
    public final dzsj<avrg> e;
    public final dzsj<avzj> f;

    public avra(dzsj<avop> dzsjVar, dzsj<dehq> dzsjVar2, dzsj<avqf> dzsjVar3, dzsj<avrd> dzsjVar4, dzsj<avrg> dzsjVar5, dzsj<avzj> dzsjVar6) {
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
