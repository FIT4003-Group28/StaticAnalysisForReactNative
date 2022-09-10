package defpackage;

import android.content.DialogInterface;
import android.view.View;
/* compiled from: PG */
/* renamed from: gde  reason: default package */
/* loaded from: classes6.dex */
public final class gde extends qy {
    public final cjqy b;
    private final cjqq c;
    @dzsi
    private final cjtd d;
    @dzsi
    private final gdb e;
    @dzsi
    private final gdb f;
    @dzsi
    private final gdb g;
    @dzsi
    private final gcy h;
    @dzsi
    private final View i;

    public gde(gcz gczVar, @dzsi cjtd cjtdVar) {
        super(gczVar.a, gczVar.h);
        this.b = gczVar.b;
        this.c = gczVar.c;
        this.d = cjtdVar;
        gdb a = gdb.a(gczVar.j);
        this.e = a;
        gdb a2 = gdb.a(gczVar.k);
        this.f = a2;
        this.g = null;
        gcx gcxVar = gczVar.l;
        final gcy gcyVar = gcxVar == null ? null : new gcy(gcxVar);
        this.h = gcyVar;
        View view = gczVar.m;
        this.i = view;
        if (gczVar.d.length() > 0) {
            setTitle(gczVar.d);
            gczVar.d.toString();
        }
        if (gczVar.e.length() > 0) {
            ((qy) this).a.c(gczVar.e);
        }
        if (gcyVar != null) {
            setOnCancelListener(new DialogInterface.OnCancelListener(this, gcyVar) { // from class: gcw
                private final gde a;
                private final gcy b;

                {
                    this.a = this;
                    this.b = gcyVar;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    gde gdeVar = this.a;
                    gde.g(gdeVar.b, dialogInterface, this.b);
                }
            });
        }
        setCancelable(gczVar.f);
        setCanceledOnTouchOutside(gczVar.g);
        h(a, -1);
        h(a2, -2);
        h(null, -3);
        if (view != null) {
            c(view);
        }
    }

    public static void g(cjqy cjqyVar, DialogInterface dialogInterface, gcy gcyVar) {
        gcx gcxVar = gcyVar.a;
        cjql cjqlVar = gcyVar.b;
        cjtd cjtdVar = gcxVar.a;
        if (cjtdVar == null || cjqlVar == null) {
            cjqm cjqmVar = cjqm.a;
        } else {
            cjqyVar.j(cjqlVar, cjtdVar);
        }
        gcxVar.b.a(dialogInterface);
    }

    private final void h(@dzsi final gdb gdbVar, int i) {
        if (gdbVar == null) {
            return;
        }
        ((qy) this).a.h(i, gdbVar.c, new DialogInterface.OnClickListener(this, gdbVar) { // from class: gcv
            private final gde a;
            private final gdb b;

            {
                this.a = this;
                this.b = gdbVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                gde gdeVar = this.a;
                gde.g(gdeVar.b, dialogInterface, this.b);
            }
        });
    }

    private final void i(@dzsi gcy gcyVar) {
        if (gcyVar == null) {
            return;
        }
        gcx gcxVar = gcyVar.a;
        if (gcxVar.a == null) {
            return;
        }
        gcyVar.b = this.c.g().d(gcxVar.a);
    }

    @Override // android.app.Dialog
    public final void hide() {
        this.b.h();
        super.hide();
    }

    @Override // android.app.Dialog
    public final void show() {
        if (!gcu.a(getContext())) {
            return;
        }
        super.show();
        if (this.d != null) {
            this.c.g().d(this.d);
        }
        i(this.e);
        i(null);
        i(this.f);
        i(this.h);
    }
}
