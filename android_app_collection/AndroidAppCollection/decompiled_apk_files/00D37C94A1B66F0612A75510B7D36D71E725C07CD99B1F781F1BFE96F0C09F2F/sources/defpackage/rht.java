package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.internal.InitializationParams;
/* compiled from: PG */
/* renamed from: rht  reason: default package */
/* loaded from: classes4.dex */
final class rht extends rii {
    final /* synthetic */ Context a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ rir c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rht(rir rirVar, Context context, Bundle bundle) {
        super(rirVar);
        this.c = rirVar;
        this.a = context;
        this.b = bundle;
    }

    @Override // defpackage.rii
    public final void a() {
        rhg rhgVar;
        try {
            qnm.b(this.a);
            rir rirVar = this.c;
            try {
                rhgVar = rhf.asInterface(ras.e(this.a, ras.c, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (rao e) {
                rirVar.a(e, true, false);
                rhgVar = null;
            }
            rirVar.f = rhgVar;
            if (this.c.f == null) {
                Log.w(this.c.a, "Failed to connect to measurement client.");
                return;
            }
            int a = ras.a(this.a, ModuleDescriptor.MODULE_ID);
            int b = ras.b(this.a, ModuleDescriptor.MODULE_ID);
            InitializationParams initializationParams = new InitializationParams(43009L, Math.max(a, b), b < a, null, null, null, this.b, rgf.n(this.a));
            rhg rhgVar2 = this.c.f;
            qnm.b(rhgVar2);
            rhgVar2.initialize(rac.a(this.a), initializationParams, this.f);
        } catch (Exception e2) {
            this.c.a(e2, true, false);
        }
    }
}
