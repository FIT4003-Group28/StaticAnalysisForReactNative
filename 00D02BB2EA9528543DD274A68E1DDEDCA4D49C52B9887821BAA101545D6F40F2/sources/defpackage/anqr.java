package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: anqr  reason: default package */
/* loaded from: classes2.dex */
public class anqr {
    private final akfa a;
    private final cjnx b;
    private final dehq c;

    public anqr(akfa akfaVar, cjnx cjnxVar, dehq dehqVar) {
        this.a = akfaVar;
        this.b = cjnxVar;
        this.c = dehqVar;
    }

    public final dehn<cora> a() {
        btlu j = this.a.j();
        if (j == null) {
            return deha.b(new IllegalStateException("GmmAccount is 'null'. Can not fetch Reporting State from ULR"));
        }
        return deha.h(this.b.i(j), 3L, TimeUnit.SECONDS, this.c);
    }
}
