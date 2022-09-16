package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: bwal  reason: default package */
/* loaded from: classes4.dex */
public final class bwal extends bvwn<dmgm> {
    private final gga b;
    private final dxio<afha> c;

    public bwal(gga ggaVar, dxio<afha> dxioVar) {
        super(dmgm.d);
        this.b = ggaVar;
        this.c = dxioVar;
    }

    @Override // defpackage.bvwn
    public final /* bridge */ /* synthetic */ void a(dmgm dmgmVar) {
        dmgm dmgmVar2 = dmgmVar;
        ahs a = new ahr().a();
        a.a.setData(Uri.parse(dmgmVar2.a));
        this.c.a().f(this.b, a.a, true != dmgmVar2.b ? 4 : 2);
    }
}
