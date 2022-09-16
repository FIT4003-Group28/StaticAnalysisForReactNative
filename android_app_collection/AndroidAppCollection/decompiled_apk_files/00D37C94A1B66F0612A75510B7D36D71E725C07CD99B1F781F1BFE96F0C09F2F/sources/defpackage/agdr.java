package defpackage;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: agdr  reason: default package */
/* loaded from: classes.dex */
public final class agdr implements ageb {
    private final Context a;
    private final Intent b;
    private final Intent c;
    private final atps d;

    public agdr(Context context, Intent intent, Intent intent2, aadd aaddVar) {
        this.a = context;
        this.b = intent;
        this.c = intent2;
        this.d = agel.a(aaddVar);
    }

    @Override // defpackage.ageb
    public final void a(apgq apgqVar, acti actiVar, aged agedVar, fi fiVar) {
        int i = apgqVar.b;
        if ((i & 2) != 0) {
            fiVar.g = agel.j(this.a, b(apgqVar, this.b, actiVar));
        } else if ((i & 4) == 0) {
        } else {
            fiVar.g = agel.k(this.a, b(apgqVar, this.c, actiVar));
        }
    }

    final Intent b(apgq apgqVar, Intent intent, acti actiVar) {
        Intent intent2 = new Intent(intent);
        apzg apzgVar = apgqVar.f;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        agec.a(intent2, apzgVar, actiVar, (apgqVar.b & 32768) != 0);
        apzg apzgVar2 = apgqVar.g;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        agee.f(intent2, apzgVar2);
        agel.l(intent2, "CLICKED", this.d);
        apzg apzgVar3 = apgqVar.h;
        if (apzgVar3 == null) {
            apzgVar3 = apzg.a;
        }
        ahfe.d(intent2, apzgVar3);
        aoxp aoxpVar = apgqVar.o;
        if (aoxpVar == null) {
            aoxpVar = aoxp.a;
        }
        agec.d(intent2, aoxpVar);
        avqu avquVar = apgqVar.q;
        if (avquVar == null) {
            avquVar = avqu.a;
        }
        if (avquVar != null && avquVar.b != 0) {
            intent2.putExtra("com.google.android.apps.youtube.unplugged.unplugged_notification_params_extra", avquVar.toByteArray());
        }
        return intent2;
    }
}
