package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
/* compiled from: PG */
/* renamed from: rma  reason: default package */
/* loaded from: classes4.dex */
final class rma implements Runnable {
    final /* synthetic */ ConditionalUserPropertyParcel a;
    final /* synthetic */ rki b;

    public rma(rki rkiVar, ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        this.b = rkiVar;
        this.a = conditionalUserPropertyParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.w();
        if (this.a.c.a() == null) {
            rpn rpnVar = this.b.a;
            ConditionalUserPropertyParcel conditionalUserPropertyParcel = this.a;
            String str = conditionalUserPropertyParcel.a;
            qnm.b(str);
            AppMetadata d = rpnVar.d(str);
            if (d == null) {
                return;
            }
            rpnVar.F(conditionalUserPropertyParcel, d);
            return;
        }
        rpn rpnVar2 = this.b.a;
        ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = this.a;
        String str2 = conditionalUserPropertyParcel2.a;
        qnm.b(str2);
        AppMetadata d2 = rpnVar2.d(str2);
        if (d2 == null) {
            return;
        }
        rpnVar2.I(conditionalUserPropertyParcel2, d2);
    }
}
