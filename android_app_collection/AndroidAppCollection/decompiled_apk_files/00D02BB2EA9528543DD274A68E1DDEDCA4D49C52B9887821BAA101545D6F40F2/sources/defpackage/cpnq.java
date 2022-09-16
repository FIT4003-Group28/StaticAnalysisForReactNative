package defpackage;

import android.widget.RadioButton;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cpnq  reason: default package */
/* loaded from: classes5.dex */
final class cpnq implements Runnable {
    final /* synthetic */ dgzr a;
    final /* synthetic */ cpnv b;

    public cpnq(cpnv cpnvVar, dgzr dgzrVar) {
        this.b = cpnvVar;
        this.a = dgzrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.l();
        dsrj<dgzv> dsrjVar = this.a.b;
        int min = Math.min(dsrjVar.size(), this.b.e().getChildCount() - 1);
        for (int i = 0; i < min; i++) {
            RadioButton radioButton = (RadioButton) this.b.e().getChildAt(i);
            dgzv dgzvVar = dsrjVar.get(i);
            cpnv cpnvVar = this.b;
            dhad dhadVar = dgzvVar.a;
            if (dhadVar == null) {
                dhadVar = dhad.c;
            }
            dhaj dhajVar = dhadVar.a;
            if (dhajVar == null) {
                dhajVar = dhaj.c;
            }
            if (dhajVar.a.size() != 0) {
                dhad dhadVar2 = dgzvVar.a;
                if (dhadVar2 == null) {
                    dhadVar2 = dhad.c;
                }
                dhaj dhajVar2 = dhadVar2.a;
                if (dhajVar2 == null) {
                    dhajVar2 = dhaj.c;
                }
                cpnvVar.o(radioButton, dhajVar2.a.get(0), new cpns(cpnvVar, dgzvVar));
            }
        }
        cpnv cpnvVar2 = this.b;
        cpnr cpnrVar = new cpnr(cpnvVar2);
        cpnvVar2.o((RadioButton) this.b.e().getChildAt(this.b.e().getChildCount() - 1), cpnvVar2.a().getString(R.string.keep_original) + "<br>" + String.format("<font color='#828282'>%s</font>", cpnv.n(cpnvVar2.a)), cpnrVar);
        this.b.e().setVisibility(0);
    }
}
