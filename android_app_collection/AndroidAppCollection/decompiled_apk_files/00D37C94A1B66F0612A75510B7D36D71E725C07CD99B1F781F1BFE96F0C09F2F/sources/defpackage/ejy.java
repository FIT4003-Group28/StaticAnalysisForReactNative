package defpackage;

import android.app.AlertDialog;
import android.view.View;
/* compiled from: PG */
/* renamed from: ejy  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ejy implements View.OnClickListener {
    public final /* synthetic */ eki a;
    public final /* synthetic */ AlertDialog b;
    private final /* synthetic */ int c;

    public /* synthetic */ ejy(eki ekiVar, AlertDialog alertDialog) {
        this.a = ekiVar;
        this.b = alertDialog;
    }

    public /* synthetic */ ejy(eki ekiVar, AlertDialog alertDialog, int i) {
        this.c = i;
        this.a = ekiVar;
        this.b = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        if (i == 0) {
            this.a.aF(this.b);
        } else if (i == 1) {
            this.a.aF(this.b);
        } else {
            this.a.aF(this.b);
        }
    }
}
