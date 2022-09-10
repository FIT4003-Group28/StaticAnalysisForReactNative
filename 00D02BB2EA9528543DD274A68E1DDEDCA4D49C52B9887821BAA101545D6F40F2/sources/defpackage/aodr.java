package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: aodr  reason: default package */
/* loaded from: classes2.dex */
public final class aodr extends gen implements DialogInterface.OnClickListener {
    public aoea a;
    public cqkj b;
    public AlertDialog c;
    public aodz d;
    private aodq e;

    public static aodr g(aoeb aoebVar, boolean z, aodq aodqVar) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("duration-state", aoebVar);
        bundle.putBoolean("show-open-ended-checkbox", z);
        bundle.putSerializable("result-handler", aodqVar);
        aodr aodrVar = new aodr();
        aodrVar.B(bundle);
        return aodrVar;
    }

    private final aoeb q() {
        aogq h = this.d.h();
        int i = 1;
        if (true == this.d.d().booleanValue()) {
            i = 2;
        }
        return aoeb.e(h, i);
    }

    private static <T extends Serializable> T w(Bundle bundle, String str, Class<T> cls) {
        return cls.cast(bundle.getSerializable(str));
    }

    @Override // defpackage.gen
    public final /* bridge */ /* synthetic */ Dialog i(Bundle bundle) {
        if (this.d == null) {
            this.e = (aodq) w(this.o, "result-handler", aodq.class);
            aoeb aoebVar = (aoeb) w(this.o, "duration-state", aoeb.class);
            if (bundle != null && bundle.containsKey("duration-state")) {
                aoebVar = (aoeb) w(bundle, "duration-state", aoeb.class);
            }
            aoeb aoebVar2 = aoebVar;
            boolean z = this.o.getBoolean("show-open-ended-checkbox");
            aoea aoeaVar = this.a;
            Runnable runnable = new Runnable(this) { // from class: aodp
                private final aodr a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    aodr aodrVar = this.a;
                    AlertDialog alertDialog = aodrVar.c;
                    if (alertDialog != null) {
                        alertDialog.getButton(-1).setEnabled(aodrVar.d.g());
                    }
                }
            };
            Activity activity = (Activity) ((dxjd) aoeaVar.a).a;
            aoea.a(activity, 1);
            cqat a = aoeaVar.b.a();
            aoea.a(a, 2);
            aoea.a(aoebVar2, 3);
            aoea.a(runnable, 5);
            this.d = new aodz(activity, a, aoebVar2, z, runnable);
        }
        cqkf c = this.b.c(new aodx(), null);
        c.e(this.d);
        AlertDialog.Builder builder = new AlertDialog.Builder(J());
        builder.setTitle(J().getString(R.string.MAPS_ACTIVITY_EDIT_SEGMENT_DURATION));
        builder.setView(c.c());
        builder.setPositiveButton(J().getString(R.string.SAVE), this);
        builder.setNegativeButton(J().getString(R.string.CANCEL_BUTTON), this);
        AlertDialog show = builder.show();
        this.c = show;
        show.getButton(-1).setEnabled(this.d.g());
        return this.c;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            dbsg<aogy> d = q().d();
            if (d.a()) {
                this.e.a(d.b(), this);
            }
        }
        aT();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyi.aS;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putSerializable("duration-state", q());
    }
}
