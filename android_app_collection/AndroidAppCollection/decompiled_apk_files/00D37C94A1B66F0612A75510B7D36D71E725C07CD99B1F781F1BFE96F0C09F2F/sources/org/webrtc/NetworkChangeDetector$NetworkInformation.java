package org.webrtc;
/* compiled from: PG */
/* loaded from: classes4.dex */
public class NetworkChangeDetector$NetworkInformation {
    public final String a;
    public final NetworkChangeDetector$ConnectionType b;
    public final NetworkChangeDetector$ConnectionType c;
    public final long d;
    public final NetworkChangeDetector$IPAddress[] e;

    public NetworkChangeDetector$NetworkInformation(String str, NetworkChangeDetector$ConnectionType networkChangeDetector$ConnectionType, NetworkChangeDetector$ConnectionType networkChangeDetector$ConnectionType2, long j, NetworkChangeDetector$IPAddress[] networkChangeDetector$IPAddressArr) {
        this.a = str;
        this.b = networkChangeDetector$ConnectionType;
        this.c = networkChangeDetector$ConnectionType2;
        this.d = j;
        this.e = networkChangeDetector$IPAddressArr;
    }

    private NetworkChangeDetector$ConnectionType getConnectionType() {
        return this.b;
    }

    private long getHandle() {
        return this.d;
    }

    private NetworkChangeDetector$IPAddress[] getIpAddresses() {
        return this.e;
    }

    private String getName() {
        return this.a;
    }

    private NetworkChangeDetector$ConnectionType getUnderlyingConnectionTypeForVpn() {
        return this.c;
    }
}
