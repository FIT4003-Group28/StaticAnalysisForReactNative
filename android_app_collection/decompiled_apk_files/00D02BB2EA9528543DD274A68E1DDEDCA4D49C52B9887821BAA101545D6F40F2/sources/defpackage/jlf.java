package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jlf  reason: default package */
/* loaded from: classes7.dex */
public final class jlf implements View.OnClickListener {
    final /* synthetic */ cjtd a;
    final /* synthetic */ dcdc b;
    final /* synthetic */ jlg c;

    public jlf(jlg jlgVar, cjtd cjtdVar, dcdc dcdcVar) {
        this.c = jlgVar;
        this.a = cjtdVar;
        this.b = dcdcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.d(view, this.a);
        jlg jlgVar = this.c;
        isc a = jlgVar.f.a(jlgVar.b);
        a.a(this.b);
        a.show();
    }
}
