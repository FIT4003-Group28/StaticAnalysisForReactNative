package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: roe  reason: default package */
/* loaded from: classes4.dex */
public final class roe implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ConditionalUserPropertyParcel c;
    final /* synthetic */ rom d;

    public roe(rom romVar, AppMetadata appMetadata, boolean z, ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        this.d = romVar;
        this.a = appMetadata;
        this.b = z;
        this.c = conditionalUserPropertyParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rom romVar = this.d;
        rkj rkjVar = romVar.c;
        if (rkjVar == null) {
            romVar.aG().c.a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        romVar.u(rkjVar, this.b ? null : this.c, this.a);
        this.d.s();
    }
}
