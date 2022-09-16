package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: accw  reason: default package */
/* loaded from: classes.dex */
final class accw implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ accx b;

    public accw(accx accxVar, long j) {
        this.b = accxVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SharedPreferences.Editor edit = this.b.d.edit();
        edit.putLong(accx.c, this.a);
        edit.apply();
    }
}
