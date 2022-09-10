package defpackage;

import com.google.android.apps.gmm.messaging.common.ConfigurableCurvularLayoutView;
/* compiled from: PG */
/* renamed from: aqhx  reason: default package */
/* loaded from: classes2.dex */
public final class aqhx implements aqop {
    private final dxio<aqgo> a;
    private final dxio<aqkt> b;
    private final btlu c;
    private final apzb d;
    private final String e;

    public aqhx(dxio<aqgo> dxioVar, dxio<aqkt> dxioVar2, btlu btluVar, apzb apzbVar, String str) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = btluVar;
        this.d = apzbVar;
        this.e = str;
    }

    @Override // defpackage.aqop
    public final boolean a(cufw cufwVar) {
        return this.a.a().a(cufwVar, this.e);
    }

    @Override // defpackage.aqop
    public final apzb b() {
        return this.d;
    }

    @Override // defpackage.aqop
    public final int c() {
        return 2;
    }

    @Override // defpackage.aqop
    public final cjtd d() {
        return aqdb.a(dtxv.bK, this.e).a();
    }

    @Override // defpackage.aqop
    public final void e(ConfigurableCurvularLayoutView configurableCurvularLayoutView) {
        configurableCurvularLayoutView.a(new aqog(), this.b.a().a(this.c, this.e));
    }
}
