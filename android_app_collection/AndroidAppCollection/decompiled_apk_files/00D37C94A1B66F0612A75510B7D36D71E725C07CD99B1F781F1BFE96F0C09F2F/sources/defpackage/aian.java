package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: aian  reason: default package */
/* loaded from: classes.dex */
public final class aian implements aial, airt, ynl {
    private static final avwa[] c = new avwa[0];
    public final airr a;
    public PlayerResponseModel b;
    private final jyk d;

    public aian(airr airrVar, jyk jykVar) {
        this.a = airrVar;
        jykVar.getClass();
        this.d = jykVar;
        jykVar.c.a(this);
    }

    private final void d() {
        this.d.b(false);
        this.d.a(c, -1);
    }

    public final void a(ahgh ahghVar) {
        c(ahghVar.c());
    }

    public final void b(ahhw ahhwVar) {
        aika c2 = ahhwVar.c();
        this.b = ahhwVar.b();
        if (c2.h()) {
            d();
        }
        if (c2 == aika.VIDEO_PLAYING) {
            c(ahgh.d(ahhwVar.b()));
            jyk jykVar = this.d;
            avwb avwbVar = ahhwVar.b().c().c.t;
            if (avwbVar == null) {
                avwbVar = avwb.a;
            }
            jykVar.d = avwbVar.d;
        }
    }

    public final void c(avwa[] avwaVarArr) {
        ajah ajahVar = this.a.q.a;
        int i = 0;
        boolean z = ajahVar != null && ajahVar.q().a();
        this.d.b(z);
        if (z) {
            while (true) {
                if (i >= avwaVarArr.length) {
                    i = -1;
                    break;
                }
                float f = avwaVarArr[i].d;
                ajah ajahVar2 = this.a.q.a;
                if (Float.compare(f, ajahVar2 != null ? ajahVar2.j() : 1.0f) == 0) {
                    break;
                }
                i++;
            }
            this.d.a(avwaVarArr, i);
            return;
        }
        d();
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 131072L)).h(aiwv.l(1)).aa(new aiam(this), ahqs.t), airwVar.ae(ahja.h, ahja.i).h(aiwv.n(airwVar.aB(), 131072L)).h(aiwv.l(1)).aa(new aiam(this, 1), ahqs.t)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                a((ahgh) obj);
                return null;
            } else if (i == 1) {
                b((ahhw) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahgh.class, ahhw.class};
    }
}
