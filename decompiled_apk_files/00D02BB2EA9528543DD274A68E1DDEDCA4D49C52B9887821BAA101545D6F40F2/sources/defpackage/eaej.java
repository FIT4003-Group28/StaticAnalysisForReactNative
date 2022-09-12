package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eaej  reason: default package */
/* loaded from: classes6.dex */
public final class eaej extends eaex {
    final /* synthetic */ eaek a;
    private final eadd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eaej(eaek eaekVar, eadd eaddVar) {
        super("OkHttp %s", eaekVar.f());
        this.a = eaekVar;
        this.c = eaddVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        return this.a.d.a.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ExecutorService executorService) {
        try {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                this.c.a(interruptedIOException);
                this.a.a.c.c(this);
            }
        } catch (Throwable th) {
            this.a.a.c.c(this);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v18, types: [eadp] */
    /* JADX WARN: Type inference failed for: r0v19 */
    @Override // defpackage.eaex
    protected final void c() {
        boolean z;
        eadp eadpVar;
        eaep g;
        this.a.c.d();
        boolean z2 = true;
        ?? r0 = 1;
        try {
            try {
                g = this.a.g();
            } catch (IOException e) {
                e = e;
                z = false;
            }
            try {
                if (this.a.b.c) {
                    this.c.a(new IOException("Canceled"));
                } else {
                    this.c.b(g);
                }
                r0 = this.a.a.c;
                eadpVar = r0;
            } catch (IOException e2) {
                e = e2;
                z = true;
                z2 = r0;
                IOException e3 = this.a.e(e);
                if (z) {
                    eaim eaimVar = eaim.c;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Callback failure for ");
                    eaek eaekVar = this.a;
                    StringBuilder sb2 = new StringBuilder();
                    String str = "canceled ";
                    if (z2 != eaekVar.b.c) {
                        str = "";
                    }
                    sb2.append(str);
                    sb2.append("call");
                    sb2.append(" to ");
                    sb2.append(eaekVar.f());
                    sb.append(sb2.toString());
                    eaimVar.e(4, sb.toString(), e3);
                } else {
                    this.c.a(e3);
                }
                eadpVar = this.a.a.c;
                eadpVar.c(this);
            }
            eadpVar.c(this);
        } catch (Throwable th) {
            this.a.a.c.c(this);
            throw th;
        }
    }
}
