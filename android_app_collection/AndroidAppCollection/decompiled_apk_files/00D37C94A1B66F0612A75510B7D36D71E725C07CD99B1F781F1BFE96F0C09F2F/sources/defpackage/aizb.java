package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aizb  reason: default package */
/* loaded from: classes.dex */
public final class aizb implements airt, ynl {
    public volatile float a;
    public boolean b;
    private final aant c;
    private final Set d = Collections.newSetFromMap(new ConcurrentHashMap());

    public aizb(aant aantVar) {
        this.c = aantVar;
    }

    public final void a(aiza aizaVar) {
        if (aizaVar != null) {
            this.d.add(aizaVar);
        }
    }

    public final void b(aesr aesrVar) {
        float f;
        FormatStreamModel f2 = aesrVar.f();
        if (f2 == null) {
            return;
        }
        int i = f2.i();
        int d = f2.d();
        if (i < 0 || d < 0) {
            i = 1280;
            d = 720;
        }
        int V = f2.V();
        atzv atzvVar = this.c.get().c;
        boolean z = true;
        float f3 = 0.0f;
        if ((atzvVar.c & 1) != 0) {
            awbw awbwVar = atzvVar.v;
            if (awbwVar == null) {
                awbwVar = awbw.a;
            }
            f = awbwVar.i;
        } else {
            f = 0.0f;
        }
        if (V != 3 && V != 4 && V != 5) {
            z = false;
        }
        this.b = z;
        if (z && f != 0.0f) {
            i = (int) (d * f);
        }
        if (d > 0 && i > 0) {
            f3 = i / d;
        }
        this.a = f3;
        for (aiza aizaVar : this.d) {
            aizaVar.d(i, d);
        }
    }

    public final void c(aiza aizaVar) {
        if (aizaVar != null) {
            this.d.remove(aizaVar);
        }
    }

    public final boolean d() {
        return this.a <= 1.01f && this.a > 0.0f;
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.ae(aiyy.a, aiyy.c).h(aiwv.n(airwVar.aB(), 1073741824L)).h(aiwv.l(1)).aa(new ayqb() { // from class: aiyz
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aizb.this.b((aesr) obj);
            }
        }, aiax.r), airwVar.ae(aiyy.a, aiyy.d).h(aiwv.n(airwVar.aB(), 1073741824L)).h(aiwv.l(1)).aa(new ayqb() { // from class: aiyz
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aizb.this.b((aesr) obj);
            }
        }, aiax.r)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                b((aesr) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{aesr.class};
    }
}
