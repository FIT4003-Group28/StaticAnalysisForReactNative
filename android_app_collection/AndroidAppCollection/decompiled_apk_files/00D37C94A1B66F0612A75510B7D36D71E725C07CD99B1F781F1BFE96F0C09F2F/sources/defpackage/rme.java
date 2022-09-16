package defpackage;

import com.google.android.gms.measurement.internal.EventParcel;
/* compiled from: PG */
/* renamed from: rme  reason: default package */
/* loaded from: classes4.dex */
final class rme implements Runnable {
    final /* synthetic */ EventParcel a;
    final /* synthetic */ String b;
    final /* synthetic */ rki c;

    public rme(rki rkiVar, EventParcel eventParcel, String str) {
        this.c = rkiVar;
        this.a = eventParcel;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.w();
        this.c.a.B(this.a, this.b);
    }
}
