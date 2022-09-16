package defpackage;

import android.support.v7.widget.SearchView;
import android.view.inputmethod.InputMethodManager;
/* compiled from: PG */
/* renamed from: zl  reason: default package */
/* loaded from: classes4.dex */
public final class zl implements Runnable {
    final /* synthetic */ SearchView.SearchAutoComplete a;

    public zl(SearchView.SearchAutoComplete searchAutoComplete) {
        this.a = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.a;
        if (searchAutoComplete.b) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.b = false;
        }
    }
}
