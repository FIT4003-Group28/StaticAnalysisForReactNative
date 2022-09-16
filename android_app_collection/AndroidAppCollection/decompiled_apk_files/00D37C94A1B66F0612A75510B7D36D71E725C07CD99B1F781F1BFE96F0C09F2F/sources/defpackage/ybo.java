package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
/* compiled from: PG */
/* renamed from: ybo  reason: default package */
/* loaded from: classes4.dex */
public final class ybo {
    public static final String a = "ybo";
    protected final abff b;
    public final abet c;
    public final azqb d;
    public final yat e;
    public final acth f;
    public final acrr g;
    public final azqb h;
    public final dt i;
    public boolean j;
    public ybm k;
    public ybl l;
    public final yjk m;
    public ycu n;
    private final afvn o;
    private final azqb p;
    private final yzj q;
    private final rwx r;
    private final aadd s;
    private final vzc t;

    public ybo(yjk yjkVar, abff abffVar, abet abetVar, afvn afvnVar, vzc vzcVar, azqb azqbVar, azqb azqbVar2, yzj yzjVar, Context context, acth acthVar, acrr acrrVar, azqb azqbVar3, dt dtVar, aadd aaddVar) {
        this.m = yjkVar;
        this.b = abffVar;
        this.c = abetVar;
        this.o = afvnVar;
        this.t = vzcVar;
        this.p = azqbVar;
        this.d = azqbVar2;
        this.q = yzjVar;
        this.r = new rwx(context);
        this.f = acthVar;
        this.g = acrrVar;
        this.h = azqbVar3;
        this.i = dtVar;
        this.s = aaddVar;
        yat yatVar = new yat();
        this.e = yatVar;
        yatVar.b = new DialogInterface.OnKeyListener() { // from class: ybg
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                boolean z;
                ybo yboVar = ybo.this;
                if (i == 4) {
                    yjk yjkVar2 = yboVar.m;
                    if (!yjkVar2.b.a(906)) {
                        z = false;
                    } else {
                        yjkVar2.a.finishActivity(906);
                        z = true;
                    }
                    yboVar.j = !z;
                    yboVar.e.dismiss();
                }
                return true;
            }
        };
    }

    private final Intent h(aade aadeVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Account account;
        WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
        walletCustomTheme.a();
        try {
            account = this.t.a(this.o.c());
            if (account == null) {
                i("Failure: Buyer account is null.");
            }
        } catch (RemoteException | qsc | qsd e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
            sb.append("Failed to get buyer account in buy flow: ");
            sb.append(valueOf);
            i(sb.toString());
            account = null;
        }
        arhd a2 = this.s.a();
        if (a2 != null) {
            aqdb aqdbVar = a2.r;
            if (aqdbVar == null) {
                aqdbVar = aqdb.b;
            }
            if (aqdbVar.i && account == null) {
                return null;
            }
        }
        this.r.b(account);
        rwx rwxVar = this.r;
        rwxVar.d((aadeVar == aade.PRODUCTION || aadeVar == aade.RELEASE) ? 1 : 0);
        rwxVar.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bArr);
        rwxVar.e();
        if (!z) {
            try {
                this.r.c(walletCustomTheme);
            } catch (UnsupportedOperationException unused) {
            }
        }
        if (bArr2 != null && bArr2.length > 0) {
            this.r.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bArr2);
        }
        if (bArr3 != null && bArr3.length > 0) {
            rwx rwxVar2 = this.r;
            rwxVar2.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS", bArr3);
            rwxVar2.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_CLIENT_PARAMETERS", bArr3);
        } else {
            String str = a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 79);
            sb2.append("youtubePayment::");
            sb2.append(str);
            sb2.append(" buyFlowClientParameters is not found, fallback to non-NGBF UI.");
            afus.b(1, 11, sb2.toString());
        }
        Intent a3 = this.r.a();
        a3.setPackage("com.google.android.gms");
        return a3;
    }

    private static final void i(String str) {
        String str2 = a;
        zep.c(str2, str);
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 17 + String.valueOf(str).length());
        sb.append("youtubePayment::");
        sb.append(str2);
        sb.append(" ");
        sb.append(str);
        afus.b(2, 11, sb.toString());
    }

    public final void a(ashp ashpVar, aade aadeVar) {
        aoob aoobVar;
        aqcy aqcyVar;
        boolean z = ashpVar.o;
        if (ashpVar.c == 7) {
            aoobVar = (aoob) ashpVar.d;
        } else {
            aoobVar = aoob.b;
        }
        Intent h = h(aadeVar, z, aoobVar.I(), ashpVar.m.I(), ashpVar.q.I());
        if (h != null) {
            if ((ashpVar.b & 16) == 0) {
                aqcyVar = aqcy.a;
            } else {
                aopa createBuilder = aqcy.a.createBuilder();
                String str = ashpVar.h;
                createBuilder.copyOnWrite();
                aqcy aqcyVar2 = (aqcy) createBuilder.instance;
                str.getClass();
                aqcyVar2.b |= 1;
                aqcyVar2.c = str;
                aqcyVar = (aqcy) createBuilder.mo39build();
            }
            arrf a2 = arrh.a();
            a2.copyOnWrite();
            ((arrh) a2.instance).cf(aqcyVar);
            this.g.c((arrh) a2.mo39build());
            if ((ashpVar.b & 4096) == 0) {
                this.g.c(new ybr().e());
            } else {
                acrr acrrVar = this.g;
                ybr ybrVar = new ybr();
                ybrVar.a = ashpVar.n;
                acrrVar.c(ybrVar.e());
            }
            this.m.a(h, 906, new ybn(this, ashpVar));
            ybm ybmVar = this.k;
            if (ybmVar == null) {
                return;
            }
            ybmVar.a();
            return;
        }
        if ((ashpVar.b & 4096) != 0) {
            acrr acrrVar2 = this.g;
            ybr ybrVar2 = new ybr();
            ybrVar2.a = ashpVar.n;
            ybrVar2.b = 2;
            acrrVar2.c(ybrVar2.b());
        } else {
            acrr acrrVar3 = this.g;
            ybr ybrVar3 = new ybr();
            ybrVar3.b = 2;
            acrrVar3.c(ybrVar3.b());
        }
        d(null);
    }

    public final void b(ashp ashpVar) {
        aqft aqftVar;
        ycu ycuVar;
        awja awjaVar;
        ashu ashuVar = ashpVar.k;
        if (ashuVar == null) {
            ashuVar = ashu.a;
        }
        CharSequence charSequence = null;
        if (ashuVar.b == 64099105) {
            ashu ashuVar2 = ashpVar.k;
            if (ashuVar2 == null) {
                ashuVar2 = ashu.a;
            }
            if (ashuVar2.b == 64099105) {
                aqftVar = (aqft) ashuVar2.c;
            } else {
                aqftVar = aqft.a;
            }
        } else {
            aqftVar = null;
        }
        if (aqftVar == null) {
            ashu ashuVar3 = ashpVar.k;
            if (ashuVar3 == null) {
                ashuVar3 = ashu.a;
            }
            if (ashuVar3.b == 65500215) {
                ashu ashuVar4 = ashpVar.k;
                if (ashuVar4 == null) {
                    ashuVar4 = ashu.a;
                }
                if (ashuVar4.b == 65500215) {
                    awjaVar = (awja) ashuVar4.c;
                } else {
                    awjaVar = awja.a;
                }
                charSequence = yic.i(awjaVar);
            }
            if (charSequence == null) {
                if ((ashpVar.b & 128) != 0 && (ycuVar = this.n) != null) {
                    ashu ashuVar5 = ashpVar.k;
                    if (ashuVar5 == null) {
                        ashuVar5 = ashu.a;
                    }
                    CharSequence a2 = ycuVar.a(ashuVar5);
                    if (a2 != null) {
                        String.valueOf(String.valueOf(a2)).length();
                        e(a2);
                        return;
                    }
                }
                int r = akzj.r(ashpVar.s);
                if (r == 0 || r != 2) {
                    if (ashpVar.c == 15) {
                        ybm ybmVar = this.k;
                        ybmVar.getClass();
                        ashpVar.getClass();
                        ybu ybuVar = new ybu();
                        ybuVar.ae = ybmVar;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("get_cart_response", ashpVar.toByteArray());
                        ybuVar.ae(bundle);
                        ybuVar.qv(this.i.getSupportFragmentManager(), "upgrade_dialog");
                        return;
                    }
                    dt dtVar = this.i;
                    ylr ylrVar = (ylr) this.p.get();
                    ylx.n(dtVar, anlz.q(false), zbx.a, new ybh(this, ashpVar));
                    return;
                }
                zep.h(a, "Use BILLING_FLOW_TYPE_CONSOLIDATED");
                aafo aafoVar = (aafo) this.h.get();
                apzg apzgVar = ashpVar.p;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.a(apzgVar);
                return;
            }
            String.valueOf(String.valueOf(charSequence)).length();
            e(charSequence);
            return;
        }
        ajgx.n(this.i, aqftVar, (aafo) this.h.get(), this.f.oi(), null);
        c();
    }

    public final void c() {
        ybm ybmVar = this.k;
        if (ybmVar != null) {
            ybmVar.b();
        }
    }

    public final void d(Throwable th) {
        e(this.q.b(th));
    }

    public final void e(CharSequence charSequence) {
        ybm ybmVar = this.k;
        if (ybmVar != null) {
            ybmVar.c(charSequence);
        }
    }

    public final void f(String str, byte[] bArr, byte[] bArr2, ashp ashpVar) {
        if ((!ashpVar.h.isEmpty()) + (!ashpVar.i.isEmpty()) + (ashpVar.j.d() == 0 ? 0 : 1) != 1) {
            zep.b("More than one kind of offer params or none set. Complete transaction request aborted");
            if ((ashpVar.b & 4096) != 0) {
                acrr acrrVar = this.g;
                ybr ybrVar = new ybr();
                ybrVar.a = ashpVar.n;
                ybrVar.b = 18;
                acrrVar.c(ybrVar.b());
            }
            d(null);
        } else if (TextUtils.isEmpty(str)) {
            if ((ashpVar.b & 4096) != 0) {
                acrr acrrVar2 = this.g;
                ybr ybrVar2 = new ybr();
                ybrVar2.a = ashpVar.n;
                ybrVar2.b = 17;
                acrrVar2.c(ybrVar2.b());
            }
            d(null);
        } else {
            abez a2 = this.b.a();
            a2.a = abez.g(ashpVar.h);
            a2.b = abez.g(ashpVar.i);
            a2.d = ashpVar.j;
            a2.u = bArr;
            a2.v = bArr2;
            a2.c = aoob.z(str);
            ybm ybmVar = this.k;
            if (ybmVar != null) {
                ybmVar.d(a2);
            }
            a2.k(ashpVar.l.I());
            this.e.show(this.i.getFragmentManager(), yat.a);
            this.b.d(a2, new ybj(this, ashpVar));
        }
    }

    public final void g(abfa abfaVar) {
        acrr acrrVar = this.g;
        ybr ybrVar = new ybr();
        arrf a2 = arrh.a();
        awhf g = ybrVar.g();
        a2.copyOnWrite();
        ((arrh) a2.instance).dp(g);
        acrrVar.c((arrh) a2.mo39build());
        this.e.show(this.i.getFragmentManager(), yat.a);
        abff abffVar = this.b;
        abffVar.g.e(abfaVar, new ybi(this));
    }
}
