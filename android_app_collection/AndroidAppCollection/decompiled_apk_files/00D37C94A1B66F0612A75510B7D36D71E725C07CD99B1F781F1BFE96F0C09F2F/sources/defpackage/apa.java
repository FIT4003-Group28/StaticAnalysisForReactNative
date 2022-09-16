package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: apa  reason: default package */
/* loaded from: classes.dex */
final class apa implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ apm b;

    public apa(String str, apm apmVar) {
        this.a = str;
        this.b = apmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + this.a, this.b);
        throw this.b;
    }
}
