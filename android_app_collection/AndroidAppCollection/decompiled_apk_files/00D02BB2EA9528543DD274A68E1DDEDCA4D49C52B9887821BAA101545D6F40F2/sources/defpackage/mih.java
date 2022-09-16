package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mih  reason: default package */
/* loaded from: classes7.dex */
public final class mih implements ksu {
    final /* synthetic */ mio a;

    public mih(mio mioVar) {
        this.a = mioVar;
    }

    @Override // defpackage.ksu
    public final void a(ldm ldmVar) {
        bvrj.UI_THREAD.c();
        mio mioVar = this.a;
        if (ldmVar != mioVar.s) {
            return;
        }
        ckcq ckcqVar = mioVar.A;
        if (ckcqVar != null) {
            ckcqVar.b();
            this.a.A = null;
        }
        this.a.q.s();
        ldmVar.u();
        this.a.t.m(ldmVar);
        this.a.o.l();
        this.a.k();
        if (ldmVar.u() == 2) {
            return;
        }
        final mio mioVar2 = this.a;
        if (!mioVar2.D) {
            return;
        }
        final akqq o = mioVar2.s.o();
        if (o == null || mioVar2.o.k()) {
            kxt.a(mioVar2.k.m(), mioVar2.j, mioVar2.g);
            return;
        }
        ldm ldmVar2 = mioVar2.C;
        ldm ldmVar3 = mioVar2.s;
        if (ldmVar2 == ldmVar3) {
            return;
        }
        mioVar2.C = ldmVar3;
        if (mioVar2.y) {
            mioVar2.p.postDelayed(new Runnable(mioVar2, o) { // from class: mhz
                private final mio a;
                private final akqq b;

                {
                    this.a = mioVar2;
                    this.b = o;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.n(this.b);
                }
            }, 1000L);
        } else {
            mioVar2.n(o);
        }
    }
}
