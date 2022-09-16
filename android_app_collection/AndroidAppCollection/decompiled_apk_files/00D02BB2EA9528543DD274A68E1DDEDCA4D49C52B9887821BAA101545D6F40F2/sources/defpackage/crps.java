package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.reporting.SendDataRequest;
import com.google.android.gms.location.reporting.UploadRequest;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: crps  reason: default package */
/* loaded from: classes5.dex */
public final class crps {
    private static final long f = TimeUnit.HOURS.toMillis(1);
    public final Account a;
    public final GoogleApiClient b;
    public final ckcw c;
    public final dehq d;
    public final corc e;
    private final Map<Object, cnoh<?>> g = new dzqz();
    private boolean h;
    private int i;
    private long j;
    private int k;

    public crps(Account account, GoogleApiClient googleApiClient, corc corcVar, ckcw ckcwVar, dehq dehqVar) {
        this.a = account;
        this.b = googleApiClient;
        this.e = corcVar;
        this.c = ckcwVar;
        this.d = dehqVar;
    }

    public final synchronized void a(int i) {
        ((ckcm) this.c.a(ckhj.g)).a(true);
        this.i++;
        this.j += i;
    }

    public final synchronized void b() {
        ((ckcm) this.c.a(ckhj.g)).a(false);
        this.k++;
    }

    public final synchronized boolean c() {
        return this.h;
    }

    final synchronized int d() {
        return ((dzqz) this.g).h;
    }

    public final synchronized void e(Object obj, cnoh<?> cnohVar) {
        this.g.put(obj, cnohVar);
    }

    public final synchronized void f(Object obj) {
        this.g.remove(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g(ddwd ddwdVar) {
        final dbsi dbsiVar;
        if (d() >= 3) {
            ((ckcn) this.c.a(ckhj.h)).a();
            b();
            return;
        }
        final int i = ddwdVar.bE;
        if (i == -1) {
            i = dsst.a.b(ddwdVar).e(ddwdVar);
            ddwdVar.bE = i;
        }
        final ckcm ckcmVar = (ckcm) this.c.a(ckhj.s);
        SendDataRequest sendDataRequest = new SendDataRequest("GMMNAV", ddwdVar.bS());
        try {
            GoogleApiClient googleApiClient = this.b;
            dbsiVar = dbsi.a(sendDataRequest, googleApiClient.execute(new coqz(googleApiClient, this.a, sendDataRequest)));
        } catch (IllegalStateException e) {
            if (String.valueOf(e.getMessage()).length() == 0) {
                new String("NAVLOG: ULR sendData threw: ");
            }
            bvoo.j(e);
            dbsiVar = null;
        }
        if (dbsiVar == null) {
            ckcmVar.a(false);
            ((ckcn) this.c.a(ckhj.u)).a();
            b();
            return;
        }
        e(dbsiVar.a, (cnoh) dbsiVar.b);
        ((cnoh) dbsiVar.b).i(new cnon(this, dbsiVar, ckcmVar, i) { // from class: crpp
            private final crps a;
            private final dbsi b;
            private final ckcm c;
            private final int d;

            {
                this.a = this;
                this.b = dbsiVar;
                this.c = ckcmVar;
                this.d = i;
            }

            @Override // defpackage.cnon
            public final void Om(cnom cnomVar) {
                final crps crpsVar = this.a;
                dbsi dbsiVar2 = this.b;
                ckcm ckcmVar2 = this.c;
                final int i2 = this.d;
                Status status = (Status) cnomVar;
                crpsVar.f(dbsiVar2.a);
                if (!status.d()) {
                    ckcmVar2.a(false);
                    ((ckco) crpsVar.c.a(ckhj.t)).a(status.g);
                    crpsVar.b();
                    int i3 = status.g;
                    return;
                }
                ckcmVar2.a(true);
                if (crpsVar.c()) {
                    crpsVar.b();
                } else {
                    crpsVar.d.execute(new Runnable(crpsVar, i2) { // from class: crpq
                        private final crps a;
                        private final int b;

                        {
                            this.a = crpsVar;
                            this.b = i2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            final dbsi dbsiVar3;
                            final crps crpsVar2 = this.a;
                            final int i4 = this.b;
                            final ckcm ckcmVar3 = (ckcm) crpsVar2.c.a(ckhj.v);
                            coqo a = UploadRequest.a(crpsVar2.a, "Navlogs", 0L);
                            a.b(0L);
                            a.f = "GMM";
                            UploadRequest a2 = a.a();
                            try {
                                dbsiVar3 = dbsi.a(a2, corc.d(crpsVar2.b, a2));
                            } catch (IllegalStateException e2) {
                                if (String.valueOf(e2.getMessage()).length() == 0) {
                                    new String("NAVLOG: ULR requestUpload threw: ");
                                }
                                bvoo.j(e2);
                                dbsiVar3 = null;
                            }
                            if (dbsiVar3 == null) {
                                ckcmVar3.a(false);
                                ((ckcn) crpsVar2.c.a(ckhj.x)).a();
                                crpsVar2.b();
                                return;
                            }
                            crpsVar2.e(dbsiVar3.a, (cnoh) dbsiVar3.b);
                            ((cnoh) dbsiVar3.b).i(new cnon(crpsVar2, dbsiVar3, ckcmVar3, i4) { // from class: crpr
                                private final crps a;
                                private final dbsi b;
                                private final ckcm c;
                                private final int d;

                                {
                                    this.a = crpsVar2;
                                    this.b = dbsiVar3;
                                    this.c = ckcmVar3;
                                    this.d = i4;
                                }

                                @Override // defpackage.cnon
                                public final void Om(cnom cnomVar2) {
                                    crps crpsVar3 = this.a;
                                    dbsi dbsiVar4 = this.b;
                                    ckcm ckcmVar4 = this.c;
                                    int i5 = this.d;
                                    corb corbVar = (corb) cnomVar2;
                                    crpsVar3.f(dbsiVar4.a);
                                    if (!corbVar.a.d()) {
                                        int i6 = corbVar.a.g;
                                        crpsVar3.b();
                                        ckcmVar4.a(false);
                                        ((ckco) crpsVar3.c.a(ckhj.w)).a(corbVar.a.g);
                                        return;
                                    }
                                    ckcmVar4.a(true);
                                    crpsVar3.a(i5);
                                }
                            });
                        }
                    });
                }
            }
        });
    }

    public final synchronized void h() {
        dbsk.l(!this.h);
        this.h = true;
        ((ckcn) this.c.a(ckhj.i)).b(d());
        ArrayList arrayList = new ArrayList(((dznt) this.g).values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cnoh) arrayList.get(i)).h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void i(StringBuilder sb, long j) {
        if (j == 0) {
            return;
        }
        int d = d();
        sb.append(", ULR successful sends: ");
        sb.append(this.i);
        sb.append(" (");
        long j2 = f;
        sb.append((this.i * j2) / j);
        sb.append(" per hour)");
        sb.append(", ULR successful bytes: ");
        sb.append(this.j);
        sb.append(" (");
        sb.append((this.j * j2) / j);
        sb.append(" per hour)");
        sb.append(", ULR failed sends: ");
        sb.append(this.k);
        sb.append(" (");
        sb.append((this.k * j2) / j);
        sb.append(" per hour)");
        sb.append(", ULR in-flight sends: ");
        sb.append(d);
    }
}
