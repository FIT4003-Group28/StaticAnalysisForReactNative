package defpackage;

import android.accounts.Account;
import java.util.Collection;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahlq  reason: default package */
/* loaded from: classes.dex */
public final class ahlq implements bvkz {
    private final Executor a;
    private final ahlr b;

    public ahlq(Executor executor, ahlr ahlrVar) {
        this.a = executor;
        this.b = ahlrVar;
    }

    @Override // defpackage.bvkz
    public final Executor a() {
        return this.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cspt<Void, Collection<cspy<eavq>>> csptVar;
        ahln ahlnVar = (ahln) this.b;
        dvgo group = ahlnVar.f.getGroup(dvgn.FEDERATED_LOCATION);
        if (group != null) {
            dkkx dkkxVar = group.bH;
            if (dkkxVar == null) {
                dkkxVar = dkkx.h;
            }
            ahlnVar.g = dkkxVar;
        }
        dkkx dkkxVar2 = ahlnVar.g;
        boolean z = dkkxVar2.d;
        boolean z2 = dkkxVar2.b;
        if (!z) {
            if (!z2) {
                return;
            }
            ahlnVar.a();
            return;
        }
        Account m = ahlnVar.c.m();
        if (m == null) {
            return;
        }
        dkkx dkkxVar3 = ahlnVar.g;
        if (dkkxVar3.g) {
            csptVar = dkkxVar3.f ? ahlnVar.j : ahlnVar.i;
        } else {
            csptVar = ahlnVar.h;
        }
        deha.q(csptVar.a(m).a(), new ahlk(ahlnVar), ahlnVar.a);
    }
}
