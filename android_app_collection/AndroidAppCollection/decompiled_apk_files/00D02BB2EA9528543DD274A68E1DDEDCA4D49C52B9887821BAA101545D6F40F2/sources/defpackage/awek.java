package defpackage;

import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awek  reason: default package */
/* loaded from: classes3.dex */
final class awek implements Runnable {
    final /* synthetic */ awet a;

    public awek(awet awetVar) {
        this.a = awetVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final awet awetVar = this.a;
        final akqs a = awetVar.k.a(awetVar.f);
        if (a == null) {
            return;
        }
        final awhd awhdVar = awetVar.m;
        degp<dloe> x = awetVar.b.x();
        final Executor executor = awetVar.e;
        bvqj.c(deew.g(degp.q(x), new defg(awhdVar, a, executor) { // from class: awgw
            private final awhd a;
            private final akqs b;
            private final Executor c;

            {
                this.a = awhdVar;
                this.b = a;
                this.c = executor;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                awhd awhdVar2 = this.a;
                akqs akqsVar = this.b;
                Executor executor2 = this.c;
                dloe dloeVar = (dloe) obj;
                deig d = deig.d();
                avqd avqdVar = awhdVar2.a;
                akqq j = akqsVar.j();
                akqq k = akqsVar.k();
                deig d2 = deig.d();
                if (!avqdVar.f) {
                    avqdVar.f = true;
                    avqdVar.e = avqdVar.a.a().a().a.b;
                }
                boolean z = btlu.i(avqdVar.c.j()).equals(btlt.GOOGLE) && avqdVar.e;
                buac a2 = avqdVar.a.a();
                btyq btyqVar = avqdVar.a.a().a().a;
                dsqp dsqpVar = (dsqp) btyqVar.cu(5);
                dsqpVar.bC(btyqVar);
                btyp btypVar = (btyp) dsqpVar;
                if (btypVar.c) {
                    btypVar.bF();
                    btypVar.c = false;
                }
                btyq btyqVar2 = (btyq) btypVar.b;
                btyqVar2.a = 1 | btyqVar2.a;
                btyqVar2.b = z;
                a2.a = btypVar.bK();
                avqdVar.d.execute(new Runnable(avqdVar, j, k, dloeVar, d2) { // from class: avqb
                    private final avqd a;
                    private final akqq b;
                    private final akqq c;
                    private final dloe d;
                    private final deig e;

                    {
                        this.a = avqdVar;
                        this.b = j;
                        this.c = k;
                        this.d = dloeVar;
                        this.e = d2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        avqd avqdVar2 = this.a;
                        akqq akqqVar = this.b;
                        akqq akqqVar2 = this.c;
                        dloe dloeVar2 = this.d;
                        deig deigVar = this.e;
                        dvgb bZ = dvgc.e.bZ();
                        dvfc a3 = avqdVar2.b.a().a();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dvgc dvgcVar = (dvgc) bZ.b;
                        a3.getClass();
                        dvgcVar.c = a3;
                        dvgcVar.a |= 2;
                        dlud bZ2 = dlug.c.bZ();
                        dlub bZ3 = dluc.d.bZ();
                        dwzj r = akqqVar.r();
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dluc dlucVar = (dluc) bZ3.b;
                        r.getClass();
                        dlucVar.b = r;
                        dlucVar.a |= 1;
                        dwzj r2 = akqqVar2.r();
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dluc dlucVar2 = (dluc) bZ3.b;
                        r2.getClass();
                        dlucVar2.c = r2;
                        dlucVar2.a |= 2;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dlug dlugVar = (dlug) bZ2.b;
                        dluc bK = bZ3.bK();
                        bK.getClass();
                        dlugVar.b = bK;
                        dlugVar.a = 1;
                        dlug bK2 = bZ2.bK();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dvgc dvgcVar2 = (dvgc) bZ.b;
                        bK2.getClass();
                        dvgcVar2.b = bK2;
                        int i = dvgcVar2.a | 1;
                        dvgcVar2.a = i;
                        dloeVar2.getClass();
                        dvgcVar2.d = dloeVar2;
                        dvgcVar2.a = i | 4;
                        avqdVar2.a.c().b(bZ.bK(), new avqc(deigVar), avqdVar2.d);
                    }
                });
                deha.q(degp.q(d2), new awha(awhdVar2, d), executor2);
                return d;
            }
        }, executor), new bvqg(awetVar) { // from class: aweh
            private final awet a;

            {
                this.a = awetVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                String string;
                awet awetVar2 = this.a;
                awhb awhbVar = (awhb) obj;
                if (awhbVar.a()) {
                    TextView textView = awetVar2.i;
                    awgu awguVar = awetVar2.j;
                    long b = awhbVar.b();
                    textView.setText(awguVar.a.getResources().getString(R.string.OFFLINE_ACCURATE_DOWNLOAD_SIZE, Long.valueOf(b + (5 - (b % 5)))));
                } else {
                    TextView textView2 = awetVar2.i;
                    awgu awguVar2 = awetVar2.j;
                    long b2 = awhbVar.b();
                    if (awguVar2.a.getResources().getConfiguration().orientation == 1) {
                        String string2 = awguVar2.a.getResources().getString(R.string.OFFLINE_ONBOARDING_DOWNLOAD_SIZE, Long.valueOf(b2));
                        String string3 = awguVar2.a.getResources().getString(true != awguVar2.b ? R.string.OFFLINE_ONBOARDING_AVAILABLE_SIZE : R.string.OFFLINE_ONBOARDING_AVAILABLE_SIZE_SD, Long.valueOf(awguVar2.c));
                        StringBuilder sb = new StringBuilder(String.valueOf(string2).length() + 3 + String.valueOf(string3).length());
                        sb.append(string2);
                        sb.append("\n(");
                        sb.append(string3);
                        sb.append(")");
                        string = sb.toString();
                    } else {
                        string = awguVar2.a.getResources().getString(true != awguVar2.b ? R.string.OFFLINE_SELECT_AREA_SIZE_STRING_LANDSCAPE : R.string.OFFLINE_SELECT_AREA_SIZE_STRING_LANDSCAPE_SD, Long.valueOf(b2), Long.valueOf(awguVar2.c));
                    }
                    textView2.setText(string);
                }
                if (awetVar2.q) {
                    awetVar2.i.setVisibility(0);
                }
                cqkx.p(awetVar2);
            }
        }, awetVar.e);
    }
}
