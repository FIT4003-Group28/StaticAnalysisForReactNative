package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: urt  reason: default package */
/* loaded from: classes4.dex */
public final class urt implements uqe {
    public static final /* synthetic */ int b = 0;
    private static final rsa c;
    private final Context d;
    private final rsf e;
    private final Executor f;
    private final upx g;
    private final qrq h;
    private final qst j;
    private final qst k;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final rsd i = new rsd() { // from class: urr
        @Override // defpackage.rsd
        public final void a() {
            Iterator it = urt.this.a.iterator();
            while (it.hasNext()) {
                ((ukz) it.next()).a();
            }
        }
    };

    static {
        rsa rsaVar = new rsa();
        rsaVar.a = 1;
        c = rsaVar;
    }

    public urt(Context context, qst qstVar, rsf rsfVar, qst qstVar2, upx upxVar, Executor executor, qrq qrqVar) {
        this.d = context;
        this.j = qstVar;
        this.e = rsfVar;
        this.k = qstVar2;
        this.f = executor;
        this.g = upxVar;
        this.h = qrqVar;
    }

    public static Object g(ankt anktVar, String str) {
        try {
            return anlz.y(anktVar);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if ((cause instanceof qsd) || (cause instanceof qsc)) {
                throw e;
            }
            Log.e("OneGoogle", str.length() != 0 ? "Failed to load ".concat(str) : new String("Failed to load "), e);
            return null;
        }
    }

    private final ankt h(int i) {
        if (qse.g(i)) {
            return anlz.p(new qsd(i, "Google Play Services not available", this.h.i(this.d, i, null)));
        }
        return anlz.p(new qsc(i));
    }

    @Override // defpackage.uqe
    public final ankt a() {
        return b();
    }

    @Override // defpackage.uqe
    public final ankt b() {
        final ankt b2;
        final ankt a = this.g.a();
        int h = this.h.h(this.d, 10000000);
        if (h != 0) {
            b2 = h(h);
        } else {
            qst qstVar = this.j;
            rsa rsaVar = c;
            qso qsoVar = rsk.a;
            qsx qsxVar = qstVar.D;
            rsw rswVar = new rsw(qsxVar, rsaVar);
            qsxVar.a(rswVar);
            b2 = usg.b(rswVar, ammo.a(uag.n), anjk.a);
        }
        upz upzVar = (upz) this.g;
        final ankt d = amnt.d(new upy(upzVar), upzVar.c);
        return amnt.h(new Callable() { // from class: urs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                ankt anktVar = ankt.this;
                ankt anktVar2 = d;
                ankt anktVar3 = b2;
                List<Account> list = (List) urt.g(anktVar, "device accounts");
                List<Account> list2 = (List) urt.g(anktVar2, "g1 accounts");
                amuk amukVar = (amuk) urt.g(anktVar3, "owners");
                if (list != null || list2 != null || amukVar != null) {
                    ArrayList<String> arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    if (list != null) {
                        for (Account account : list) {
                            urq.a(account.name, arrayList, hashMap);
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    if (list2 != null) {
                        for (Account account2 : list2) {
                            if (!z) {
                                urq.a(account2.name, arrayList, hashMap);
                            }
                            uqa uqaVar = (uqa) hashMap.get(account2.name);
                            if (uqaVar != null) {
                                uqaVar.d(true);
                            }
                        }
                    }
                    if (amukVar != null) {
                        int size = amukVar.size();
                        for (int i = 0; i < size; i++) {
                            uqc uqcVar = (uqc) amukVar.get(i);
                            String str = uqcVar.a;
                            if (!z) {
                                urq.a(str, arrayList, hashMap);
                            }
                            uqa uqaVar2 = (uqa) hashMap.get(str);
                            if (uqaVar2 != null) {
                                uqaVar2.a = uqcVar.c;
                                uqaVar2.b = uqcVar.d;
                                uqaVar2.c = uqcVar.e;
                                uqaVar2.d = uqcVar.f;
                                uqaVar2.e = uqcVar.i;
                                uqaVar2.c(uqcVar.h);
                            }
                        }
                    }
                    amuf f = amuk.f();
                    for (String str2 : arrayList) {
                        f.h(((uqa) hashMap.get(str2)).a());
                    }
                    return f.g();
                }
                throw new uqd();
            }
        }, anjk.a, anlz.k(a, b2, d));
    }

    @Override // defpackage.uqe
    public final void c(ukz ukzVar) {
        if (this.a.isEmpty()) {
            rsf rsfVar = this.e;
            qvd p = rsfVar.p(this.i, rsd.class.getName());
            rso rsoVar = new rso(p);
            rse rseVar = new rse(rsoVar);
            rse rseVar2 = new rse(rsoVar, 1);
            qvm a = qvn.a();
            a.a = rseVar;
            a.b = rseVar2;
            a.c = p;
            a.e = 2720;
            rsfVar.t(a.a());
        }
        this.a.add(ukzVar);
    }

    @Override // defpackage.uqe
    public final void d(ukz ukzVar) {
        this.a.remove(ukzVar);
        if (this.a.isEmpty()) {
            this.e.u(tgo.n(this.i, rsd.class.getName()), 2721);
        }
    }

    @Override // defpackage.uqe
    public final ankt e(String str, int i) {
        return f(str, i);
    }

    @Override // defpackage.uqe
    public final ankt f(String str, int i) {
        int h = this.h.h(this.d, 10400000);
        if (h != 0) {
            return h(h);
        }
        qst qstVar = this.k;
        int b2 = uqb.b(i);
        qso qsoVar = rsk.a;
        qsx qsxVar = qstVar.D;
        rsy rsyVar = new rsy(qsxVar, str, b2);
        qsxVar.a(rsyVar);
        return usg.b(rsyVar, uag.o, this.f);
    }
}
