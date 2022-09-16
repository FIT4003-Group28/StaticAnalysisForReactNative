package defpackage;

import android.app.Activity;
import android.util.Pair;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: ahbm  reason: default package */
/* loaded from: classes.dex */
public class ahbm implements ahcy {
    private final afvn a;
    public final Activity b;
    public final yzj c;
    public final yrj d;
    public final agvq e;
    public final ahcz f;
    public final yzv g;
    public final agsd h;
    public final ahdf i;
    private final aguv j;
    private final afwc k;
    private final ahcd l;
    private final aghg m;
    private final agnd n;
    private final Executor o;
    private final agrf p;

    public ahbm(Activity activity, afvn afvnVar, agrf agrfVar, aguv aguvVar, afwc afwcVar, yzj yzjVar, yrj yrjVar, agvq agvqVar, ahcz ahczVar, ahcd ahcdVar, yzv yzvVar, agsd agsdVar, aghg aghgVar, ahdf ahdfVar, agnd agndVar, Executor executor) {
        this.b = activity;
        agrfVar.getClass();
        this.p = agrfVar;
        aguvVar.getClass();
        this.j = aguvVar;
        afwcVar.getClass();
        this.k = afwcVar;
        afvnVar.getClass();
        this.a = afvnVar;
        yzjVar.getClass();
        this.c = yzjVar;
        yrjVar.getClass();
        this.d = yrjVar;
        agvqVar.getClass();
        this.e = agvqVar;
        ahczVar.getClass();
        this.f = ahczVar;
        ahcdVar.getClass();
        this.l = ahcdVar;
        this.g = yzvVar;
        this.h = agsdVar;
        this.m = aghgVar;
        this.i = ahdfVar;
        this.n = agndVar;
        this.o = executor;
    }

    private final void C(String str, attp attpVar, ahcx ahcxVar, acti actiVar, atpy atpyVar, int i) {
        zgh.m(str);
        agqv agqvVar = (agqv) l(str).f();
        if (this.d.o() || i(str, agqvVar)) {
            if (agqvVar != null && (!agqvVar.u() ? agqvVar.e : !agqvVar.y())) {
                if (ahcxVar != null) {
                    ahcxVar.a(str, 1);
                }
                x(1);
                return;
            } else if (attpVar == null) {
                if (ahcxVar != null) {
                    ahcxVar.a(str, 2);
                }
                x(2);
                return;
            } else {
                Object obj = null;
                if (!attpVar.c) {
                    atto attoVar = attpVar.d;
                    if (attoVar == null) {
                        attoVar = atto.a;
                    }
                    if ((2 & attoVar.b) != 0) {
                        atto attoVar2 = attpVar.d;
                        if (attoVar2 == null) {
                            attoVar2 = atto.a;
                        }
                        obj = attoVar2.d;
                        if (obj == null) {
                            obj = avvh.a;
                        }
                    } else {
                        atto attoVar3 = attpVar.d;
                        if (attoVar3 == null) {
                            attoVar3 = atto.a;
                        }
                        if ((attoVar3.b & 1) != 0) {
                            atto attoVar4 = attpVar.d;
                            if (attoVar4 == null) {
                                attoVar4 = atto.a;
                            }
                            obj = attoVar4.c;
                            if (obj == null) {
                                obj = aqmu.a;
                            }
                        }
                    }
                    h(str, obj, actiVar);
                    return;
                } else if (!this.a.t()) {
                    this.k.c(this.b, null, new ahbj(this, str, attpVar, ahcxVar, actiVar, atpyVar, i));
                    return;
                } else {
                    c(str, attpVar, ahcxVar, actiVar, atpyVar, i);
                    return;
                }
            }
        }
        this.g.b();
    }

    public static int s(int i, agvq agvqVar, yrj yrjVar, aghg aghgVar, ahdf ahdfVar) {
        if (yrjVar == null || agvqVar == null) {
            return 0;
        }
        if (i != 0) {
            return i != 1 ? R.string.add_video_to_offline_error : R.string.video_already_added_to_offline;
        }
        awuy w = agvqVar.w();
        return (w != awuy.UNMETERED_WIFI_OR_UNMETERED_MOBILE || yrjVar.r() || (ahdfVar.c() && yrjVar.q())) ? (w != awuy.UNMETERED_WIFI || yrjVar.r()) ? R.string.add_to_offline_start : R.string.add_to_offline_waiting_for_wifi : (!ahdfVar.c() || !aghgVar.a()) ? R.string.add_to_offline_waiting_for_wifi : R.string.add_to_offline_waiting_for_wifi_or_unmetered;
    }

    private final String z(String str) {
        try {
            aqqx aqqxVar = (aqqx) this.n.a(str).get(30L, TimeUnit.SECONDS);
            if (aqqxVar == null) {
                return null;
            }
            return aqqxVar.c;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zep.d("[Offline] Unable to retrieve the DrmErrorInfo.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public atrc b(String str, attl attlVar, String str2, byte[] bArr) {
        return atrc.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(final String str, final attp attpVar, final ahcx ahcxVar, final acti actiVar, atpy atpyVar, final int i) {
        byte[] bArr;
        atpx atpxVar;
        if ((attpVar.b & 128) != 0) {
            bArr = attpVar.i.I();
        } else {
            bArr = aadi.b;
        }
        final byte[] bArr2 = bArr;
        if (this.e.m(attpVar, atpyVar)) {
            this.f.g(str, attpVar, actiVar, new ahdc() { // from class: ahbh
                @Override // defpackage.ahdc
                public final void a(attl attlVar, atpx atpxVar2) {
                    ahbm ahbmVar = ahbm.this;
                    attp attpVar2 = attpVar;
                    acti actiVar2 = actiVar;
                    String str2 = str;
                    byte[] bArr3 = bArr2;
                    ahcx ahcxVar2 = ahcxVar;
                    int i2 = i;
                    ahdq.f(attpVar2, actiVar2, str2, null, attlVar, false, agqn.OFFLINE_IMMEDIATELY, atpxVar2);
                    ahbmVar.j(str2, attlVar, null, agqn.OFFLINE_IMMEDIATELY, bArr3, ahcxVar2, i2);
                }
            });
            return;
        }
        attl u = this.e.u();
        agqn agqnVar = agqn.OFFLINE_IMMEDIATELY;
        if (atpyVar == null || (atpyVar.b & 2) == 0) {
            atpxVar = null;
        } else {
            atpx b = atpx.b(atpyVar.d);
            if (b == null) {
                b = atpx.DOWNLOAD_QUALITY_SETTINGS_ACTION_UNKNOWN;
            }
            atpxVar = b;
        }
        ahdq.f(attpVar, actiVar, str, null, u, true, agqnVar, atpxVar);
        j(str, u, atpyVar != null ? atpyVar.e : null, agqn.OFFLINE_IMMEDIATELY, bArr2, ahcxVar, i);
    }

    @Override // defpackage.ahcy
    public void d(String str, boolean z) {
        A(str, z, a());
    }

    @Override // defpackage.ahcy
    public void e(String str, boolean z) {
        A(aakj.g(str), z, aakj.a(str));
    }

    @Override // defpackage.ahcy
    public void f(agqu agquVar, boolean z) {
        if (z) {
            this.f.f(new ahbl(this));
            return;
        }
        m();
    }

    protected void g(int i) {
        zag.q(this.b, i, 1);
    }

    protected void h(String str, Object obj, acti actiVar) {
        r(str, obj, actiVar);
    }

    protected boolean i(String str, agqv agqvVar) {
        return agqvVar != null && agqvVar.s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(String str, attl attlVar, String str2, agqn agqnVar, byte[] bArr, ahcx ahcxVar, int i) {
        if (!this.i.m() || i == 0) {
            int a = k().m().a(str, attlVar, agqnVar, bArr, -1);
            if (ahcxVar != null) {
                ahcxVar.a(str, a);
            }
            x(a);
            return;
        }
        y(str, attlVar, str2, bArr, ahcxVar, i);
    }

    public final agvx k() {
        return this.p.a();
    }

    public final ampq l(String str) {
        try {
            return (ampq) k().m().h(str).get(30L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zep.d("[Offline] Unable to retrieve the offlineVideoSnapshot.", e);
            return amon.a;
        }
    }

    public final void m() {
        this.j.c(this.p.d());
    }

    @Override // defpackage.ahcy
    public final void n(String str, String str2, ahcx ahcxVar, boolean z) {
        B(str, str2, ahcxVar, z, a());
    }

    @Override // defpackage.ahcy
    public final void o(String str, attp attpVar, ahcx ahcxVar, acti actiVar, atpy atpyVar) {
        C(str, attpVar, ahcxVar, actiVar, atpyVar, a());
    }

    public final void p(String str, int i) {
        if (!this.i.m() || i == 0) {
            k().m().y(str);
            return;
        }
        try {
            agsd agsdVar = this.h;
            aopa createBuilder = atrf.a.createBuilder();
            createBuilder.copyOnWrite();
            atrf atrfVar = (atrf) createBuilder.instance;
            atrfVar.c = 2;
            atrfVar.b |= 1;
            String f = aakj.f(i, str);
            createBuilder.copyOnWrite();
            atrf atrfVar2 = (atrf) createBuilder.instance;
            f.getClass();
            atrfVar2.b |= 2;
            atrfVar2.d = f;
            agsdVar.d((atrf) createBuilder.mo39build());
        } catch (agse e) {
            String valueOf = String.valueOf(e.getMessage());
            zep.b(valueOf.length() != 0 ? "[Offline] Couldn't delete: ".concat(valueOf) : new String("[Offline] Couldn't delete: "));
        }
    }

    public final void q(String str, String str2, ahcx ahcxVar, int i) {
        if (this.d.o()) {
            int i2 = 2;
            if (amps.e(str) || str.equals("PPSV")) {
                if (!this.i.m() || i == 0) {
                    i2 = k().m().b(str2);
                } else {
                    ampq l = l(str2);
                    if (l.h() && ((agqv) l.c()).z()) {
                        i2 = k().m().b(str2);
                    } else {
                        try {
                            agsd agsdVar = this.h;
                            aopa createBuilder = atrf.a.createBuilder();
                            createBuilder.copyOnWrite();
                            atrf atrfVar = (atrf) createBuilder.instance;
                            atrfVar.c = 1;
                            atrfVar.b = 1 | atrfVar.b;
                            String f = aakj.f(i, str2);
                            createBuilder.copyOnWrite();
                            atrf atrfVar2 = (atrf) createBuilder.instance;
                            f.getClass();
                            atrfVar2.b |= 2;
                            atrfVar2.d = f;
                            attl u = this.e.u();
                            if (l.h()) {
                                agqv agqvVar = (agqv) l.c();
                            }
                            atrc b = b(str2, u, null, aadi.b);
                            createBuilder.copyOnWrite();
                            atrf atrfVar3 = (atrf) createBuilder.instance;
                            b.getClass();
                            atrfVar3.e = b;
                            atrfVar3.b |= 4;
                            agsdVar.d((atrf) createBuilder.mo39build());
                            i2 = 0;
                        } catch (agse e) {
                            String valueOf = String.valueOf(e.getMessage());
                            zep.b(valueOf.length() != 0 ? "[Offline] Couldn't retry video: ".concat(valueOf) : new String("[Offline] Couldn't retry video: "));
                        }
                    }
                }
            } else {
                i2 = k().i().b(str, str2);
            }
            if (ahcxVar != null) {
                ahcxVar.a(str2, i2);
            }
            agqn agqnVar = agqn.OFFLINE_IMMEDIATELY;
            x(i2);
            return;
        }
        this.g.b();
    }

    @Override // defpackage.ahcy
    public final void r(final String str, Object obj, acti actiVar) {
        final int a = a();
        this.l.a(obj, actiVar, l(str).h() ? new Pair(this.b.getString(R.string.remove_offline_confirmed_button), new Runnable() { // from class: ahbi
            @Override // java.lang.Runnable
            public final void run() {
                ahbm.this.p(str, a);
            }
        }) : null, null);
    }

    @Override // defpackage.ahcy
    public final void t() {
        this.f.l(new ahdb() { // from class: ahbe
            @Override // defpackage.ahdb
            public final void a() {
                ahbm ahbmVar = ahbm.this;
                int a = ahbmVar.a();
                if (!ahbmVar.d.o()) {
                    ahbmVar.g.b();
                    return;
                }
                HashSet hashSet = new HashSet();
                for (agqo agqoVar : ahbmVar.k().m().l()) {
                    if (hashSet.add(agqoVar.f())) {
                        ampq l = ahbmVar.l(agqoVar.f());
                        if (!l.h()) {
                            return;
                        }
                        agqv agqvVar = (agqv) l.c();
                        if (agqvVar.t()) {
                            if (!ahbmVar.i.m() || a == 0) {
                                ahbmVar.k().m().b(agqvVar.m());
                            } else {
                                try {
                                    agsd agsdVar = ahbmVar.h;
                                    aopa createBuilder = atrf.a.createBuilder();
                                    createBuilder.copyOnWrite();
                                    atrf atrfVar = (atrf) createBuilder.instance;
                                    atrfVar.c = 1;
                                    atrfVar.b = 1 | atrfVar.b;
                                    String f = aakj.f(a, agqvVar.m());
                                    createBuilder.copyOnWrite();
                                    atrf atrfVar2 = (atrf) createBuilder.instance;
                                    f.getClass();
                                    atrfVar2.b |= 2;
                                    atrfVar2.d = f;
                                    atrc b = ahbmVar.b(agqvVar.m(), ahbmVar.e.u(), null, aadi.b);
                                    createBuilder.copyOnWrite();
                                    atrf atrfVar3 = (atrf) createBuilder.instance;
                                    b.getClass();
                                    atrfVar3.e = b;
                                    atrfVar3.b |= 4;
                                    agsdVar.d((atrf) createBuilder.mo39build());
                                } catch (agse e) {
                                    String valueOf = String.valueOf(e.getMessage());
                                    zep.b(valueOf.length() != 0 ? "[Offline] Couldn't retry video: ".concat(valueOf) : new String("[Offline] Couldn't retry video: "));
                                }
                            }
                        }
                    }
                }
            }
        });
    }

    @Override // defpackage.ahcy
    public final void u(final String str, final String str2) {
        zgh.m(str2);
        ampq l = l(str2);
        if (!l.h() || !((agqv) l.c()).a()) {
            return;
        }
        this.f.o(new ahdb() { // from class: ahbf
            @Override // defpackage.ahdb
            public final void a() {
                ahbm ahbmVar = ahbm.this;
                ahbmVar.q(str, str2, null, ahbmVar.a());
            }
        });
    }

    @Override // defpackage.ahcy
    public final void v(String str, String str2) {
        B(str, aakj.g(str2), null, true, aakj.a(str2));
    }

    @Override // defpackage.ahcy
    public final void w(String str, attp attpVar, acti actiVar, atpy atpyVar) {
        C(aakj.g(str), attpVar, null, actiVar, atpyVar, aakj.a(str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(int i) {
        int s = s(i, this.e, this.d, this.m, this.i);
        if (s != 0) {
            g(s);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y(String str, attl attlVar, String str2, byte[] bArr, ahcx ahcxVar, int i) {
        int i2 = 2;
        try {
            zep.h("[Offline] offline", "trying to add video");
            agsd agsdVar = this.h;
            aopa createBuilder = atrf.a.createBuilder();
            createBuilder.copyOnWrite();
            atrf atrfVar = (atrf) createBuilder.instance;
            atrfVar.c = 1;
            atrfVar.b = 1 | atrfVar.b;
            String f = aakj.f(i, str);
            createBuilder.copyOnWrite();
            atrf atrfVar2 = (atrf) createBuilder.instance;
            f.getClass();
            atrfVar2.b |= 2;
            atrfVar2.d = f;
            atrc b = b(str, attlVar, str2, bArr);
            createBuilder.copyOnWrite();
            atrf atrfVar3 = (atrf) createBuilder.instance;
            b.getClass();
            atrfVar3.e = b;
            atrfVar3.b |= 4;
            agsdVar.d((atrf) createBuilder.mo39build());
            i2 = 0;
        } catch (agse e) {
            String valueOf = String.valueOf(e.getMessage());
            zep.c("[Offline] offline", valueOf.length() != 0 ? "Couldn't add: ".concat(valueOf) : new String("Couldn't add: "));
        }
        if (ahcxVar != null) {
            ahcxVar.a(str, i2);
        }
        x(i2);
    }

    private final void B(final String str, final String str2, final ahcx ahcxVar, boolean z, final int i) {
        if (!z) {
            q(str, str2, ahcxVar, i);
            return;
        }
        zgh.m(str2);
        agqv agqvVar = (agqv) l(str2).f();
        if (agqvVar != null && ((!agqvVar.u() || !agqvVar.y()) && !agqvVar.z())) {
            return;
        }
        ahdb ahdbVar = new ahdb() { // from class: ahbg
            @Override // defpackage.ahdb
            public final void a() {
                ahbm.this.q(str, str2, ahcxVar, i);
            }
        };
        String z2 = z(str2);
        if (!amps.e(z2)) {
            this.f.n(ahdbVar, z2);
        } else {
            this.f.m(ahdbVar);
        }
    }

    private final void A(String str, boolean z, int i) {
        if (!z) {
            zgh.m(str);
            if (!l(str).h()) {
                return;
            }
            p(str, i);
            return;
        }
        zgh.m(str);
        ampq l = l(str);
        if (!l.h()) {
            return;
        }
        agqv agqvVar = (agqv) l.c();
        final ahbk ahbkVar = new ahbk(this, str, i);
        if (agqvVar.l == agqe.ACTIVE || agqvVar.l == agqe.PAUSED) {
            this.f.q(ahbkVar);
            return;
        }
        String z2 = z(str);
        if (!amps.e(z2)) {
            this.f.k(ahbkVar, this.b.getResources().getString(R.string.offline_dialog_download_failed), z2);
        } else {
            ylx.k(this.n.b(str), this.o, new ylv() { // from class: ahbc
                @Override // defpackage.zdt
                /* renamed from: b */
                public final void a(Throwable th) {
                    ahbm ahbmVar = ahbm.this;
                    ahda ahdaVar = ahbkVar;
                    zep.b("Failed to determine if the video is an expired rental.");
                    ahbmVar.f.j(ahdaVar);
                }
            }, new ylw() { // from class: ahbd
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    ahbm ahbmVar = ahbm.this;
                    ahda ahdaVar = ahbkVar;
                    if (((Boolean) obj).booleanValue()) {
                        ahbmVar.f.k(ahdaVar, ahbmVar.b.getResources().getString(R.string.rental_expired_dialog_title), ahbmVar.b.getResources().getString(R.string.rental_expired_dialog_message));
                    } else {
                        ahbmVar.f.j(ahdaVar);
                    }
                }
            });
        }
    }
}
