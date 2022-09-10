package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jle  reason: default package */
/* loaded from: classes7.dex */
public final class jle implements View.OnClickListener {
    final /* synthetic */ cjtd a;
    final /* synthetic */ jho b;
    final /* synthetic */ jlg c;

    public jle(jlg jlgVar, cjtd cjtdVar, jho jhoVar) {
        this.c = jlgVar;
        this.a = cjtdVar;
        this.b = jhoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.d(view, this.c.d(view, this.a));
    }
}
