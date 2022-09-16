package com.google.android.apps.youtube.app.search.suggest;

import com.google.android.apps.youtube.app.search.suggest.SuggestVideoStateSubscriber;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SuggestVideoStateSubscriber implements f, ynl {
    public String a;
    public String b;
    public final snc d;
    private final yni e;
    private final airw f;
    private final aacz h;
    public long c = -1;
    private final aypf g = new aypf();

    public SuggestVideoStateSubscriber(snc sncVar, yni yniVar, airw airwVar, aacz aaczVar) {
        this.d = sncVar;
        this.e = yniVar;
        this.f = airwVar;
        this.h = aaczVar;
    }

    public final void g(ahhw ahhwVar) {
        aika c = ahhwVar.c();
        PlayerResponseModel b = ahhwVar.b();
        if (!c.a(aika.PLAYBACK_LOADED) || b == null) {
            if (!c.a(aika.NEW, aika.ENDED) || this.b == null) {
                return;
            }
            this.b = null;
            this.c = this.d.c();
            return;
        }
        String B = b.B();
        if (akzj.f(this.b, B)) {
            return;
        }
        this.b = B;
        this.a = B;
        this.c = -1L;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                g((ahhw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhw.class};
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        if (eog.aq(this.h)) {
            this.g.c();
        } else {
            this.e.m(this);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (eog.aq(this.h)) {
            this.g.c();
            this.g.g(this.f.G().b.aa(new ayqb() { // from class: lbn
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    SuggestVideoStateSubscriber.this.g((ahhw) obj);
                }
            }, kjt.j));
            return;
        }
        this.e.g(this);
    }
}
