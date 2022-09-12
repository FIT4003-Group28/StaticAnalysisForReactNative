package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: bqwa  reason: default package */
/* loaded from: classes4.dex */
public final class bqwa {
    private final dxio<bqlc> b;
    @dzsi
    public akqi a = null;
    private AtomicReference<bqvz> c = new AtomicReference<>();
    private final Queue<AtomicReference<bqvz>> d = new ArrayDeque();
    private int e = 2;

    public bqwa(dxio<bqlc> dxioVar) {
        this.b = dxioVar;
    }

    @dzsi
    private final synchronized AtomicReference<bqvz> h() {
        if (this.d.isEmpty() || this.e != 2) {
            return null;
        }
        this.e = 1;
        return this.d.remove();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(akqi akqiVar) {
        this.a = akqiVar;
        this.c = new AtomicReference<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        this.a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(bqla bqlaVar, bwrs<ilo> bwrsVar, bqlb bqlbVar) {
        synchronized (this) {
            if (!bqlaVar.a().a().equals(this.a)) {
                bqlaVar.a();
                return false;
            }
            d(bwrsVar, bqlaVar, bqlbVar);
            b();
            g();
            return true;
        }
    }

    public final void d(bwrs<ilo> bwrsVar, bqla bqlaVar, bqlb bqlbVar) {
        AtomicReference<bqvz> atomicReference = this.c;
        bqtp bqtpVar = new bqtp();
        bqtpVar.b = bwrsVar;
        if (bqlaVar != null) {
            bqtpVar.a = bqlaVar;
            if (bqlbVar != null) {
                bqtpVar.c = bqlbVar;
                String str = bqtpVar.a == null ? " reviewRequest" : "";
                if (bqtpVar.b == null) {
                    str = str.concat(" placemarkRef");
                }
                if (bqtpVar.c == null) {
                    str = String.valueOf(str).concat(" callback");
                }
                if (!str.isEmpty()) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                }
                bqvz andSet = atomicReference.getAndSet(new bqtq(bqtpVar.a, bqtpVar.b, bqtpVar.c));
                this.d.add(this.c);
                if (andSet == null) {
                    return;
                }
                andSet.a().a();
                return;
            }
            throw new NullPointerException("Null callback");
        }
        throw new NullPointerException("Null reviewRequest");
    }

    public final synchronized boolean e() {
        return this.a != null;
    }

    public final synchronized void f() {
        this.e = 2;
    }

    public final void g() {
        while (true) {
            AtomicReference<bqvz> h = h();
            if (h == null) {
                return;
            }
            bqvz andSet = h.getAndSet(null);
            if (andSet == null) {
                f();
            } else {
                andSet.a().a();
                this.b.a().b(andSet.a(), andSet.b(), new bqvx(this, andSet));
                return;
            }
        }
    }
}
