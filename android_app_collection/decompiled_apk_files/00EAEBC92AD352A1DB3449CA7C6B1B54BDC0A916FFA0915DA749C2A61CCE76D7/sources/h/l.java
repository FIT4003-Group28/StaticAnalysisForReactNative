package h;

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
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    static final Logger f10159a = Logger.getLogger(l.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class a implements u {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f10160b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ OutputStream f10161c;

        a(w wVar, OutputStream outputStream) {
            this.f10160b = wVar;
            this.f10161c = outputStream;
        }

        @Override // h.u, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f10161c.close();
        }

        @Override // h.u, java.io.Flushable
        public void flush() {
            this.f10161c.flush();
        }

        @Override // h.u
        public w timeout() {
            return this.f10160b;
        }

        public String toString() {
            return "sink(" + this.f10161c + ")";
        }

        @Override // h.u
        public void write(h.c cVar, long j) {
            x.a(cVar.f10134c, 0L, j);
            while (j > 0) {
                this.f10160b.throwIfReached();
                r rVar = cVar.f10133b;
                int min = (int) Math.min(j, rVar.f10192c - rVar.f10191b);
                this.f10161c.write(rVar.f10190a, rVar.f10191b, min);
                rVar.f10191b += min;
                long j2 = min;
                j -= j2;
                cVar.f10134c -= j2;
                if (rVar.f10191b == rVar.f10192c) {
                    cVar.f10133b = rVar.b();
                    s.a(rVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class b implements v {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f10162b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InputStream f10163c;

        b(w wVar, InputStream inputStream) {
            this.f10162b = wVar;
            this.f10163c = inputStream;
        }

        @Override // h.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f10163c.close();
        }

        @Override // h.v
        public long read(h.c cVar, long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (i == 0) {
                return 0L;
            } else {
                try {
                    this.f10162b.throwIfReached();
                    r b2 = cVar.b(1);
                    int read = this.f10163c.read(b2.f10190a, b2.f10192c, (int) Math.min(j, 8192 - b2.f10192c));
                    if (read == -1) {
                        return -1L;
                    }
                    b2.f10192c += read;
                    long j2 = read;
                    cVar.f10134c += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (!l.a(e2)) {
                        throw e2;
                    }
                    throw new IOException(e2);
                }
            }
        }

        @Override // h.v
        public w timeout() {
            return this.f10162b;
        }

        public String toString() {
            return "source(" + this.f10163c + ")";
        }
    }

    /* loaded from: classes.dex */
    final class c implements u {
        c() {
        }

        @Override // h.u, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // h.u, java.io.Flushable
        public void flush() {
        }

        @Override // h.u
        public w timeout() {
            return w.NONE;
        }

        @Override // h.u
        public void write(h.c cVar, long j) {
            cVar.skip(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class d extends h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Socket f10164a;

        d(Socket socket) {
            this.f10164a = socket;
        }

        @Override // h.a
        protected IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.a
        protected void timedOut() {
            Level level;
            StringBuilder sb;
            Logger logger;
            Exception exc;
            try {
                this.f10164a.close();
            } catch (AssertionError e2) {
                if (!l.a(e2)) {
                    throw e2;
                }
                Logger logger2 = l.f10159a;
                level = Level.WARNING;
                sb = new StringBuilder();
                exc = e2;
                logger = logger2;
                sb.append("Failed to close timed out socket ");
                sb.append(this.f10164a);
                logger.log(level, sb.toString(), (Throwable) exc);
            } catch (Exception e3) {
                Logger logger3 = l.f10159a;
                level = Level.WARNING;
                sb = new StringBuilder();
                exc = e3;
                logger = logger3;
                sb.append("Failed to close timed out socket ");
                sb.append(this.f10164a);
                logger.log(level, sb.toString(), (Throwable) exc);
            }
        }
    }

    private l() {
    }

    public static h.d a(u uVar) {
        return new p(uVar);
    }

    public static e a(v vVar) {
        return new q(vVar);
    }

    public static u a() {
        return new c();
    }

    public static u a(File file) {
        if (file != null) {
            return a(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static u a(OutputStream outputStream) {
        return a(outputStream, new w());
    }

    private static u a(OutputStream outputStream, w wVar) {
        if (outputStream != null) {
            if (wVar == null) {
                throw new IllegalArgumentException("timeout == null");
            }
            return new a(wVar, outputStream);
        }
        throw new IllegalArgumentException("out == null");
    }

    public static u a(Socket socket) {
        if (socket != null) {
            if (socket.getOutputStream() == null) {
                throw new IOException("socket's output stream == null");
            }
            h.a c2 = c(socket);
            return c2.sink(a(socket.getOutputStream(), c2));
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static v a(InputStream inputStream) {
        return a(inputStream, new w());
    }

    private static v a(InputStream inputStream, w wVar) {
        if (inputStream != null) {
            if (wVar == null) {
                throw new IllegalArgumentException("timeout == null");
            }
            return new b(wVar, inputStream);
        }
        throw new IllegalArgumentException("in == null");
    }

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static u b(File file) {
        if (file != null) {
            return a(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static v b(Socket socket) {
        if (socket != null) {
            if (socket.getInputStream() == null) {
                throw new IOException("socket's input stream == null");
            }
            h.a c2 = c(socket);
            return c2.source(a(socket.getInputStream(), c2));
        }
        throw new IllegalArgumentException("socket == null");
    }

    private static h.a c(Socket socket) {
        return new d(socket);
    }

    public static v c(File file) {
        if (file != null) {
            return a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }
}
