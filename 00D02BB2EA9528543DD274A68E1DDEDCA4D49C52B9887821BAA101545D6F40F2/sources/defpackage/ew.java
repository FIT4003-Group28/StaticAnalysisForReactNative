package defpackage;

import android.app.Dialog;
import android.view.View;
/* compiled from: PG */
/* renamed from: ew  reason: default package */
/* loaded from: classes6.dex */
final class ew extends fn {
    final /* synthetic */ fn a;
    final /* synthetic */ ex b;

    public ew(ex exVar, fn fnVar) {
        this.b = exVar;
        this.a = fnVar;
    }

    @Override // defpackage.fn
    public final boolean MW() {
        return this.b.g || this.a.MW();
    }

    @Override // defpackage.fn
    public final View a(int i) {
        Dialog dialog = this.b.d;
        View findViewById = dialog != null ? dialog.findViewById(i) : null;
        if (findViewById != null) {
            return findViewById;
        }
        if (!this.a.MW()) {
            return null;
        }
        return this.a.a(i);
    }
}
