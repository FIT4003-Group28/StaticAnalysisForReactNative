package defpackage;

import android.widget.EditText;
/* compiled from: PG */
/* renamed from: alqg  reason: default package */
/* loaded from: classes.dex */
final class alqg implements Runnable {
    final /* synthetic */ EditText a;
    final /* synthetic */ alqh b;

    public alqg(alqh alqhVar, EditText editText) {
        this.b = alqhVar;
        this.a = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.removeTextChangedListener(this.b.a.a);
    }
}
