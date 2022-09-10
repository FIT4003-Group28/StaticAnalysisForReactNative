package defpackage;

import android.content.res.Resources;
import android.media.MediaPlayer;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crde  reason: default package */
/* loaded from: classes5.dex */
public final class crde implements crdg, crec {
    public final bvrb a;
    public final crbk b;
    public final crfj c;
    public final crbr d;
    @dzsi
    public crbc e;
    @dzsi
    public final cree f;
    public final crej g;
    public boolean h;
    @dzsi
    public Runnable i;
    private final crem k;
    private final crco l;
    private final Resources m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private boolean q;
    private final Runnable r = new crdc(this);
    public final crbb j = new crdd(this);

    public crde(bvrb bvrbVar, crbk crbkVar, crem cremVar, crfj crfjVar, crej crejVar, @dzsi cree creeVar, Resources resources, crer crerVar, crco crcoVar) {
        this.a = bvrbVar;
        this.b = crbkVar;
        this.k = cremVar;
        this.c = crfjVar;
        this.g = crejVar;
        this.f = creeVar;
        this.m = resources;
        this.l = crcoVar;
        this.d = crbkVar.r();
        synchronized (crbkVar) {
            this.n = crerVar.a;
            this.o = crerVar.b;
            this.p = crbkVar.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        synchronized (this.b) {
            if (c(true)) {
                d();
            } else {
                e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        synchronized (this.b) {
            crbc crbcVar = this.e;
            if (crbcVar != null) {
                crbcVar.c();
            }
            this.h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(boolean z) {
        crea creaVar;
        crbc a;
        crbc a2;
        long[] jArr;
        long[] jArr2;
        crdx crdxVar;
        this.c.e();
        if (this.e != null) {
            return true;
        }
        if ((!z && this.i != null) || this.h) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        if (this.c.e == crfi.SILENT) {
            this.e = this.l.a(this.m, R.raw.silence, cres.NORMAL);
            return true;
        } else if (this.c.e == crfi.DELAY) {
            this.e = new crci(Long.parseLong(this.c.e()));
            return true;
        } else {
            crbc crbcVar = null;
            if (this.c.e == crfi.URI) {
                crco crcoVar = this.l;
                String str = this.c.c;
                dbsk.s(str);
                MediaPlayer mediaPlayer = new MediaPlayer();
                mediaPlayer.setOnErrorListener(crcr.a);
                mediaPlayer.setOnInfoListener(crcr.b);
                try {
                    mediaPlayer.setDataSource(str);
                    mediaPlayer.setAudioStreamType(3);
                    crbcVar = ((crcr) crcoVar).c(mediaPlayer, cres.NORMAL, 3);
                } catch (Exception e) {
                    bvoo.j(e);
                    mediaPlayer.release();
                }
                this.e = crbcVar;
                return true;
            } else if (this.c.e == crfi.PREROLL_SOUND_ONLY) {
                if (this.k.h(this.g)) {
                    return false;
                }
                this.e = this.b.b.a(this.c);
                return true;
            } else {
                if (this.n && this.p) {
                    crbl crblVar = this.b.c;
                    crfj crfjVar = this.c;
                    amut amutVar = crfjVar.f;
                    if (amutVar == null) {
                        crdxVar = null;
                    } else {
                        crfi crfiVar = crfjVar.e;
                        amuo a3 = amutVar.a();
                        if (crfiVar == crfi.ERROR) {
                            jArr2 = crdy.e;
                        } else if (amux.c(a3.d)) {
                            dpdn dpdnVar = dpdn.SIDE_LEFT;
                            int ordinal = a3.e.ordinal();
                            jArr2 = ordinal != 0 ? ordinal != 1 ? crdy.d : crdy.c : crdy.b;
                        } else {
                            jArr2 = crdy.f;
                        }
                        crdxVar = new crdx(((crdy) crblVar).a, jArr2);
                    }
                    crce.a(crdxVar, arrayList);
                }
                if (this.o) {
                    creb crebVar = this.b.i;
                    crfj crfjVar2 = this.c;
                    dpdn dpdnVar2 = dpdn.SIDE_LEFT;
                    int ordinal2 = crfjVar2.e.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            jArr = creb.f;
                        } else {
                            amut amutVar2 = crfjVar2.f;
                            if (amutVar2 == null) {
                                jArr = creb.f;
                            } else {
                                crfi crfiVar2 = crfjVar2.e;
                                amuo a4 = amutVar2.a();
                                if (crfiVar2 == crfi.ERROR) {
                                    jArr = creb.d;
                                } else if (amux.c(a4.d)) {
                                    int ordinal3 = a4.e.ordinal();
                                    if (ordinal3 == 0) {
                                        jArr = creb.a;
                                    } else if (ordinal3 == 1) {
                                        jArr = creb.b;
                                    } else if (ordinal3 == 2) {
                                        jArr = creb.c;
                                    }
                                }
                            }
                        }
                        creaVar = new crea(crebVar.g, jArr);
                    }
                    jArr = creb.e;
                    creaVar = new crea(crebVar.g, jArr);
                } else {
                    creaVar = new crea(this.b.i.g, creb.f);
                }
                crce.a(creaVar, arrayList);
                if (!this.k.h(this.g)) {
                    crce.a(this.b.b.a(this.c), arrayList);
                    crdi a5 = this.b.k.a();
                    if ((!this.g.k.a && !this.b.o() && crbk.l.contains(this.c.e)) || !this.b.f.z(bvjk.eK, "").isEmpty()) {
                        a = null;
                    } else if (a5.d(this.c)) {
                        a = a5.a(this.c);
                    } else if (z) {
                        a = a5.a(this.c);
                        if (a == null) {
                            this.b.g.e();
                        }
                    } else {
                        a5.e(this.c, this, cksq.NOW);
                        this.b.s().a(this.c);
                        return false;
                    }
                    if (a == null) {
                        a = this.b.s().a(this.c);
                    }
                    if (a == null) {
                        if (!z) {
                            return false;
                        }
                        crbl crblVar2 = this.b.a;
                        crfj crfjVar3 = this.c;
                        crcj crcjVar = (crcj) crblVar2;
                        cres a6 = cres.a(crcjVar.c);
                        int ordinal4 = crfjVar3.e.ordinal();
                        if (ordinal4 == 0) {
                            a2 = crcjVar.b.a(crcjVar.a, R.raw.da_prepare, a6);
                        } else if (ordinal4 == 1) {
                            a2 = crcjVar.b.a(crcjVar.a, R.raw.da_act, a6);
                        } else if (ordinal4 != 3) {
                            a2 = ordinal4 != 6 ? null : crcjVar.b.a(crcjVar.a, R.raw.test_sound, a6);
                        } else {
                            a2 = crcjVar.b.a(crcjVar.a, R.raw.da_error, a6);
                        }
                        crce.a(a2, arrayList);
                    }
                    crce.a(a, arrayList);
                }
                if (!arrayList.isEmpty()) {
                    if (arrayList.size() == 1) {
                        crbcVar = (crbc) arrayList.get(0);
                    } else {
                        crbcVar = new crcg((crbc[]) arrayList.toArray(new crbc[arrayList.size()]));
                    }
                }
                this.e = crbcVar;
                return true;
            }
        }
    }

    public final void d() {
        crbc crbcVar = this.e;
        if (crbcVar == null) {
            e();
            return;
        }
        if (!this.q) {
            this.q = true;
            if (!crbcVar.a()) {
                e();
                return;
            }
        }
        this.a.b(this.r, bvrj.UI_THREAD);
    }

    public final void e() {
        this.a.b(new Runnable(this) { // from class: crda
            private final crde a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                crde crdeVar = this.a;
                crdeVar.b.h();
                crbk.d(crdeVar.f);
            }
        }, bvrj.UI_THREAD);
    }

    @Override // defpackage.crdg
    public final void f() {
        this.a.b(new Runnable(this) { // from class: crdb
            private final crde a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                crde crdeVar = this.a;
                synchronized (crdeVar.b) {
                    if (crdeVar.i != null) {
                        crdeVar.i = null;
                        crdeVar.a();
                    }
                }
            }
        }, bvrj.ALERT_CONTROLLER);
    }
}
