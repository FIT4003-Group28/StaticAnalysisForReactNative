package defpackage;

import android.support.v7.widget.SearchView;
import android.view.View;
/* compiled from: PG */
/* renamed from: zc  reason: default package */
/* loaded from: classes4.dex */
public final class zc implements View.OnClickListener {
    final /* synthetic */ SearchView a;

    public zc(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.a;
        if (view == searchView.mSearchButton) {
            searchView.onSearchClicked();
        } else if (view == searchView.mCloseButton) {
            searchView.onCloseClicked();
        } else if (view == searchView.mGoButton) {
            searchView.onSubmitQuery();
        } else if (view == searchView.mVoiceButton) {
            searchView.onVoiceClicked();
        } else if (view != searchView.mSearchSrcTextView) {
        } else {
            searchView.forceSuggestionQuery();
        }
    }
}
