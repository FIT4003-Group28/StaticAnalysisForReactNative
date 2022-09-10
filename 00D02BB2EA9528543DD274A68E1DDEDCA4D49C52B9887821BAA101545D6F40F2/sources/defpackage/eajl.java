package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: eajl  reason: default package */
/* loaded from: classes6.dex */
public final class eajl {
    static final Logger a = Logger.getLogger(eajl.class.getName());

    private eajl() {
    }

    public static eajb a(eajy eajyVar) {
        return new eajt(eajyVar);
    }

    public static eaja b(eajx eajxVar) {
        return new eajr(eajxVar);
    }

    public static eajx c(OutputStream outputStream) {
        return j(outputStream, new eaka());
    }

    public static eajy e(InputStream inputStream) {
        return k(inputStream, new eaka());
    }

    public static eajx f(File file) {
        return c(new FileOutputStream(file));
    }

    public static eajx g(File file) {
        return c(new FileOutputStream(file, true));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    private static eajx j(OutputStream outputStream, eaka eakaVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        return new eaji(eakaVar, outputStream);
    }

    private static eajy k(InputStream inputStream, eaka eakaVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        return new eajj(eakaVar, inputStream);
    }

    private static eaiw l(Socket socket) {
        return new eajk(socket);
    }

    public static eajx d(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        eaiw l = l(socket);
        return new eait(l, j(socket.getOutputStream(), l));
    }

    public static eajy h(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        eaiw l = l(socket);
        return new eaiu(l, k(socket.getInputStream(), l));
    }
}
