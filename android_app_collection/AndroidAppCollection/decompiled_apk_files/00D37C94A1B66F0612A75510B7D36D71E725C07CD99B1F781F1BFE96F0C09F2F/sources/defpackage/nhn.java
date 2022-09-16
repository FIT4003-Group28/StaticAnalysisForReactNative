package defpackage;

import android.view.MenuItem;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nhn  reason: default package */
/* loaded from: classes3.dex */
final class nhn implements fry {
    final /* synthetic */ nhr a;
    private final String b;

    public nhn(nhr nhrVar, String str) {
        this.a = nhrVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.fry
    public final int g() {
        return R.id.menu_delete_playlist;
    }

    @Override // defpackage.fry
    public final int h() {
        return R.menu.delete_playlist_menu;
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
        this.a.e.a(this.b).show();
        return true;
    }
}
