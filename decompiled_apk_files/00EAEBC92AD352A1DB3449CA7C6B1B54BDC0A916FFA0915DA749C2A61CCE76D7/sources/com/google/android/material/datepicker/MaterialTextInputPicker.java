package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class MaterialTextInputPicker<S> extends m<S> {
    private d<S> Y;
    private com.google.android.material.datepicker.a Z;

    /* loaded from: classes.dex */
    class a implements l<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.l
        public void a(S s) {
            Iterator<l<S>> it = MaterialTextInputPicker.this.X.iterator();
            while (it.hasNext()) {
                it.next().a(s);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> MaterialTextInputPicker<T> a(d<T> dVar, com.google.android.material.datepicker.a aVar) {
        MaterialTextInputPicker<T> materialTextInputPicker = new MaterialTextInputPicker<>();
        Bundle bundle = new Bundle();
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        materialTextInputPicker.m(bundle);
        return materialTextInputPicker;
    }

    @Override // androidx.fragment.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.Y.a(layoutInflater, viewGroup, bundle, this.Z, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void c(Bundle bundle) {
        super.c(bundle);
        if (bundle == null) {
            bundle = l();
        }
        this.Y = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.Z = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.Y);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.Z);
    }
}
