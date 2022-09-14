package defpackage;

import java.util.concurrent.Executors;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: duih  reason: default package */
/* loaded from: classes6.dex */
public final class duih implements duio {
    public static final char[] a = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
    public final String b;
    public final String c;
    public final duhx d;
    public final String e;
    public final duhv f;
    public duio g;
    @dzsi
    public duis h;
    public int i;
    public final duic j;
    private int k;

    public duih(String str, duhx duhxVar, duhv duhvVar, String str2, duic duicVar) {
        dbsk.s(str);
        dbsk.s(duicVar);
        this.b = str;
        this.c = "POST";
        this.d = duhxVar;
        this.e = str2 == null ? "" : str2;
        this.j = duicVar;
        this.f = duhvVar;
        this.k = 1;
    }

    @Override // defpackage.duio
    public final dehn<duir> a() {
        duif duifVar = new duif(this);
        deip deipVar = new deip();
        deipVar.a = "Scotty-Uploader-MultipartTransfer-%d";
        dehp c = dehx.c(Executors.newSingleThreadExecutor(deip.a(deipVar)));
        dehn<duir> c2 = c.c(duifVar);
        c.shutdown();
        return c2;
    }

    public final synchronized void b() {
        int i;
        while (true) {
            i = this.k;
            if (i != 2) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
        if (i == 3) {
            throw new duiq(duip.CANCELED, "");
        }
    }

    @Override // defpackage.duio
    public final void e() {
        synchronized (this) {
            duio duioVar = this.g;
            if (duioVar != null) {
                duioVar.e();
            }
            this.k = 3;
            notifyAll();
        }
    }

    @Override // defpackage.duio
    public final long f() {
        return this.f.d();
    }

    @Override // defpackage.duio
    public final synchronized void g(duis duisVar, int i) {
        dbsk.b(true, "Progress threshold (bytes) must be greater than 0");
        dbsk.b(true, "Progress threshold (millis) must be greater or equal to 0");
        this.h = duisVar;
        this.i = 1;
    }
}
