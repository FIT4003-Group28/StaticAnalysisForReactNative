package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ayee  reason: default package */
/* loaded from: classes3.dex */
final class ayee implements axyy {
    final /* synthetic */ ayen a;

    public ayee(ayen ayenVar) {
        this.a = ayenVar;
    }

    @Override // defpackage.axyy
    public final void a(List list) {
    }

    @Override // defpackage.axyy
    public final void b() {
        iii iiiVar = new iii();
        iiiVar.a = this.a.Ro(R.string.LIST_NOT_AVAILABLE_DIALOG_TITLE);
        iiiVar.b = this.a.Ro(R.string.LIST_NOT_AVAILABLE_DIALOG_TEXT);
        iiiVar.d(this.a.Ro(R.string.OK_BUTTON), new View.OnClickListener(this) { // from class: ayed
            private final ayee a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ayee ayeeVar = this.a;
                gga ggaVar = ayeeVar.a.aE;
                dbsk.s(ggaVar);
                ggaVar.g().f();
                ayeeVar.a.av.a().n();
            }
        }, cjtd.a(dtxy.eg));
        gga ggaVar = this.a.aE;
        dbsk.s(ggaVar);
        iiiVar.a(ggaVar, this.a.g).k();
    }
}
