package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: csru  reason: default package */
/* loaded from: classes5.dex */
public final class csru implements csqo {
    public final cspo a;
    private final Object b = new Object();
    private final Map<Account, csqn> c = new HashMap();
    private final Context d;
    private final Executor e;
    private final czif f;
    private final czkq g;
    private final cqat h;
    private final czkf i;
    private final String j;
    private final csqk k;

    public csru(Context context, Executor executor, String str, czif czifVar, czkq czkqVar, cspo cspoVar, csqk csqkVar, cqat cqatVar, czkf czkfVar) {
        this.d = context;
        this.e = executor;
        this.f = czifVar;
        this.g = czkqVar;
        this.a = cspoVar;
        this.k = csqkVar;
        this.h = cqatVar;
        this.j = str;
        this.i = czkfVar;
    }

    @Override // defpackage.csqo
    public final csqn a(final Account account) {
        csqn csqnVar;
        synchronized (this.b) {
            if (!this.c.containsKey(account)) {
                Map<Account, csqn> map = this.c;
                czkq czkqVar = this.g;
                czkn i = czko.i();
                i.f(new czjt(this.i));
                i.d(csry.c);
                czik a = czil.a(this.d);
                a.a = "com.google.android.gms";
                a.b("managed");
                a.c("mdisync");
                czig.a(account);
                a.b = account;
                a.d("profilesync/public/profile_info.pb");
                i.e(a.a());
                cspr csprVar = new cspr(czkqVar.a(i.a()));
                cssb cssbVar = new cssb(this.e, this.f);
                final AtomicReference atomicReference = new AtomicReference(csro.a);
                final AtomicReference atomicReference2 = new AtomicReference(csrp.a);
                dbty dbtyVar = new dbty(atomicReference) { // from class: csrq
                    private final AtomicReference a;

                    {
                        this.a = atomicReference;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        return this.a.get();
                    }
                };
                dbty dbtyVar2 = new dbty(atomicReference2) { // from class: csrr
                    private final AtomicReference a;

                    {
                        this.a = atomicReference2;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        return this.a.get();
                    }
                };
                cssi cssiVar = new cssi(this.d, new corv(this.d, new corh(account)), this.j, dbtyVar, dbtyVar2);
                cspk.d(this.d.getApplicationContext(), this.j);
                csnl.a(this.h, account.toString(), 0);
                new dbty(this, account) { // from class: csrt
                    private final csru a;
                    private final Account b;

                    {
                        this.a = this;
                        this.b = account;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        return new cspn(new cnjz(this.a.a.a, "MDI_SYNC_COMPONENTS_GAIA", this.b.name));
                    }
                };
                final cspo cspoVar = this.a;
                cspoVar.getClass();
                csrn csrnVar = new csrn(cssiVar, cssbVar, csprVar, new csrz(new dbty(cspoVar) { // from class: csrs
                    private final cspo a;

                    {
                        this.a = cspoVar;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        return this.a.a();
                    }
                }, new csnj(), cspk.d(this.d.getApplicationContext(), this.j)));
                atomicReference.set(csrnVar);
                atomicReference2.set(csrnVar);
                map.put(account, csrnVar);
            }
            csqnVar = this.c.get(account);
        }
        return csqnVar;
    }
}
