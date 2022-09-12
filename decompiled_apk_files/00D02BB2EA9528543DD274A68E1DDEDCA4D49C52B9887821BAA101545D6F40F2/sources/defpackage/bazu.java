package defpackage;

import android.content.DialogInterface;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bazu  reason: default package */
/* loaded from: classes3.dex */
final class bazu implements DialogInterface.OnClickListener {
    final /* synthetic */ bazw a;

    public bazu(bazw bazwVar) {
        this.a = bazwVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        final bazw bazwVar = this.a;
        deha.q(bazwVar.a.x().f(bazwVar.e, new axxd(bazwVar) { // from class: bazm
            private final bazw a;

            {
                this.a = bazwVar;
            }

            @Override // defpackage.axxd
            public final void a(boolean z) {
                bazw bazwVar2 = this.a;
                if (z) {
                    bazwVar2.c.l();
                }
            }
        }), bvqj.b(new bvqg(bazwVar) { // from class: bazn
            private final bazw a;

            {
                this.a = bazwVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                bazw bazwVar2 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    bazwVar2.c.j(bazwVar2);
                } else {
                    Toast.makeText(bazwVar2.t, (int) R.string.CONTACT_DELETION_ERROR_MESSAGE, 0).show();
                }
            }
        }), bazwVar.d.h());
    }
}
