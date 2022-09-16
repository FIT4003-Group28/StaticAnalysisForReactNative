package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kca  reason: default package */
/* loaded from: classes3.dex */
final class kca extends jo {
    final /* synthetic */ kcb b;

    public kca(kcb kcbVar) {
        this.b = kcbVar;
    }

    private final String k(CharSequence charSequence, int i) {
        if (charSequence == null) {
            return null;
        }
        Resources resources = this.b.b;
        kcb kcbVar = this.b;
        return resources.getString(i, zgt.z(resources, charSequence), zgt.z(kcbVar.b, kcbVar.i));
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        String k;
        super.d(view, mhVar);
        kcb kcbVar = this.b;
        if (kcbVar.i == null) {
            k = null;
        } else if (kcbVar.f) {
            k = k(kcbVar.h, R.string.accessibility_player_remaining_time);
        } else {
            k = k(kcbVar.g, R.string.accessibility_player_elapsed_time);
        }
        mhVar.v(k);
        kcb kcbVar2 = this.b;
        mhVar.A(kcbVar2.b.getString(true != kcbVar2.f ? R.string.accessibility_player_remaining_time_hint : R.string.accessibility_player_elapsed_time_hint));
    }
}
