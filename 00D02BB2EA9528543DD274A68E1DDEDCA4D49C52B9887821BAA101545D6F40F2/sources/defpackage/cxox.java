package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxox  reason: default package */
/* loaded from: classes5.dex */
public final class cxox implements View.OnLayoutChangeListener {
    final /* synthetic */ cxpn a;

    public cxox(cxpn cxpnVar) {
        this.a = cxpnVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.a.removeOnLayoutChangeListener(this);
        this.a.f();
        cxpn cxpnVar = this.a;
        if (cxpnVar.r) {
            cxpnVar.c();
        }
    }
}
