package defpackage;

import android.os.SystemClock;
import android.view.View;
/* compiled from: PG */
/* renamed from: ajly  reason: default package */
/* loaded from: classes.dex */
final class ajly implements tdn {
    final /* synthetic */ akee a;
    final /* synthetic */ ajmb b;

    public ajly(ajmb ajmbVar, akee akeeVar) {
        this.b = ajmbVar;
        this.a = akeeVar;
    }

    @Override // defpackage.tdn
    public final void a(View view, tfi tfiVar) {
        this.b.a = SystemClock.uptimeMillis();
        if (view != null) {
            akee akeeVar = this.a;
            ajmb ajmbVar = this.b;
            akeeVar.onTouch(view, ajmbVar.b(ajmbVar.a, 0, tfiVar));
        }
    }
}
