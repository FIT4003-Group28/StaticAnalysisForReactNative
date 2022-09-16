package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abln  reason: default package */
/* loaded from: classes.dex */
public final class abln extends ablc {
    public aaza ae;
    public Activity af;
    public abre ag;
    public View ah;
    public LinearLayout ai;
    private apzg aj;

    @Override // defpackage.ablc, defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        this.af = activity;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (this.aj == null) {
            Bundle bundle2 = this.m;
            if (bundle2 == null) {
                dismiss();
            } else {
                this.aj = aafr.c(bundle2.getByteArray("navigation_endpoint"));
            }
        }
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (zew.y(this.af) || configuration.orientation != 2) {
            return;
        }
        dismiss();
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        View inflate = LayoutInflater.from(this.af).inflate(R.layout.live_chat_item_context_menu_dialog, (ViewGroup) null);
        this.ah = inflate.findViewById(R.id.progress_bar);
        this.ai = (LinearLayout) inflate.findViewById(R.id.menu_container);
        aaza aazaVar = this.ae;
        aazaVar.f(aazaVar.d(this.aj), new ablm(this));
        nw nwVar = new nw(this.af);
        nwVar.n(R.string.live_chat_item_context_menu_title);
        nwVar.p(inflate);
        nwVar.c(true);
        return nwVar.b();
    }
}
