package defpackage;

import android.support.v7.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dkh  reason: default package */
/* loaded from: classes3.dex */
public final class dkh implements Runnable {
    final /* synthetic */ dlc a;
    private final /* synthetic */ int b;

    public dkh(dlc dlcVar) {
        this.a = dlcVar;
    }

    public dkh(dlc dlcVar, int i) {
        this.b = i;
        this.a = dlcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.e.mr();
        } else if (i != 1) {
            RecyclerView recyclerView = this.a.t;
            if (recyclerView == null || !recyclerView.at()) {
                if (this.a.D.d()) {
                    this.a.D.b(1);
                }
                this.a.E = 0;
                return;
            }
            RecyclerView recyclerView2 = this.a.t;
            if (!recyclerView2.r || recyclerView2.getVisibility() == 8) {
                this.a.E = 0;
                return;
            }
            dlc dlcVar = this.a;
            int i2 = dlcVar.E;
            if (i2 >= 3) {
                dlcVar.E = 0;
                if (!dlcVar.D.d()) {
                    return;
                }
                this.a.D.b(1);
                return;
            }
            dlcVar.E = i2 + 1;
            lj.H(dlcVar.t, dlcVar.G);
        } else {
            daq daqVar = this.a.y;
            if (daqVar == null) {
                return;
            }
            daqVar.a(new djv());
        }
    }
}
