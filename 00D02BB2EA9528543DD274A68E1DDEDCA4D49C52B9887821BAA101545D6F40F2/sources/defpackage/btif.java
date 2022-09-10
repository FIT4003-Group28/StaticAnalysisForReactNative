package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btif  reason: default package */
/* loaded from: classes4.dex */
public final class btif extends gen implements DialogInterface.OnClickListener {
    public cqat a;
    public btht b;
    public cqkj c;
    public AlertDialog d;
    public aodc e;
    private cqkf<aocz> g;

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void Qe() {
        this.g.e(null);
        super.Qe();
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(J());
        this.e = new aodc(J(), this.a, new Runnable(this) { // from class: btid
            private final btif a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                btif btifVar = this.a;
                btifVar.d.getButton(-1).setEnabled(btifVar.e.e());
            }
        });
        cqkf<aocz> c = this.c.c(new aocy(), null);
        this.g = c;
        c.e(this.e);
        builder.setTitle(R.string.MAPS_ACTIVITY_DELETE_LOCATION_HISTORY_RANGE_TITLE);
        builder.setView(this.g.c());
        builder.setPositiveButton(R.string.MAPS_ACTIVITY_DELETE_LOCATION_HISTORY_RANGE_CONTINUE, this);
        builder.setNegativeButton(R.string.CANCEL_BUTTON, this);
        AlertDialog show = builder.show();
        this.d = show;
        show.getButton(-1).setEnabled(false);
        return this.d;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        aT();
        if (i == -1) {
            dbsg<dpop> f = this.e.f();
            dbsg<dngq> g = this.e.g();
            if (!f.a() || !g.a()) {
                return;
            }
            btie btieVar = new btie(f.b(), g.b());
            String b = this.e.a().b();
            String b2 = this.e.b().b();
            btht bthtVar = this.b;
            bthq h = bths.h();
            h.g(Rp(R.string.MAPS_ACTIVITY_DELETE_LOCATION_HISTORY_RANGE_TITLE));
            h.f(bths.a.h(new String[]{Rq(R.string.MAPS_ACTIVITY_DELETE_LOCATION_HISTORY_RANGE_CONFIRM, b, b2), Rp(R.string.MAPS_ACTIVITY_DELETE_ALL_LOCATION_HISTORY_EXPLANATION)}));
            h.b(Rp(R.string.MAPS_ACTIVITY_DELETE_ALL_LOCATION_HISTORY_CONFIRMATION));
            h.c(Rp(R.string.DELETE_BUTTON));
            h.d(cjtd.a(dtyi.ao));
            ((btha) h).a = dtyi.an;
            h.e(btieVar);
            bthtVar.a(h.a());
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyi.ap;
    }
}
