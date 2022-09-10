package defpackage;

import android.database.ContentObserver;
import android.provider.ContactsContract;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cyyf  reason: default package */
/* loaded from: classes5.dex */
public final class cyyf extends ContentObserver {
    @dzsi
    public volatile dcdc<cyzl> a;
    final /* synthetic */ cyyg b;
    @dzsi
    public final cxyg c;
    private final Object d;
    private volatile boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyyf(cyyg cyygVar, cxyg cxygVar) {
        super(null);
        this.b = cyygVar;
        this.d = new Object();
        this.c = cxygVar;
        if (cyygVar.b()) {
            cyygVar.b.c(new Callable(this) { // from class: cyyc
                private final cyyf a;

                {
                    this.a = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.a();
                }
            });
        }
    }

    public final dcdc<cyzl> a() {
        synchronized (this.d) {
            if (!this.b.b()) {
                this.a = dcdc.e();
                return this.a;
            }
            if (!this.e) {
                this.b.a.getContentResolver().registerContentObserver(ContactsContract.Data.CONTENT_URI, true, this);
                this.e = true;
            }
            dcdc<cyzl> dcdcVar = this.a;
            if (dcdcVar != null) {
                return dcdcVar;
            }
            dcdc<cyzl> a = this.b.a("", cyor.a);
            this.a = a;
            return a;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        dehn a;
        if (this.c != null) {
            if (this.b.b()) {
                a = this.b.b.c(new Callable(this) { // from class: cyyd
                    private final cyyf a;

                    {
                        this.a = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        cyyf cyyfVar = this.a;
                        dcdc<cyzl> dcdcVar = cyyfVar.a;
                        cyyfVar.a = null;
                        dcdc<cyzl> a2 = cyyfVar.a();
                        boolean z2 = true;
                        if (dcdcVar != null && dchl.m(dcdcVar, a2)) {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    }
                });
            } else {
                this.a = null;
                a = deha.a(true);
            }
            deha.q(a, new cyye(this), this.b.b);
        } else {
            this.a = null;
        }
        super.onChange(z);
    }
}
