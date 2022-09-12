package defpackage;

import android.graphics.Rect;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akyg  reason: default package */
/* loaded from: classes2.dex */
public final class akyg extends akyc {
    final /* synthetic */ Rect a;
    final /* synthetic */ akqq d;

    public akyg(Rect rect, akqq akqqVar) {
        this.a = rect;
        this.d = akqqVar;
    }

    @Override // defpackage.akyc
    public final void a(akyb akybVar) {
        alad p = akybVar.c().p();
        alae a = alae.a(this.a.exactCenterX(), this.a.exactCenterY(), akybVar.a(), akybVar.b());
        alaa b = alad.b(p);
        b.c(this.d);
        b.f = a;
        akybVar.d(b.a(), this.b, this.c);
    }
}
