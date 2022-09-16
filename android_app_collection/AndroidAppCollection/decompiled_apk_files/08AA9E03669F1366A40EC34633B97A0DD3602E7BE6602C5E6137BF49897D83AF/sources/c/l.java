package c;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: Okio.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    static final Logger f1298a = Logger.getLogger(l.class.getName());

    private l() {
    }

    public static e a(t tVar) {
        return new o(tVar);
    }

    public static d a(s sVar) {
        return new n(sVar);
    }

    public static s a(OutputStream outputStream) {
        return a(outputStream, new u());
    }

    private static s a(final OutputStream outputStream, final u uVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (uVar == null) {
            throw new IllegalArgumentException("timeout == null");
        }
        return new s() { // from class: c.l.1
            @Override // c.s
            public void write(c cVar, long j) {
                v.a(cVar.f1283b, 0L, j);
                while (j > 0) {
                    u.this.throwIfReached();
                    p pVar = cVar.f1282a;
                    int min = (int) Math.min(j, pVar.f1321c - pVar.f1320b);
                    outputStream.write(pVar.f1319a, pVar.f1320b, min);
                    pVar.f1320b += min;
                    long j2 = min;
                    j -= j2;
                    cVar.f1283b -= j2;
                    if (pVar.f1320b == pVar.f1321c) {
                        cVar.f1282a = pVar.a();
                        q.a(pVar);
                    }
                }
            }

            @Override // c.s, java.io.Flushable
            public void flush() {
                outputStream.flush();
            }

            @Override // c.s, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                outputStream.close();
            }

            @Override // c.s
            public u timeout() {
                return u.this;
            }

            public String toString() {
                return "sink(" + outputStream + ")";
            }
        };
    }

    public static s a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        a c2 = c(socket);
        return c2.sink(a(socket.getOutputStream(), c2));
    }

    public static t a(InputStream inputStream) {
        return a(inputStream, new u());
    }

    private static t a(final InputStream inputStream, final u uVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (uVar == null) {
            throw new IllegalArgumentException("timeout == null");
        }
        return new t() { // from class: c.l.2
            @Override // c.t
            public long read(c cVar, long j) {
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i < 0) {
                    throw new IllegalArgumentException("byteCount < 0: " + j);
                } else if (i == 0) {
                    return 0L;
                } else {
                    try {
                        u.this.throwIfReached();
                        p e = cVar.e(1);
                        int read = inputStream.read(e.f1319a, e.f1321c, (int) Math.min(j, 8192 - e.f1321c));
                        if (read == -1) {
                            return -1L;
                        }
                        e.f1321c += read;
                        long j2 = read;
                        cVar.f1283b += j2;
                        return j2;
                    } catch (AssertionError e2) {
                        if (!l.a(e2)) {
                            throw e2;
                        }
                        throw new IOException(e2);
                    }
                }
            }

            @Override // c.t, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                inputStream.close();
            }

            @Override // c.t
            public u timeout() {
                return u.this;
            }

            public String toString() {
                return "source(" + inputStream + ")";
            }
        };
    }

    public static t a(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return a(new FileInputStream(file));
    }

    public static s b(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return a(new FileOutputStream(file));
    }

    public static s c(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return a(new FileOutputStream(file, true));
    }

    public static s a() {
        return new s() { // from class: c.l.3
            @Override // c.s, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // c.s, java.io.Flushable
            public void flush() {
            }

            @Override // c.s
            public void write(c cVar, long j) {
                cVar.i(j);
            }

            @Override // c.s
            public u timeout() {
                return u.NONE;
            }
        };
    }

    public static t b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        a c2 = c(socket);
        return c2.source(a(socket.getInputStream(), c2));
    }

    private static a c(final Socket socket) {
        return new a() { // from class: c.l.4
            @Override // c.a
            protected IOException newTimeoutException(IOException iOException) {
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }

            @Override // c.a
            protected void timedOut() {
                try {
                    socket.close();
                } catch (AssertionError e) {
                    if (l.a(e)) {
                        Logger logger = l.f1298a;
                        Level level = Level.WARNING;
                        logger.log(level, "Failed to close timed out socket " + socket, (Throwable) e);
                        return;
                    }
                    throw e;
                } catch (Exception e2) {
                    Logger logger2 = l.f1298a;
                    Level level2 = Level.WARNING;
                    logger2.log(level2, "Failed to close timed out socket " + socket, (Throwable) e2);
                }
            }
        };
    }

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
