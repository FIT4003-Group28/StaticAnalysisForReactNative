package defpackage;

import java.net.Socket;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;
/* compiled from: PG */
/* renamed from: dyxo  reason: default package */
/* loaded from: classes6.dex */
final class dyxo extends dyxs {
    private final dyxk<Socket> d;
    private final dyxk<Socket> e;
    private final dyxk<Socket> f;
    private final dyxk<Socket> g;
    private final int h;

    public dyxo(dyxk<Socket> dyxkVar, dyxk<Socket> dyxkVar2, dyxk<Socket> dyxkVar3, dyxk<Socket> dyxkVar4, Provider provider, int i) {
        super(provider);
        this.d = dyxkVar;
        this.e = dyxkVar2;
        this.f = dyxkVar3;
        this.g = dyxkVar4;
        this.h = i;
    }

    @Override // defpackage.dyxs
    public final void a(SSLSocket sSLSocket, String str, List<dyxt> list) {
        if (str != null) {
            this.d.c(sSLSocket, true);
            this.e.c(sSLSocket, str);
        }
        if (this.g.a(sSLSocket)) {
            this.g.b(sSLSocket, e(list));
        }
    }

    @Override // defpackage.dyxs
    public final String b(SSLSocket sSLSocket) {
        byte[] bArr;
        if (this.f.a(sSLSocket) && (bArr = (byte[]) this.f.b(sSLSocket, new Object[0])) != null) {
            return new String(bArr, dyxv.b);
        }
        return null;
    }

    @Override // defpackage.dyxs
    public final int c() {
        return this.h;
    }
}
