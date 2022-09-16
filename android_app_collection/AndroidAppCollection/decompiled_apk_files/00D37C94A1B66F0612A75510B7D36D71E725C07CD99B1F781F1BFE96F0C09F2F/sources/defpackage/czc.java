package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czc  reason: default package */
/* loaded from: classes3.dex */
public final class czc implements View.OnLongClickListener {
    public daq a;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        daq daqVar = this.a;
        if (daqVar != null) {
            if (czu.c == null) {
                czu.c = new dck();
            }
            czu.c.a = view;
            Object K = daqVar.a.l().K(daqVar, czu.c);
            czu.c.a = null;
            if (K != null && ((Boolean) K).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
