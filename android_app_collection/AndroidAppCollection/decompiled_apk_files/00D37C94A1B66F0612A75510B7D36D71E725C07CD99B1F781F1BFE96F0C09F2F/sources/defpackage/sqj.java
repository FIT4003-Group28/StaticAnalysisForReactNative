package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
/* compiled from: PG */
/* renamed from: sqj  reason: default package */
/* loaded from: classes4.dex */
public final class sqj {
    public static final sqj a = new sqj();
    private final Object b = new Object();
    private final sqi[] c;
    private volatile sqn d;

    private sqj() {
        aosz[] values;
        int i = 0;
        for (aosz aoszVar : aosz.values()) {
            i = Math.max(i, aoszVar.A);
        }
        this.c = new sqi[i + 1];
        for (aosz aoszVar2 : aosz.values()) {
            int ordinal = aoszVar2.ordinal();
            if (ordinal != 1) {
                switch (ordinal) {
                    case 14:
                    case 15:
                    case 16:
                        break;
                    default:
                        switch (ordinal) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                                break;
                            default:
                                continue;
                        }
                        break;
                }
            }
            this.c[aoszVar2.A] = new sqi();
            this.c[aoszVar2.A].a = amuk.q();
        }
    }

    public final sqh a(aosz aoszVar, spt sptVar) {
        aosz aoszVar2 = aosz.CB_NONE;
        int ordinal = aoszVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 13 && ordinal != 10 && ordinal != 11) {
                int i = 0;
                switch (ordinal) {
                    case 2:
                        return sqd.b;
                    case 3:
                        if (sptVar.c) {
                            try {
                                Account[] accountsByType = AccountManager.get(sptVar.a).getAccountsByType("com.google");
                                int length = accountsByType.length;
                                while (i < length) {
                                    Account account = accountsByType[i];
                                    if (account.name != null && account.type != null && account.name.endsWith("@google.com")) {
                                        return sqd.b;
                                    }
                                    i++;
                                }
                            } catch (SecurityException unused) {
                            }
                        }
                        if (this.d == null) {
                            synchronized (this.b) {
                                if (this.d == null) {
                                    sqm sqmVar = new sqm();
                                    Context applicationContext = sptVar.a.getApplicationContext();
                                    applicationContext.getClass();
                                    sqmVar.a = applicationContext;
                                    axzl.n(sqmVar.a, Context.class);
                                    this.d = new sqn(sqmVar.a);
                                }
                            }
                        }
                        return (sqq) this.d.c.get();
                    case 4:
                        sqo sqoVar = new sqo();
                        sqoVar.a = sptVar;
                        axzl.n(sqoVar.a, spt.class);
                        return new sqd(2);
                    case 5:
                        return sqd.b;
                    case 6:
                        return sqd.b;
                    case 7:
                        return sqd.b;
                    case 8:
                        return sqd.b;
                    default:
                        switch (ordinal) {
                            case 22:
                                return sqd.b;
                            case 23:
                                return sqd.b;
                            case 24:
                                return sqd.b;
                            case 25:
                                return sqd.b;
                            default:
                                sqi sqiVar = this.c[aoszVar.A];
                                sqe sqeVar = null;
                                if (sqiVar != null) {
                                    amuk amukVar = sqiVar.a;
                                    int i2 = ((amxx) amukVar).c;
                                    while (i < i2) {
                                        sqg sqgVar = (sqg) amukVar.get(i);
                                        ampq a2 = sqgVar.b().a();
                                        if (!a2.h() || ((amuk) a2.c()).isEmpty()) {
                                            sqeVar = sqgVar.a();
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                                return sqeVar != null ? sqeVar : sqd.a;
                        }
                }
            }
            return sqd.b;
        }
        return sqd.a;
    }
}
