package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
/* compiled from: PG */
/* renamed from: rlz  reason: default package */
/* loaded from: classes4.dex */
final class rlz implements Runnable {
    final /* synthetic */ ConditionalUserPropertyParcel a;
    final /* synthetic */ AppMetadata b;
    final /* synthetic */ rki c;

    public rlz(rki rkiVar, ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        this.c = rkiVar;
        this.a = conditionalUserPropertyParcel;
        this.b = appMetadata;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.w();
        if (this.a.c.a() == null) {
            this.c.a.F(this.a, this.b);
        } else {
            this.c.a.I(this.a, this.b);
        }
    }
}
