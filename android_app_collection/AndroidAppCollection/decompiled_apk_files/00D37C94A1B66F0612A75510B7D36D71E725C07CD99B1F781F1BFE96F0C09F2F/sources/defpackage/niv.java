package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: niv  reason: default package */
/* loaded from: classes3.dex */
public final class niv extends fdm implements ahsl, airt, ynl {
    public final Context a;
    public final yve b;
    public final azqb c;
    public volatile boolean d;
    public boolean e;
    private final yni f;
    private final ahso g;
    private final airw h;
    private final aypf i;
    private final aacz j;

    public niv(Context context, yni yniVar, yve yveVar, feh fehVar, azqb azqbVar, ahso ahsoVar, airw airwVar, aacz aaczVar) {
        super(fehVar);
        this.a = context;
        yniVar.getClass();
        this.f = yniVar;
        yveVar.getClass();
        this.b = yveVar;
        azqbVar.getClass();
        this.c = azqbVar;
        ahsoVar.getClass();
        this.g = ahsoVar;
        this.h = airwVar;
        this.j = aaczVar;
        this.i = new aypf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ahhw ahhwVar) {
        PlayerResponseModel b;
        PlayerConfigModel c;
        if (ahhwVar.c() != aika.VIDEO_PLAYING || (b = ahhwVar.b()) == null || (c = b.c()) == null) {
            return;
        }
        this.d = c.ap();
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().b.aa(new ayqb() { // from class: niu
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                niv.this.a((ahhw) obj);
            }
        }, kjt.t)};
    }

    @Override // defpackage.feg
    public final void kF() {
        this.i.c();
        if (!eog.ap(this.j)) {
            this.f.m(this);
        }
        this.g.f = null;
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

    @Override // defpackage.feg
    public final void nr() {
        if (eog.ap(this.j)) {
            this.i.g(g(this.h));
        } else {
            this.f.g(this);
        }
        this.g.f = this;
        if (!this.e || ((awvd) this.b.c()).d) {
            return;
        }
        this.e = false;
        ((airr) this.c.get()).b();
        this.g.e();
    }
}
