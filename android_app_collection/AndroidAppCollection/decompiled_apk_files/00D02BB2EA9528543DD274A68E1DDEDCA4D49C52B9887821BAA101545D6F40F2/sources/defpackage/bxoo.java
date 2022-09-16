package defpackage;
/* compiled from: PG */
/* renamed from: bxoo  reason: default package */
/* loaded from: classes4.dex */
public final class bxoo {
    private final dzsj<gga> a;
    private final dzsj<akpm> b;
    private final dzsj<dxio<araj>> c;
    private final dzsj<btvo> d;

    public bxoo(dzsj<gga> dzsjVar, dzsj<akpm> dzsjVar2, dzsj<dxio<araj>> dzsjVar3, dzsj<btvo> dzsjVar4) {
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

    public final bxon a(String str, String str2, String str3, boolean z, ges gesVar, @dzsi String str4, @dzsi akqq akqqVar, @dzsi ddho ddhoVar, @dzsi ddho ddhoVar2, @dzsi ddho ddhoVar3, @dzsi cjtd cjtdVar, boolean z2, boolean z3, @dzsi bxov bxovVar) {
        b(str, 1);
        b(str2, 2);
        b(str3, 3);
        b(gesVar, 5);
        gga a = this.a.a();
        b(a, 15);
        akpm a2 = this.b.a();
        b(a2, 16);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 17);
        btvo a4 = this.d.a();
        b(a4, 18);
        return new bxon(str, str2, str3, z, gesVar, str4, akqqVar, ddhoVar, ddhoVar2, ddhoVar3, cjtdVar, z2, z3, bxovVar, a, a2, a3, a4);
    }
}
