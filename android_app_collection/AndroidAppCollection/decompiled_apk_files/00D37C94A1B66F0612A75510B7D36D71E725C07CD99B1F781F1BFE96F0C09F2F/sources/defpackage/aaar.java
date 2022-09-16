package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.player.infocards.YouTubeInfoCardOverlayPresenter;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.infocards.factories.InfoCardCollection;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: aaar  reason: default package */
/* loaded from: classes.dex */
public final class aaar implements ynl {
    public final aafo A;
    public long B = 0;
    private boolean C;
    private final acti D;
    public aaoa a;
    public aaoa b;
    public aaoa c;
    public final acwm d;
    public final snc e;
    public final azpm f;
    public InfoCardCollection g;
    public InfoCardCollection h;
    public InfoCardCollection i;
    public int j;
    public String k;
    public boolean l;
    public boolean m;
    public boolean n;
    public String o;
    public String p;
    public String q;
    public boolean r;
    public boolean s;
    public boolean t;
    public aaal u;
    public ahyz v;
    public aaas w;
    public long x;
    public boolean y;
    public final aafo z;

    public aaar(oa oaVar, afwu afwuVar, afzo afzoVar, acti actiVar, snc sncVar, aafo aafoVar, aafo aafoVar2, afvn afvnVar, afwc afwcVar, yzj yzjVar) {
        this.j = -1;
        oaVar.getClass();
        sncVar.getClass();
        this.e = sncVar;
        this.d = new acwm(afwuVar, afzoVar, "iv");
        azpm e = azpm.e();
        this.f = e;
        arit aritVar = null;
        l(null);
        oaVar.getSavedStateRegistry().b("info-cards", new bli() { // from class: aaap
            @Override // defpackage.bli
            public final Bundle a() {
                aaar aaarVar = aaar.this;
                Bundle bundle = new Bundle(5);
                bundle.putParcelable("info-card-collection", aaarVar.g);
                bundle.putParcelable("shopping-info-card-collection", aaarVar.h);
                bundle.putString("last-pinged-video-id", aaarVar.k);
                bundle.putBoolean("info-cards-are-shown", aaarVar.r);
                bundle.putInt("active-card-index", aaarVar.j);
                return bundle;
            }
        });
        Bundle a = oaVar.getSavedStateRegistry().a("info-cards");
        if (a != null) {
            this.g = (InfoCardCollection) a.getParcelable("info-card-collection");
            InfoCardCollection infoCardCollection = this.g;
            this.a = new aaoa(infoCardCollection != null ? infoCardCollection.a : null);
            e.c(Boolean.valueOf(this.g != null));
            this.h = (InfoCardCollection) a.getParcelable("shopping-info-card-collection");
            InfoCardCollection infoCardCollection2 = this.h;
            this.b = new aaoa(infoCardCollection2 != null ? infoCardCollection2.a : null);
            InfoCardCollection infoCardCollection3 = this.i;
            this.c = new aaoa(infoCardCollection3 != null ? infoCardCollection3.a : aritVar);
            this.k = a.getString("last-pinged-video-id");
            this.C = a.getBoolean("info-cards-are-shown");
            this.j = a.getInt("active-card-index");
        }
        this.z = aafoVar;
        this.A = aafoVar2;
        this.D = actiVar;
        afvnVar.getClass();
        afwcVar.getClass();
        yzjVar.getClass();
    }

    public final zza a() {
        InfoCardCollection infoCardCollection;
        int i = this.j;
        if (i < 0 || (infoCardCollection = this.g) == null || i >= infoCardCollection.b().size()) {
            return null;
        }
        return (zza) this.g.b().get(this.j);
    }

    public final void b() {
        if (this.h == null || !this.s) {
            return;
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        this.D.H(3, new acte(bArr), null);
    }

    public final void d() {
        InfoCardCollection infoCardCollection = this.g;
        if (infoCardCollection != null) {
            c(infoCardCollection.c());
            this.d.b((aswg[]) this.g.a.e.toArray(new aswg[0]));
        }
    }

    public final void e(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        this.D.u(new acte(bArr), null);
    }

    public final void g() {
        apzg apzgVar;
        InfoCardCollection infoCardCollection = this.g;
        if (infoCardCollection == null) {
            zep.l("Failed to show info card drawer - missing infoCardCollection");
            return;
        }
        arit aritVar = infoCardCollection.a;
        if ((aritVar.b & 512) != 0) {
            apzgVar = aritVar.k;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        if (apzgVar != null) {
            this.z.c(apzgVar, null);
        } else if (!this.r || q()) {
            m(this.j, true);
        } else {
            r();
            return;
        }
        zza a = a();
        if (a == null) {
            this.d.b((aswg[]) this.g.a.d.toArray(new aswg[0]));
            c(this.g.d());
            return;
        }
        this.d.a(a.e().f);
        c(a.h());
    }

    public final void h() {
        this.B = this.e.d();
    }

    public final void i(InfoCardCollection infoCardCollection, String str, String str2) {
        if (this.u == null) {
            zep.b("Missing InfoCardOverlayPresenter for InfoCards to work.");
        } else if (this.v == null) {
            zep.b("Missing ControlsOverlayPresenter for InfoCards to work.");
        } else if (str != null && str.equals(this.o)) {
        } else {
            this.o = str;
            this.u.j();
            this.d.c("CPN", str2);
            this.g = infoCardCollection;
            this.f.c(Boolean.valueOf(infoCardCollection != null));
            this.x = -1L;
            this.y = false;
            if (infoCardCollection == null) {
                return;
            }
            aaal aaalVar = this.u;
            aaalVar.f = infoCardCollection;
            aaalVar.b.i(infoCardCollection, aaalVar.d, aaalVar.c);
            e(infoCardCollection.d());
            if (!this.C) {
                this.j = -1;
                return;
            }
            this.C = false;
            int i = this.j;
            if (i > 0 && i >= infoCardCollection.b().size()) {
                this.j = -1;
            }
            m(this.j, false);
        }
    }

    public final void j(int i, boolean z) {
        if (this.r) {
            r();
        } else if (this.g == null) {
        } else {
            if (i == -1) {
                i = this.j;
            }
            m(i, true);
            this.s = z;
        }
    }

    public final void k(int i) {
        if (this.h != null) {
            if (!this.s) {
                String str = this.q;
                if (str != null) {
                    this.d.c("CPN", str);
                }
                s(this.h);
                h();
                String str2 = this.p;
                if (str2 != null) {
                    this.d.c("CPN", str2);
                }
                this.r = true;
                this.s = true;
                aaas aaasVar = this.w;
                if (aaasVar == null) {
                    return;
                }
                aaasVar.c(this.h, i, true);
                return;
            }
            r();
        }
    }

    public final void l(aaas aaasVar) {
        r();
        aaas aaasVar2 = this.w;
        if (aaasVar2 != null) {
            ((aaag) aaasVar2).f = null;
        }
        this.w = aaasVar;
        if (aaasVar != null) {
            ((aaag) aaasVar).f = this;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r7, boolean r8) {
        /*
            r6 = this;
            com.google.android.libraries.youtube.infocards.factories.InfoCardCollection r0 = r6.g
            r6.s(r0)
            r6.h()
            r0 = 0
            r1 = -1
            if (r7 != r1) goto Le
            r1 = 0
            goto Lf
        Le:
            r1 = r7
        Lf:
            aaal r2 = r6.u
            com.google.android.libraries.youtube.infocards.factories.InfoCardCollection r3 = r2.f
            r4 = 1
            if (r3 == 0) goto L42
            java.util.List r3 = r3.b()
            int r3 = r3.size()
            if (r3 != 0) goto L21
            goto L42
        L21:
            if (r1 < 0) goto L3c
            com.google.android.libraries.youtube.infocards.factories.InfoCardCollection r3 = r2.f
            java.util.List r3 = r3.b()
            int r3 = r3.size()
            if (r1 < r3) goto L30
            goto L3c
        L30:
            aaai r3 = r2.b
            r3.h(r1)
            r2.i = r4
            boolean r2 = r2.l()
            goto L48
        L3c:
            java.lang.String r2 = "Info card index outside of infoCardCollection"
            defpackage.zep.l(r2)
            goto L47
        L42:
            java.lang.String r2 = "Failed to show info card gallery - missing infoCardCollection"
            defpackage.zep.l(r2)
        L47:
            r2 = 0
        L48:
            if (r2 == 0) goto L4f
            ahyz r3 = r6.v
            r3.a()
        L4f:
            aaas r3 = r6.w
            if (r3 == 0) goto L99
            if (r2 == 0) goto L60
            r3.a(r0)
            aaas r8 = r6.w
            com.google.android.libraries.youtube.infocards.factories.InfoCardCollection r2 = r6.g
            r8.c(r2, r1, r0)
            goto L99
        L60:
            boolean r2 = r6.q()
            if (r2 == 0) goto L92
            aaas r8 = r6.w
            com.google.android.libraries.youtube.infocards.factories.InfoCardCollection r2 = r6.g
            aaag r8 = (defpackage.aaag) r8
            boolean r3 = r8.g
            if (r3 == 0) goto L99
            r8.g = r0
            android.view.View r3 = r8.e
            android.view.ViewParent r3 = r3.getParent()
            android.view.View r3 = (android.view.View) r3
            boolean r3 = r3.isShown()
            if (r3 == 0) goto L99
            android.view.animation.Animation r3 = r8.d
            aaac r5 = new aaac
            r5.<init>(r8, r2, r1)
            r3.setAnimationListener(r5)
            android.view.View r1 = r8.e
            android.view.animation.Animation r8 = r8.d
            r1.startAnimation(r8)
            goto L99
        L92:
            aaas r2 = r6.w
            com.google.android.libraries.youtube.infocards.factories.InfoCardCollection r3 = r6.g
            r2.c(r3, r1, r8)
        L99:
            r6.j = r7
            r6.r = r4
            boolean r7 = r6.q()
            if (r7 == 0) goto La5
            r6.s = r0
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaar.m(int, boolean):void");
    }

    public final void n(int i) {
        RecyclerView recyclerView;
        if (!this.t) {
            this.u.i(i);
            return;
        }
        aaas aaasVar = this.w;
        if (aaasVar == null || (recyclerView = ((aaag) aaasVar).h) == null) {
            return;
        }
        recyclerView.ab(i);
    }

    public final void o() {
        if (this.r) {
            r();
        } else if (this.g != null) {
            for (int i = 0; i < this.g.b().size(); i++) {
                if (((zza) this.g.b().get(i)).b == zyz.SHOPPING_CARD) {
                    m(i, true);
                    return;
                }
            }
            m(this.j, true);
        }
    }

    public final boolean p(zza zzaVar) {
        InfoCardCollection infoCardCollection = this.g;
        return infoCardCollection != null && infoCardCollection.b().contains(zzaVar);
    }

    public final boolean q() {
        InfoCardCollection infoCardCollection;
        return (!this.s || (infoCardCollection = this.h) == null || infoCardCollection == this.g) ? false : true;
    }

    public final void r() {
        aaal aaalVar = this.u;
        if (aaalVar != null) {
            aaalVar.k();
        }
        aaas aaasVar = this.w;
        if (aaasVar != null) {
            aaasVar.a(true);
        }
        this.r = false;
        this.s = false;
    }

    private final void s(InfoCardCollection infoCardCollection) {
        aaoa aaoaVar = infoCardCollection == this.h ? this.b : this.a;
        if (aaoaVar != null) {
            for (int i = 0; i < infoCardCollection.b().size(); i++) {
                if (!aaoaVar.a(i) || !((Boolean) aaoaVar.a.get(i)).booleanValue()) {
                    acwm acwmVar = this.d;
                    zza zzaVar = (zza) infoCardCollection.b().get(i);
                    zyz zyzVar = zyz.COLLABORATOR_CARD;
                    int ordinal = zzaVar.b.ordinal();
                    acwmVar.a(ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : zzaVar.c().j : zzaVar.f().l : zzaVar.d().i : zzaVar.b().j : zzaVar.a().h);
                    if (aaoaVar.a(i)) {
                        aaoaVar.a.set(i, true);
                    }
                }
            }
        }
        e(infoCardCollection.c());
        for (zza zzaVar2 : infoCardCollection.b()) {
            zyz zyzVar2 = zyz.COLLABORATOR_CARD;
            int ordinal2 = zzaVar2.b.ordinal();
            e(ordinal2 != 0 ? ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? ordinal2 != 4 ? null : zzaVar2.c().k.I() : zzaVar2.f().k.I() : zzaVar2.d().j.I() : zzaVar2.b().i.I() : zzaVar2.a().i.I());
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        InfoCardCollection infoCardCollection;
        arit aritVar;
        arit aritVar2;
        InfoCardCollection infoCardCollection2;
        arit aritVar3;
        arit aritVar4;
        zza zzaVar;
        boolean z = true;
        switch (i) {
            case -1:
                return new Class[]{wxr.class, ahgn.class, ahhm.class, ahhv.class, ahhw.class, ahhx.class};
            case 0:
                wxr wxrVar = (wxr) obj;
                wxq wxqVar = wxq.AD_INTERRUPT_ACQUIRED;
                aika aikaVar = aika.NEW;
                int ordinal = wxrVar.a().ordinal();
                if (ordinal == 1) {
                    if (wxrVar.c() != null) {
                        PlayerAd c = wxrVar.c();
                        this.h = c.j() == null ? null : new InfoCardCollection(c.j());
                        this.q = wxrVar.d();
                        this.b = new aaoa(c.j());
                        i(this.h, c.n(), this.q);
                    }
                    if (!this.r) {
                        return null;
                    }
                    r();
                    return null;
                } else if (ordinal != 3 || !this.r) {
                    return null;
                } else {
                    if (!this.s) {
                        r();
                        return null;
                    }
                    this.u.k();
                    return null;
                }
            case 1:
                if (((ahgn) obj).c() != aijs.FULLSCREEN) {
                    z = false;
                }
                if (this.r && !q() && !this.t && z) {
                    this.v.a();
                }
                this.t = z;
                return null;
            case 2:
                ahhm ahhmVar = (ahhm) obj;
                if (ahhmVar.c() == aijx.NEW) {
                    this.o = null;
                    aaal aaalVar = this.u;
                    if (aaalVar != null) {
                        aaalVar.j();
                    }
                    this.i = null;
                    this.m = false;
                    return null;
                } else if (ahhmVar.c() == aijx.VIDEO_WATCH_LOADED) {
                    WatchNextResponseModel a = ahhmVar.a();
                    asgt asgtVar = a.a;
                    if ((asgtVar.b & 1073741824) != 0) {
                        arja arjaVar = asgtVar.y;
                        if (arjaVar == null) {
                            arjaVar = arja.a;
                        }
                        if (arjaVar.b == 61737181) {
                            aritVar2 = (arit) arjaVar.c;
                        } else {
                            aritVar2 = arit.a;
                        }
                        infoCardCollection = new InfoCardCollection(aritVar2);
                    } else {
                        infoCardCollection = null;
                    }
                    this.i = infoCardCollection;
                    asgt asgtVar2 = a.a;
                    if ((1073741824 & asgtVar2.b) != 0) {
                        arja arjaVar2 = asgtVar2.y;
                        if (arjaVar2 == null) {
                            arjaVar2 = arja.a;
                        }
                        if (arjaVar2.b == 61737181) {
                            aritVar = (arit) arjaVar2.c;
                        } else {
                            aritVar = arit.a;
                        }
                    } else {
                        aritVar = null;
                    }
                    aaoa aaoaVar = new aaoa(aritVar);
                    this.c = aaoaVar;
                    this.m = true;
                    InfoCardCollection infoCardCollection3 = this.i;
                    if (infoCardCollection3 != null && this.l) {
                        this.a = aaoaVar;
                        i(infoCardCollection3, a.b, this.p);
                        return null;
                    } else if (!this.n) {
                        return null;
                    } else {
                        i(null, a.b, this.p);
                        return null;
                    }
                } else {
                    this.i = null;
                    this.m = false;
                    return null;
                }
            case 3:
                if (((ahhv) obj).a && this.t) {
                    r();
                }
                h();
                return null;
            case 4:
                ahhw ahhwVar = (ahhw) obj;
                this.l = ahhwVar.c().a(aika.VIDEO_PLAYING);
                wxq wxqVar2 = wxq.AD_INTERRUPT_ACQUIRED;
                int ordinal2 = ahhwVar.c().ordinal();
                if (ordinal2 == 0) {
                    this.n = false;
                    return null;
                } else if (ordinal2 != 2 && ordinal2 != 7 && ordinal2 != 8) {
                    return null;
                } else {
                    this.p = ahhwVar.e();
                    PlayerResponseModel b = ahhwVar.b();
                    InfoCardCollection infoCardCollection4 = this.i;
                    if (infoCardCollection4 != null) {
                        this.a = this.c;
                        i(infoCardCollection4, b.B(), this.p);
                        return null;
                    }
                    asaj asajVar = b.a;
                    if ((asajVar.b & 8192) != 0) {
                        arja arjaVar3 = asajVar.r;
                        if (arjaVar3 == null) {
                            arjaVar3 = arja.a;
                        }
                        if (arjaVar3.b == 61737181) {
                            aritVar4 = (arit) arjaVar3.c;
                        } else {
                            aritVar4 = arit.a;
                        }
                        infoCardCollection2 = new InfoCardCollection(aritVar4);
                    } else {
                        infoCardCollection2 = null;
                    }
                    if (b.e == null) {
                        asaj asajVar2 = b.a;
                        if ((asajVar2.b & 8192) != 0) {
                            arja arjaVar4 = asajVar2.r;
                            if (arjaVar4 == null) {
                                arjaVar4 = arja.a;
                            }
                            if (arjaVar4.b == 61737181) {
                                aritVar3 = (arit) arjaVar4.c;
                            } else {
                                aritVar3 = arit.a;
                            }
                        } else {
                            aritVar3 = null;
                        }
                        b.e = new aaoa(aritVar3);
                    }
                    this.a = b.e;
                    if (infoCardCollection2 != null) {
                        i(infoCardCollection2, b.B(), this.p);
                        return null;
                    } else if (this.m) {
                        i(null, b.B(), this.p);
                        return null;
                    } else {
                        aaal aaalVar2 = this.u;
                        if (aaalVar2 != null) {
                            aaalVar2.j();
                        }
                        if (!this.l) {
                            return null;
                        }
                        this.n = true;
                        return null;
                    }
                }
            case 5:
                ahhx ahhxVar = (ahhx) obj;
                InfoCardCollection infoCardCollection5 = this.g;
                if (infoCardCollection5 == null || infoCardCollection5.b().isEmpty()) {
                    return null;
                }
                boolean j = ahhxVar.j();
                if (j != this.y) {
                    h();
                    this.y = j;
                }
                if (j) {
                    long j2 = this.x;
                    long e = ahhxVar.e();
                    if (Math.abs(e - j2) <= 5000) {
                        long j3 = this.g.a.j;
                        if (j3 > 0 && j3 >= j2 && j3 < e && this.t && !this.r) {
                            j(-1, false);
                        }
                        int i2 = 0;
                        while (true) {
                            if (i2 < this.g.b().size()) {
                                zzaVar = (zza) this.g.b().get(i2);
                                if (!zzaVar.g().isEmpty()) {
                                    long j4 = ((ariv) zzaVar.g().get(0)).b;
                                    if (j2 <= j4 && j4 < e) {
                                    }
                                }
                                i2++;
                            } else {
                                zzaVar = null;
                                i2 = -1;
                            }
                        }
                        if (i2 >= 0) {
                            this.j = i2;
                            if (!this.r || q()) {
                                ariv arivVar = (ariv) zzaVar.g().get(0);
                                if (zzaVar.a.f && this.t) {
                                    j(-1, false);
                                } else {
                                    long j5 = arivVar.c;
                                    if (j5 > 0) {
                                        aaal aaalVar3 = this.u;
                                        long j6 = arivVar.d;
                                        if (!((YouTubeInfoCardOverlayPresenter) aaalVar3).a && !aaalVar3.h && !aaalVar3.g) {
                                            aaalVar3.h();
                                            aaalVar3.h = aaalVar3.b.a(zzaVar.e(), j5, j6).booleanValue();
                                            aaar aaarVar = aaalVar3.c;
                                            if (!aaarVar.p(zzaVar)) {
                                                zep.l("Teaser expanded for a card that is not in the current InfoCardCollection.");
                                            } else {
                                                arji e2 = zzaVar.e();
                                                aaarVar.j = aaarVar.g.b().indexOf(zzaVar);
                                                aaarVar.d.a(e2.d);
                                                aaarVar.e(e2.h.I());
                                                aaarVar.e(zzaVar.h());
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.e.d() - this.B > 5500) {
                                this.u.i(i2);
                                aaas aaasVar = this.w;
                                if (aaasVar != null) {
                                    aaag aaagVar = (aaag) aaasVar;
                                    if (aaagVar.h != null && !zdg.e(aaagVar.b)) {
                                        if (aaagVar.g) {
                                            aaagVar.h.al(i2);
                                            aaag.b(aaagVar.i.S(i2));
                                        } else {
                                            aaagVar.i.aa(i2, 0);
                                            aaagVar.h.ab(i2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.x = ahhxVar.e();
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
