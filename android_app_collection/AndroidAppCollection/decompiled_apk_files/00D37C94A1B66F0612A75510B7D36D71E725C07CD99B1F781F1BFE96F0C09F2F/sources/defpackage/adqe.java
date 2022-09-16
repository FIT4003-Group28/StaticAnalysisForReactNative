package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: adqe  reason: default package */
/* loaded from: classes.dex */
public final class adqe {
    public final /* synthetic */ adqh a;

    public adqe(adqh adqhVar) {
        this.a = adqhVar;
    }

    public final void a(adib adibVar, int i) {
        zep.h(adqh.a, String.format(Locale.US, "Found corresponding cloud screen %s for DIAL device %s", adibVar, this.a.m));
        adqh adqhVar = this.a;
        adqhVar.s = i + 1;
        adqhVar.ak.c(11);
        this.a.at(adibVar);
    }

    public final void b(int i, int i2, int i3) {
        adne adneVar;
        this.a.s = i3 + 1;
        if (i2 == 0) {
            adneVar = adne.LAUNCH_FAIL_DEVICE_BUSY;
        } else if (i2 == 2) {
            adneVar = adne.LAUNCH_FAIL_TIMEOUT;
        } else if (i2 == 3) {
            adneVar = adne.LAUNCH_FAIL_TIMEOUT;
        } else if (i2 == 4) {
            adneVar = adne.NETWORK;
        } else {
            adneVar = adne.UNKNOWN;
        }
        zep.c(adqh.a, String.format(Locale.US, "Could not find cloud screen corresponding to DIAL device %s, %s", this.a.m, adneVar));
        atcv aF = adqh.aF(i2);
        if (aF.equals(atcv.MDX_SESSION_DISCONNECT_REASON_NETWORK)) {
            this.a.ar(adneVar, aF, 1);
        } else {
            this.a.ar(adneVar, adqh.aF(i2), Integer.valueOf(i));
        }
    }
}
