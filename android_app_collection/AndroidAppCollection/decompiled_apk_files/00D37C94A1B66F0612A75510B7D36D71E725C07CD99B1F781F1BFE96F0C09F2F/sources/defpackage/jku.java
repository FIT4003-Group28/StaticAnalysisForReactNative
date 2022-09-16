package defpackage;

import android.view.View;
import android.view.ViewStub;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: jku  reason: default package */
/* loaded from: classes3.dex */
public final class jku implements ynl {
    public String a;
    public String b;
    ankt c;
    ankt d;
    public final agrf e;
    public final fbj f;
    private final ViewStub g;
    private final ScheduledExecutorService h;
    private final Executor i;
    private final yni j;
    private final ahdn k;
    private final jlk l;
    private final fcd m;
    private final fcc n = new fcc() { // from class: jko
        @Override // defpackage.fcc
        public final void a() {
            jku.this.c();
        }
    };
    private View o;
    private boolean p;

    public jku(ScheduledExecutorService scheduledExecutorService, Executor executor, agrf agrfVar, yni yniVar, ahdn ahdnVar, fcd fcdVar, fbj fbjVar, ViewStub viewStub, jlk jlkVar) {
        this.h = scheduledExecutorService;
        this.i = executor;
        this.e = agrfVar;
        this.j = yniVar;
        this.k = ahdnVar;
        this.m = fcdVar;
        this.g = viewStub;
        this.l = jlkVar;
        this.f = fbjVar;
    }

    private final void e() {
        ankt anktVar = this.c;
        if (anktVar != null) {
            anktVar.cancel(false);
            this.c = null;
        }
        ankt anktVar2 = this.d;
        if (anktVar2 != null) {
            anktVar2.cancel(false);
            this.d = null;
        }
    }

    public final void a() {
        e();
        this.a = null;
        this.b = null;
        this.j.m(this);
        this.m.b(this.n);
        d(false);
    }

    public final void b(ajrs ajrsVar) {
        if (!this.k.c()) {
            d(false);
            return;
        }
        this.a = ajrsVar.k("VideoPresenterConstants.VIDEO_ID");
        this.b = ajrsVar.k("PlaylistPresenterConstants.PLAYLIST_ID");
        if (!amps.e(this.a) || !amps.e(this.b)) {
            this.j.g(this);
            this.m.a(this.n);
            c();
            return;
        }
        d(false);
    }

    public final void c() {
        e();
        String str = this.a;
        String str2 = this.b;
        if (amps.e(str)) {
            if (amps.e(str2)) {
                return;
            }
            ankt i = anii.i(anlz.v(new jkp(this), this.h), new jkq(str2), this.h);
            this.d = i;
            anlz.A(i, new jkt(this, 1), this.i);
            return;
        }
        ankt i2 = anii.i(anlz.v(new jkp(this, 1), this.h), new jkq(str, 1), this.h);
        this.c = i2;
        anlz.A(i2, new jkt(this), this.i);
    }

    public final void d(boolean z) {
        ylr.c();
        if (z && this.o == null) {
            View inflate = this.g.inflate();
            final jlk jlkVar = this.l;
            if (jlkVar != null && inflate != null) {
                jlkVar.a = inflate;
                inflate.setOnClickListener(new View.OnClickListener() { // from class: jkn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        jlk.this.e();
                    }
                });
            }
            this.o = inflate;
        }
        View view = this.o;
        if (view != null && z != this.p) {
            zag.o(view, z);
        }
        this.p = z;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                if (!((jiy) obj).a.equals(this.a)) {
                    return null;
                }
                d(false);
                return null;
            } else if (i == 1) {
                jiz jizVar = (jiz) obj;
                c();
                return null;
            } else if (i == 2) {
                if (!((agnn) obj).a.equals(this.b)) {
                    return null;
                }
                d(false);
                return null;
            } else if (i == 3) {
                final agnz agnzVar = (agnz) obj;
                this.f.a().E(new ayqe() { // from class: jks
                    @Override // defpackage.ayqe
                    public final Object a(Object obj2) {
                        return Boolean.valueOf(((amvn) obj2).contains(agnz.this.a.m()));
                    }
                }).S(new ayqb() { // from class: jkr
                    @Override // defpackage.ayqb
                    public final void a(Object obj2) {
                        jku jkuVar = jku.this;
                        agnz agnzVar2 = agnzVar;
                        if (!((Boolean) obj2).booleanValue()) {
                            if (!agnzVar2.a.m().equals(jkuVar.a) || agnzVar2.a.i() != agqp.PLAYABLE) {
                                if (amps.e(jkuVar.b) || !jkuVar.e.a().i().n(agnzVar2.a.m()).contains(jkuVar.b)) {
                                    return;
                                }
                                jkuVar.d(true);
                                return;
                            }
                            jkuVar.d(true);
                        }
                    }
                });
                return null;
            } else if (i == 4) {
                if (!((agoa) obj).a.equals(this.a)) {
                    return null;
                }
                d(false);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{jiy.class, jiz.class, agnn.class, agnz.class, agoa.class};
    }
}
