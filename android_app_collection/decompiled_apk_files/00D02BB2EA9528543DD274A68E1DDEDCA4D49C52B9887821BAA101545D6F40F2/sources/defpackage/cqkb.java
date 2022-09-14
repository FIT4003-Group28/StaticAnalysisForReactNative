package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqkb  reason: default package */
/* loaded from: classes.dex */
public final class cqkb implements View.OnClickListener {
    final /* synthetic */ View a;
    final /* synthetic */ Object b;

    public cqkb(View view, Object obj) {
        this.a = view;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cqkp o = cqjz.o(this.a);
        if (o != null) {
            ((cqkn) this.b).a(o, this.a);
        }
    }
}
