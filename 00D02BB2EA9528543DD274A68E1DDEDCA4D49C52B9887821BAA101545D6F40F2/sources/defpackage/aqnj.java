package defpackage;
/* compiled from: PG */
/* renamed from: aqnj  reason: default package */
/* loaded from: classes2.dex */
public final class aqnj {
    private final dzsj<gga> a;
    private final dzsj<bvrb> b;
    private final dzsj<dxio<aqbo>> c;
    private final dzsj<dxio<apyz>> d;
    private final dzsj<dxio<aqov>> e;
    private final dzsj<dxio<aqmk>> f;
    private final dzsj<aqgn> g;

    public aqnj(dzsj<gga> dzsjVar, dzsj<bvrb> dzsjVar2, dzsj<dxio<aqbo>> dzsjVar3, dzsj<dxio<apyz>> dzsjVar4, dzsj<dxio<aqov>> dzsjVar5, dzsj<dxio<aqmk>> dzsjVar6, dzsj<aqgn> dzsjVar7) {
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
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aqni a(apzb apzbVar, @dzsi cvbp cvbpVar, ges gesVar) {
        gga a = this.a.a();
        b(a, 1);
        bvrb a2 = this.b.a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        dxio a5 = ((dxjh) this.e).a();
        b(a5, 5);
        dxio a6 = ((dxjh) this.f).a();
        b(a6, 6);
        aqgn a7 = this.g.a();
        b(a7, 7);
        b(apzbVar, 8);
        b(gesVar, 10);
        return new aqni(a, a2, a3, a4, a5, a6, a7, apzbVar, cvbpVar, gesVar);
    }
}
