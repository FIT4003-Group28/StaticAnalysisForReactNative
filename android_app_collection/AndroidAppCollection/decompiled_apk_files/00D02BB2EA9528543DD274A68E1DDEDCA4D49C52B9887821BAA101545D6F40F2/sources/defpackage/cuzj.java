package defpackage;

import android.view.MenuItem;
import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuzj  reason: default package */
/* loaded from: classes5.dex */
public final class cuzj implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ cuzo a;

    public cuzj(cuzo cuzoVar) {
        this.a = cuzoVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (this.a.n == null || menuItem.getItemId() != this.a.n.getItemId()) {
            return false;
        }
        cuzo cuzoVar = this.a;
        if (cuzoVar.F) {
            cuzoVar.k();
        } else {
            cuzoVar.j.j(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader);
            this.a.a.b();
            cuzo cuzoVar2 = this.a;
            cuzoVar2.G = true;
            if (cuzoVar2.u == null) {
                cuzoVar2.u = new cuvs(cuzoVar2.a.q(), cuzoVar2.l, cuzoVar2.z);
                cuzoVar2.u.a = new cuzi(cuzoVar2);
                if (cuzoVar2.E) {
                    cuzoVar2.u.z();
                }
            }
        }
        return true;
    }
}
