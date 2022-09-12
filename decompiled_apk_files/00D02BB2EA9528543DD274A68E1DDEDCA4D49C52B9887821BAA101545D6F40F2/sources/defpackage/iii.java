package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.method.MovementMethod;
import android.view.View;
/* compiled from: PG */
/* renamed from: iii  reason: default package */
/* loaded from: classes6.dex */
public class iii {
    @dzsi
    public DialogInterface.OnCancelListener c;
    @dzsi
    public MovementMethod d;
    @dzsi
    private View.OnClickListener i;
    @dzsi
    private View.OnClickListener j;
    @dzsi
    private cjtd k;
    @dzsi
    private cjtd l;
    private int e = 280;
    @dzsi
    public CharSequence a = "";
    public CharSequence b = "";
    private CharSequence f = "";
    private CharSequence g = "";
    private boolean h = true;

    public final iij a(Activity activity, cqkj cqkjVar) {
        AlertDialog create = new AlertDialog.Builder(activity, 2132018255).create();
        iij iijVar = new iij(this.e, this.a, this.b, this.f, this.g, this.i, this.j, this.k, this.l, create, this.d);
        cqkf c = cqkjVar.c(new iiv(), null);
        c.e(iijVar);
        create.setView(c.c());
        create.setOnCancelListener(this.c);
        create.setCancelable(this.h);
        create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        return iijVar;
    }

    public final void b() {
        this.h = false;
    }

    public final void c(CharSequence charSequence, @dzsi View.OnClickListener onClickListener, @dzsi cjtd cjtdVar) {
        this.g = charSequence;
        this.j = onClickListener;
        this.l = cjtdVar;
    }

    public final void d(CharSequence charSequence, @dzsi View.OnClickListener onClickListener, @dzsi cjtd cjtdVar) {
        this.f = charSequence;
        this.i = onClickListener;
        this.k = cjtdVar;
    }
}
