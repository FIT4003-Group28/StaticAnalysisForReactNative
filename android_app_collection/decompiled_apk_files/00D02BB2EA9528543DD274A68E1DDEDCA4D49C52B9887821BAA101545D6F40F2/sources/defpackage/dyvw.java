package defpackage;

import java.io.IOException;
import java.net.Socket;
/* compiled from: PG */
/* renamed from: dyvw  reason: default package */
/* loaded from: classes6.dex */
final class dyvw implements Runnable {
    final /* synthetic */ dyvy a;

    public dyvw(dyvy dyvyVar) {
        this.a = dyvyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            eajx eajxVar = this.a.f;
            if (eajxVar != null) {
                eajxVar.close();
            }
        } catch (IOException e) {
            this.a.c.a(e);
        }
        try {
            Socket socket = this.a.g;
            if (socket == null) {
                return;
            }
            socket.close();
        } catch (IOException e2) {
            this.a.c.a(e2);
        }
    }
}
