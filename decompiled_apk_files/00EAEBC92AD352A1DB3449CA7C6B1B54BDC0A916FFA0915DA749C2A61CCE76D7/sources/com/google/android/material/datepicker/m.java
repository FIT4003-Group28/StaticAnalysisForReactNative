package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class m<S> extends Fragment {
    protected final LinkedHashSet<l<S>> X = new LinkedHashSet<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(l<S> lVar) {
        return this.X.add(lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m0() {
        this.X.clear();
    }
}
