package c.d.d.g;

import java.io.Closeable;
/* loaded from: classes.dex */
public interface g extends Closeable {

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a() {
            super("Invalid bytebuf. Already closed");
        }
    }

    byte a(int i);

    int a(int i, byte[] bArr, int i2, int i3);

    boolean isClosed();

    int size();
}
