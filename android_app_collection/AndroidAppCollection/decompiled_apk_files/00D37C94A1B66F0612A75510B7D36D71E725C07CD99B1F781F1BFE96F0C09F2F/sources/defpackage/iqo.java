package defpackage;

import android.view.MenuItem;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: iqo  reason: default package */
/* loaded from: classes3.dex */
final class iqo implements fry {
    final /* synthetic */ iqp a;

    public iqo(iqp iqpVar) {
        this.a = iqpVar;
    }

    @Override // defpackage.fry
    public final int g() {
        return R.id.menu_save_playlist;
    }

    @Override // defpackage.fry
    public final int h() {
        return R.menu.playlist_editor_menu;
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
        this.a.aE(new iqn(this));
        return true;
    }
}
