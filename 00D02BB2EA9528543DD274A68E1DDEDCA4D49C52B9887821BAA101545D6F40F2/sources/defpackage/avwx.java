package defpackage;

import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: avwx  reason: default package */
/* loaded from: classes3.dex */
public class avwx implements avwq {
    public final avwp a;
    public final dxio<avik> b;
    public dltm c;
    public final avuk d;
    private final ges e;
    private final avzo f;
    private final avzp g;
    private int h;

    public avwx(ges gesVar, avwp avwpVar, dltm dltmVar, dxio<avik> dxioVar, avzp avzpVar, avuk avukVar, avzo avzoVar) {
        this.e = gesVar;
        this.a = avwpVar;
        this.c = dltmVar;
        this.h = avzoVar.b(dltmVar);
        this.b = dxioVar;
        this.g = avzpVar;
        this.d = avukVar;
        this.f = avzoVar;
    }

    @Override // defpackage.avwq
    public Boolean a() {
        int i = this.h;
        boolean z = true;
        if (i != 9 && i != 10) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.avwq
    public Boolean b() {
        int i = this.h;
        boolean z = true;
        if (i != 5 && i != 7) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.avwq
    public jht c() {
        String Rp;
        dcdc f;
        if (this.e.aD) {
            jhu h = jhv.h();
            dccx F = dcdc.F();
            if (!j().booleanValue()) {
                f = F.f();
            } else {
                int i = this.h;
                if (i == 8) {
                    jhm jhmVar = new jhm();
                    jhmVar.a = this.e.Rp(R.string.OFFLINE_MENU_UPDATE_AREA);
                    jhmVar.f = cjtd.a(dtxx.aE);
                    jhmVar.d(new View.OnClickListener(this) { // from class: avws
                        private final avwx a;

                        {
                            this.a = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            avwx avwxVar = this.a;
                            avwxVar.d.c(avwxVar.c);
                        }
                    });
                    F.g(jhmVar.c());
                } else if (i == 9 || i == 10 || i == 1) {
                    jhm jhmVar2 = new jhm();
                    jhmVar2.a = this.e.Rp(R.string.OFFLINE_MENU_DOWNLOAD_AREA);
                    jhmVar2.f = cjtd.a(dtxx.aB);
                    jhmVar2.d(new View.OnClickListener(this) { // from class: avwt
                        private final avwx a;

                        {
                            this.a = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            avwx avwxVar = this.a;
                            avwxVar.d.c(avwxVar.c);
                        }
                    });
                    F.g(jhmVar2.c());
                }
                jhm jhmVar3 = new jhm();
                jhmVar3.a = this.e.Rp(R.string.OFFLINE_MENU_VIEW_AREA);
                jhmVar3.f = cjtd.a(dtxx.aF);
                jhmVar3.d(new View.OnClickListener(this) { // from class: avwu
                    private final avwx a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        avwx avwxVar = this.a;
                        avwxVar.b.a().l(avwxVar.c);
                    }
                });
                F.g(jhmVar3.c());
                jhm jhmVar4 = new jhm();
                jhmVar4.a = this.e.Rp(R.string.OFFLINE_MENU_RENAME_AREA);
                jhmVar4.f = cjtd.a(dtxx.aD);
                jhmVar4.d(new View.OnClickListener(this) { // from class: avwv
                    private final avwx a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        avwx avwxVar = this.a;
                        avwxVar.b.a().q(avwxVar.c);
                    }
                });
                F.g(jhmVar4.c());
                jhm jhmVar5 = new jhm();
                if (this.h == 1) {
                    Rp = this.e.Rp(R.string.OFFLINE_MENU_REMOVE_AREA);
                } else {
                    Rp = this.e.Rp(R.string.OFFLINE_MENU_DELETE_AREA);
                }
                jhmVar5.a = Rp;
                jhmVar5.f = this.d.b(this.c, dtxx.aA);
                jhmVar5.d(new View.OnClickListener(this) { // from class: avww
                    private final avwx a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        avwx avwxVar = this.a;
                        avwxVar.d.a(avwxVar.c, null);
                    }
                });
                F.g(jhmVar5.c());
                f = F.f();
            }
            h.e(f);
            ((jhi) h).e = this.e.Rq(R.string.OFFLINE_AREA_OVERFLOW_MENU_DESCRIPTION, this.c.a);
            return h.b();
        }
        jhu h2 = jhv.h();
        h2.d(new jhm().c());
        return h2.b();
    }

    @Override // defpackage.jbf
    public cqtd d() {
        return this.g.a(this.c, false);
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        if (this.e.aD) {
            this.b.a().l(this.c);
        }
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    public cjtd h() {
        return cjtd.a(dtxx.bB);
    }

    @Override // defpackage.avwq
    public View.OnTouchListener i() {
        return new View.OnTouchListener(this) { // from class: avwr
            private final avwx a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                avwx avwxVar = this.a;
                int action = motionEvent.getAction();
                if (action == 0) {
                    avwxVar.a.a();
                    return false;
                } else if (action != 1 && action != 3) {
                    return false;
                } else {
                    avwxVar.a.b();
                    return false;
                }
            }
        };
    }

    @Override // defpackage.avwq
    public Boolean j() {
        return true;
    }

    @Override // defpackage.avwq
    @dzsi
    public Spannable k(bvsx bvsxVar, cklf cklfVar) {
        boolean z = false;
        boolean z2 = false;
        for (dluu dluuVar : this.c.l) {
            int a = dlut.a(dluuVar.a);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                z = true;
            } else if (i != 2) {
                if (i == 3) {
                    return bvsxVar.c(R.string.LOCATION_HISTORY).c();
                }
                if (i == 4) {
                    return bvsxVar.c(R.string.LOCATION_USING_MAPS).c();
                }
                if (i != 5) {
                    return null;
                }
                bvsu c = bvsxVar.c(R.string.SOURCE_TRIPS);
                c.k(cklfVar.e("android_offline_maps_trips"));
                return c.c();
            } else {
                z2 = true;
            }
        }
        if (!z || !z2) {
            if (z) {
                return bvsxVar.c(R.string.HOME).c();
            }
            if (!z2) {
                return null;
            }
            return bvsxVar.c(R.string.WORK).c();
        }
        return bvsxVar.c(R.string.HOME_AND_WORK).c();
    }

    @Override // defpackage.jbf
    public CharSequence l() {
        if (!this.e.aD) {
            return "";
        }
        avzp avzpVar = this.g;
        dltm dltmVar = this.c;
        return dltmVar.r ? avzpVar.c(dltmVar, false, false) : avzpVar.d(dltmVar);
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        return this.c.a;
    }

    @Override // defpackage.avwq
    @dzsi
    public String n() {
        avzp avzpVar = this.g;
        int b = avzpVar.c.b(this.c) - 1;
        if (b == 8 || b == 9) {
            return avzpVar.a.getString(R.string.OFFINE_ALERT_SEVERITY_CONTENT_DESCRIPTION);
        }
        return null;
    }

    public dspd o() {
        return this.c.b;
    }

    public String p() {
        return this.c.a;
    }

    public void q(dltm dltmVar) {
        this.c = dltmVar;
        this.h = this.f.b(dltmVar);
        cqkx.p(this);
    }
}
