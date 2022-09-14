package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cwbd  reason: default package */
/* loaded from: classes5.dex */
public final class cwbd<AccountT> {
    public final cvvm<cvvh<?>> a;
    public final cvvm<cvvx> b;
    public final cvvi<AccountT> c;
    public final cvvn<cvvx, AccountT> d;
    public AccountT e;
    private final dcdc<cwbj<AccountT>> f;
    private boolean g;

    public cwbd(Context context, dcdc<cwbe<AccountT, ? extends cwbn>> dcdcVar, m mVar) {
        cwbj cwbkVar;
        cvvm<cvvh<?>> cvvmVar = new cvvm<>();
        cvvm<cvvx> cvvmVar2 = new cvvm<>();
        this.a = cvvmVar;
        this.b = cvvmVar2;
        dccx dccxVar = new dccx();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            cwbe<AccountT, ? extends cwbn> cwbeVar = dcdcVar.get(i);
            if (cwau.class.isAssignableFrom(cwbeVar.b())) {
                cwbkVar = new cwav(cwbeVar.a());
            } else {
                cwbkVar = new cwbk();
            }
            dccxVar.g(cwbkVar);
        }
        dcdc<cwbj<AccountT>> f = dccxVar.f();
        this.f = f;
        aa<? super cwbi> aaVar = new aa(this) { // from class: cwbc
            private final cwbd a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cwbi cwbiVar = (cwbi) obj;
                this.a.b();
            }
        };
        int size2 = f.size();
        for (int i2 = 0; i2 < size2; i2++) {
            f.get(i2).a.b(mVar, aaVar);
        }
        this.c = new cvvi(this) { // from class: cwba
            private final cwbd a;

            {
                this.a = this;
            }

            @Override // defpackage.cvvn
            public final cvvm<cvvh> a(Object obj) {
                cwbd cwbdVar = this.a;
                if (obj != cwbdVar.e) {
                    cwbdVar.a(obj);
                }
                return cwbdVar.a;
            }
        };
        this.d = new cvvn(this) { // from class: cwbb
            private final cwbd a;

            {
                this.a = this;
            }

            @Override // defpackage.cvvn
            public final cvvm a(Object obj) {
                cwbd cwbdVar = this.a;
                if (obj != cwbdVar.e) {
                    cwbdVar.a(obj);
                }
                return cwbdVar.b;
            }
        };
    }

    public final void a(AccountT accountt) {
        czhz.b();
        this.e = accountt;
        this.g = true;
        dcdc<cwbj<AccountT>> dcdcVar = this.f;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).a();
        }
        this.g = false;
        b();
    }

    public final void b() {
        cwbi c;
        czhz.b();
        if (!this.g) {
            dcdc<cwbj<AccountT>> dcdcVar = this.f;
            int size = dcdcVar.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    c = dcdcVar.get(i).a.h();
                    if (c != null && (c.a().a() || c.b().a())) {
                        break;
                    }
                    i++;
                } else {
                    c = cwbi.c();
                    break;
                }
            }
            this.a.c(c.a().f());
            this.b.c(c.b().f());
        }
    }
}
