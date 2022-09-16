package defpackage;

import android.view.inputmethod.InputMethodManager;
/* compiled from: PG */
/* renamed from: zxa  reason: default package */
/* loaded from: classes4.dex */
final class zxa implements Runnable {
    final /* synthetic */ zxb a;

    public zxa(zxb zxbVar) {
        this.a = zxbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dt mJ = this.a.mJ();
        if (mJ != null) {
            ((InputMethodManager) mJ.getSystemService("input_method")).hideSoftInputFromWindow(this.a.O.getWindowToken(), 0);
        }
    }
}
