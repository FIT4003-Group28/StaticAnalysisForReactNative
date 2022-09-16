package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
/* compiled from: PG */
/* renamed from: rmg  reason: default package */
/* loaded from: classes4.dex */
final class rmg implements Runnable {
    final /* synthetic */ UserAttributeParcel a;
    final /* synthetic */ AppMetadata b;
    final /* synthetic */ rki c;

    public rmg(rki rkiVar, UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        this.c = rkiVar;
        this.a = userAttributeParcel;
        this.b = appMetadata;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.w();
        if (this.a.a() == null) {
            this.c.a.G(this.a, this.b);
        } else {
            this.c.a.L(this.a, this.b);
        }
    }
}
