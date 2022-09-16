package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;
import java.util.List;
/* compiled from: PG */
/* renamed from: xyt  reason: default package */
/* loaded from: classes4.dex */
public final class xyt {
    public final Context a;
    private final aadd b;
    private final afvn c;
    private final abfh d;
    private final yrj e;
    private final vzc f;

    public xyt(vzc vzcVar, aadd aaddVar, Context context, afvn afvnVar, abfh abfhVar, yrj yrjVar) {
        this.f = vzcVar;
        this.b = aaddVar;
        this.a = context;
        this.c = afvnVar;
        this.d = abfhVar;
        this.e = yrjVar;
    }

    public final void a() {
        List q;
        int i;
        final Account account;
        arhd a = this.b.a();
        if (a != null) {
            aqdb aqdbVar = a.r;
            if (aqdbVar == null) {
                aqdbVar = aqdb.b;
            }
            if (!aqdbVar.e) {
                return;
            }
            apwf b = apwf.b(this.e.a());
            if (b == null) {
                b = apwf.CONN_UNKNOWN;
            }
            arhd a2 = this.b.a();
            if (a2 != null) {
                aqdb aqdbVar2 = a2.r;
                if (aqdbVar2 == null) {
                    aqdbVar2 = aqdb.b;
                }
                q = new aops(aqdbVar2.f, aqdb.a);
            } else {
                q = amuk.q();
            }
            if (q.contains(b)) {
                return;
            }
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            arhd a3 = this.b.a();
            if (a3 != null) {
                aqdb aqdbVar3 = a3.r;
                if (aqdbVar3 == null) {
                    aqdbVar3 = aqdb.b;
                }
                i = aqdbVar3.g;
            } else {
                i = 0;
            }
            if (availableProcessors < i) {
                return;
            }
            try {
                account = this.f.a(this.c.c());
            } catch (RemoteException | qsc | qsd e) {
                zep.d("exception occurred while trying to get account", e);
                account = null;
            }
            if (account == null) {
                return;
            }
            final ylw ylwVar = new ylw() { // from class: xys
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    xyt xytVar = xyt.this;
                    Account account2 = account;
                    aade aadeVar = (aade) obj;
                    int i2 = (aadeVar == aade.PRODUCTION || aadeVar == aade.RELEASE) ? 1 : 0;
                    aopa createBuilder = aoip.a.createBuilder();
                    createBuilder.copyOnWrite();
                    aoip aoipVar = (aoip) createBuilder.instance;
                    aoipVar.b |= 1;
                    aoipVar.c = "YOUTUBE_APP_OPEN";
                    Context context = xytVar.a;
                    rwo rwoVar = new rwo();
                    rwoVar.b(i2);
                    rwoVar.b = account2;
                    final rwv a4 = rwq.a(context, rwoVar.a());
                    final InitializeBuyFlowRequest initializeBuyFlowRequest = new InitializeBuyFlowRequest(1, new byte[][]{((aoip) createBuilder.mo39build()).toByteArray()});
                    qvx b2 = qvy.b();
                    b2.a = new qvo() { // from class: rws
                        @Override // defpackage.qvo
                        public final void a(Object obj2, Object obj3) {
                            rwv rwvVar = rwv.this;
                            InitializeBuyFlowRequest initializeBuyFlowRequest2 = initializeBuyFlowRequest;
                            rwt rwtVar = new rwt((rvh) obj3);
                            rxa rxaVar = (rxa) ((rxd) obj2).D();
                            Bundle k = rxd.k(rwvVar.c, rwvVar.a.getPackageName(), rwvVar.b, rwvVar.d, false);
                            Parcel pv = rxaVar.pv();
                            dve.g(pv, initializeBuyFlowRequest2);
                            dve.g(pv, k);
                            dve.i(pv, rwtVar);
                            rxaVar.py(13, pv);
                        }
                    };
                    b2.b = new Feature[]{rwk.d};
                    b2.b();
                    b2.c = 23709;
                    a4.v(b2.a());
                }
            };
            ylx.k(this.d.c(), anjk.a, new ylv() { // from class: xyr
                @Override // defpackage.zdt
                /* renamed from: b */
                public final void a(Throwable th) {
                    ylw.this.a(aade.PRODUCTION);
                }
            }, ylwVar);
        }
    }
}
