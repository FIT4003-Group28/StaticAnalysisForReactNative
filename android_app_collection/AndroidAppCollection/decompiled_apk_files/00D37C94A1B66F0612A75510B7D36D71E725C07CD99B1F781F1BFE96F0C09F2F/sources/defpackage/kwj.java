package defpackage;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kwj  reason: default package */
/* loaded from: classes3.dex */
public final class kwj implements fry, frx {
    public MenuItem a;
    final /* synthetic */ kwm b;

    public kwj(kwm kwmVar) {
        this.b = kwmVar;
    }

    @Override // defpackage.frx
    public final void a(yzh yzhVar, int i) {
        ImageButton b;
        if (yzhVar == null || (b = b()) == null) {
            return;
        }
        b.setImageDrawable(yzhVar.b(b.getContext().getResources().getDrawable(2131233305).mutate(), i));
    }

    public final ImageButton b() {
        MenuItem menuItem = this.a;
        if (menuItem != null) {
            return (ImageButton) menuItem.getActionView();
        }
        return null;
    }

    public final void c(boolean z) {
        MenuItem menuItem = this.a;
        if (menuItem != null) {
            menuItem.setEnabled(z);
        }
    }

    @Override // defpackage.fry
    public final int g() {
        return R.id.menu_filter_results;
    }

    @Override // defpackage.fry
    public final int h() {
        return R.menu.search_results_menu;
    }

    @Override // defpackage.fry
    public final frx i() {
        return null;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
        this.a = menuItem;
        c(this.b.aH.e());
        if (this.b.aH.E == null) {
            c(false);
        }
        ImageButton b = b();
        if (b != null) {
            b.setOnClickListener(new View.OnClickListener() { // from class: kwi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    kwj.this.b.s();
                }
            });
        }
        this.b.r();
    }

    @Override // defpackage.fry
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.fry
    public final boolean l() {
        return false;
    }

    @Override // defpackage.fry
    public final boolean m() {
        return true;
    }
}
