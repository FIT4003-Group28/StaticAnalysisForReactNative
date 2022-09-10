package defpackage;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
/* compiled from: PG */
/* renamed from: aer  reason: default package */
/* loaded from: classes2.dex */
public final class aer implements wy {
    final /* synthetic */ Toolbar a;

    public aer(Toolbar toolbar) {
        this.a = toolbar;
    }

    @Override // defpackage.wy
    public final boolean a(MenuItem menuItem) {
        aew aewVar = this.a.l;
        if (aewVar != null) {
            return aewVar.a();
        }
        return false;
    }
}
