package defpackage;

import android.view.MenuItem;
import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuzk  reason: default package */
/* loaded from: classes5.dex */
public final class cuzk implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ cuzo a;

    public cuzk(cuzo cuzoVar) {
        this.a = cuzoVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (this.a.p == null || menuItem.getItemId() != this.a.p.getItemId()) {
            return false;
        }
        cuzo cuzoVar = this.a;
        if (cuzoVar.a == 0) {
            return false;
        }
        cuzoVar.j.j(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        this.a.a.f();
        cuzo cuzoVar2 = this.a;
        cuzoVar2.H = true;
        if (cuzoVar2.v == null) {
            cuzoVar2.v = new cvbx(cuzoVar2.a.r(), cuzoVar2.Q, cuzoVar2.d.b());
            ((cvbx) cuzoVar2.v).a = new cuzl(cuzoVar2);
        }
        return true;
    }
}
