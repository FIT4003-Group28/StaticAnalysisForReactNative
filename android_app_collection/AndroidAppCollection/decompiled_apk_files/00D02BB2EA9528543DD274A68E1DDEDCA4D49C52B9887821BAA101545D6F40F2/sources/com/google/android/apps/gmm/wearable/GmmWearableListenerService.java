package com.google.android.apps.gmm.wearable;

import java.util.Iterator;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class GmmWearableListenerService extends cphg {
    public ckuq a;
    public bvrv b;

    @Override // defpackage.cphg
    public final void a(cpgk cpgkVar) {
        cktp cktpVar = ((cktw) this.a).h;
        Iterator<cphz> it = cpgkVar.iterator();
        while (it.hasNext()) {
            cphz next = it.next();
            if (next.b() == 1) {
                cktpVar.a(next.a());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:259:0x033a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x02f0 A[SYNTHETIC] */
    @Override // defpackage.cphg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.google.android.gms.wearable.internal.MessageEventParcelable r18) {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gmm.wearable.GmmWearableListenerService.b(com.google.android.gms.wearable.internal.MessageEventParcelable):void");
    }

    @Override // defpackage.cphg, android.app.Service
    public final void onCreate() {
        dxiq.b(this);
        super.onCreate();
    }

    @Override // defpackage.cphg, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b.a();
    }
}
