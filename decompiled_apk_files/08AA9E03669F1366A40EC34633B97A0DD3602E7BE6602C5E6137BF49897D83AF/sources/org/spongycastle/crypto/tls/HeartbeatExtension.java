package org.spongycastle.crypto.tls;

import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class HeartbeatExtension {
    protected short mode;

    public HeartbeatExtension(short s) {
        if (!HeartbeatMode.isValid(s)) {
            throw new IllegalArgumentException("'mode' is not a valid HeartbeatMode value");
        }
        this.mode = s;
    }

    public short getMode() {
        return this.mode;
    }

    public void encode(OutputStream outputStream) {
        TlsUtils.writeUint8(this.mode, outputStream);
    }

    public static HeartbeatExtension parse(InputStream inputStream) {
        short readUint8 = TlsUtils.readUint8(inputStream);
        if (!HeartbeatMode.isValid(readUint8)) {
            throw new TlsFatalAlert((short) 47);
        }
        return new HeartbeatExtension(readUint8);
    }
}
