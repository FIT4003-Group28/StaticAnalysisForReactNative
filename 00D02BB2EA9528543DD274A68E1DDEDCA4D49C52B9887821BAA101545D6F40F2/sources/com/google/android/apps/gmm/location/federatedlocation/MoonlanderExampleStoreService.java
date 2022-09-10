package com.google.android.apps.gmm.location.federatedlocation;

import android.accounts.Account;
import java.util.Collection;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class MoonlanderExampleStoreService extends cogf {
    public cspt<Void, Collection<cspy<eavq>>> a;
    public cspt<Void, Collection<cspy<eavq>>> b;
    public cspt<Void, Collection<cspy<eavq>>> c;
    public btvo d;
    public akfa e;
    public cjqy f;
    private dkkx g = dkkx.h;

    @Override // defpackage.cogf
    public final void a(String str, byte[] bArr, byte[] bArr2, cohi cohiVar) {
        cspt<Void, Collection<cspy<eavq>>> csptVar;
        dvgo group = this.d.getGroup(dvgn.FEDERATED_LOCATION);
        if (group != null) {
            dkkx dkkxVar = group.bH;
            if (dkkxVar == null) {
                dkkxVar = dkkx.h;
            }
            this.g = dkkxVar;
        }
        Account m = this.e.m();
        dkkx dkkxVar2 = this.g;
        if (!dkkxVar2.d || m == null) {
            cohiVar.a(new ahlp(dcdc.e()));
            return;
        }
        if (dkkxVar2.g) {
            csptVar = dkkxVar2.f ? this.c : this.b;
        } else {
            csptVar = this.a;
        }
        deha.q(csptVar.a(m).a(), new ahlo(cohiVar), dege.a);
        cjqy cjqyVar = this.f;
        cjsx i = cjsy.i();
        i.b(ddda.i);
        cjqyVar.k(i.a());
    }

    @Override // android.app.Service
    public final void onCreate() {
        dxiq.b(this);
        super.onCreate();
    }
}
