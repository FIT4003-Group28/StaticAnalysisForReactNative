package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axsz  reason: default package */
/* loaded from: classes3.dex */
public final class axsz implements bzpu {
    final /* synthetic */ axtp a;
    private final azrv b;
    @dzsi
    private final dpyv c;

    public axsz(axtp axtpVar, @dzsi azrv azrvVar, dpyv dpyvVar) {
        this.a = axtpVar;
        this.b = azrvVar;
        this.c = dpyvVar;
    }

    @Override // defpackage.bzpu
    public final void a() {
        axtp axtpVar = this.a;
        if (!axtpVar.b.aZ) {
            return;
        }
        try {
            this.a.b.D(axtpVar.J(this.b));
        } catch (IllegalStateException e) {
            bvoo.i(e);
        }
        this.a.X(this.c);
    }

    @Override // defpackage.bzpu
    public final void b() {
        int i;
        if (!this.a.b.aZ) {
            return;
        }
        dndr a = this.b.a();
        String b = this.b.b();
        if (a == dndr.HOME) {
            i = true != b.isEmpty() ? R.string.EDIT_HOME_ENABLE_SEARCH_HISTORY_PROMPT : R.string.ADD_HOME_ENABLE_SEARCH_HISTORY_PROMPT;
        } else if (a == dndr.WORK) {
            i = true != b.isEmpty() ? R.string.EDIT_WORK_ENABLE_SEARCH_HISTORY_PROMPT : R.string.ADD_WORK_ENABLE_SEARCH_HISTORY_PROMPT;
        } else if (a != dndr.NICKNAME) {
            throw new IllegalStateException();
        } else {
            i = R.string.ADD_LABEL_ENABLE_SEARCH_HISTORY_PROMPT;
        }
        final axtp axtpVar = this.a;
        final azrv azrvVar = this.b;
        final azsg a2 = azrt.a(azrvVar, axtpVar.e);
        new AlertDialog.Builder(this.a.b).setMessage(i).setPositiveButton(R.string.CONTINUE_BUTTON, new DialogInterface.OnClickListener(axtpVar, azrvVar, a2) { // from class: axsi
            private final axtp a;
            private final azrv b;
            private final azsg c;

            {
                this.a = axtpVar;
                this.b = azrvVar;
                this.c = a2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                axtp axtpVar2 = this.a;
                azrv azrvVar2 = this.b;
                azsg azsgVar = this.c;
                axtpVar2.i.i(cjtd.a(dtxj.aH));
                anee m = azrvVar2.m();
                if (m == null) {
                    anee b2 = axtpVar2.s.b(axtpVar2.u, azrvVar2);
                    azru o = azrvVar2.o();
                    o.h(b2);
                    azrvVar2 = o.a();
                }
                axtpVar2.k.b(new axrz(axtpVar2.e, axtpVar2.i, azrvVar2, azsgVar, m)).a("geo_personal_place_label_or_contact");
            }
        }).setNegativeButton(R.string.CANCEL_BUTTON, new axsq(this.a)).show();
        this.a.j.g().d(cjtd.a(dtxj.aG));
    }
}
