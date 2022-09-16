package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: oan  reason: default package */
/* loaded from: classes3.dex */
public final class oan {
    public boolean a;
    public CharSequence b;
    public CharSequence c;
    public avhn d;
    public acuv e;
    public aikd f;
    public Bundle g;
    public final fgh h;
    private final aaqp i;
    private final List j = new ArrayList();
    private oal k;
    private WatchNextResponseModel l;

    public oan(aaqp aaqpVar, fgh fghVar) {
        this.h = fghVar;
        this.i = aaqpVar;
    }

    public static boolean k(aikd aikdVar) {
        return aikdVar.i == 12;
    }

    private final int l() {
        return !this.j.isEmpty() ? 1 : 0;
    }

    private final void m() {
        int l = l();
        oal oalVar = this.k;
        if (oalVar != null) {
            oalVar.a(l);
        }
    }

    public final int a(WatchNextResponseModel watchNextResponseModel, acuv acuvVar) {
        oal oalVar = this.k;
        oal oalVar2 = null;
        if ((oalVar != null ? (WatchNextResponseModel) oalVar.get() : null) == watchNextResponseModel) {
            return 0;
        }
        if (watchNextResponseModel != null) {
            oalVar2 = new oal(watchNextResponseModel, l());
        }
        this.k = oalVar2;
        this.e = acuvVar;
        return 16;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel b() {
        /*
            r4 = this;
            com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel r0 = r4.l
            if (r0 != 0) goto L5d
            fgh r0 = r4.h
            apzg r0 = r0.b()
            r1 = 0
            if (r0 == 0) goto L3d
            aopg r2 = com.google.protos.youtube.api.innertube.WatchEndpointOuterClass.watchEndpoint
            boolean r2 = r0.qn(r2)
            if (r2 != 0) goto L16
            goto L3d
        L16:
            aopg r2 = com.google.protos.youtube.api.innertube.WatchEndpointOuterClass.watchEndpoint
            java.lang.Object r0 = r0.qm(r2)
            awel r0 = (defpackage.awel) r0
            aweo r2 = r0.o
            if (r2 != 0) goto L24
            aweo r2 = defpackage.aweo.a
        L24:
            int r2 = r2.b
            r3 = 128400768(0x7a73d80, float:2.5163514E-34)
            if (r2 != r3) goto L3d
            aweo r0 = r0.o
            if (r0 != 0) goto L31
            aweo r0 = defpackage.aweo.a
        L31:
            int r2 = r0.b
            if (r2 != r3) goto L3a
            java.lang.Object r0 = r0.c
            awen r0 = (defpackage.awen) r0
            goto L3e
        L3a:
            awen r0 = defpackage.awen.a
            goto L3e
        L3d:
            r0 = r1
        L3e:
            if (r0 == 0) goto L47
            aoob r0 = r0.b
            byte[] r0 = r0.I()
            goto L48
        L47:
            r0 = r1
        L48:
            if (r0 != 0) goto L4b
            return r1
        L4b:
            com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel r1 = new com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel
            aaqp r2 = r4.i
            asgt r3 = defpackage.asgt.a
            aoqu r0 = r2.a(r0, r3)
            asgt r0 = (defpackage.asgt) r0
            r1.<init>(r0)
            r4.l = r1
            return r1
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oan.b():com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel");
    }

    public final WatchNextResponseModel c() {
        oal oalVar = this.k;
        if (oalVar != null) {
            return (WatchNextResponseModel) oalVar.get();
        }
        return null;
    }

    public final CharSequence d() {
        if (this.b == null) {
            f();
        }
        return this.b;
    }

    public final void e(int i) {
        if (i == 0) {
            return;
        }
        for (oam oamVar : this.j) {
            oamVar.g(this, i);
        }
    }

    public final void f() {
        auqh auqhVar;
        arag aragVar;
        if (b() == null || b().f == null) {
            return;
        }
        asgk asgkVar = b().f.c;
        if (asgkVar == null) {
            asgkVar = asgk.a;
        }
        if (asgkVar.b != 49399797) {
            return;
        }
        asgk asgkVar2 = b().f.c;
        if (asgkVar2 == null) {
            asgkVar2 = asgk.a;
        }
        if (asgkVar2.b == 49399797) {
            auqhVar = (auqh) asgkVar2.c;
        } else {
            auqhVar = auqh.a;
        }
        if (auqhVar.d.size() == 0) {
            return;
        }
        aslq aslqVar = ((auqk) auqhVar.d.get(0)).j;
        if (aslqVar == null) {
            aslqVar = aslq.a;
        }
        if (aslqVar.e.size() == 0) {
            return;
        }
        aslt asltVar = (aslt) aslqVar.e.get(0);
        if ((asltVar.b & 8388608) == 0) {
            return;
        }
        auxg auxgVar = asltVar.H;
        if (auxgVar == null) {
            auxgVar = auxg.a;
        }
        arag aragVar2 = null;
        if ((auxgVar.b & 2) != 0) {
            aragVar = auxgVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        this.b = ajgl.b(aragVar);
        auxf auxfVar = auxgVar.d;
        if (auxfVar == null) {
            auxfVar = auxf.a;
        }
        if ((auxfVar.b & 1) == 0) {
            return;
        }
        auxf auxfVar2 = auxgVar.d;
        if (auxfVar2 == null) {
            auxfVar2 = auxf.a;
        }
        auxc auxcVar = auxfVar2.c;
        if (auxcVar == null) {
            auxcVar = auxc.a;
        }
        if ((auxcVar.b & 2) != 0 && (aragVar2 = auxcVar.d) == null) {
            aragVar2 = arag.a;
        }
        this.c = ajgl.b(aragVar2);
    }

    public final void g(oam oamVar) {
        if (this.j.contains(oamVar)) {
            return;
        }
        this.j.add(oamVar);
        m();
    }

    public final void h(boolean z) {
        if (this.a == z) {
            return;
        }
        this.a = z;
        e(1);
    }

    public final void i(Bundle bundle) {
        if (this.g == bundle) {
            return;
        }
        this.g = bundle;
        e(64);
    }

    public final void j(oam oamVar) {
        this.j.remove(oamVar);
        if (this.j.isEmpty()) {
            m();
        }
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("id", this.h);
        c.g("isCurrentPlayback", this.a);
        c.b("title", this.b);
        c.e("idHashCode", this.h.hashCode());
        return c.toString();
    }
}
