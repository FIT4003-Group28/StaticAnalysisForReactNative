package defpackage;

import java.io.InterruptedIOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eahv  reason: default package */
/* loaded from: classes6.dex */
public final class eahv implements eaea {
    final /* synthetic */ eahy a;
    private boolean b;

    public eahv(eahy eahyVar) {
        this.a = eahyVar;
    }

    @Override // defpackage.eaea
    public final eaep a(eafv eafvVar) {
        eaem eaemVar = eafvVar.d;
        synchronized (this.a.e) {
            eahy eahyVar = this.a;
            eahyVar.g = false;
            eafg eafgVar = eafvVar.c;
            eahyVar.h = eafgVar.b.b;
            eahyVar.i = eafgVar.e;
            eahyVar.e.notifyAll();
            while (!this.b) {
                try {
                    this.a.e.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
        }
        eaen eaenVar = eaemVar.d;
        if (eaenVar instanceof eaib) {
            eaemVar = ((eaib) eaenVar).d(eaemVar);
        }
        eaep a = eafvVar.a(eaemVar);
        synchronized (this.a.e) {
            eahy eahyVar2 = this.a;
            eahyVar2.f = a;
            eahyVar2.url = a.a.a.a();
        }
        return a;
    }

    public final void b() {
        synchronized (this.a.e) {
            this.b = true;
            this.a.e.notifyAll();
        }
    }
}
