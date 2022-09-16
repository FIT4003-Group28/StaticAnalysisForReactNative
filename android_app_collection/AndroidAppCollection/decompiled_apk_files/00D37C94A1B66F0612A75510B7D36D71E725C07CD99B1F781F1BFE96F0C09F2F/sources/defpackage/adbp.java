package defpackage;

import java.io.IOException;
import java.net.MulticastSocket;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: adbp  reason: default package */
/* loaded from: classes.dex */
public final class adbp implements adbq {
    private static final String a = zep.a("MDX.SocketFactory");

    public final MulticastSocket a(yrf yrfVar, Integer num) {
        try {
            MulticastSocket multicastSocket = new MulticastSocket();
            multicastSocket.setNetworkInterface(yrfVar.a);
            if (num != null) {
                multicastSocket.setReceiveBufferSize(num.intValue());
            }
            multicastSocket.setBroadcast(true);
            return multicastSocket;
        } catch (IOException e) {
            zep.f(a, String.format(Locale.US, "Error creating socket on interface %s", yrfVar.a()), e);
            return null;
        }
    }
}
