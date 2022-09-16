package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nzm  reason: default package */
/* loaded from: classes3.dex */
public final class nzm extends jo {
    final /* synthetic */ NextGenWatchLayout b;

    public nzm(NextGenWatchLayout nextGenWatchLayout) {
        this.b = nextGenWatchLayout;
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        super.d(view, mhVar);
        mhVar.v(this.b.getResources().getString(R.string.accessibility_player_content_description));
        mhVar.A(this.b.getResources().getString(R.string.accessibility_player_hint_text));
    }
}
