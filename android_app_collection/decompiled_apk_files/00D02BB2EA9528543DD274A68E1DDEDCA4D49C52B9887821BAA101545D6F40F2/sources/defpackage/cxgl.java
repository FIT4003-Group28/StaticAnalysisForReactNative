package defpackage;

import android.accounts.Account;
/* compiled from: PG */
/* renamed from: cxgl  reason: default package */
/* loaded from: classes5.dex */
public final class cxgl {
    public final cxgg a;
    public final dbty<cxgi> b;
    public final csnk c;
    public final int d = 3011;

    public cxgl(cxgg cxggVar, int i, dbty<cxgi> dbtyVar, csnk csnkVar) {
        this.a = cxggVar;
        this.b = dbtyVar;
        this.c = csnkVar;
    }

    public static cxgl a(cxgg cxggVar, int i, final cxgj cxgjVar, final Account account, csnk csnkVar) {
        return new cxgl(cxggVar, 3011, new dbty(cxgjVar, account) { // from class: cxgk
            private final Account a;
            private final cxgj b;

            {
                this.b = cxgjVar;
                this.a = account;
            }

            @Override // defpackage.dbty
            public final Object a() {
                cxgj cxgjVar2 = this.b;
                return new cxgi(cxgjVar2.a, this.a);
            }
        }, csnkVar);
    }
}
