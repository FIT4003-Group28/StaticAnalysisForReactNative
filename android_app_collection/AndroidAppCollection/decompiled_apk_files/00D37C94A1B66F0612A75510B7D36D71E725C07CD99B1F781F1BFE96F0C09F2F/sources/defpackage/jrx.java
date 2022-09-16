package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jrx */
/* loaded from: classes3.dex */
public final class jrx implements ajzh, ynl {
    private final fbw A;
    private final snc B;
    public final jsz a;
    public final yni b;
    public final jln c;
    public final jot d;
    public final fcd e;
    public final jaw f;
    public final aagi g;
    public final Executor h;
    public final Executor i;
    public final jrq j;
    public final jna k;
    public final jji l;
    public final CharSequence m;
    public final boolean n;
    public final jrv o = new jrv(this);
    public final ypf p;
    public LoadingFrameLayout q;
    public RecyclerView r;
    public jsy s;
    public akam t;
    public aypg u;
    public ajsm v;
    public fsl w;
    public boolean x;
    public final aacz y;
    private final fcu z;

    public jrx(jsz jszVar, yni yniVar, jln jlnVar, jot jotVar, fcd fcdVar, jaw jawVar, aagi aagiVar, Executor executor, Executor executor2, jrq jrqVar, jna jnaVar, ypf ypfVar, aacz aaczVar, fcu fcuVar, fbw fbwVar, snc sncVar, akam akamVar, jji jjiVar, CharSequence charSequence, boolean z) {
        this.a = jszVar;
        this.b = yniVar;
        this.c = jlnVar;
        this.d = jotVar;
        this.e = fcdVar;
        this.f = jawVar;
        this.h = executor;
        this.i = executor2;
        this.j = jrqVar;
        this.k = jnaVar;
        this.l = jjiVar;
        this.m = charSequence;
        this.n = z;
        this.g = aagiVar;
        this.p = ypfVar;
        this.y = aaczVar;
        this.z = fcuVar;
        this.A = fbwVar;
        this.B = sncVar;
        if (akamVar instanceof jrw) {
            jrw jrwVar = (jrw) akamVar;
            this.x = jrwVar.b;
            this.t = jrwVar.a;
        }
    }

    public static /* synthetic */ void b(Throwable th) {
        zep.d("Failed to set last downloads page usage", th);
    }

    public final void a() {
        jsy jsyVar = this.s;
        LoadingFrameLayout loadingFrameLayout = this.q;
        if (jsyVar == null || loadingFrameLayout == null) {
            return;
        }
        jrq jrqVar = this.j;
        if (!jrqVar.d) {
            acvg acvgVar = jrqVar.c;
            acvgVar.getClass();
            acvgVar.c("br_r");
        }
        jsyVar.c();
        loadingFrameLayout.a();
        if (this.A.b()) {
            ylx.j(this.z.a.b(new fcp(TimeUnit.MILLISECONDS.toSeconds(this.B.c()))), anjk.a, jou.h);
        }
        jrq jrqVar2 = this.j;
        if (!jrqVar2.d) {
            acvg acvgVar2 = jrqVar2.c;
            acvgVar2.getClass();
            acvgVar2.c("ol");
            jrqVar2.d = true;
        }
        this.x = true;
    }

    public final void c(boolean z) {
        ajsm ajsmVar;
        fsl fslVar;
        if (!this.n || (ajsmVar = this.v) == null || (fslVar = this.w) == null) {
            return;
        }
        if (!z) {
            ajsmVar.remove(fslVar);
        } else if (ajsmVar.contains(fslVar)) {
        } else {
            this.v.add(0, this.w);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                agnk agnkVar = (agnk) obj;
                jsy jsyVar = this.s;
                if (jsyVar == null) {
                    return null;
                }
                jsyVar.ll();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{agnk.class};
    }

    @Override // defpackage.ajzh
    public final akam pn() {
        throw null;
    }
}
