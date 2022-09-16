package defpackage;

import android.os.SystemClock;
import android.view.View;
/* compiled from: PG */
/* renamed from: ajma  reason: default package */
/* loaded from: classes.dex */
final class ajma implements tdm {
    final /* synthetic */ akee a;
    final /* synthetic */ ajmb b;

    public ajma(ajmb ajmbVar, akee akeeVar) {
        this.b = ajmbVar;
        this.a = akeeVar;
    }

    @Override // defpackage.tdm
    public final void a(View view) {
        if (view != null) {
            this.a.onTouch(view, this.b.b(SystemClock.uptimeMillis(), 3, new tfi(0.0f, 0.0f)));
        }
    }
}
