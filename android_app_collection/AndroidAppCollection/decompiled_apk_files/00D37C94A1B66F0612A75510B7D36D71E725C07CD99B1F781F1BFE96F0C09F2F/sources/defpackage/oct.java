package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: oct  reason: default package */
/* loaded from: classes3.dex */
final class oct extends jo {
    final /* synthetic */ Activity b;

    public oct(Activity activity) {
        this.b = activity;
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        super.d(view, mhVar);
        mhVar.i(new mf(16, this.b.getString(R.string.accessibility_collapse_text)));
    }
}
