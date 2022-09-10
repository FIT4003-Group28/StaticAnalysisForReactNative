package defpackage;

import android.app.ProgressDialog;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqwv  reason: default package */
/* loaded from: classes4.dex */
public final class bqwv implements bqlb {
    final /* synthetic */ ProgressDialog a;
    final /* synthetic */ bqww b;

    public bqwv(bqww bqwwVar, ProgressDialog progressDialog) {
        this.b = bqwwVar;
        this.a = progressDialog;
    }

    @Override // defpackage.bqlb
    public final void d(bqlf bqlfVar) {
        this.a.dismiss();
        this.b.c.d(bqlfVar);
    }

    @Override // defpackage.bqlb
    public final void e() {
        this.a.dismiss();
        bqww bqwwVar = this.b;
        bqxf bqxfVar = bqwwVar.d;
        final bqlb bqlbVar = bqwwVar.c;
        bqlbVar.getClass();
        bqxfVar.aU(new Runnable(bqlbVar) { // from class: bqwu
            private final bqlb a;

            {
                this.a = bqlbVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.e();
            }
        });
    }
}
