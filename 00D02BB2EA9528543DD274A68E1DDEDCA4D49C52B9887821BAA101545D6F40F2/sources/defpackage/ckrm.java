package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ckrm  reason: default package */
/* loaded from: classes.dex */
public final class ckrm implements afhy {
    private final dzsj<gga> a;
    private final dzsj<bvrb> b;
    private final dzsj<dxio<ckrb>> c;
    private final dzsj<afhe> d;
    private final dzsj<dxio<asik>> e;
    private final dzsj<dxio<brlz>> f;
    private final dzsj<dxio<akfa>> g;
    private final dzsj<dxio<ckcw>> h;

    public ckrm(dzsj<gga> dzsjVar, dzsj<bvrb> dzsjVar2, dzsj<dxio<ckrb>> dzsjVar3, dzsj<afhe> dzsjVar4, dzsj<dxio<asik>> dzsjVar5, dzsj<dxio<brlz>> dzsjVar6, dzsj<dxio<akfa>> dzsjVar7, dzsj<dxio<ckcw>> dzsjVar8) {
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
        b(dzsjVar8, 8);
        this.h = dzsjVar8;
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

    @Override // defpackage.afhy
    public final /* bridge */ /* synthetic */ afhx a(Intent intent, @dzsi String str) {
        b(intent, 1);
        gga a = this.a.a();
        b(a, 3);
        bvrb a2 = this.b.a();
        b(a2, 4);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 5);
        afhe a4 = this.d.a();
        b(a4, 6);
        dxio a5 = ((dxjh) this.e).a();
        b(a5, 7);
        dxio a6 = ((dxjh) this.f).a();
        b(a6, 8);
        dxio a7 = ((dxjh) this.g).a();
        b(a7, 9);
        dxio a8 = ((dxjh) this.h).a();
        b(a8, 10);
        return new ckrl(intent, str, a, a2, a3, a4, a5, a6, a7, a8);
    }
}
