package defpackage;

import android.app.AlertDialog;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cben  reason: default package */
/* loaded from: classes4.dex */
class cben implements cbrh {
    final /* synthetic */ AlertDialog a;
    final /* synthetic */ cbep b;

    public cben(cbep cbepVar, AlertDialog alertDialog) {
        this.b = cbepVar;
        this.a = alertDialog;
    }

    @Override // defpackage.cbrh
    public String a() {
        return this.b.c;
    }

    @Override // defpackage.cbrh
    public cqkl b() {
        this.a.dismiss();
        int a = dijq.a(this.b.b.b);
        if (a != 0 && a == 3) {
            cbep cbepVar = this.b;
            dafk b = ckos.b(cbepVar.d.findViewById(16908290), R.string.EVENT_CREATION_EDIT_DELAY_TOAST, 0);
            b.p(this.b.d.getString(R.string.OK_BUTTON), new View.OnClickListener(this) { // from class: cbem
                private final cben a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cbep cbepVar2 = this.a.b;
                    dafk dafkVar = cbepVar2.m;
                    if (dafkVar != null) {
                        dafkVar.d();
                        cbepVar2.m = null;
                    }
                }
            });
            cbepVar.m = b;
            this.b.m.c();
        }
        return cqkl.a;
    }

    @Override // defpackage.cbrh
    public cqkl c() {
        this.a.dismiss();
        this.b.h.a().k(null, dkcp.EVENTS);
        return cqkl.a;
    }
}
