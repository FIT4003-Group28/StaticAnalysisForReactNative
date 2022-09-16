package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rnu  reason: default package */
/* loaded from: classes4.dex */
public final class rnu implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ boolean b;
    final /* synthetic */ UserAttributeParcel c;
    final /* synthetic */ rom d;

    public rnu(rom romVar, AppMetadata appMetadata, boolean z, UserAttributeParcel userAttributeParcel) {
        this.d = romVar;
        this.a = appMetadata;
        this.b = z;
        this.c = userAttributeParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rom romVar = this.d;
        rkj rkjVar = romVar.c;
        if (rkjVar == null) {
            romVar.aG().c.a("Discarding data. Failed to set user property");
            return;
        }
        romVar.u(rkjVar, this.b ? null : this.c, this.a);
        this.d.s();
    }
}
