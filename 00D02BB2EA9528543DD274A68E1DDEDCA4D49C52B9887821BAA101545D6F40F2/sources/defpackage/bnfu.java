package defpackage;
/* compiled from: PG */
/* renamed from: bnfu  reason: default package */
/* loaded from: classes3.dex */
public final class bnfu {
    public final dzsj<gga> a;
    public final dzsj<dxio<cafi>> b;
    public final dzsj<dxio<afha>> c;
    public final dzsj<cebu> d;
    public final dzsj<ceet> e;
    public final dzsj<bngj> f;

    public bnfu(dzsj<gga> dzsjVar, dzsj<dxio<cafi>> dzsjVar2, dzsj<dxio<afha>> dzsjVar3, dzsj<cebu> dzsjVar4, dzsj<ceet> dzsjVar5, dzsj<bngj> dzsjVar6) {
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
