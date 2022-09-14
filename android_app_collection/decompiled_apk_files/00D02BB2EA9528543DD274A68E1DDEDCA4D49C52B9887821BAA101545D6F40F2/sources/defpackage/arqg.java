package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.Button;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: arqg  reason: default package */
/* loaded from: classes2.dex */
public final class arqg {
    public final arrf a;
    private final Context b;
    private final cqkj c;

    public arqg(Context context, cqkj cqkjVar, arrf arrfVar) {
        this.b = context;
        this.c = cqkjVar;
        this.a = arrfVar;
    }

    public static void b(qy qyVar, aryk arykVar) {
        Button b = qyVar.b(-1);
        if (b != null) {
            b.setEnabled(arykVar.c().booleanValue());
        }
    }

    public final qy a() {
        final cqkf e = this.c.e(new arrs());
        final aryk t = this.a.t();
        e.e(t);
        qx qxVar = new qx(this.b);
        qxVar.i(R.string.DEFAULT_MEDIA_APP_DIALOG_TITLE);
        qxVar.k(e.c());
        qxVar.o(R.string.NEXT_BUTTON, new DialogInterface.OnClickListener(this) { // from class: arqb
            private final arqg a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.a.f();
            }
        });
        qxVar.l(R.string.CANCEL_BUTTON, arqc.a);
        qxVar.n(new DialogInterface.OnDismissListener(e) { // from class: arqd
            private final cqkf a;

            {
                this.a = e;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.a.e(null);
            }
        });
        final qy b = qxVar.b();
        cqkx.j(t, new cqhm(b, t) { // from class: arqe
            private final qy a;
            private final aryk b;

            {
                this.a = b;
                this.b = t;
            }

            @Override // defpackage.cqhm
            public final void a() {
                arqg.b(this.a, this.b);
            }
        });
        b.setOnShowListener(new DialogInterface.OnShowListener(b, t) { // from class: arqf
            private final qy a;
            private final aryk b;

            {
                this.a = b;
                this.b = t;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                arqg.b(this.a, this.b);
            }
        });
        return b;
    }
}
