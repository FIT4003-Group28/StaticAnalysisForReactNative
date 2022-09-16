package defpackage;

import android.accounts.Account;
/* compiled from: PG */
/* renamed from: cqxt  reason: default package */
/* loaded from: classes5.dex */
public final class cqxt {
    public final dbuv<Account, cqyt> a;

    public cqxt(final cqxs cqxsVar) {
        this.a = dbuo.a().d(dbus.d(new dbrn(cqxsVar) { // from class: cqxr
            private final cqxs a;

            {
                this.a = cqxsVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cqxs cqxsVar2 = this.a;
                return new cqyt((Account) obj, cqxsVar2.a, cqxsVar2.j, cqxsVar2.f, cqxsVar2.l, cqxsVar2.g, new cqxn(new cqyu(cqxsVar2.e)), cqxsVar2.c, cqxsVar2.d, cqxsVar2.e, cqxsVar2.i, dbpc.a);
            }
        }));
    }
}
