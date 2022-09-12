package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqka  reason: default package */
/* loaded from: classes.dex */
public final class cqka implements View.OnClickListener {
    final /* synthetic */ View a;
    final /* synthetic */ Object b;

    public cqka(View view, Object obj) {
        this.a = view;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cqkp o = cqjz.o(this.a);
        if (o != null) {
            ((cqnx) this.b).a(o, new Object[0]);
        }
    }
}
