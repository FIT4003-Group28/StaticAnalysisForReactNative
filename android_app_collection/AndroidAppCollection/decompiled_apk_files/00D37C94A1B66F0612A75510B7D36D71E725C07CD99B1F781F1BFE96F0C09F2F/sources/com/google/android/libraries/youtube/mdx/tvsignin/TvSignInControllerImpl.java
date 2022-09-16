package com.google.android.libraries.youtube.mdx.tvsignin;

import android.content.Intent;
import android.text.TextUtils;
import androidx.activity.result.ActivityResult;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInActivity;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInControllerImpl;
import com.google.android.youtube.R;
import j$.time.Duration;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class TvSignInControllerImpl implements advc, ynl {
    public static final /* synthetic */ int o = 0;
    public final yni b;
    public final acrr c;
    public final wal d;
    public final afvn e;
    public final azqb f;
    public final dt g;
    public final ScheduledExecutorService h;
    public advb k;
    public aby m;
    public final advo n;
    private final adbe p;
    private final adbb q;
    private final adoa r;
    private final adux s;
    private final Executor t;
    final advm i = new advm(this);
    public final aypf j = new aypf();
    public boolean l = false;

    public TvSignInControllerImpl(adbe adbeVar, final yni yniVar, acrr acrrVar, final String str, wal walVar, afvn afvnVar, final acwu acwuVar, azqb azqbVar, dt dtVar, advo advoVar, adoa adoaVar, adux aduxVar, final Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.p = adbeVar;
        this.b = yniVar;
        this.c = acrrVar;
        this.d = walVar;
        this.e = afvnVar;
        this.f = azqbVar;
        this.g = dtVar;
        this.n = advoVar;
        this.r = adoaVar;
        this.s = aduxVar;
        this.h = scheduledExecutorService;
        this.t = executor;
        this.q = new adbb() { // from class: advj
            /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
            /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
            @Override // defpackage.adbb
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(defpackage.adid r13) {
                /*
                    Method dump skipped, instructions count: 244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.advj.a(adid):void");
            }

            @Override // defpackage.adbb
            public final /* synthetic */ void b() {
            }
        };
        this.m = dtVar.registerForActivityResult(new acj(), new abw() { // from class: advd
            @Override // defpackage.abw
            public final void a(Object obj) {
                TvSignInControllerImpl tvSignInControllerImpl = TvSignInControllerImpl.this;
                ActivityResult activityResult = (ActivityResult) obj;
                int i = activityResult.a;
                Intent intent = activityResult.b;
                if (i == -1) {
                    int intExtra = intent.getIntExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyExitType", 2);
                    if (intExtra == 0) {
                        advo advoVar2 = tvSignInControllerImpl.n;
                        advoVar2.b(advoVar2.a.getString(R.string.mdx_tv_signin_connecting_snackbar_message), actj.MDX_TV_SIGN_IN_SNACKBAR_CONNECTING);
                    } else if (intExtra == 1) {
                        advo advoVar3 = tvSignInControllerImpl.n;
                        advoVar3.b(advoVar3.a.getString(R.string.mdx_tv_signin_cancel_snackbar_message), actj.MDX_TV_SIGN_IN_SNACKBAR_CANCELED);
                    } else if (intExtra == 2) {
                        if (TextUtils.isEmpty(intent.getStringExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyError"))) {
                            tvSignInControllerImpl.g.getString(R.string.mdx_tv_signin_error_snackbar_message);
                        }
                        tvSignInControllerImpl.n.a();
                    }
                } else if (i == 0) {
                    tvSignInControllerImpl.l = true;
                }
                tvSignInControllerImpl.k = null;
            }
        });
    }

    public static /* synthetic */ void m(Throwable th) {
        zep.f(a, "Failed to store passive last time shown.", th);
    }

    @Override // defpackage.advc
    public final advb g() {
        return this.k;
    }

    @Override // defpackage.advc
    public final void h() {
        this.j.c();
        o();
    }

    @Override // defpackage.advc
    public final void i() {
        ylr.c();
        this.k = null;
    }

    @Override // defpackage.advc
    public final void j(ixj ixjVar, Duration duration) {
        final adnt e = this.r.e();
        if (e == null || e.a() != 1 || e.n() == null) {
            zep.c(a, "startMdxMessageSignIn failed before sending MDx message as MDx session state is invalid.");
            ixjVar.a();
            return;
        }
        ayor b = azpj.b(this.h);
        final String uuid = UUID.randomUUID().toString();
        ayoi ag = aynr.j(new aynt() { // from class: advk
            @Override // defpackage.aynt
            public final void a(final aysm aysmVar) {
                ylx.k(e.q(uuid), TvSignInControllerImpl.this.h, new ylv() { // from class: advg
                    @Override // defpackage.zdt
                    /* renamed from: b */
                    public final void a(Throwable th) {
                        aysm.this.c(th);
                    }
                }, new ylw() { // from class: advh
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj) {
                        aysm aysmVar2 = aysm.this;
                        int i = TvSignInControllerImpl.o;
                        if (((Boolean) obj).booleanValue()) {
                            aysmVar2.a();
                        } else {
                            aysmVar2.c(new Exception("MdxSession.sendStartSignIn returned false."));
                        }
                    }
                });
            }
        }).M(e.n().c()).ag(1L);
        long millis = duration.toMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ayrd.b(timeUnit, "timeUnit is null");
        azjh azjhVar = new azjh(ag, millis, timeUnit, b);
        azqc.i();
        this.j.d(azjhVar.X(aypa.a()).at(new advl(this, ixjVar), new advl(this, ixjVar, 1)));
    }

    @Override // defpackage.advc
    public final void k() {
        p(this.k, null);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        ScreenId screenId;
        if (i != -1) {
            if (i == 0) {
                adno adnoVar = (adno) obj;
                adig adigVar = adnoVar.d;
                if (adigVar == null || (screenId = adnoVar.a) == null) {
                    zep.m(a, "Got a null MDX screen or screenID when processing MdxRequestAssistedSignInEvent.");
                    return null;
                }
                ampq a = advb.a(adnoVar.b, adnoVar.c, screenId.c, adigVar, 2);
                if (!a.h()) {
                    return null;
                }
                n((advb) a.c());
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{adno.class};
    }

    @Override // defpackage.advc
    public final void l(advb advbVar, String str) {
        p(advbVar, str);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    public final void n(final advb advbVar) {
        this.k = advbVar;
        final String str = advbVar.a;
        ylx.n(this.g, ((vne) this.f.get()).a(), aclb.i, new zdt() { // from class: advi
            @Override // defpackage.zdt
            public final void a(Object obj) {
                TvSignInControllerImpl tvSignInControllerImpl = TvSignInControllerImpl.this;
                String str2 = str;
                advb advbVar2 = advbVar;
                if (!((awua) obj).d.contains(str2) || tvSignInControllerImpl.l) {
                    tvSignInControllerImpl.l = false;
                    aopa createBuilder = atcf.a.createBuilder();
                    createBuilder.copyOnWrite();
                    atcf atcfVar = (atcf) createBuilder.instance;
                    atcfVar.c = 2;
                    atcfVar.b |= 1;
                    createBuilder.copyOnWrite();
                    atcf atcfVar2 = (atcf) createBuilder.instance;
                    str2.getClass();
                    atcfVar2.b = 2 | atcfVar2.b;
                    atcfVar2.d = str2;
                    arrf a = arrh.a();
                    a.copyOnWrite();
                    ((arrh) a.instance).de((atcf) createBuilder.mo39build());
                    tvSignInControllerImpl.c.c((arrh) a.mo39build());
                    tvSignInControllerImpl.b.d(new adva(true, advbVar2.d, advbVar2.b, advbVar2.c.b()));
                    ylx.m(((vne) tvSignInControllerImpl.f.get()).b(new wdx(str2, 15), anjk.a), adkd.m);
                }
            }
        });
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.b.m(this);
        this.p.f(this.q);
        this.k = null;
        this.j.c();
        this.r.i(this.i);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.p.c(this.q, false);
        this.b.g(this);
        this.r.g(this.i);
    }

    public final void o() {
        adnt e = this.r.e();
        if (e == null || e.l() == null) {
            return;
        }
        this.s.a(e.l().c, "canceled");
    }

    public final void p(final advb advbVar, final String str) {
        if (this.g == null || advbVar == null) {
            return;
        }
        this.t.execute(new Runnable() { // from class: advf
            @Override // java.lang.Runnable
            public final void run() {
                TvSignInControllerImpl tvSignInControllerImpl = TvSignInControllerImpl.this;
                advb advbVar2 = advbVar;
                String str2 = str;
                advo advoVar = tvSignInControllerImpl.n;
                akfi akfiVar = advoVar.d;
                if (akfiVar != null) {
                    advoVar.b.m(akfiVar);
                }
                Intent intent = new Intent(tvSignInControllerImpl.g, TvSignInActivity.class);
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountEmail", str2);
                }
                String b = advbVar2.b() != null ? advbVar2.b() : "";
                intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyAuthCode", advbVar2.e);
                intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyScreenId", advbVar2.b);
                intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyAppStatusUri", b);
                intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.requestType", advbVar2.d);
                tvSignInControllerImpl.m.b(intent);
            }
        });
    }
}
