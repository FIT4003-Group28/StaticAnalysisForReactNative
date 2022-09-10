package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cwlf  reason: default package */
/* loaded from: classes5.dex */
final class cwlf extends cvxj {
    final /* synthetic */ View a;
    final /* synthetic */ cwlg b;

    public cwlf(cwlg cwlgVar, View view) {
        this.b = cwlgVar;
        this.a = view;
    }

    @Override // defpackage.cvxj
    public final void a(final Object obj) {
        this.a.post(new Runnable(this, obj) { // from class: cwle
            private final cwlf a;
            private final Object b;

            {
                this.a = this;
                this.b = obj;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cwlf cwlfVar = this.a;
                cwlfVar.b.a(this.b);
            }
        });
    }
}
