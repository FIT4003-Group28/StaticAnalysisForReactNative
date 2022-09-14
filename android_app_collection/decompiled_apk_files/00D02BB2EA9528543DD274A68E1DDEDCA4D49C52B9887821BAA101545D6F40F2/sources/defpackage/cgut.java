package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cgut  reason: default package */
/* loaded from: classes4.dex */
public final class cgut implements ggd {
    public final gga a;
    @dzsi
    public cgel b;

    public cgut(gga ggaVar) {
        this.a = ggaVar;
    }

    @Override // defpackage.ggd
    public final void a(final Runnable runnable) {
        cgel cgelVar = this.b;
        if (cgelVar == null || !cgelVar.bI()) {
            runnable.run();
        } else {
            new AlertDialog.Builder(this.a).setTitle("Abandon Edit?").setMessage("Any changes you have made will not be submitted").setPositiveButton(R.string.YES_BUTTON, new DialogInterface.OnClickListener(runnable) { // from class: cgur
                private final Runnable a;

                {
                    this.a = runnable;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.run();
                    dialogInterface.dismiss();
                }
            }).setNegativeButton(R.string.NO_BUTTON, cgus.a).show();
        }
    }

    @Override // defpackage.ggd
    public final void b() {
    }

    @Override // defpackage.ggd
    public final boolean c(fd fdVar) {
        return (fdVar instanceof cgel) && ((cgel) fdVar).bI();
    }

    public final boolean d() {
        return this.a.bc.a() == this;
    }
}
