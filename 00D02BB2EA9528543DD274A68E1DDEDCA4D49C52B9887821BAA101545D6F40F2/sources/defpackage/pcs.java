package defpackage;

import android.graphics.BitmapFactory;
/* compiled from: PG */
/* renamed from: pcs  reason: default package */
/* loaded from: classes7.dex */
public final class pcs implements pcx<dlez> {
    public static final int a = auiy.COMMUTE_NOTIFICATION_MINIMAP_UPDATE.a().intValue();
    private final dxio<byqg> b;

    public pcs(dxio<byqg> dxioVar) {
        this.b = dxioVar;
    }

    @Override // defpackage.pcx
    public final boolean a(int i) {
        return a == i;
    }

    @Override // defpackage.pcx
    public final dssr<dlez> b() {
        return (dssr) dlez.d.cu(7);
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ int c(dlez dlezVar) {
        return dpyv.COMMUTE_NOTIFICATION_MINIMAP_ROUTE_UPDATE.dm;
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ void d(pau pauVar, pas pasVar, dlez dlezVar) {
        dlez dlezVar2 = dlezVar;
        byte[] G = dlezVar2.a.G();
        this.b.a().a(BitmapFactory.decodeByteArray(G, 0, G.length), dlezVar2.b, dlezVar2.c);
    }
}
