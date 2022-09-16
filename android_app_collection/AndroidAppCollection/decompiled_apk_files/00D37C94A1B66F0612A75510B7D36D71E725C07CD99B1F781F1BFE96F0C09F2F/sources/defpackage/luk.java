package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: luk  reason: default package */
/* loaded from: classes3.dex */
public final class luk implements fry {
    private final fzo a;

    public luk(fzo fzoVar) {
        this.a = fzoVar;
    }

    @Override // defpackage.fry
    public final int g() {
        return R.id.menu_inline_global_play_pause;
    }

    @Override // defpackage.fry
    public final int h() {
        return R.menu.inline_menu;
    }

    @Override // defpackage.fry
    public final frx i() {
        return null;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
    }

    @Override // defpackage.fry
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.fry
    public final boolean l() {
        return true;
    }

    @Override // defpackage.fry
    public final boolean m() {
        fzo fzoVar = this.a;
        if (fzoVar.g == null) {
            View inflate = LayoutInflater.from(fzoVar.a).inflate(R.layout.inline_global_play_pause_dialog, (ViewGroup) null);
            fzoVar.d = (RadioButton) inflate.findViewById(R.id.inline_global_play_on);
            fzoVar.e = (RadioButton) inflate.findViewById(R.id.inline_global_play_on_wifi_only);
            fzoVar.f = (RadioButton) inflate.findViewById(R.id.inline_global_play_off);
            fzoVar.h = fzoVar.b.oi();
            fzoVar.h.D(new acte(actj.INLINE_DIALOG_SETTINGS_ON));
            fzoVar.h.D(new acte(actj.INLINE_DIALOG_SETTINGS_ONLY_WIFI));
            fzoVar.h.D(new acte(actj.INLINE_DIALOG_SETTINGS_OFF));
            fzoVar.g = new AlertDialog.Builder(fzoVar.a).setView(inflate).setTitle(R.string.menu_inline_global_play_pause).setPositiveButton(R.string.ok, new fzn(fzoVar)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setCancelable(true).create();
        }
        int b = fzoVar.c.b();
        if (b == 2) {
            fzoVar.d.setChecked(true);
        } else if (b == 1) {
            fzoVar.e.setChecked(true);
        } else if (b == 0) {
            fzoVar.f.setChecked(true);
        }
        fzoVar.g.show();
        return true;
    }
}
