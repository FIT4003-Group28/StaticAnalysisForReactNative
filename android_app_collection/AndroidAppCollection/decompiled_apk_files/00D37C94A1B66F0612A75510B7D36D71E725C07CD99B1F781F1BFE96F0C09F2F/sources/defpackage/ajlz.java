package defpackage;

import android.os.SystemClock;
import android.view.View;
/* compiled from: PG */
/* renamed from: ajlz  reason: default package */
/* loaded from: classes.dex */
final class ajlz implements tdo {
    final /* synthetic */ akee a;
    final /* synthetic */ ajmb b;

    public ajlz(ajmb ajmbVar, akee akeeVar) {
        this.b = ajmbVar;
        this.a = akeeVar;
    }

    @Override // defpackage.tdo
    public final void a(View view, tfi tfiVar) {
        if (view != null) {
            this.a.onTouch(view, this.b.b(SystemClock.uptimeMillis(), 1, tfiVar));
        }
    }
}
