package defpackage;
/* compiled from: PG */
/* renamed from: zqg  reason: default package */
/* loaded from: classes7.dex */
public class zqg {
    private final dzsj<gga> a;
    private final dzsj<bvsl> b;
    private final dzsj<vtn> c;
    private final dzsj<dxio<afha>> d;
    private final dzsj<btvo> e;

    public zqg(dzsj<gga> dzsjVar, dzsj<bvsl> dzsjVar2, dzsj<vtn> dzsjVar3, dzsj<dxio<afha>> dzsjVar4, dzsj<btvo> dzsjVar5) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final zqf a(dozz dozzVar, Runnable runnable, boolean z) {
        gga a = this.a.a();
        b(a, 1);
        bvsl a2 = this.b.a();
        b(a2, 2);
        vtn a3 = this.c.a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        btvo a5 = this.e.a();
        b(a5, 5);
        b(dozzVar, 6);
        return new zqf(a, a2, a3, a4, a5, dozzVar, runnable, z);
    }
}
