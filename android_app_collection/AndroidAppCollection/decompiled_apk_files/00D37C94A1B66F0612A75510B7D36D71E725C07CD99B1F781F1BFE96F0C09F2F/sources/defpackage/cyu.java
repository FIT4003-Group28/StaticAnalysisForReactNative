package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cyu  reason: default package */
/* loaded from: classes3.dex */
public final class cyu implements View.OnClickListener {
    public daq a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        daq daqVar = this.a;
        if (daqVar != null) {
            if (czu.a == null) {
                czu.a = new cyj();
            }
            czu.a.a = view;
            daqVar.a.l().K(daqVar, czu.a);
            czu.a.a = null;
        }
    }
}
