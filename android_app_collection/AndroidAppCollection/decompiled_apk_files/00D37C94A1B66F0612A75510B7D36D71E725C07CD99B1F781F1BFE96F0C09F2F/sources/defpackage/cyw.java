package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cyw  reason: default package */
/* loaded from: classes3.dex */
public final class cyw implements View.OnFocusChangeListener {
    public daq a;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        daq daqVar = this.a;
        if (daqVar != null) {
            if (czu.b == null) {
                czu.b = new daw();
            }
            czu.b.a = view;
            czu.b.b = z;
            daqVar.a.l().K(daqVar, czu.b);
            czu.b.a = null;
        }
    }
}
