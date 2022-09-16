package defpackage;

import android.accounts.Account;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import com.google.android.filament.R;
import com.google.android.gms.audit.LogAuditRecordsRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: cqen  reason: default package */
/* loaded from: classes5.dex */
final class cqen extends a {
    public final z<cqek> d;
    public final z<String> e;
    public final z<Bitmap> f;
    public final cqbr g;
    public final cqdo h;
    public final Integer i;
    public final cqew j;
    public dgyb k;
    public String l;
    final Account m;
    final dgyd n;
    private final cqdu o;
    private final cqeu p;
    private byte[] q;

    public cqen(Application application, Account account, dgyd dgydVar, cqdu cqduVar, cqbr cqbrVar, cqeu cqeuVar, cqdo cqdoVar) {
        super(application);
        this.d = new z<>();
        this.e = new z<>();
        this.f = new z<>();
        this.m = account;
        this.n = dgydVar;
        this.o = cqduVar;
        this.g = cqbrVar;
        this.p = cqeuVar;
        this.h = cqdoVar;
        Integer valueOf = Integer.valueOf(dbsy.a.nextInt());
        this.i = valueOf;
        this.j = cqev.a(application, account, valueOf, dgydVar);
    }

    public final void c(cqek cqekVar) {
        cqek h = this.d.h();
        this.d.g(cqekVar);
        cqeo cqeoVar = cqeo.ALREADY_CONSENTED;
        cqek cqekVar2 = cqek.CONSENT_DATA_LOADING;
        boolean z = false;
        switch (cqekVar.ordinal()) {
            case 0:
                dbsk.l(h == null || h == cqek.CONSENT_DATA_LOADING_FAILED);
                dgxp bZ = dgxq.c.bZ();
                dgxu bZ2 = dgxv.c.bZ();
                UUID randomUUID = UUID.randomUUID();
                dgxw bZ3 = dgxx.d.bZ();
                long mostSignificantBits = randomUUID.getMostSignificantBits();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dgxx dgxxVar = (dgxx) bZ3.b;
                dgxxVar.a |= 1;
                dgxxVar.b = mostSignificantBits;
                long leastSignificantBits = randomUUID.getLeastSignificantBits();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dgxx dgxxVar2 = (dgxx) bZ3.b;
                dgxxVar2.a = 2 | dgxxVar2.a;
                dgxxVar2.c = leastSignificantBits;
                dgxx bK = bZ3.bK();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dgxv dgxvVar = (dgxv) bZ2.b;
                bK.getClass();
                dgxvVar.b = bK;
                dgxvVar.a |= 1;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dgxq dgxqVar = (dgxq) bZ.b;
                dgxv bK2 = bZ2.bK();
                bK2.getClass();
                dgxqVar.b = bK2;
                dgxqVar.a |= 1;
                this.q = bZ.bK().bS();
                this.p.a(this.a, this.m, new cqet(this) { // from class: cqed
                    private final cqen a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.cqet
                    public final void a(cqes cqesVar) {
                        cqen cqenVar = this.a;
                        cqeo cqeoVar2 = cqeo.ALREADY_CONSENTED;
                        cqek cqekVar3 = cqek.CONSENT_DATA_LOADING;
                        int ordinal = ((cqde) cqesVar).a.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal == 2) {
                                    deha.q(cqenVar.h.a(cqenVar.a, cqenVar.m, cqeu.b(cqesVar), cqbs.a(cqenVar.a)), new cqej(cqenVar), new cqem());
                                    cqbr cqbrVar = cqenVar.g;
                                    Application application = cqenVar.a;
                                    Account account = cqenVar.m;
                                    final z<String> zVar = cqenVar.e;
                                    zVar.getClass();
                                    cqbrVar.a(application, account, new cqbq(zVar) { // from class: cqee
                                        private final z a;

                                        {
                                            this.a = zVar;
                                        }

                                        @Override // defpackage.cqbq
                                        public final void a(Object obj) {
                                            this.a.f((String) obj);
                                        }
                                    });
                                    cqenVar.f.f(cqenVar.g.c(cqenVar.a));
                                    cqbr cqbrVar2 = cqenVar.g;
                                    Application application2 = cqenVar.a;
                                    Account account2 = cqenVar.m;
                                    final z<Bitmap> zVar2 = cqenVar.f;
                                    zVar2.getClass();
                                    cqbrVar2.b(application2, account2, new cqbq(zVar2) { // from class: cqef
                                        private final z a;

                                        {
                                            this.a = zVar2;
                                        }

                                        @Override // defpackage.cqbq
                                        public final void a(Object obj) {
                                            this.a.f((Bitmap) obj);
                                        }
                                    });
                                    return;
                                } else if (ordinal != 3) {
                                    return;
                                }
                            }
                            cqenVar.c(cqek.CONSENT_NOT_POSSIBLE);
                            return;
                        }
                        cqenVar.c(cqek.ALREADY_CONSENTED);
                    }
                });
                return;
            case 1:
                if (h == cqek.CONSENT_DATA_LOADING || h == cqek.CONSENT_WRITE_IN_PROGRESS) {
                    z = true;
                }
                dbsk.l(z);
                if (h != cqek.CONSENT_DATA_LOADING) {
                    return;
                }
                this.j.b(8);
                return;
            case 2:
                if (h == cqek.WAITING_FOR_USER_DECISION) {
                    z = true;
                }
                dbsk.l(z);
                dbsk.s(this.k);
                final Application application = this.a;
                final cqdu cqduVar = this.o;
                final Account account = this.m;
                final byte[] bArr = this.q;
                final dgyb dgybVar = this.k;
                final dgyd dgydVar = this.n;
                final cqei cqeiVar = new cqei(this, application);
                Executors.newSingleThreadExecutor().execute(new Runnable(cqduVar, application, account, bArr, dgybVar, dgydVar, cqeiVar) { // from class: cqdp
                    private final cqdu a;
                    private final Context b;
                    private final Account c;
                    private final byte[] d;
                    private final dgyb e;
                    private final dgyd f;
                    private final cqei g;

                    {
                        this.a = cqduVar;
                        this.b = application;
                        this.c = account;
                        this.d = bArr;
                        this.e = dgybVar;
                        this.f = dgydVar;
                        this.g = cqeiVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        final Context context = this.b;
                        final Account account2 = this.c;
                        final byte[] bArr2 = this.d;
                        dgyb dgybVar2 = this.e;
                        dgyd dgydVar2 = this.f;
                        final cqei cqeiVar2 = this.g;
                        try {
                            String str = account2.name;
                            String l = cmrh.l(context, str);
                            dgyu bZ4 = dgyv.f.bZ();
                            dgza bZ5 = dgzd.d.bZ();
                            dgzb bZ6 = dgzc.c.bZ();
                            if (bZ6.c) {
                                bZ6.bF();
                                bZ6.c = false;
                            }
                            dgzc dgzcVar = (dgzc) bZ6.b;
                            l.getClass();
                            dgzcVar.a = 1;
                            dgzcVar.b = l;
                            if (bZ5.c) {
                                bZ5.bF();
                                bZ5.c = false;
                            }
                            dgzd dgzdVar = (dgzd) bZ5.b;
                            dgzc bK3 = bZ6.bK();
                            bK3.getClass();
                            dgzdVar.b = bK3;
                            dgzdVar.a |= 1;
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            dgyv dgyvVar = (dgyv) bZ4.b;
                            dgzd bK4 = bZ5.bK();
                            bK4.getClass();
                            dgyvVar.b = bK4;
                            dgyvVar.a |= 1;
                            dgza bZ7 = dgzd.d.bZ();
                            dgzb bZ8 = dgzc.c.bZ();
                            if (bZ8.c) {
                                bZ8.bF();
                                bZ8.c = false;
                            }
                            dgzc dgzcVar2 = (dgzc) bZ8.b;
                            l.getClass();
                            dgzcVar2.a = 1;
                            dgzcVar2.b = l;
                            if (bZ7.c) {
                                bZ7.bF();
                                bZ7.c = false;
                            }
                            dgzd dgzdVar2 = (dgzd) bZ7.b;
                            dgzc bK5 = bZ8.bK();
                            bK5.getClass();
                            dgzdVar2.b = bK5;
                            dgzdVar2.a |= 1;
                            dgyy bZ9 = dgyz.c.bZ();
                            String a = cpke.a(context.getContentResolver(), "android_id", "");
                            if (bZ9.c) {
                                bZ9.bF();
                                bZ9.c = false;
                            }
                            dgyz dgyzVar = (dgyz) bZ9.b;
                            a.getClass();
                            dgyzVar.a |= 1;
                            dgyzVar.b = a;
                            if (bZ7.c) {
                                bZ7.bF();
                                bZ7.c = false;
                            }
                            dgzd dgzdVar3 = (dgzd) bZ7.b;
                            dgyz bK6 = bZ9.bK();
                            bK6.getClass();
                            dgzdVar3.c = bK6;
                            dgzdVar3.a |= 4;
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            dgyv dgyvVar2 = (dgyv) bZ4.b;
                            dgzd bK7 = bZ7.bK();
                            bK7.getClass();
                            dgyvVar2.c = bK7;
                            dgyvVar2.a |= 2;
                            dgze bZ10 = dgzf.d.bZ();
                            if (bZ10.c) {
                                bZ10.bF();
                                bZ10.c = false;
                            }
                            dgzf dgzfVar = (dgzf) bZ10.b;
                            dgzfVar.b = 21;
                            dgzfVar.a |= 1;
                            dgzg bZ11 = dgzh.c.bZ();
                            dgzi bZ12 = dgzj.d.bZ();
                            if (bZ12.c) {
                                bZ12.bF();
                                bZ12.c = false;
                            }
                            dgzj dgzjVar = (dgzj) bZ12.b;
                            dgzjVar.a |= 2;
                            dgzjVar.c = 341506552;
                            dgzj dgzjVar2 = (dgzj) bZ12.b;
                            dgzjVar2.b = dgydVar2.v;
                            dgzjVar2.a |= 1;
                            if (bZ11.c) {
                                bZ11.bF();
                                bZ11.c = false;
                            }
                            dgzh dgzhVar = (dgzh) bZ11.b;
                            dgzj bK8 = bZ12.bK();
                            bK8.getClass();
                            dgzhVar.b = bK8;
                            dgzhVar.a |= 8;
                            if (bZ10.c) {
                                bZ10.bF();
                                bZ10.c = false;
                            }
                            dgzf dgzfVar2 = (dgzf) bZ10.b;
                            dgzh bK9 = bZ11.bK();
                            bK9.getClass();
                            dgzfVar2.c = bK9;
                            dgzfVar2.a |= 2;
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            dgyv dgyvVar3 = (dgyv) bZ4.b;
                            dgzf bK10 = bZ10.bK();
                            bK10.getClass();
                            dgyvVar3.d = bK10;
                            dgyvVar3.a |= 4;
                            dgzo bZ13 = dgzp.e.bZ();
                            dgxs dgxsVar = cqdv.a.get(dgydVar2);
                            if (bZ13.c) {
                                bZ13.bF();
                                bZ13.c = false;
                            }
                            dgzp dgzpVar = (dgzp) bZ13.b;
                            dgzpVar.b = dgxsVar.kf;
                            dgzpVar.a |= 1;
                            dgzl dgzlVar = dgybVar2.d;
                            if (dgzlVar == null) {
                                dgzlVar = dgzl.a;
                            }
                            if (bZ13.c) {
                                bZ13.bF();
                                bZ13.c = false;
                            }
                            dgzp dgzpVar2 = (dgzp) bZ13.b;
                            dgzlVar.getClass();
                            dgzpVar2.c = dgzlVar;
                            dgzpVar2.a |= 4;
                            dgzm bZ14 = dgzn.c.bZ();
                            dgyx dgyxVar = dgybVar2.c;
                            if (dgyxVar == null) {
                                dgyxVar = dgyx.a;
                            }
                            if (bZ14.c) {
                                bZ14.bF();
                                bZ14.c = false;
                            }
                            dgzn dgznVar = (dgzn) bZ14.b;
                            dgyxVar.getClass();
                            dgznVar.b = dgyxVar;
                            dgznVar.a |= 2048;
                            if (bZ13.c) {
                                bZ13.bF();
                                bZ13.c = false;
                            }
                            dgzp dgzpVar3 = (dgzp) bZ13.b;
                            dgzn bK11 = bZ14.bK();
                            bK11.getClass();
                            dgzpVar3.d = bK11;
                            dgzpVar3.a |= 8;
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            dgyv dgyvVar4 = (dgyv) bZ4.b;
                            dgzp bK12 = bZ13.bK();
                            bK12.getClass();
                            dgyvVar4.e = bK12;
                            dgyvVar4.a |= 8;
                            cmqs cmqsVar = new cmqs();
                            cmqsVar.d = bArr2;
                            cmqsVar.b = R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
                            cmqsVar.c = str;
                            cmqsVar.e.add(bZ4.bK().bS());
                            cmqsVar.a = 1;
                            if (!cmqsVar.e.isEmpty()) {
                                int i = cmqsVar.b;
                                if (i != 0) {
                                    LogAuditRecordsRequest logAuditRecordsRequest = new LogAuditRecordsRequest(cmqsVar.a, i, cmqsVar.c, (byte[][]) cmqsVar.e.toArray(new byte[0]), null, cmqsVar.d);
                                    cmqr cmqrVar = new cmqr(context);
                                    cntc builder = cntd.builder();
                                    builder.c = 6901;
                                    builder.a = new cnsr(logAuditRecordsRequest) { // from class: cmqo
                                        private final LogAuditRecordsRequest a;

                                        {
                                            this.a = logAuditRecordsRequest;
                                        }

                                        @Override // defpackage.cnsr
                                        public final void a(Object obj, Object obj2) {
                                            ((cmqv) ((cmqu) obj).L()).e(this.a, new cmqq((cpct) obj2));
                                        }
                                    };
                                    cmqrVar.d(builder.a()).f(new cpbu(context, account2, bArr2, cqeiVar2) { // from class: cqdq
                                        private final Context a;
                                        private final Account b;
                                        private final byte[] c;
                                        private final cqei d;

                                        {
                                            this.a = context;
                                            this.b = account2;
                                            this.c = bArr2;
                                            this.d = cqeiVar2;
                                        }

                                        @Override // defpackage.cpbu
                                        public final Object a(cpcq cpcqVar) {
                                            Context context2 = this.a;
                                            Account account3 = this.b;
                                            byte[] bArr3 = this.c;
                                            final cqei cqeiVar3 = this.d;
                                            if (cpcqVar.b()) {
                                                GoogleApiClient.Builder builder2 = new GoogleApiClient.Builder(context2);
                                                builder2.addApi(coqk.a);
                                                GoogleApiClient build = builder2.build();
                                                build.registerConnectionCallbacks(new cqdt(build, account3, Base64.encodeToString(bArr3, 10), cqeiVar3));
                                                build.registerConnectionFailedListener(new GoogleApiClient.OnConnectionFailedListener(cqeiVar3) { // from class: cqdr
                                                    private final cqei a;

                                                    {
                                                        this.a = cqeiVar3;
                                                    }

                                                    @Override // defpackage.cnsi
                                                    public final void Pi(ConnectionResult connectionResult) {
                                                        this.a.a();
                                                    }
                                                });
                                                build.connect();
                                                return null;
                                            }
                                            cpcqVar.e();
                                            cqeiVar3.a();
                                            return null;
                                        }
                                    });
                                    return;
                                }
                                throw new IllegalStateException("Invalid componentId.");
                            }
                            throw new IllegalStateException("Must specify at least one audit record.");
                        } catch (Exception unused) {
                            cqeiVar2.a();
                        }
                    }
                });
                return;
            case 3:
                if (h == cqek.CONSENT_WRITE_IN_PROGRESS) {
                    z = true;
                }
                dbsk.l(z);
                this.j.b(13);
                return;
            case 4:
                if (h == cqek.CONSENT_DATA_LOADING) {
                    z = true;
                }
                dbsk.l(z);
                this.j.c(3);
                return;
            case 5:
                if (h == cqek.CONSENT_DATA_LOADING) {
                    z = true;
                }
                dbsk.l(z);
                this.j.c(2);
                return;
            case 6:
                if (h == cqek.CONSENT_DATA_LOADING) {
                    z = true;
                }
                dbsk.l(z);
                this.j.b(5);
                return;
            default:
                return;
        }
    }

    public final void d(Throwable th) {
        String string;
        if (th == null) {
            this.l = "";
        } else if (!dyab.b(this.a)) {
            this.l = this.a.getResources().getString(com.google.android.apps.maps.R.string.loading_failed_error_message);
        } else {
            if ((th instanceof IOException) || (th instanceof dyjd)) {
                string = this.a.getResources().getString(com.google.android.apps.maps.R.string.network_error_message);
            } else {
                string = this.a.getResources().getString(com.google.android.apps.maps.R.string.loading_failed_error_message);
            }
            this.l = string;
        }
    }
}
