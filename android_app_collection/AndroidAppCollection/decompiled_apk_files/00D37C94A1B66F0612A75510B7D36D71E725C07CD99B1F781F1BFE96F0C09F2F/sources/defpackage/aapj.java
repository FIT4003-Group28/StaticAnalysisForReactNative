package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aapj  reason: default package */
/* loaded from: classes.dex */
public final class aapj extends PhoneStateListener {
    final /* synthetic */ aapk a;

    public aapj(aapk aapkVar) {
        this.a = aapkVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        this.a.d.qo(new Runnable() { // from class: aapi
            @Override // java.lang.Runnable
            public final void run() {
                aapk aapkVar = aapj.this.a;
                aapkVar.e.set(aapkVar.a());
            }
        });
    }
}
