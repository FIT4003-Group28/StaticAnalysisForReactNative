package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.EventParcel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rod  reason: default package */
/* loaded from: classes4.dex */
public final class rod implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ boolean b;
    final /* synthetic */ EventParcel c;
    final /* synthetic */ rom d;

    public rod(rom romVar, AppMetadata appMetadata, boolean z, EventParcel eventParcel) {
        this.d = romVar;
        this.a = appMetadata;
        this.b = z;
        this.c = eventParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rom romVar = this.d;
        rkj rkjVar = romVar.c;
        if (rkjVar == null) {
            romVar.aG().c.a("Discarding data. Failed to send event to service");
            return;
        }
        romVar.u(rkjVar, this.b ? null : this.c, this.a);
        this.d.s();
    }
}
