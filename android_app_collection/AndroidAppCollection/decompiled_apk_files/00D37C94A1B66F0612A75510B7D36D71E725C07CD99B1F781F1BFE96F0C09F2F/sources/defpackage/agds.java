package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.protos.youtube.api.innertube.RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint;
/* compiled from: PG */
/* renamed from: agds  reason: default package */
/* loaded from: classes.dex */
public final class agds implements ageb {
    private final Context a;
    private final Intent b;
    private final atps c;

    public agds(Context context, Intent intent, aadd aaddVar) {
        this.a = context;
        this.b = intent;
        this.c = agel.a(aaddVar);
    }

    @Override // defpackage.ageb
    public final void a(apgq apgqVar, acti actiVar, aged agedVar, fi fiVar) {
        if (this.b == null || (apgqVar.b & 16) == 0) {
            return;
        }
        apzg apzgVar = apgqVar.i;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        if (!apzgVar.qn(RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.recordNotificationInteractionsEndpoint)) {
            return;
        }
        Context context = this.a;
        Intent intent = new Intent(this.b);
        apzg apzgVar2 = apgqVar.i;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        ahfe.d(intent, apzgVar2);
        asvv asvvVar = apgqVar.u;
        if (asvvVar == null) {
            asvvVar = asvv.b;
        }
        agec.c(intent, asvvVar);
        if ((apgqVar.b & 32768) != 0) {
            ahfe.g(intent, ((acsx) actiVar).i);
            intent.putExtra("interaction_type", 2);
        }
        agel.l(intent, "DISMISSED", this.c);
        aoxp aoxpVar = apgqVar.o;
        if (aoxpVar == null) {
            aoxpVar = aoxp.a;
        }
        agec.d(intent, aoxpVar);
        fiVar.m(agel.k(context, intent));
    }
}
