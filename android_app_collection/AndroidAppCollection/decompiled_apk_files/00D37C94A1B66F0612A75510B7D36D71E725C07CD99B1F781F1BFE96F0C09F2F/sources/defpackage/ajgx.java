package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ajgx  reason: default package */
/* loaded from: classes.dex */
public final class ajgx extends ajgv {
    private final aqft a;
    private final acti b;
    private final ajgw c;
    private final zah d;

    protected ajgx(aqft aqftVar, aafo aafoVar, acti actiVar, ajgz ajgzVar, ajgw ajgwVar, Object obj, String str, zah zahVar) {
        super(aafoVar, ajgzVar, obj, str);
        aqftVar.getClass();
        this.a = aqftVar;
        actiVar.getClass();
        this.b = actiVar;
        this.c = ajgwVar;
        this.d = zahVar;
    }

    public static ajgx c(Context context, aqft aqftVar, aafo aafoVar, acti actiVar, ajgw ajgwVar, Object obj) {
        return g(context, aqftVar, aafoVar, actiVar, null, true, true, ajgwVar, obj);
    }

    public static ajgx g(Context context, aqft aqftVar, aafo aafoVar, acti actiVar, ajgz ajgzVar, boolean z, boolean z2, ajgw ajgwVar, Object obj) {
        return h(context, aqftVar, aafoVar, actiVar, ajgzVar, z, z2, ajgwVar, obj, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ajgx h(android.content.Context r16, defpackage.aqft r17, defpackage.aafo r18, defpackage.acti r19, defpackage.ajgz r20, boolean r21, boolean r22, defpackage.ajgw r23, java.lang.Object r24, defpackage.ajxz r25, defpackage.zah r26) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajgx.h(android.content.Context, aqft, aafo, acti, ajgz, boolean, boolean, ajgw, java.lang.Object, ajxz, zah):ajgx");
    }

    public static void m(Context context, aqft aqftVar, aafo aafoVar, acti actiVar, ajgz ajgzVar) {
        p(context, aqftVar, aafoVar, actiVar, ajgzVar, null, null);
    }

    public static void n(Context context, aqft aqftVar, aafo aafoVar, acti actiVar, Object obj) {
        p(context, aqftVar, aafoVar, actiVar, null, null, obj);
    }

    public static void o(Context context, aqft aqftVar, aafo aafoVar, acti actiVar, boolean z, ajgw ajgwVar, Object obj, ajxz ajxzVar) {
        h(context, aqftVar, aafoVar, actiVar, null, true, z, ajgwVar, obj, ajxzVar, null);
    }

    public static void p(Context context, aqft aqftVar, aafo aafoVar, acti actiVar, ajgz ajgzVar, ajgw ajgwVar, Object obj) {
        g(context, aqftVar, aafoVar, actiVar, ajgzVar, true, true, ajgwVar, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajgv
    public final Map d() {
        Map d = super.d();
        d.remove(actk.b);
        return d;
    }

    @Override // defpackage.ajgv
    protected final void e() {
        apoj f = ajjh.f(this.a);
        if (f != null) {
            if ((f.b & 16384) != 0) {
                aafo aafoVar = this.g;
                apzg apzgVar = f.o;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, d());
            }
            if ((f.b & 8192) != 0) {
                aafo aafoVar2 = this.g;
                apzg apzgVar2 = f.n;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                aafoVar2.c(apzgVar2, d());
            }
            if ((f.b & 32768) != 0) {
                aafo aafoVar3 = this.g;
                apzg apzgVar3 = f.p;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
                aafoVar3.c(apzgVar3, d());
            }
            this.b.H(3, new acte(f.t), null);
        } else {
            aqft aqftVar = this.a;
            if ((aqftVar.b & 16777216) != 0) {
                aafo aafoVar4 = this.g;
                apzg apzgVar4 = aqftVar.s;
                if (apzgVar4 == null) {
                    apzgVar4 = apzg.a;
                }
                aafoVar4.c(apzgVar4, d());
            }
        }
        ajgw ajgwVar = this.c;
        if (ajgwVar != null) {
            ajgwVar.a();
        }
        zah zahVar = this.d;
        if (zahVar != null) {
            zahVar.b();
        }
    }

    @Override // defpackage.ajgv
    protected final void f() {
        apoj g = ajjh.g(this.a);
        if (g != null) {
            if ((g.b & 32768) != 0) {
                aafo aafoVar = this.g;
                apzg apzgVar = g.p;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, d());
            }
            if ((g.b & 16384) != 0) {
                aafo aafoVar2 = this.g;
                apzg apzgVar2 = g.o;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                aafoVar2.c(apzgVar2, d());
            }
            if ((g.b & 8192) != 0) {
                aafo aafoVar3 = this.g;
                apzg apzgVar3 = g.n;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
                aafoVar3.c(apzgVar3, d());
            }
            this.b.H(3, new acte(g.t), null);
        } else {
            aqft aqftVar = this.a;
            int i = aqftVar.b;
            if ((33554432 & i) != 0) {
                aafo aafoVar4 = this.g;
                apzg apzgVar4 = aqftVar.t;
                if (apzgVar4 == null) {
                    apzgVar4 = apzg.a;
                }
                aafoVar4.c(apzgVar4, d());
            } else if ((i & 8388608) != 0) {
                aafo aafoVar5 = this.g;
                apzg apzgVar5 = aqftVar.r;
                if (apzgVar5 == null) {
                    apzgVar5 = apzg.a;
                }
                aafoVar5.c(apzgVar5, d());
            }
        }
        ajgw ajgwVar = this.c;
        if (ajgwVar != null) {
            ajgwVar.b();
        }
        zah zahVar = this.d;
        if (zahVar != null) {
            zahVar.b();
        }
    }

    public final void l() {
        AlertDialog alertDialog = this.i;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        i(7);
    }

    @Override // defpackage.ajgv
    protected final void lu(int i) {
        ajgw ajgwVar = this.c;
        if (ajgwVar != null) {
            ajgwVar.c(i == 5 || i == 6 || i == 7);
        }
        if (i != 1) {
            this.g.e(this.a.l, this.h);
            if (i == 6) {
                return;
            }
        }
        zah zahVar = this.d;
        if (zahVar != null) {
            zahVar.b();
        }
    }
}
