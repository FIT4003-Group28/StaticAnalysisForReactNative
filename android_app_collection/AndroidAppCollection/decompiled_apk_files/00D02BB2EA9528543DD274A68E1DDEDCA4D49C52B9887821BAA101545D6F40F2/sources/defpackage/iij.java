package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.text.method.MovementMethod;
import android.view.View;
/* compiled from: PG */
/* renamed from: iij  reason: default package */
/* loaded from: classes6.dex */
public class iij implements iiw {
    @dzsi
    public final View.OnClickListener a;
    @dzsi
    public final View.OnClickListener b;
    public final AlertDialog c;
    private final int d;
    @dzsi
    private final CharSequence e;
    private final CharSequence f;
    private final CharSequence g;
    private final CharSequence h;
    @dzsi
    private final cjtd i;
    @dzsi
    private final cjtd j;
    @dzsi
    private final MovementMethod k;

    public iij(int i, @dzsi CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, @dzsi View.OnClickListener onClickListener, @dzsi View.OnClickListener onClickListener2, @dzsi cjtd cjtdVar, @dzsi cjtd cjtdVar2, AlertDialog alertDialog, @dzsi MovementMethod movementMethod) {
        this.d = i;
        this.e = charSequence;
        this.f = charSequence2;
        this.g = charSequence3;
        this.h = charSequence4;
        this.a = onClickListener;
        this.b = onClickListener2;
        this.i = cjtdVar;
        this.j = cjtdVar2;
        this.c = alertDialog;
        this.k = movementMethod;
    }

    @Override // defpackage.iiw
    public cqtv a() {
        return cqrp.d(this.d);
    }

    @Override // defpackage.iiw
    @dzsi
    public CharSequence b() {
        return this.e;
    }

    @Override // defpackage.iiw
    public CharSequence c() {
        return this.f;
    }

    @Override // defpackage.iiw
    @dzsi
    public MovementMethod d() {
        return this.k;
    }

    @Override // defpackage.iiw
    public CharSequence e() {
        return this.g;
    }

    @Override // defpackage.iiw
    @dzsi
    public cjtd f() {
        return this.i;
    }

    @Override // defpackage.iiw
    public View.OnClickListener g() {
        return new View.OnClickListener(this) { // from class: iig
            private final iij a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iij iijVar = this.a;
                iijVar.c.dismiss();
                View.OnClickListener onClickListener = iijVar.a;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        };
    }

    @Override // defpackage.iiw
    public CharSequence h() {
        return this.h;
    }

    @Override // defpackage.iiw
    public View.OnClickListener i() {
        return new View.OnClickListener(this) { // from class: iih
            private final iij a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iij iijVar = this.a;
                iijVar.c.dismiss();
                View.OnClickListener onClickListener = iijVar.b;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        };
    }

    @Override // defpackage.iiw
    @dzsi
    public cjtd j() {
        return this.j;
    }

    public void k() {
        this.c.show();
    }

    public Dialog l() {
        return this.c;
    }
}
