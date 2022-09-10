package defpackage;
/* compiled from: PG */
/* renamed from: bijt  reason: default package */
/* loaded from: classes3.dex */
public class bijt {
    private final dzsj<gga> a;
    private final dzsj<dxio<bvvw>> b;
    private final dzsj<cklf> c;
    private final dzsj<btvo> d;

    public bijt(dzsj<gga> dzsjVar, dzsj<dxio<bvvw>> dzsjVar2, dzsj<cklf> dzsjVar3, dzsj<btvo> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
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

    public final bijs a(dqbe dqbeVar, ilo iloVar, boolean z) {
        gga a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        cklf a3 = this.c.a();
        b(a3, 3);
        btvo a4 = this.d.a();
        b(a4, 4);
        b(dqbeVar, 5);
        b(iloVar, 6);
        return new bijs(a, a2, a3, a4, dqbeVar, iloVar, z);
    }
}
