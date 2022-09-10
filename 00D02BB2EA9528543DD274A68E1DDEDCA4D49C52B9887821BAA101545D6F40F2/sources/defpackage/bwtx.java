package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: bwtx  reason: default package */
/* loaded from: classes4.dex */
final class bwtx extends akyc {
    final /* synthetic */ Rect a;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ akqq f;

    public bwtx(Rect rect, int i, int i2, akqq akqqVar) {
        this.a = rect;
        this.d = i;
        this.e = i2;
        this.f = akqqVar;
    }

    @Override // defpackage.akyc
    public final void a(akyb akybVar) {
        alad p = akybVar.c().p();
        alae a = alae.a(this.a.exactCenterX(), this.a.exactCenterY(), this.d, this.e);
        alaa b = alad.b(p);
        b.c(this.f);
        b.f = a;
        akybVar.d(b.a(), this.b, this.c);
    }
}
