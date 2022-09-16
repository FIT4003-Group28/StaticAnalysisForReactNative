package defpackage;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
/* compiled from: PG */
/* renamed from: adbd  reason: default package */
/* loaded from: classes.dex */
final class adbd implements Runnable {
    private final MulticastSocket a;

    public adbd(MulticastSocket multicastSocket) {
        this.a = multicastSocket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (adbe.d == null) {
                InetAddress byName = InetAddress.getByName("239.255.255.250");
                String hostAddress = byName.getHostAddress();
                StringBuilder sb = new StringBuilder(String.valueOf(hostAddress).length() + 117);
                sb.append("M-SEARCH * HTTP/1.1\r\nHOST: ");
                sb.append(hostAddress);
                sb.append(":1900\r\nMAN: \"ssdp:discover\"\r\nMX: 1\r\nST: urn:dial-multiscreen-org:service:dial:1\r\n\r\n");
                byte[] bytes = sb.toString().getBytes();
                adbe.d = new DatagramPacket(bytes, bytes.length, byName, 1900);
            }
            this.a.send(adbe.d);
        } catch (IOException e) {
            zep.f(adbe.a, "Error sending M-search:", e);
        }
    }
}
