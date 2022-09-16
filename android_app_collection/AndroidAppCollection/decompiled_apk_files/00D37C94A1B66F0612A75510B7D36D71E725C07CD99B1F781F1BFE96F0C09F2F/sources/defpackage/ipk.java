package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ipk  reason: default package */
/* loaded from: classes3.dex */
public final class ipk extends ajsm {
    final /* synthetic */ ipm a;

    public ipk(ipm ipmVar) {
        this.a = ipmVar;
    }

    public final void f(Object obj) {
        if (isEmpty()) {
            add(obj);
        } else {
            n(0, obj);
        }
    }

    public final void g(String str) {
        f(new mfu(str, new View.OnClickListener() { // from class: ipj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ipk.this.a.aG(false);
            }
        }));
    }

    @Override // defpackage.ajsm, defpackage.ajqm
    public final /* bridge */ /* synthetic */ void lT(ajql ajqlVar) {
        super.i(ajqlVar);
    }

    @Override // defpackage.ajsm, defpackage.ajqm
    public final /* bridge */ /* synthetic */ void pl(ajql ajqlVar) {
        super.j(ajqlVar);
    }
}
