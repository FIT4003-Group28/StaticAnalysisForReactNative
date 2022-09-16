package defpackage;

import android.os.Build;
import java.lang.ref.Reference;
import java.util.UUID;
import org.chromium.net.CellularSignalStrengthError;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amlm  reason: default package */
/* loaded from: classes.dex */
public final class amlm extends amkk {
    private final amnb c;
    private final amll d;
    private final snc e;
    private final int f;
    private final boolean g;

    private amlm(amnb amnbVar, amlm amlmVar) {
        super(amnbVar.a, amlmVar, amnbVar.c);
        this.c = amnbVar;
        this.d = amlmVar.d;
        this.e = amlmVar.e;
        this.f = amlmVar.f;
        this.g = amlmVar.g;
    }

    private final int h() {
        return ((int) (this.g ? this.e.g() : this.e.d())) - this.f;
    }

    public final int d() {
        return this.c.d;
    }

    public final ammq e() {
        return ((amnd) this.d).a().d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        return new defpackage.amlm(r3, r4);
     */
    @Override // defpackage.amlv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.amlv f(java.lang.String r5, defpackage.amlt r6) {
        /*
            r4 = this;
            amll r0 = r4.d
            amnb r1 = r4.c
            int r2 = r4.h()
            amnb r3 = new amnb
            r3.<init>(r1, r5, r2, r6)
        Ld:
            r5 = r0
            amnd r5 = (defpackage.amnd) r5
            java.util.concurrent.atomic.AtomicReference r6 = r5.c
            java.lang.Object r6 = r6.get()
            amnb r6 = (defpackage.amnb) r6
            int r1 = r6.d
            int r1 = r1 + 1
            r2 = 500(0x1f4, float:7.0E-43)
            if (r1 < r2) goto L37
            r5 = -1
            r6 = 0
            r3.b(r5, r6)
            monitor-enter(r0)
            r5 = r0
            amnd r5 = (defpackage.amnd) r5     // Catch: java.lang.Throwable -> L34
            int r5 = r5.e     // Catch: java.lang.Throwable -> L34
            int r5 = r5 + 1
            r6 = r0
            amnd r6 = (defpackage.amnd) r6     // Catch: java.lang.Throwable -> L34
            r6.e = r5     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            goto L42
        L34:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r5
        L37:
            r3.b(r1, r6)
            java.util.concurrent.atomic.AtomicReference r5 = r5.c
            boolean r5 = r5.compareAndSet(r6, r3)
            if (r5 == 0) goto Ld
        L42:
            amlm r5 = new amlm
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amlm.f(java.lang.String, amlt):amlv");
    }

    @Override // defpackage.amlv
    public final void g(boolean z) {
        int h = h();
        amnb amnbVar = this.c;
        int i = h - amnbVar.b;
        aqxo.y(!amnbVar.c());
        amnbVar.f = (true != z ? 0 : 1073741824) | CellularSignalStrengthError.ERROR_NOT_SUPPORTED | (i & 1073741823);
        if (Build.VERSION.SDK_INT >= 28) {
            Reference.reachabilityFence(this);
        }
    }

    public amlm(amnb amnbVar, UUID uuid, amll amllVar, snc sncVar, long j, boolean z) {
        super(amnbVar.a, uuid, amnbVar.c);
        this.c = amnbVar;
        this.d = amllVar;
        this.e = sncVar;
        this.f = (int) j;
        this.g = z;
    }
}
