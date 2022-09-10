package defpackage;

import java.io.IOException;
import java.util.concurrent.RejectedExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eahd  reason: default package */
/* loaded from: classes6.dex */
public final class eahd extends eaex implements eahg {
    final eahh a;
    final /* synthetic */ eahe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eahd(eahe eaheVar, eahh eahhVar) {
        super("OkHttp %s", eaheVar.e);
        this.c = eaheVar;
        this.a = eahhVar;
    }

    public final void a(eahr eahrVar) {
        try {
            eahe eaheVar = this.c;
            eaheVar.i.execute(new eahc(this, new Object[]{eaheVar.e}, eahrVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // defpackage.eahg
    public final void b(boolean z, int i, int i2) {
        if (z) {
            synchronized (this.c) {
                eahe eaheVar = this.c;
                eaheVar.j = false;
                eaheVar.notifyAll();
            }
            return;
        }
        try {
            eahe eaheVar2 = this.c;
            eaheVar2.i.execute(new eagz(eaheVar2, true, i, i2));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // defpackage.eaex
    protected final void c() {
        try {
        } catch (IOException unused) {
            this.c.p(2, 2);
        } catch (Throwable th) {
            try {
                this.c.p(3, 3);
            } catch (IOException unused2) {
            }
            eafa.b(this.a);
            throw th;
        }
        if (this.a.a(true, this)) {
            do {
            } while (this.a.a(false, this));
            this.c.p(1, 9);
            eafa.b(this.a);
            return;
        }
        throw eagn.b("Required SETTINGS preface not received", new Object[0]);
    }
}
