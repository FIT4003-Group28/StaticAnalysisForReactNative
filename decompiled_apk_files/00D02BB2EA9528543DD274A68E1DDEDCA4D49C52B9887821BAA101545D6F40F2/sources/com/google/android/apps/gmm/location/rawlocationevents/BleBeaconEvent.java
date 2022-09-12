package com.google.android.apps.gmm.location.rawlocationevents;

import java.util.Locale;
/* compiled from: PG */
@ckor
@ckol(a = "ble-beacon", b = ckok.HIGH)
/* loaded from: classes.dex */
public class BleBeaconEvent {
    private final long eddystoneIdLeastSigBits;
    private final long eddystoneIdMostSigBits;
    private final int rssi;
    private final long timeNanos;
    private final int txPowerLvl;

    public BleBeaconEvent(@ckoo(a = "eidmsb") long j, @ckoo(a = "eidlsb") long j2, @ckoo(a = "rssi") int i, @ckoo(a = "power") int i2, @ckoo(a = "timeNs", c = true) long j3) {
        this.eddystoneIdMostSigBits = j;
        this.eddystoneIdLeastSigBits = j2;
        this.rssi = i;
        this.txPowerLvl = i2;
        this.timeNanos = j3;
    }

    @ckom(a = "eidlsb")
    public long getEddystoneIdLeastSigBits() {
        return this.eddystoneIdLeastSigBits;
    }

    @ckom(a = "eidmsb")
    public long getEddystoneIdMostSigBits() {
        return this.eddystoneIdMostSigBits;
    }

    @ckom(a = "rssi")
    public int getRssi() {
        return this.rssi;
    }

    @ckom(a = "timeNs")
    public long getTimeNanos() {
        return this.timeNanos;
    }

    @ckom(a = "power")
    public int getTxPowerLvl() {
        return this.txPowerLvl;
    }

    public String toString() {
        return String.format(Locale.US, "EID: %s %s, rssi: %d, power: %d, timeNS: %d", Long.toHexString(this.eddystoneIdMostSigBits), Long.toHexString(this.eddystoneIdLeastSigBits), Integer.valueOf(this.rssi), Integer.valueOf(this.txPowerLvl), Long.valueOf(this.timeNanos));
    }
}
