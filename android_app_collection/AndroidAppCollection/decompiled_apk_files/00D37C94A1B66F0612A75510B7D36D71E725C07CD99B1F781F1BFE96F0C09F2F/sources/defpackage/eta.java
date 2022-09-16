package defpackage;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eta  reason: default package */
/* loaded from: classes3.dex */
public final class eta implements Runnable {
    final /* synthetic */ etb a;

    public eta(etb etbVar) {
        this.a = etbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            synchronized (this.a) {
                etb etbVar = this.a;
                oru oruVar = etbVar.c;
                etc etcVar = etbVar.b;
                byte[] byteArray = oruVar.toByteArray();
                anhe.f(etcVar.a);
                anhe.g(byteArray, etcVar.a);
            }
        } catch (IOException e) {
            String valueOf = String.valueOf(this.a.b.a.getAbsolutePath());
            zep.n(valueOf.length() != 0 ? "Failed to write offline response to ".concat(valueOf) : new String("Failed to write offline response to "), e);
        }
    }
}
