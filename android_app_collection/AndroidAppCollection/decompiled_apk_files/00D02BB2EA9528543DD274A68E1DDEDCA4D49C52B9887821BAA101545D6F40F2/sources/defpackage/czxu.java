package defpackage;

import android.view.View;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: czxu  reason: default package */
/* loaded from: classes5.dex */
final class czxu implements View.OnClickListener {
    final /* synthetic */ czxy a;

    public czxu(czxy czxyVar) {
        this.a = czxyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Iterator it = this.a.ad.iterator();
        while (it.hasNext()) {
            this.a.af.a();
            ((czxz) it.next()).a();
        }
        this.a.f();
    }
}
