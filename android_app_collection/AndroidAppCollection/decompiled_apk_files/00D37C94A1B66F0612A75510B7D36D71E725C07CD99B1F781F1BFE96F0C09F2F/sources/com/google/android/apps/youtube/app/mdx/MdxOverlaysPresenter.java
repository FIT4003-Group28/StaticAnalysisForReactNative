package com.google.android.apps.youtube.app.mdx;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdxOverlaysPresenter implements f, adwm, ynl {
    public final adoa a;
    public final ivx b;
    public final ivs c;
    public final jxf d;
    int e;
    private boolean f;

    public MdxOverlaysPresenter(adoa adoaVar, ivx ivxVar, ivs ivsVar, jxf jxfVar, adwt adwtVar) {
        adoaVar.getClass();
        this.a = adoaVar;
        ivxVar.getClass();
        this.b = ivxVar;
        ivsVar.getClass();
        this.c = ivsVar;
        jxfVar.getClass();
        this.d = jxfVar;
        adwtVar.a(this);
        i(1);
    }

    public static final String j(adnt adntVar) {
        return adntVar.k().b();
    }

    private final void k() {
        boolean z = false;
        if (this.f) {
            this.d.kU();
            zag.o(this.c, false);
            this.b.kT();
            return;
        }
        this.d.kT();
        ivs ivsVar = this.c;
        if (this.e == 2) {
            z = true;
        }
        zag.o(ivsVar, z);
        if (this.e == 3) {
            this.b.kU();
        } else {
            this.b.kT();
        }
    }

    public final void g(adnt adntVar) {
        if (adntVar == null) {
            i(1);
            return;
        }
        int a = adntVar.a();
        if (a != 0) {
            if (a != 1) {
                i(1);
                return;
            }
            this.c.d(j(adntVar));
            i(2);
            return;
        }
        String b = adntVar.k() != null ? adntVar.k().b() : null;
        ivx ivxVar = this.b;
        boolean ai = adntVar.ai();
        int i = TextUtils.isEmpty(b) ? true != ai ? R.string.connecting : R.string.reconnecting : true != ai ? R.string.connecting_to_screen : R.string.reconnecting_to_screen;
        if (i != ivxVar.b || ivxVar.a != 2 || !TextUtils.equals(ivxVar.c, b)) {
            ivxVar.c = b;
            ivxVar.b = i;
            ivxVar.a = 2;
            ivxVar.X();
        }
        i(3);
    }

    @Override // defpackage.adwm
    public final void h(int i, adwj adwjVar) {
        PlayerResponseModel playerResponseModel;
        if (adwjVar.a == 4 && (playerResponseModel = adwjVar.k.a) != null && !amps.e(playerResponseModel.B())) {
            this.f = true;
            this.d.c = adwjVar.k.a.B();
        } else {
            this.f = false;
        }
        k();
    }

    public final void i(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        k();
    }

    @Override // defpackage.f, defpackage.g
    public final void kG(apy apyVar) {
        g(this.a.e());
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                g(((adob) obj).a());
                return null;
            } else if (i == 1) {
                ahhw ahhwVar = (ahhw) obj;
                adnt e = this.a.e();
                if (e == null || e.a() != 1) {
                    return null;
                }
                if (e.aa()) {
                    i(1);
                    return null;
                }
                aika aikaVar = aika.NEW;
                int ordinal = ahhwVar.c().ordinal();
                if (ordinal == 0) {
                    this.d.g(false);
                } else if (ordinal == 5) {
                    if (ahhwVar.k() != null) {
                        return null;
                    }
                    ivx ivxVar = this.b;
                    if (ivxVar.a != 1) {
                        ivxVar.b = R.string.advertisement;
                        ivxVar.c = null;
                        ivxVar.a = 1;
                        ivxVar.X();
                    }
                    i(3);
                    return null;
                } else if (ordinal == 8) {
                    ivs ivsVar = this.c;
                    ivsVar.a.setText(ivsVar.a(R.string.playing_on_tv, j(e)));
                    i(2);
                    return null;
                } else if (ordinal != 9) {
                    return null;
                }
                this.c.d(j(e));
                i(2);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{adob.class, ahhw.class};
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
