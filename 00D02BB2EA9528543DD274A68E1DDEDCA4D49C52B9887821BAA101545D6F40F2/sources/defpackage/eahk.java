package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eahk  reason: default package */
/* loaded from: classes6.dex */
public final class eahk extends eaiw {
    final /* synthetic */ eahl a;

    public eahk(eahl eahlVar) {
        this.a = eahlVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eaiw
    public final void a() {
        this.a.k(9);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eaiw
    public final IOException b(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public final void c() {
        if (!e()) {
            return;
        }
        throw b(null);
    }
}
