package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: izd  reason: default package */
/* loaded from: classes3.dex */
public final class izd extends jo {
    final /* synthetic */ MdxWatchDrawerLayout b;

    public izd(MdxWatchDrawerLayout mdxWatchDrawerLayout) {
        this.b = mdxWatchDrawerLayout;
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        super.d(view, mhVar);
        mhVar.i(new mf(mf.b.a(), this.b.getContext().getString(R.string.mdx_minibar_accessibility_queue_open_action)));
    }
}
