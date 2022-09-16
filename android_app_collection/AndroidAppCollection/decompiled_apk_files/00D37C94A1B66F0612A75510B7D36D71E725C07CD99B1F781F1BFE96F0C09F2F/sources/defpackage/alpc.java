package defpackage;

import android.widget.EditText;
/* compiled from: PG */
/* renamed from: alpc  reason: default package */
/* loaded from: classes.dex */
final class alpc implements Runnable {
    final /* synthetic */ EditText a;
    final /* synthetic */ alpd b;

    public alpc(alpd alpdVar, EditText editText) {
        this.b = alpdVar;
        this.a = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.removeTextChangedListener(this.b.a.a);
    }
}
