package defpackage;

import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
/* compiled from: PG */
/* renamed from: lxw  reason: default package */
/* loaded from: classes3.dex */
public final class lxw extends ne {
    public lxv a = lxv.a();
    final /* synthetic */ lxd b;

    public lxw() {
    }

    public lxw(lxd lxdVar) {
        this.b = lxdVar;
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        LinearLayout linearLayout;
        lxv lxvVar = this.a;
        int i3 = lxvVar.a + i;
        lxvVar.a = i3;
        if (!lxvVar.c) {
            return;
        }
        boolean z = Math.abs(i3) > 50;
        boolean z2 = this.a.b;
        if (!z2) {
            if (z) {
                LinearLayout linearLayout2 = this.b.b;
                if (linearLayout2 == null) {
                    return;
                }
                lxd.j(linearLayout2, true, linearLayout2.getWidth());
                lxd lxdVar = this.b;
                aoob aoobVar = lxdVar.c;
                if (aoobVar != null) {
                    lxdVar.a.u(new acte(aoobVar), null);
                }
                this.a.b = true;
                return;
            }
            z = false;
        }
        if (!z2 || z || (linearLayout = this.b.b) == null) {
            return;
        }
        lxd.j(linearLayout, false, linearLayout.getWidth());
        this.a.b = false;
    }
}
