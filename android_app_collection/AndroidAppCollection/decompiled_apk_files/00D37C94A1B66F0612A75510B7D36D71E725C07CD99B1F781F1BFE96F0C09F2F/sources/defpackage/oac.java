package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: oac  reason: default package */
/* loaded from: classes3.dex */
public final class oac extends jo {
    final /* synthetic */ View b;
    final /* synthetic */ oad c;

    public oac(oad oadVar, View view) {
        this.c = oadVar;
        this.b = view;
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        super.d(view, mhVar);
        mhVar.v(this.b.getResources().getString(R.string.accessibility_player_content_description));
        mhVar.A(this.b.getResources().getString(R.string.accessibility_player_hint_text));
    }

    @Override // defpackage.jo
    public final boolean j(View view, int i, Bundle bundle) {
        if (i == 16) {
            this.c.e.get().l();
            return true;
        }
        return super.j(view, i, bundle);
    }
}
