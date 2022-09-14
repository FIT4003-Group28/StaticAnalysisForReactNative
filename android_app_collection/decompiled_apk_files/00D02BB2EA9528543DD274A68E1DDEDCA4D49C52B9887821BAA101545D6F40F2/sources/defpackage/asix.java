package defpackage;

import android.content.Intent;
import android.view.View;
/* compiled from: PG */
/* renamed from: asix  reason: default package */
/* loaded from: classes2.dex */
class asix implements cqkp {
    final /* synthetic */ asiz a;

    public asix(asiz asizVar) {
        this.a = asizVar;
    }

    public View.OnClickListener a() {
        return new View.OnClickListener(this) { // from class: asiw
            private final asix a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        asiz asizVar = this.a;
        asizVar.aJ();
        asizVar.aK(asizVar.am, asiz.ad);
        asizVar.al = true;
        asji asjiVar = asizVar.aq;
        dbsk.s(asjiVar);
        asjiVar.a.d.a().e(2);
        Intent intent = new Intent();
        intent.setAction("com.google.android.apps.opa.MORRIS_OOBE_OPT_IN");
        intent.putExtra("entry_point", "gmm_dialog");
        asjiVar.a.ad.a().f(asjiVar.a.J(), intent, 4);
    }
}
