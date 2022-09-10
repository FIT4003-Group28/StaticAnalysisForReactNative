package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: azko  reason: default package */
/* loaded from: classes3.dex */
public final class azko extends gen implements DialogInterface.OnShowListener, DialogInterface.OnClickListener {
    public static final /* synthetic */ int e = 0;
    public axwq a;
    public AlertDialog b;
    public azwf c;
    @dzsi
    public nvl d;
    private azwm<?> g;

    public final void g() {
        Toast.makeText(J(), J().getString(R.string.MY_PLACES_DELETE_SERVICE_UNAVAILABLE), 0).show();
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        if (bundle == null) {
            bundle = this.o;
        }
        if (bundle.containsKey("myplaces_item")) {
            Serializable serializable = bundle.getSerializable("myplaces_item");
            dbsk.s(serializable);
            this.g = (azwm) serializable;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(J());
        builder.setTitle(Rp(R.string.MY_PLACES_DELETE_CONFIRM_TITLE));
        builder.setPositiveButton(Rp(R.string.MY_PLACES_DELETE_ITEM_COMMAND), this);
        builder.setNegativeButton(Rp(R.string.CANCEL_BUTTON), this);
        builder.setMessage(Rp(R.string.LOADING));
        AlertDialog create = builder.create();
        this.b = create;
        create.setOnShowListener(this);
        return this.b;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.aD && i == -1) {
            if (this.c == null) {
                g();
                return;
            }
            this.b.getButton(-1).setEnabled(false);
            this.b.getButton(-2).setEnabled(false);
            this.b.setMessage(Rp(R.string.LOADING));
            this.a.B(this.c, new azkn(this), bvrj.UI_THREAD);
        }
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        if (!this.aD) {
            return;
        }
        this.b.getButton(-1).setEnabled(false);
        this.a.A(this.g, new azkm(this), bvrj.UI_THREAD);
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putSerializable("myplaces_item", this.g);
    }
}
