package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: azvw  reason: default package */
/* loaded from: classes2.dex */
public class azvw implements azvo, azuh, azwc {
    public final aztu c = ayme.f(azvx.f);
    private final aztu a = ayme.f(null);

    public static final azug A(azxw azxwVar) {
        while (azxwVar.sw()) {
            azxwVar = azxwVar.i();
        }
        while (true) {
            azxwVar = azxwVar.h();
            if (!azxwVar.sw()) {
                if (azxwVar instanceof azug) {
                    return (azug) azxwVar;
                }
                if (azxwVar instanceof azvz) {
                    return null;
                }
            }
        }
    }

    private final azvz B(azvm azvmVar) {
        azvz su = azvmVar.su();
        if (su == null) {
            if (azvmVar instanceof azvf) {
                return new azvz();
            }
            if (azvmVar instanceof azvs) {
                E((azvs) azvmVar);
                return null;
            }
            throw new IllegalStateException(azst.a("State should have list: ", azvmVar).toString());
        }
        return su;
    }

    private final void C(azvm azvmVar, Object obj) {
        azun azunVar;
        azuf t = t();
        if (t != null) {
            t.d();
            v(azwa.a);
        }
        azuk azukVar = obj instanceof azuk ? (azuk) obj : null;
        Throwable th = azukVar == null ? null : azukVar.b;
        if (azvmVar instanceof azvs) {
            try {
                ((azvs) azvmVar).b(th);
                return;
            } catch (Throwable th2) {
                c(new azun("Exception in completion handler " + azvmVar + " for " + this, th2));
                return;
            }
        }
        azvz su = azvmVar.su();
        if (su == null) {
            return;
        }
        azun azunVar2 = null;
        for (azxw azxwVar = (azxw) su.g(); !azst.c(azxwVar, su); azxwVar = azxwVar.h()) {
            if (azxwVar instanceof azvs) {
                azvs azvsVar = (azvs) azxwVar;
                try {
                    azvsVar.b(th);
                } catch (Throwable th3) {
                    if (azunVar2 == null) {
                        azunVar = null;
                    } else {
                        azqc.a(azunVar2, th3);
                        azunVar = azunVar2;
                    }
                    if (azunVar == null) {
                        azunVar2 = new azun("Exception in completion handler " + azvsVar + " for " + this, th3);
                    }
                }
            }
        }
        if (azunVar2 == null) {
            return;
        }
        c(azunVar2);
    }

    private final void D(azvz azvzVar, Throwable th) {
        azun azunVar;
        azun azunVar2 = null;
        for (azxw azxwVar = (azxw) azvzVar.g(); !azst.c(azxwVar, azvzVar); azxwVar = azxwVar.h()) {
            if (azxwVar instanceof azvq) {
                azvs azvsVar = (azvs) azxwVar;
                try {
                    azvsVar.b(th);
                } catch (Throwable th2) {
                    if (azunVar2 == null) {
                        azunVar = null;
                    } else {
                        azqc.a(azunVar2, th2);
                        azunVar = azunVar2;
                    }
                    if (azunVar == null) {
                        azunVar2 = new azun("Exception in completion handler " + azvsVar + " for " + this, th2);
                    }
                }
            }
        }
        if (azunVar2 != null) {
            c(azunVar2);
        }
        G(th);
    }

    private final void E(azvs azvsVar) {
        azvz azvzVar = new azvz();
        azvzVar.d.b(azvsVar);
        azvzVar.c.b(azvsVar);
        while (true) {
            if (azvsVar.g() != azvsVar) {
                break;
            } else if (azvsVar.c.c(azvsVar, azvzVar)) {
                azvzVar.k(azvsVar);
                break;
            }
        }
        this.c.c(azvsVar, azvsVar.h());
    }

    private final boolean F(Object obj, azvz azvzVar, azvs azvsVar) {
        int f;
        azvv azvvVar = new azvv(azvsVar, this, obj);
        do {
            f = azvzVar.i().f(azvsVar, azvzVar, azvvVar);
            if (f == 1) {
                return true;
            }
        } while (f != 2);
        return false;
    }

    private final boolean G(Throwable th) {
        z();
        boolean z = th instanceof CancellationException;
        azuf t = t();
        return (t == null || t == azwa.a) ? z : t.c(th) || z;
    }

    private static final Throwable H(Object obj) {
        return obj instanceof Throwable ? (Throwable) obj : ((azwc) obj).r();
    }

    private static final String I(Object obj) {
        if (!(obj instanceof azvu)) {
            return obj instanceof azvm ? ((azvm) obj).sv() ? "Active" : "New" : obj instanceof azuk ? "Cancelled" : "Completed";
        }
        azvu azvuVar = (azvu) obj;
        return azvuVar.g() ? "Cancelling" : azvuVar.h() ? "Completing" : "Active";
    }

    protected String a() {
        return "Job was cancelled";
    }

    public String b() {
        return banl.j(this);
    }

    public void c(Throwable th) {
        throw th;
    }

    protected void d(Object obj) {
    }

    @Override // defpackage.azuh
    public final void f(azwc azwcVar) {
        w(azwcVar);
    }

    @Override // defpackage.azrd
    public final Object fold(Object obj, azsg azsgVar) {
        return aydc.b(this, obj, azsgVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
    }

    @Override // defpackage.azra, defpackage.azrd
    public final azra get(azrb azrbVar) {
        azrbVar.getClass();
        return aydc.c(this, azrbVar);
    }

    @Override // defpackage.azra
    public final azrb getKey() {
        return azvo.b;
    }

    @Override // defpackage.azvo
    public final CancellationException h() {
        Object p = p();
        if (p instanceof azvu) {
            Throwable d = ((azvu) p).d();
            if (d == null) {
                throw new IllegalStateException(azst.a("Job is still new or active: ", this).toString());
            }
            return s(d, azst.a(banl.j(this), " is cancelling"));
        } else if (p instanceof azvm) {
            throw new IllegalStateException(azst.a("Job is still new or active: ", this).toString());
        } else {
            if (p instanceof azuk) {
                return s(((azuk) p).b, null);
            }
            return new azvp(azst.a(banl.j(this), " has completed normally"), null, this);
        }
    }

    @Override // defpackage.azvo
    public final azuf i(azuh azuhVar) {
        return (azuf) bapv.i(this, true, new azug(azuhVar), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [azsc] */
    /* JADX WARN: Type inference failed for: r5v3, types: [azvl] */
    @Override // defpackage.azvo
    public final azve j(boolean z, boolean z2, azsc azscVar) {
        azvq azvqVar;
        Throwable th;
        Throwable th2 = null;
        if (z) {
            azvqVar = azscVar instanceof azvq ? (azvq) azscVar : null;
            if (azvqVar == null) {
                azvqVar = new azvn(azscVar);
            }
        } else {
            boolean z3 = azuy.a;
            azvqVar = azscVar;
        }
        azvq azvqVar2 = azvqVar;
        azvqVar2.b = this;
        while (true) {
            Object p = p();
            if (p instanceof azvf) {
                azvf azvfVar = (azvf) p;
                if (azvfVar.a) {
                    if (this.c.c(p, azvqVar)) {
                        return azvqVar;
                    }
                } else {
                    azvz azvzVar = new azvz();
                    if (!azvfVar.a) {
                        azvzVar = new azvl(azvzVar);
                    }
                    this.c.c(azvfVar, azvzVar);
                }
            } else if (!(p instanceof azvm)) {
                if (z2) {
                    azuk azukVar = p instanceof azuk ? (azuk) p : null;
                    if (azukVar != null) {
                        th2 = azukVar.b;
                    }
                    azscVar.a(th2);
                }
                return azwa.a;
            } else {
                azvz su = ((azvm) p).su();
                if (su != null) {
                    azve azveVar = azwa.a;
                    if (!z || !(p instanceof azvu)) {
                        th = null;
                    } else {
                        synchronized (p) {
                            azvu azvuVar = (azvu) p;
                            th = azvuVar.d();
                            if (th == null || ((azscVar instanceof azug) && !azvuVar.h())) {
                                if (F(p, su, azvqVar)) {
                                    if (th == null) {
                                        return azvqVar;
                                    }
                                    azveVar = azvqVar;
                                }
                            }
                        }
                    }
                    if (th == null) {
                        if (F(p, su, azvqVar2)) {
                            return azvqVar;
                        }
                    } else {
                        if (z2) {
                            azscVar.a(th);
                        }
                        return azveVar;
                    }
                } else if (p != null) {
                    E((azvs) p);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                }
            }
        }
    }

    @Override // defpackage.azvo
    public final void k(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new azvp(a(), null, this);
        }
        w(cancellationException);
    }

    @Override // defpackage.azvo
    public final boolean l() {
        Object p = p();
        return (p instanceof azvm) && ((azvm) p).sv();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r5.c.c(r0, ((defpackage.azvl) r0).a) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r5.c.c(r0, defpackage.azvx.f) == false) goto L8;
     */
    @Override // defpackage.azvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r5.p()
            boolean r1 = r0 instanceof defpackage.azvf
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1e
            r1 = r0
            azvf r1 = (defpackage.azvf) r1
            boolean r1 = r1.a
            if (r1 == 0) goto L13
            goto L32
        L13:
            aztu r1 = r5.c
            azvf r3 = defpackage.azvx.f
            boolean r0 = r1.c(r0, r3)
            if (r0 != 0) goto L30
            goto L33
        L1e:
            boolean r1 = r0 instanceof defpackage.azvl
            if (r1 == 0) goto L32
            aztu r1 = r5.c
            r3 = r0
            azvl r3 = (defpackage.azvl) r3
            azvz r3 = r3.a
            boolean r0 = r1.c(r0, r3)
            if (r0 != 0) goto L30
            goto L33
        L30:
            r2 = 1
            goto L33
        L32:
            r2 = 0
        L33:
            if (r2 == 0) goto L38
            if (r2 == r4) goto L38
            goto L0
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azvw.m():void");
    }

    @Override // defpackage.azrd
    public final azrd minusKey(azrb azrbVar) {
        azrbVar.getClass();
        return aydc.d(this, azrbVar);
    }

    public boolean n() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6 A[Catch: all -> 0x013e, TryCatch #0 {, blocks: (B:10:0x0013, B:12:0x001c, B:19:0x0034, B:21:0x003b, B:23:0x0040, B:25:0x0046, B:26:0x0049, B:28:0x0055, B:30:0x005b, B:56:0x00ac, B:59:0x00b3, B:63:0x00ca, B:64:0x00ce, B:66:0x00d4, B:68:0x00de, B:71:0x00e6, B:73:0x00ea, B:75:0x00f0, B:62:0x00c6, B:32:0x0066, B:33:0x006a, B:35:0x0070, B:39:0x007e, B:41:0x0082, B:43:0x008c, B:44:0x0090, B:46:0x0096, B:48:0x009f, B:51:0x00a4, B:13:0x0021, B:15:0x0025, B:16:0x002e, B:18:0x0032, B:93:0x012e, B:94:0x013d), top: B:100:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d4 A[Catch: all -> 0x013e, TryCatch #0 {, blocks: (B:10:0x0013, B:12:0x001c, B:19:0x0034, B:21:0x003b, B:23:0x0040, B:25:0x0046, B:26:0x0049, B:28:0x0055, B:30:0x005b, B:56:0x00ac, B:59:0x00b3, B:63:0x00ca, B:64:0x00ce, B:66:0x00d4, B:68:0x00de, B:71:0x00e6, B:73:0x00ea, B:75:0x00f0, B:62:0x00c6, B:32:0x0066, B:33:0x006a, B:35:0x0070, B:39:0x007e, B:41:0x0082, B:43:0x008c, B:44:0x0090, B:46:0x0096, B:48:0x009f, B:51:0x00a4, B:13:0x0021, B:15:0x0025, B:16:0x002e, B:18:0x0032, B:93:0x012e, B:94:0x013d), top: B:100:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.azvu r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azvw.o(azvu, java.lang.Object):java.lang.Object");
    }

    public final Object p() {
        aztu aztuVar = this.c;
        while (true) {
            Object obj = aztuVar.a;
            if (!(obj instanceof azyc)) {
                return obj;
            }
            ((azyc) obj).c(this);
        }
    }

    @Override // defpackage.azrd
    public final azrd plus(azrd azrdVar) {
        azrdVar.getClass();
        return aydc.e(this, azrdVar);
    }

    public final Object q(Object obj, Object obj2) {
        if (!(obj instanceof azvm)) {
            return azvx.a;
        }
        if ((!(obj instanceof azvf) && !(obj instanceof azvs)) || (obj instanceof azug) || (obj2 instanceof azuk)) {
            azvm azvmVar = (azvm) obj;
            azvz B = B(azvmVar);
            if (B == null) {
                return azvx.c;
            }
            azug azugVar = null;
            azvu azvuVar = azvmVar instanceof azvu ? (azvu) azvmVar : null;
            if (azvuVar == null) {
                azvuVar = new azvu(B, null);
            }
            synchronized (azvuVar) {
                if (azvuVar.h()) {
                    return azvx.a;
                }
                azvuVar.b.c();
                if (azvuVar != azvmVar && !this.c.c(azvmVar, azvuVar)) {
                    return azvx.c;
                }
                boolean z = azuy.a;
                boolean g = azvuVar.g();
                azuk azukVar = obj2 instanceof azuk ? (azuk) obj2 : null;
                if (azukVar != null) {
                    azvuVar.e(azukVar.b);
                }
                Throwable d = azvuVar.d();
                if (true == g) {
                    d = null;
                }
                if (d != null) {
                    D(B, d);
                }
                azug azugVar2 = azvmVar instanceof azug ? (azug) azvmVar : null;
                if (azugVar2 == null) {
                    azvz su = azvmVar.su();
                    if (su != null) {
                        azugVar = A(su);
                    }
                } else {
                    azugVar = azugVar2;
                }
                return (azugVar == null || !y(azvuVar, azugVar, obj2)) ? o(azvuVar, obj2) : azvx.b;
            }
        }
        azvm azvmVar2 = (azvm) obj;
        boolean z2 = azuy.a;
        if (!this.c.c(azvmVar2, azvx.a(obj2))) {
            return azvx.c;
        }
        d(obj2);
        C(azvmVar2, obj2);
        return obj2;
    }

    @Override // defpackage.azwc
    public final CancellationException r() {
        Throwable th;
        Object p = p();
        CancellationException cancellationException = null;
        if (p instanceof azvu) {
            th = ((azvu) p).d();
        } else if (p instanceof azuk) {
            th = ((azuk) p).b;
        } else if (p instanceof azvm) {
            throw new IllegalStateException(azst.a("Cannot be cancelling child in this state: ", p).toString());
        } else {
            th = null;
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        return cancellationException == null ? new azvp(azst.a("Parent job is ", I(p)), th, this) : cancellationException;
    }

    protected final CancellationException s(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = a();
            }
            cancellationException = new azvp(str, th, this);
        }
        return cancellationException;
    }

    public boolean ss() {
        return true;
    }

    public final azuf t() {
        return (azuf) this.a.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b() + '{' + I(p()) + '}');
        sb.append('@');
        sb.append(banl.k(this));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(azvo azvoVar) {
        boolean z = azuy.a;
        if (azvoVar == null) {
            v(azwa.a);
            return;
        }
        azvoVar.m();
        azuf i = azvoVar.i(this);
        v(i);
        if (p() instanceof azvm) {
            return;
        }
        i.d();
        v(azwa.a);
    }

    public final void v(azuf azufVar) {
        aztu aztuVar = this.a;
        int i = aztv.a;
        aztuVar.a = azufVar;
    }

    public final boolean w(Object obj) {
        azyg azygVar = azvx.a;
        if (n()) {
            do {
                Object p = p();
                if (!(p instanceof azvm) || ((p instanceof azvu) && ((azvu) p).h())) {
                    azygVar = azvx.a;
                    break;
                }
                azygVar = q(p, new azuk(H(obj)));
            } while (azygVar == azvx.c);
            if (azygVar == azvx.b) {
                return true;
            }
        }
        if (azygVar == azvx.a) {
            Throwable th = null;
            Throwable th2 = null;
            while (true) {
                Object p2 = p();
                if (!(p2 instanceof azvu)) {
                    if (p2 instanceof azvm) {
                        if (th2 == null) {
                            th2 = H(obj);
                        }
                        azvm azvmVar = (azvm) p2;
                        if (azvmVar.sv()) {
                            boolean z = azuy.a;
                            azvz B = B(azvmVar);
                            if (B != null) {
                                if (this.c.c(azvmVar, new azvu(B, th2))) {
                                    D(B, th2);
                                    azygVar = azvx.a;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            Object q = q(p2, new azuk(th2));
                            if (q == azvx.a) {
                                throw new IllegalStateException(azst.a("Cannot happen in ", p2).toString());
                            }
                            if (q != azvx.c) {
                                azygVar = q;
                                break;
                            }
                        }
                    } else {
                        azygVar = azvx.d;
                        break;
                    }
                } else {
                    synchronized (p2) {
                        azvu azvuVar = (azvu) p2;
                        if (azvuVar.c() == azvx.e) {
                            azygVar = azvx.d;
                        } else {
                            boolean g = azvuVar.g();
                            if (th2 == null) {
                                th2 = H(obj);
                            }
                            azvuVar.e(th2);
                            Throwable d = azvuVar.d();
                            if (true != g) {
                                th = d;
                            }
                            if (th != null) {
                                D(((azvu) p2).a, th);
                            }
                            azygVar = azvx.a;
                        }
                    }
                }
            }
        }
        if (azygVar == azvx.a || azygVar == azvx.b) {
            return true;
        }
        if (azygVar == azvx.d) {
            return false;
        }
        g();
        return true;
    }

    protected boolean x(Throwable th) {
        return false;
    }

    public final boolean y(azvu azvuVar, azug azugVar, Object obj) {
        while (bapv.i(azugVar.a, false, new azvt(this, azvuVar, azugVar, obj), 1) == azwa.a) {
            azugVar = A(azugVar);
            if (azugVar == null) {
                return false;
            }
        }
        return true;
    }

    protected void z() {
    }
}
