package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: askz  reason: default package */
/* loaded from: classes2.dex */
final class askz extends akyc {
    final /* synthetic */ akqq a;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ Rect f;

    public askz(akqq akqqVar, float f, float f2, Rect rect) {
        this.a = akqqVar;
        this.d = f;
        this.e = f2;
        this.f = rect;
    }

    @Override // defpackage.akyc
    public final void a(akyb akybVar) {
        alaa a = alad.a();
        a.c(this.a);
        a.c = this.d;
        a.d = 65.0f;
        a.e = this.e;
        Rect rect = this.f;
        if (rect != null) {
            a.f = alae.a(rect.exactCenterX(), this.f.exactCenterY(), akybVar.a(), akybVar.b());
        }
        akybVar.d(a.a(), this.b, this.c);
    }
}
