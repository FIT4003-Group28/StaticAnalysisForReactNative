package defpackage;

import android.view.View;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: czxv  reason: default package */
/* loaded from: classes5.dex */
final class czxv implements View.OnClickListener {
    final /* synthetic */ czxy a;

    public czxv(czxy czxyVar) {
        this.a = czxyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Iterator<View.OnClickListener> it = this.a.ae.iterator();
        while (it.hasNext()) {
            it.next().onClick(view);
        }
        this.a.f();
    }
}
