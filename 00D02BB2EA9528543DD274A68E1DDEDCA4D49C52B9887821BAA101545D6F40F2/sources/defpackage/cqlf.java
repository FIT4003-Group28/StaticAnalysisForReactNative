package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cqlf  reason: default package */
/* loaded from: classes5.dex */
final class cqlf implements View.OnClickListener {
    final /* synthetic */ View a;
    final /* synthetic */ cqnx b;

    public cqlf(View view, cqnx cqnxVar) {
        this.a = view;
        this.b = cqnxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cqkp o = cqjz.o(this.a);
        if (o != null) {
            this.b.a(o, new Object[0]);
        }
    }
}
