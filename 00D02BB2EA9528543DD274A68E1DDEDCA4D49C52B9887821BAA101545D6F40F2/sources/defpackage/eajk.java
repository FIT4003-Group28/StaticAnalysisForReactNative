package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: eajk  reason: default package */
/* loaded from: classes6.dex */
final class eajk extends eaiw {
    final /* synthetic */ Socket a;

    public eajk(Socket socket) {
        this.a = socket;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eaiw
    public final void a() {
        try {
            this.a.close();
        } catch (AssertionError e) {
            if (eajl.i(e)) {
                Logger logger = eajl.a;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(this.a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                sb.append("Failed to close timed out socket ");
                sb.append(valueOf);
                logger.logp(level, "okio.Okio$4", "timedOut", sb.toString(), (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            Logger logger2 = eajl.a;
            Level level2 = Level.WARNING;
            String valueOf2 = String.valueOf(this.a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
            sb2.append("Failed to close timed out socket ");
            sb2.append(valueOf2);
            logger2.logp(level2, "okio.Okio$4", "timedOut", sb2.toString(), (Throwable) e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eaiw
    public final IOException b(@dzsi IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
