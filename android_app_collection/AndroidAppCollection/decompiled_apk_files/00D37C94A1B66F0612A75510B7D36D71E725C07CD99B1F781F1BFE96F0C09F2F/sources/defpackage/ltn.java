package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ltn  reason: default package */
/* loaded from: classes3.dex */
public final class ltn implements airt, ynl {
    public final yni a;
    public final yve b;
    public final apy c;
    public final airw d;
    public final aypf e;
    public final aacz f;
    private final Context g;
    private final akfd h;
    private final azqb i;

    public ltn(Context context, yni yniVar, akfd akfdVar, azqb azqbVar, airw airwVar, aacz aaczVar, yve yveVar, apy apyVar) {
        this.g = context;
        yniVar.getClass();
        this.a = yniVar;
        akfdVar.getClass();
        this.h = akfdVar;
        azqbVar.getClass();
        this.i = azqbVar;
        this.d = airwVar;
        this.f = aaczVar;
        this.b = yveVar;
        this.c = apyVar;
        this.e = new aypf();
    }

    public final void a(ahhw ahhwVar) {
        ajah ajahVar;
        if (ahhwVar.c() != aika.PLAYBACK_LOADED || (ajahVar = ((airr) this.i.get()).q.a) == null || (ajahVar.q().a & 8) == 0 || ((ltq) this.b.c()).c) {
            return;
        }
        akfd akfdVar = this.h;
        akfe d = akfdVar.l().d(2131231835);
        d.c = this.g.getString(R.string.spatial_audio_mealbar_title);
        d.d = this.g.getString(R.string.spatial_audio_mealbar_message);
        akfe a = d.a(this.g.getString(R.string.app_got_it), null);
        a.m = new ltm(this);
        akfdVar.n(a.e());
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().b.aa(new ayqb() { // from class: ltl
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ltn.this.a((ahhw) obj);
            }
        }, kjt.k)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                a((ahhw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhw.class};
    }
}
