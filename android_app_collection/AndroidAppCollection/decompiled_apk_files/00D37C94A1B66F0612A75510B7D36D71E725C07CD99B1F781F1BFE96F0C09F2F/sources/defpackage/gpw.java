package defpackage;

import com.google.android.apps.youtube.app.extensions.clips.ClipController;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: gpw  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gpw implements ayqb {
    public final /* synthetic */ ClipController a;
    private final /* synthetic */ int b;

    public /* synthetic */ gpw(ClipController clipController) {
        this.a = clipController;
    }

    public /* synthetic */ gpw(ClipController clipController, int i) {
        this.b = i;
        this.a = clipController;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        grk grkVar;
        grk grkVar2;
        boolean z = false;
        switch (this.b) {
            case 0:
                this.a.q = ((Boolean) obj).booleanValue();
                return;
            case 1:
                this.a.p = ((Boolean) obj).booleanValue();
                return;
            case 2:
                ClipController clipController = this.a;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                clipController.o = booleanValue;
                grk grkVar3 = clipController.f;
                if (grkVar3 == null) {
                    return;
                }
                grkVar3.s(booleanValue);
                return;
            case 3:
                ClipController clipController2 = this.a;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                clipController2.n = booleanValue2;
                grk grkVar4 = clipController2.f;
                if (grkVar4 == null) {
                    return;
                }
                grkVar4.r(booleanValue2);
                return;
            case 4:
                ClipController clipController3 = this.a;
                ahhg ahhgVar = (ahhg) obj;
                apyo r = ahhgVar.a().r();
                if (r != null) {
                    clipController3.j(r, ahhgVar.b());
                    return;
                }
                apyo apyoVar = clipController3.t;
                if (apyoVar == null || (2 & apyoVar.b) == 0) {
                    clipController3.x = "";
                    return;
                } else {
                    clipController3.j(apyoVar, ahhgVar.b());
                    return;
                }
            case 5:
                ClipController clipController4 = this.a;
                ahhw ahhwVar = (ahhw) obj;
                if (ahhwVar.c() != aika.PLAYBACK_LOADED || ahhwVar.b() == null) {
                    return;
                }
                clipController4.h = ahhwVar.b().B();
                return;
            case 6:
                ClipController clipController5 = this.a;
                ahhx ahhxVar = (ahhx) obj;
                boolean z2 = !clipController5.u();
                clipController5.g = ahhxVar;
                if (clipController5.k && (grkVar = clipController5.f) != null) {
                    grkVar.u(ahhxVar.e());
                    if (z2 && clipController5.u()) {
                        clipController5.r();
                    }
                }
                boolean z3 = clipController5.s >= ahhxVar.h();
                clipController5.m = z3;
                if (!clipController5.l || z3) {
                    return;
                }
                clipController5.k("engagement-panel-clip-view");
                return;
            case 7:
                this.a.j = ((ahia) obj).e();
                return;
            case 8:
                ClipController clipController6 = this.a;
                ahic ahicVar = (ahic) obj;
                ajff a = ahicVar.a();
                if (ahicVar == clipController6.v.get()) {
                    return;
                }
                clipController6.v = new WeakReference(ahicVar);
                if (a.c() == null) {
                    return;
                }
                clipController6.i();
                clipController6.h = a.c().B();
                clipController6.i = ahicVar.a().a();
                clipController6.g = a.p();
                grk grkVar5 = clipController6.f;
                if (grkVar5 != null) {
                    grkVar5.p(clipController6.h, clipController6.i);
                }
                clipController6.u = new WeakReference(ahicVar.a().k());
                if (a.c().r() != null) {
                    ((aiuo) clipController6.u.get()).b(a.c().r().d);
                }
                String f = aakj.f(apao.b.a(), "ad_state_id");
                aopa createBuilder = apao.a.createBuilder();
                createBuilder.copyOnWrite();
                apao apaoVar = (apao) createBuilder.instance;
                f.getClass();
                apaoVar.c |= 1;
                apaoVar.d = f;
                if (clipController6.i != 0) {
                    z = true;
                }
                createBuilder.copyOnWrite();
                apao apaoVar2 = (apao) createBuilder.instance;
                apaoVar2.c = 2 | apaoVar2.c;
                apaoVar2.e = z;
                ((tdb) clipController6.d.get()).b(f, ((apao) createBuilder.mo39build()).toByteArray());
                if (clipController6.i != 0) {
                    return;
                }
                if (!clipController6.q) {
                    clipController6.r();
                    return;
                } else if (!clipController6.k || (grkVar2 = clipController6.f) == null) {
                    return;
                } else {
                    ajbv ajbvVar = clipController6.g;
                    ajbv ajbvVar2 = grkVar2.F;
                    if (ajbvVar2 == null || ajbvVar2.h() != ajbvVar.h() || ajbvVar2.f() != ajbvVar.f()) {
                        grkVar2.t(ajbvVar);
                        return;
                    } else {
                        grkVar2.h.execute(new grf(grkVar2));
                        return;
                    }
                }
            case 9:
                ClipController clipController7 = this.a;
                ahvy ahvyVar = (ahvy) obj;
                if (ahvyVar.a() == 3) {
                    clipController7.r = "";
                    return;
                } else if (clipController7.p && clipController7.i == 1) {
                    return;
                } else {
                    if (ahvyVar.a() == 0 && clipController7.e != null) {
                        clipController7.q(bhj.b, new gpx(clipController7, 1));
                    }
                    if (ahvyVar.a() == 2) {
                        clipController7.i();
                        return;
                    }
                    if (ahvyVar.a() == 1) {
                        clipController7.m = false;
                    }
                    clipController7.q(new gpx(clipController7), new gpx(clipController7, 2));
                    return;
                }
            case 10:
                ClipController clipController8 = this.a;
                ahwj ahwjVar = (ahwj) obj;
                long h = clipController8.g.h();
                clipController8.a.d(new aicc(aicb.CLIP_VIEWING, amuk.r(new TimelineMarker(ahwjVar.b() - h, ahwjVar.a() - h))));
                return;
            default:
                this.a.w = ((Boolean) obj).booleanValue();
                return;
        }
    }
}
