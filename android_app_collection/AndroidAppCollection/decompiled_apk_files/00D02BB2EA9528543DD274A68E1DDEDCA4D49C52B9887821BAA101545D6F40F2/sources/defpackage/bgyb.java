package defpackage;

import android.content.DialogInterface;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: bgyb  reason: default package */
/* loaded from: classes3.dex */
public final class bgyb {
    public final gga a;
    @dzsi
    jeo<bhed> b;
    private final cqkj c;

    public bgyb(gga ggaVar, cqkj cqkjVar) {
        this.a = ggaVar;
        this.c = cqkjVar;
    }

    public final void a() {
        if (this.b != null) {
            return;
        }
        jeo<bhed> jeoVar = new jeo<>(this.a, 16973840, new bhee(), new bhed(), this.c);
        this.b = jeoVar;
        jeoVar.setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: bgxz
            private final bgyb a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.a.b = null;
            }
        });
        new Handler().postDelayed(new Runnable(this) { // from class: bgya
            private final bgyb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bgyb bgybVar = this.a;
                if (bgybVar.b == null || bgybVar.a.isFinishing()) {
                    return;
                }
                jeo<bhed> jeoVar2 = bgybVar.b;
                dbsk.s(jeoVar2);
                jeoVar2.show();
            }
        }, 300L);
    }

    public final void b() {
        if (this.b != null && !this.a.isFinishing()) {
            jeo<bhed> jeoVar = this.b;
            dbsk.s(jeoVar);
            jeoVar.dismiss();
        }
        this.b = null;
    }
}
