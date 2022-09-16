package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jro  reason: default package */
/* loaded from: classes3.dex */
public final class jro implements ynl {
    public final Context a;
    public final yni b;
    public final fcd c;
    public final fbr d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final ViewTreeObserver.OnGlobalLayoutListener h;
    public final fcc i;
    public final fbq j;
    public auex k;
    public String l;
    public final fbj m;
    private final azqb n;
    private final jkz o;

    public jro(Context context, yni yniVar, azqb azqbVar, jkz jkzVar, fcd fcdVar, fbr fbrVar, fbj fbjVar, View view) {
        this.a = context;
        this.b = yniVar;
        this.n = azqbVar;
        this.o = jkzVar;
        this.c = fcdVar;
        this.d = fbrVar;
        this.m = fbjVar;
        TextView textView = (TextView) view.findViewById(R.id.author);
        this.e = textView;
        this.f = (TextView) view.findViewById(R.id.details);
        TextView textView2 = (TextView) view.findViewById(R.id.overflow_video_size_bytes);
        this.g = textView2;
        this.h = new jvd(textView, textView2);
        this.i = new fcc() { // from class: jrk
            @Override // defpackage.fcc
            public final void a() {
                jro.this.b();
            }
        };
        this.j = new fbq() { // from class: jrj
            @Override // defpackage.fbq
            public final void a(final agog agogVar) {
                final jro jroVar = jro.this;
                jroVar.m.a().E(new ayqe() { // from class: jrn
                    @Override // defpackage.ayqe
                    public final Object a(Object obj) {
                        return Boolean.valueOf(jro.this.c((amvn) obj, agogVar.a.m()));
                    }
                }).S(new jrl(jroVar));
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (((defpackage.agrf) r6.n.get()).a().i().e(r3) == null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.agqv r7) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jro.a(agqv):void");
    }

    public final void b() {
        String str = this.l;
        if (!amps.e(str)) {
            a(((agrf) this.n.get()).a().m().e(str));
        }
    }

    public final boolean c(amvn amvnVar, String str) {
        return !amps.e(this.l) && this.l.equals(str) && !amvnVar.contains(this.l);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        switch (i) {
            case -1:
                return new Class[]{jiy.class, jiz.class, agnj.class, agnn.class, agnq.class, agnr.class, agnz.class, agoa.class};
            case 0:
                jiy jiyVar = (jiy) obj;
                if (amps.e(this.l) || !this.l.equals(jiyVar.a)) {
                    return null;
                }
                a(null);
                return null;
            case 1:
                jiz jizVar = (jiz) obj;
                if (amps.e(this.l) || !this.l.equals(jizVar.a)) {
                    return null;
                }
                b();
                return null;
            case 2:
                agnj agnjVar = (agnj) obj;
                b();
                return null;
            case 3:
                agnn agnnVar = (agnn) obj;
                b();
                return null;
            case 4:
                agnq agnqVar = (agnq) obj;
                auex auexVar = this.k;
                if (auexVar == null) {
                    return null;
                }
                if (!agnqVar.a.equals(auexVar.qn(aueu.b) ? this.k.qm(aueu.b) : null)) {
                    return null;
                }
                b();
                return null;
            case 5:
                agnr agnrVar = (agnr) obj;
                auex auexVar2 = this.k;
                if (auexVar2 == null) {
                    return null;
                }
                if (!agnrVar.a.d().equals(auexVar2.qn(aueu.b) ? auexVar2.qm(aueu.b) : null)) {
                    return null;
                }
                b();
                return null;
            case 6:
                final agnz agnzVar = (agnz) obj;
                this.m.a().E(new ayqe() { // from class: jrm
                    @Override // defpackage.ayqe
                    public final Object a(Object obj2) {
                        return Boolean.valueOf(jro.this.c((amvn) obj2, agnzVar.a.m()));
                    }
                }).S(new jrl(this, 1));
                return null;
            case 7:
                agoa agoaVar = (agoa) obj;
                if (amps.e(this.l) || !this.l.equals(agoaVar.a)) {
                    return null;
                }
                b();
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
