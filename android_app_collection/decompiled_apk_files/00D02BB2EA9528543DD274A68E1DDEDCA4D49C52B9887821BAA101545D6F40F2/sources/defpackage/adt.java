package defpackage;

import android.support.v7.widget.SearchView$SearchAutoComplete;
import android.view.inputmethod.InputMethodManager;
/* compiled from: PG */
/* renamed from: adt  reason: default package */
/* loaded from: classes2.dex */
public final class adt implements Runnable {
    final /* synthetic */ SearchView$SearchAutoComplete a;

    public adt(SearchView$SearchAutoComplete searchView$SearchAutoComplete) {
        this.a = searchView$SearchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.a;
        if (searchView$SearchAutoComplete.b) {
            ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
            searchView$SearchAutoComplete.b = false;
        }
    }
}
