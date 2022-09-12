package defpackage;

import android.accounts.Account;
import android.content.IntentFilter;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cxhi  reason: default package */
/* loaded from: classes5.dex */
public final class cxhi implements cxgo {
    public final cxgg a;
    private final Object b = new Object();
    private final Map<Account, cxhb> c = new HashMap();
    private final cxhh d;

    public cxhi(cxhh cxhhVar) {
        dbsk.s(cxhhVar);
        this.d = cxhhVar;
        this.a = cxgg.a(cxhhVar.a(), cxhhVar.b());
    }

    @Override // defpackage.cxgn
    public final /* bridge */ /* synthetic */ cxgm a(Account account) {
        throw null;
    }

    @Override // defpackage.cxgo
    public final cxhb b(Account account) {
        cxhb cxhbVar;
        synchronized (this.b) {
            if (!this.c.containsKey(account)) {
                Map<Account, cxhb> map = this.c;
                cxid cxidVar = new cxid(new cxio(new cocd(this.d.a(), new cobs(account)), this.d.b()), this.d.d());
                cxih a = cxih.a(this.d.e(), new csnj(), this.d.d(), this.a);
                cxgl a2 = cxgl.a(this.a, 3011, this.d.e(), account, csnl.a(this.d.c(), account.toString(), (int) this.d.d().b()));
                this.d.a().registerReceiver(new cxij(cxidVar, a, this.d.c()), new IntentFilter("com.google.android.gms.udc.action.FACS_CACHE_UPDATED"));
                map.put(account, new cxhb(cxidVar, a, a2, this.d.c(), this.d.d()));
            }
            cxhbVar = this.c.get(account);
        }
        return cxhbVar;
    }
}
