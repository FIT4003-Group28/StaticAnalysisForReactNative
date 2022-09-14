package defpackage;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
/* compiled from: PG */
/* renamed from: czyb  reason: default package */
/* loaded from: classes5.dex */
public final class czyb<S> extends czyi<S> {
    private int a;
    private DateSelector<S> b;
    private CalendarConstraints c;

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(H(), this.a));
        DateSelector<S> dateSelector = this.b;
        new czya(this);
        return dateSelector.g();
    }

    @Override // defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        this.a = bundle.getInt("THEME_RES_ID_KEY");
        this.b = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.c = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.a);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.b);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.c);
    }
}
