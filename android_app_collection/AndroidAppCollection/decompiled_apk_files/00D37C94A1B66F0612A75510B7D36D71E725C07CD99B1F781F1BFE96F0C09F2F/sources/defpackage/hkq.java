package defpackage;

import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: hkq  reason: default package */
/* loaded from: classes3.dex */
final class hkq implements zbo {
    final /* synthetic */ hkr a;
    final /* synthetic */ yo b;

    public hkq(hkr hkrVar, yo yoVar) {
        this.a = hkrVar;
        this.b = yoVar;
    }

    @Override // defpackage.zbo
    public final void nM(MotionEvent motionEvent, boolean z) {
        ((hku) this.a.e.c()).a(this.b.a());
    }

    @Override // defpackage.zbo
    public final boolean nQ(MotionEvent motionEvent, boolean z) {
        return true;
    }
}
