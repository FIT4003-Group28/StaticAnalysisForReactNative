package defpackage;

import android.database.DataSetObserver;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zww  reason: default package */
/* loaded from: classes4.dex */
public final class zww extends DataSetObserver {
    final /* synthetic */ ChooseFilterView a;
    final /* synthetic */ zwx b;

    public zww(zwx zwxVar, ChooseFilterView chooseFilterView) {
        this.b = zwxVar;
        this.a = chooseFilterView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        zxh zxhVar = this.b.aI;
        if (zxhVar == null) {
            zep.l("Video view manager not ready.");
            return;
        }
        vqr vqrVar = zxhVar.d;
        if (vqrVar == null) {
            zep.l("Video in video view manager not set.");
            return;
        }
        vqrVar.B(this.a.c().c);
        if (this.a.c().u()) {
            return;
        }
        zwx zwxVar = this.b;
        final ChooseFilterView chooseFilterView = this.a;
        zwxVar.bw(new Runnable() { // from class: zwv
            @Override // java.lang.Runnable
            public final void run() {
                zww zwwVar = zww.this;
                ChooseFilterView chooseFilterView2 = chooseFilterView;
                if (zwwVar.b.aJ() != null) {
                    zwwVar.b.aJ().setVisibility(8);
                }
                chooseFilterView2.c().m();
            }
        });
    }
}
