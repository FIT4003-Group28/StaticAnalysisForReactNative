package defpackage;

import android.content.res.Resources;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsEditToolButtonView;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hdn  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hdn implements Runnable {
    public final /* synthetic */ hdq a;
    private final /* synthetic */ int b;

    public /* synthetic */ hdn(hdq hdqVar, int i) {
        this.b = i;
        this.a = hdqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zse zseVar;
        int i = this.b;
        int i2 = R.drawable.ic_filter_off_stroke;
        if (i == 0) {
            hdq hdqVar = this.a;
            ShortsEditToolButtonView shortsEditToolButtonView = hdqVar.e;
            if (shortsEditToolButtonView == null || (zseVar = hdqVar.k) == null) {
                return;
            }
            if (true == zseVar.e()) {
                i2 = 2131231762;
            }
            shortsEditToolButtonView.c.setImageDrawable(shortsEditToolButtonView.a.getResources().getDrawable(i2));
            return;
        }
        hdq hdqVar2 = this.a;
        zse zseVar2 = hdqVar2.k;
        boolean z = false;
        if (zseVar2 != null && zseVar2.e()) {
            z = true;
        }
        EditorButtonView editorButtonView = hdqVar2.c;
        if (editorButtonView == null || hdqVar2.k == null) {
            return;
        }
        Resources resources = editorButtonView.getResources();
        if (true == z) {
            i2 = 2131231762;
        }
        editorButtonView.b(resources.getDrawable(i2));
    }
}
