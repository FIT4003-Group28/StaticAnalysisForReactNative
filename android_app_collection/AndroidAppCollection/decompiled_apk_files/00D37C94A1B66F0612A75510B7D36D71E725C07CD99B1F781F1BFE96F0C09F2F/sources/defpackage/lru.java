package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: lru  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lru implements View.OnClickListener {
    public final /* synthetic */ lrw a;
    private final /* synthetic */ int b;

    public /* synthetic */ lru(lrw lrwVar, int i) {
        this.b = i;
        this.a = lrwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            lrw lrwVar = this.a;
            ylx.n(lrwVar.d, lrwVar.c.b(lhh.o), lcz.s, ylx.b);
            Activity activity = lrwVar.a;
            activity.startActivity(etk.a(activity));
            return;
        }
        Activity activity2 = this.a.a;
        activity2.startActivity(etk.a(activity2));
    }
}
