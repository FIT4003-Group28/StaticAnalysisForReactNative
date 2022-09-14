package defpackage;

import android.graphics.Rect;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akyk  reason: default package */
/* loaded from: classes2.dex */
public final class akyk extends akyc {
    final /* synthetic */ akqq a;
    final /* synthetic */ float d;
    final /* synthetic */ Rect e;

    public akyk(akqq akqqVar, float f, Rect rect) {
        this.a = akqqVar;
        this.d = f;
        this.e = rect;
    }

    @Override // defpackage.akyc
    public final void a(akyb akybVar) {
        alaa a = alad.a();
        a.c(this.a);
        a.c = this.d;
        Rect rect = this.e;
        if (rect != null) {
            a.f = alae.a(rect.exactCenterX(), this.e.exactCenterY(), akybVar.a(), akybVar.b());
        } else {
            a.f = alae.a;
        }
        akybVar.d(a.a(), this.b, this.c);
    }
}
