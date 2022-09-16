package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: eaek  reason: default package */
/* loaded from: classes6.dex */
public final class eaek implements eadc {
    final eaee a;
    final eafy b;
    final eaiw c;
    final eaem d;
    @dzsi
    private eadu e;
    private boolean f;

    private eaek(eaee eaeeVar, eaem eaemVar) {
        this.a = eaeeVar;
        this.d = eaemVar;
        this.b = new eafy(eaeeVar);
        eaei eaeiVar = new eaei(this);
        this.c = eaeiVar;
        eaeiVar.l(0L, TimeUnit.MILLISECONDS);
    }

    public static eaek h(eaee eaeeVar, eaem eaemVar) {
        eaek eaekVar = new eaek(eaeeVar, eaemVar);
        eaekVar.e = eaeeVar.y.a;
        return eaekVar;
    }

    private final void i() {
        this.b.b = eaim.c.k();
    }

    @Override // defpackage.eadc
    public final eaem a() {
        return this.d;
    }

    @Override // defpackage.eadc
    public final eaep b() {
        synchronized (this) {
            if (!this.f) {
                this.f = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        i();
        this.c.d();
        try {
            try {
                this.a.c.b(this);
                return g();
            } catch (IOException e) {
                throw e(e);
            }
        } finally {
            this.a.c.d(this);
        }
    }

    @Override // defpackage.eadc
    public final void c(eadd eaddVar) {
        synchronized (this) {
            if (!this.f) {
                this.f = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        i();
        eadp eadpVar = this.a.c;
        eaej eaejVar = new eaej(this, eaddVar);
        synchronized (eadpVar) {
            eadpVar.a.add(eaejVar);
        }
        eadpVar.e();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return h(this.a, this.d);
    }

    @Override // defpackage.eadc
    public final void d() {
        eafq eafqVar;
        eafg eafgVar;
        eafy eafyVar = this.b;
        eafyVar.c = true;
        eafm eafmVar = eafyVar.a;
        if (eafmVar != null) {
            synchronized (eafmVar.d) {
                eafmVar.l = true;
                eafqVar = eafmVar.m;
                eafgVar = eafmVar.i;
            }
            if (eafqVar != null) {
                eafqVar.g();
            } else if (eafgVar == null) {
            } else {
                eafgVar.d();
            }
        }
    }

    @dzsi
    public final IOException e(@dzsi IOException iOException) {
        if (!this.c.e()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String f() {
        eady l = this.d.a.l("/...");
        l.b = eadz.p("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        l.c = eadz.p("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return l.b().e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final eaep g() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a.g);
        arrayList.add(this.b);
        arrayList.add(new eafn(this.a.j));
        arrayList.add(new eafb());
        arrayList.add(new eafe(this.a));
        arrayList.addAll(this.a.h);
        arrayList.add(new eafp());
        eaem eaemVar = this.d;
        eadu eaduVar = this.e;
        eaee eaeeVar = this.a;
        return new eafv(arrayList, null, null, null, 0, eaemVar, this, eaduVar, eaeeVar.v, eaeeVar.w, eaeeVar.x).a(this.d);
    }
}
