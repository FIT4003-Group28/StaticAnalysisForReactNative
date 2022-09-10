package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.common.Feature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cwoq  reason: default package */
/* loaded from: classes5.dex */
public final class cwoq implements cwlw {
    public static final /* synthetic */ int b = 0;
    private static final coui c;
    private final Context d;
    private final couk e;
    private final couq f;
    private final coum g;
    private final Executor h;
    private final cwll i;
    private final cnmq j;
    public final CopyOnWriteArrayList<cwgc> a = new CopyOnWriteArrayList<>();
    private final coun k = new coun(this) { // from class: cwom
        private final cwoq a;

        {
            this.a = this;
        }

        @Override // defpackage.coun
        public final void g(String str, String str2, int i) {
            Iterator<cwgc> it = this.a.a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    };

    static {
        cwjy.a();
        coui couiVar = new coui();
        couiVar.b = 1;
        c = couiVar;
    }

    public cwoq(Context context, couk coukVar, couq couqVar, coum coumVar, cwll cwllVar, Executor executor, cnmq cnmqVar) {
        this.d = context;
        this.e = coukVar;
        this.f = couqVar;
        this.g = coumVar;
        this.h = executor;
        this.i = cwllVar;
        this.j = cnmqVar;
    }

    public static <T> T g(dehn<T> dehnVar) {
        try {
            return (T) deha.r(dehnVar);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (!(cause instanceof cnnj) && !(cause instanceof cnni)) {
                return null;
            }
            throw e;
        }
    }

    private final <T> dehn<T> h(int i) {
        if (cnnl.g(i)) {
            return deha.b(new cnnj(i, "Google Play Services not available", this.j.k(this.d, i, null)));
        }
        return deha.b(new cnni());
    }

    @Override // defpackage.cwlw
    public final dehn<dcdc<cwls>> a() {
        final dehn a;
        final dehn<List<Account>> a2 = this.i.a();
        int j = this.j.j(this.d, 10000000);
        if (j != 0) {
            a = h(j);
        } else {
            a = cwow.a(this.e.a(c), dazv.g(cwop.a), dege.a);
        }
        final cwlp cwlpVar = (cwlp) this.i;
        final dehn e = dbae.e(new Callable(cwlpVar) { // from class: cwln
            private final cwlp a;

            {
                this.a = cwlpVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Account[] accountArr;
                Context context = this.a.b;
                String[] strArr = cwlp.a;
                cnwc.a(context);
                cnwc.l("com.google");
                cmrh.m(context, 8400000);
                cxju.c(context);
                if (dxyq.a.a().b() && cmrh.i(context)) {
                    cmrq a3 = cmrr.a(context);
                    GetAccountsRequest getAccountsRequest = new GetAccountsRequest("com.google", strArr);
                    cntc builder = cntd.builder();
                    builder.b = new Feature[]{cmqy.b};
                    builder.a = new cnsr(getAccountsRequest) { // from class: cmsd
                        private final GetAccountsRequest a;

                        {
                            this.a = getAccountsRequest;
                        }

                        @Override // defpackage.cnsr
                        public final void a(Object obj, Object obj2) {
                            ((cmrz) ((cmrs) obj).L()).h(new cmsi((cpct) obj2), this.a);
                        }
                    };
                    builder.c = 1516;
                    try {
                        List list = (List) cmrh.k(((cnof) a3).d(builder.a()), "Accounts retrieval");
                        cmrh.o(list);
                        accountArr = (Account[]) list.toArray(new Account[0]);
                    } catch (cnob unused) {
                    }
                    return Arrays.asList(accountArr);
                }
                accountArr = (Account[]) cmrh.n(context, cmrh.c, new cmre(strArr));
                return Arrays.asList(accountArr);
            }
        }, cwlpVar.c);
        return dbae.f(a2, a, e).a(new Callable(a2, e, a) { // from class: cwon
            private final dehn a;
            private final dehn b;
            private final dehn c;

            {
                this.a = a2;
                this.b = e;
                this.c = a;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                dehn dehnVar = this.a;
                dehn dehnVar2 = this.b;
                dehn dehnVar3 = this.c;
                List<Account> list = (List) cwoq.g(dehnVar);
                List<Account> list2 = (List) cwoq.g(dehnVar2);
                dcdc dcdcVar = (dcdc) cwoq.g(dehnVar3);
                if (list != null || list2 != null || dcdcVar != null) {
                    ArrayList<String> arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    if (list != null) {
                        for (Account account : list) {
                            cwol.a(account.name, arrayList, hashMap);
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    if (list2 != null) {
                        for (Account account2 : list2) {
                            if (!z) {
                                cwol.a(account2.name, arrayList, hashMap);
                            }
                            cwlq cwlqVar = (cwlq) hashMap.get(account2.name);
                            if (cwlqVar != null) {
                                cwlqVar.h(true);
                            }
                        }
                    }
                    if (dcdcVar != null) {
                        int size = dcdcVar.size();
                        for (int i = 0; i < size; i++) {
                            cwls cwlsVar = (cwls) dcdcVar.get(i);
                            String a3 = cwlsVar.a();
                            if (!z) {
                                cwol.a(a3, arrayList, hashMap);
                            }
                            cwlq cwlqVar2 = (cwlq) hashMap.get(a3);
                            if (cwlqVar2 != null) {
                                cwlqVar2.d(cwlsVar.b());
                                cwlqVar2.f(cwlsVar.c());
                                cwlqVar2.e(cwlsVar.d());
                                cwlqVar2.i(cwlsVar.e());
                                cwlqVar2.c(cwlsVar.h());
                                cwlqVar2.g(cwlsVar.g());
                            }
                        }
                    }
                    dccx F = dcdc.F();
                    for (String str : arrayList) {
                        F.g(((cwlq) hashMap.get(str)).a());
                    }
                    return F.f();
                }
                throw new cwlu();
            }
        }, dege.a);
    }

    @Override // defpackage.cwlw
    public final dehn<dcdc<cwls>> b() {
        return a();
    }

    @Override // defpackage.cwlw
    public final void c(cwgc cwgcVar) {
        if (this.a.isEmpty()) {
            couq couqVar = this.f;
            cnsd<L> a = cnse.a(this.k, couqVar.g, coun.class.getName());
            final cowc cowcVar = new cowc(a);
            cnsr<A, cpct<Void>> cnsrVar = new cnsr(cowcVar) { // from class: couo
                private final cowc a;

                {
                    this.a = cowcVar;
                }

                @Override // defpackage.cnsr
                public final void a(Object obj, Object obj2) {
                    ((covy) ((cowh) obj).L()).e(this.a, true, 1);
                    ((cpct) obj2).a(null);
                }
            };
            cnsr<A, cpct<Boolean>> cnsrVar2 = new cnsr(cowcVar) { // from class: coup
                private final cowc a;

                {
                    this.a = cowcVar;
                }

                @Override // defpackage.cnsr
                public final void a(Object obj, Object obj2) {
                    ((covy) ((cowh) obj).L()).e(this.a, false, 0);
                    ((cpct) obj2).a(true);
                }
            };
            cnsp a2 = cnsq.a();
            a2.a = cnsrVar;
            a2.b = cnsrVar2;
            a2.c = a;
            a2.d = 2720;
            couqVar.f(a2.a());
        }
        this.a.add(cwgcVar);
    }

    @Override // defpackage.cwlw
    public final void d(cwgc cwgcVar) {
        this.a.remove(cwgcVar);
        if (this.a.isEmpty()) {
            this.f.h(cnse.b(this.k, coun.class.getName()), 2721);
        }
    }

    @Override // defpackage.cwlw
    public final dehn<Bitmap> e(String str, int i) {
        int j = this.j.j(this.d, 10400000);
        if (j != 0) {
            return h(j);
        }
        return cwow.a(this.g.a(str, cwlk.a(i), 1), cwoo.a, this.h);
    }

    @Override // defpackage.cwlw
    public final dehn<Bitmap> f(String str, int i) {
        return e(str, i);
    }
}
