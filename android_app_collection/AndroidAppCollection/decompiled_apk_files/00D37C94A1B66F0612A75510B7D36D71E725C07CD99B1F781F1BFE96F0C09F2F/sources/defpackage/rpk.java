package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.EventParcel;
/* compiled from: PG */
/* renamed from: rpk  reason: default package */
/* loaded from: classes4.dex */
final class rpk implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b = "_err";
    final /* synthetic */ Bundle c;
    final /* synthetic */ rpl d;

    public rpk(rpl rplVar, String str, Bundle bundle) {
        this.d = rplVar;
        this.a = str;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rps s = this.d.a.s();
        String str = this.a;
        String str2 = this.b;
        Bundle bundle = this.c;
        this.d.a.T();
        EventParcel aw = s.aw(str, str2, bundle, "auto", System.currentTimeMillis(), false);
        rpn rpnVar = this.d.a;
        qnm.b(aw);
        rpnVar.B(aw, this.a);
    }
}
