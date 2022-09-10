package defpackage;

import com.google.android.apps.gmm.location.rawlocationevents.BleBeaconEvent;
import com.google.ar.core.ImageMetadata;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahqg  reason: default package */
/* loaded from: classes2.dex */
public final class ahqg extends ahqe {
    private final BleBeaconEvent b;

    public ahqg(BleBeaconEvent bleBeaconEvent) {
        super(TimeUnit.NANOSECONDS.toMillis(bleBeaconEvent.getTimeNanos()));
        this.b = bleBeaconEvent;
    }

    @Override // defpackage.ahqe
    public final void c(ahqb ahqbVar) {
        ahqbVar.l(this.a, this.b.getEddystoneIdMostSigBits(), this.b.getEddystoneIdLeastSigBits(), this.b.getTxPowerLvl(), this.b.getRssi());
    }

    @Override // defpackage.ahqe
    public final void d(ddrh ddrhVar) {
        long eddystoneIdMostSigBits = this.b.getEddystoneIdMostSigBits();
        if (ddrhVar.c) {
            ddrhVar.bF();
            ddrhVar.c = false;
        }
        ddri ddriVar = (ddri) ddrhVar.b;
        ddri ddriVar2 = ddri.r;
        ddriVar.a |= 8192;
        ddriVar.m = eddystoneIdMostSigBits;
        long eddystoneIdLeastSigBits = this.b.getEddystoneIdLeastSigBits();
        if (ddrhVar.c) {
            ddrhVar.bF();
            ddrhVar.c = false;
        }
        ddri ddriVar3 = (ddri) ddrhVar.b;
        ddriVar3.a |= 16384;
        ddriVar3.n = eddystoneIdLeastSigBits;
        int rssi = this.b.getRssi();
        if (ddrhVar.c) {
            ddrhVar.bF();
            ddrhVar.c = false;
        }
        ddri ddriVar4 = (ddri) ddrhVar.b;
        ddriVar4.a |= 32768;
        ddriVar4.o = rssi;
        int txPowerLvl = this.b.getTxPowerLvl();
        if (ddrhVar.c) {
            ddrhVar.bF();
            ddrhVar.c = false;
        }
        ddri ddriVar5 = (ddri) ddrhVar.b;
        ddriVar5.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        ddriVar5.p = txPowerLvl;
    }
}
