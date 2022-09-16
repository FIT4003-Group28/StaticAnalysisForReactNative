package defpackage;

import android.app.Dialog;
import android.view.View;
/* compiled from: PG */
/* renamed from: dg  reason: default package */
/* loaded from: classes3.dex */
final class dg extends dw {
    final /* synthetic */ dw a;
    final /* synthetic */ dh b;

    public dg(dh dhVar, dw dwVar) {
        this.b = dhVar;
        this.a = dwVar;
    }

    @Override // defpackage.dw
    public final View a(int i) {
        if (this.a.b()) {
            return this.a.a(i);
        }
        Dialog dialog = this.b.d;
        if (dialog == null) {
            return null;
        }
        return dialog.findViewById(i);
    }

    @Override // defpackage.dw
    public final boolean b() {
        return this.a.b() || this.b.e;
    }
}
