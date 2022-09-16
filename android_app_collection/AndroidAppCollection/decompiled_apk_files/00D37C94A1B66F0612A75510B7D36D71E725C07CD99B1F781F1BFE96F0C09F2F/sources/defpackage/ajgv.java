package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ajgv  reason: default package */
/* loaded from: classes.dex */
public class ajgv implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
    private final ajgz a;
    private final ajgy b;
    private final String c;
    private boolean d;
    public final aafo g;
    public final Object h;
    public AlertDialog i;

    /* JADX INFO: Access modifiers changed from: protected */
    public ajgv(aafo aafoVar, ajgz ajgzVar, Object obj, String str) {
        aafoVar.getClass();
        this.g = aafoVar;
        this.a = ajgzVar;
        this.h = obj;
        this.c = str;
        this.d = false;
        this.b = ajgzVar == null ? null : new ajgy() { // from class: ajgu
            @Override // defpackage.ajgy
            public final void lL() {
                ajgv ajgvVar = ajgv.this;
                if (ajgvVar.i == null) {
                    return;
                }
                ajgvVar.i(6);
            }
        };
    }

    protected void a(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Map d() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.h);
        hashMap.put(actk.b, Boolean.TRUE);
        return hashMap;
    }

    protected void e() {
    }

    protected void f() {
    }

    public final void i(int i) {
        aqxo.y(this.i != null);
        lu(i);
        this.d = true;
        ampq D = zew.D(this.i.getContext());
        if (D.h()) {
            Activity activity = (Activity) D.c();
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        }
        this.i.dismiss();
    }

    public final void j(AlertDialog alertDialog) {
        alertDialog.getClass();
        aqxo.y(this.i == null);
        this.i = alertDialog;
        alertDialog.setOnDismissListener(this);
    }

    public final void k() {
        aqxo.y(this.i != null);
        ajgz ajgzVar = this.a;
        if (ajgzVar != null) {
            String str = this.c;
            if (str == null) {
                ajgzVar.a(this.b);
            } else {
                ajgzVar.b(this.b, str);
            }
        }
        this.i.show();
    }

    protected void lu(int i) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        aqxo.y(dialogInterface == this.i);
        if (i >= 0) {
            a(i);
        } else if (i == -1) {
            f();
            i(1);
        } else if (i == -3) {
            i(2);
        } else if (i != -2) {
        } else {
            e();
            i(3);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.d) {
            this.d = true;
            lu(5);
        }
        ajgz ajgzVar = this.a;
        if (ajgzVar != null) {
            String str = this.c;
            if (str == null) {
                ajgzVar.d(this.b);
            } else {
                ajgzVar.e(this.b, str);
            }
        }
    }
}
