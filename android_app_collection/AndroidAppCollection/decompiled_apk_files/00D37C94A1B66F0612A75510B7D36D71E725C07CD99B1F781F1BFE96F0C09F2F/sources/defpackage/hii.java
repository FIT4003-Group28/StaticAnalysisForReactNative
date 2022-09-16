package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.MusicSearchSuggestionsController;
/* compiled from: PG */
/* renamed from: hii  reason: default package */
/* loaded from: classes3.dex */
public final class hii extends ne {
    final /* synthetic */ MusicSearchSuggestionsController a;

    public hii(MusicSearchSuggestionsController musicSearchSuggestionsController) {
        this.a = musicSearchSuggestionsController;
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        Activity activity;
        if (i != 1 || (activity = this.a.l) == null) {
            return;
        }
        zag.h(activity);
    }
}
