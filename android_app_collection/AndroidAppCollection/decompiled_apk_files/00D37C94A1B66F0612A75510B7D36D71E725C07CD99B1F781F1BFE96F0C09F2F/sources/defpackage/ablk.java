package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ablk  reason: default package */
/* loaded from: classes.dex */
public final class ablk extends ablb implements abkr, abkx {
    public aaza ae;
    public abks af;
    public abky ag;
    public ajxz ah;
    public ajyi ai;
    public Activity aj;
    public abre ak;
    public asrf al;
    public View am;
    public LinearLayout an;
    public ViewGroup ao;
    public View ap;
    private apzg aq;

    private final void aG() {
        Dialog dialog = this.d;
        if (dialog == null || dialog.getWindow() == null) {
            return;
        }
        Window window = this.d.getWindow();
        window.setLayout(this.af.a, -2);
        window.setGravity(this.af.b);
    }

    @Override // defpackage.ablb, defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        this.aj = activity;
    }

    @Override // defpackage.dp
    public final void U() {
        super.U();
        this.af.b(this);
    }

    @Override // defpackage.abkx
    public final int b() {
        return 2;
    }

    @Override // defpackage.abkx
    public final void c() {
        dismiss();
    }

    @Override // defpackage.abkr
    public final void d() {
        aG();
    }

    @Override // defpackage.abkx
    public final void i() {
        this.O.setVisibility(0);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 == null) {
            dismiss();
            return;
        }
        if (this.aq == null) {
            this.aq = aafr.c(bundle2.getByteArray("navigation_endpoint"));
        }
        ParcelableMessageLite parcelableMessageLite = (ParcelableMessageLite) this.m.getParcelable("live_chat_context_menu_included_renderer");
        if (parcelableMessageLite != null) {
            this.al = (asrf) parcelableMessageLite.a(asrf.a);
        }
        this.ai.a(assn.class);
        mN(1, 0);
        this.af.a(this);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mS() {
        super.mS();
        aG();
        this.ag.b(this);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.live_chat_context_menu_bottom_sheet_dialog, viewGroup);
        this.am = inflate.findViewById(R.id.progress_bar);
        this.an = (LinearLayout) inflate.findViewById(R.id.menu_container);
        this.ao = (ViewGroup) inflate.findViewById(R.id.header_item_container);
        this.ap = inflate.findViewById(R.id.separator);
        aaza aazaVar = this.ae;
        aazaVar.f(aazaVar.d(this.aq), new ablj(this));
        inflate.setVisibility(8);
        return inflate;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void my() {
        super.my();
        this.af.b(this);
        this.ao.setVisibility(8);
        this.ap.setVisibility(8);
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (zew.y(this.aj) || configuration.orientation != 2) {
            return;
        }
        dismiss();
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.ag.a(this);
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        Dialog oy = super.oy(bundle);
        oy.requestWindowFeature(1);
        if (oy.getWindow() != null) {
            oy.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        return oy;
    }
}
