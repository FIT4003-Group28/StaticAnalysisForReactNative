package defpackage;

import android.content.ComponentName;
import android.content.Context;
/* compiled from: PG */
/* renamed from: rok  reason: default package */
/* loaded from: classes4.dex */
final class rok implements Runnable {
    final /* synthetic */ rol a;
    private final /* synthetic */ int b;

    public rok(rol rolVar) {
        this.a = rolVar;
    }

    public rok(rol rolVar, int i) {
        this.b = i;
        this.a = rolVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            rom romVar = this.a.c;
            romVar.c = null;
            romVar.p();
            return;
        }
        rom romVar2 = this.a.c;
        Context I = romVar2.I();
        this.a.c.P();
        romVar2.r(new ComponentName(I, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
