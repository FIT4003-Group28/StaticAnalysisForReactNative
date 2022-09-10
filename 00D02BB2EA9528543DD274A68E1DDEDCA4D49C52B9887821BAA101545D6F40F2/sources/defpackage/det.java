package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: det  reason: default package */
/* loaded from: classes6.dex */
public abstract class det extends des {
    public aufc ah;
    public dxio<gcg> ai;
    public dxio<gce> aj;
    @dzsi
    private ContextThemeWrapper am;

    @Override // defpackage.fd
    public final Context H() {
        ContextThemeWrapper contextThemeWrapper = this.am;
        return contextThemeWrapper != null ? contextThemeWrapper : super.H();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean aN() {
        return this.ah.b() || (this.ai.a().a() && this.aj.a().h());
    }

    protected abstract void aO(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(layoutInflater.getContext(), true != aN() ? 2132018220 : 2132018218);
        this.am = contextThemeWrapper;
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        View inflate = cloneInContext.inflate(R.layout.ar_hero_dialog_layout, viewGroup);
        aO(cloneInContext, (ViewGroup) inflate.findViewById(R.id.ar_hero_dialog_container));
        return inflate;
    }

    @Override // defpackage.des, defpackage.ex, defpackage.fd
    public void s() {
        super.s();
        Dialog dialog = this.d;
        Window window = dialog != null ? dialog.getWindow() : null;
        if (window == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setLayout(-1, -2);
    }
}
