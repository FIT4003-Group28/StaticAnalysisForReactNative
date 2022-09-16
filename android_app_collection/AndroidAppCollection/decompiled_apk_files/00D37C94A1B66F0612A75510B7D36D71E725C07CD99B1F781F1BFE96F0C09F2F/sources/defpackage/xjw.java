package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import com.google.android.youtube.R;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: xjw  reason: default package */
/* loaded from: classes4.dex */
public final class xjw extends ahlb implements ahnw, ahlz {
    private static final float c = ahom.a(120.0f);
    private static final float e = ahom.a(40.0f);
    private static final String f = alj.a().b(" · ");
    public final xjx a;
    public xjy b;
    private final ahob g;
    private final ahnh h;
    private final Resources i;

    public xjw(Resources resources, final Handler handler, ahoo ahooVar, ahof ahofVar, ahob ahobVar) {
        this.i = resources;
        this.g = ahobVar;
        xjx xjxVar = new xjx(resources, ahobVar.b, ahooVar.clone(), ahofVar.a.a());
        this.a = xjxVar;
        ((ahjs) xjxVar).c = new ahjt() { // from class: xju
            @Override // defpackage.ahjt
            public final void a() {
                final xjw xjwVar = xjw.this;
                Handler handler2 = handler;
                if (xjwVar.b != null) {
                    handler2.post(new Runnable() { // from class: xjv
                        @Override // java.lang.Runnable
                        public final void run() {
                            xjw.this.b.a.a.d();
                        }
                    });
                }
            }
        };
        ahnh a = ahobVar.b.a(ahooVar.clone(), c, e);
        this.h = a;
        a.A(2.0f);
        a.z(-1);
        a.h(17);
        xjxVar.n(0.0f, ahom.a(-180.0f), 0.0f);
        a.n(0.0f, ahom.a(-40.0f), 0.0f);
        q(a);
        q(xjxVar);
        ahobVar.e.add(this);
        c(ahobVar.w());
    }

    public final void a() {
        this.a.d(true);
    }

    public final void b(int i) {
        this.h.y(this.i.getString(R.string.ad_minimized, f, zgh.i(i / 1000)));
    }

    @Override // defpackage.ahnw
    public final void c(boolean z) {
        this.h.qS(z);
    }

    public final void d(int i) {
        this.a.e(i);
    }

    public final void e(boolean z) {
        this.l = !z;
        this.g.l();
    }

    @Override // defpackage.ahlz
    public final boolean f(ahjy ahjyVar) {
        Iterator it = iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                ahmf ahmfVar = (ahmf) it.next();
                if (ahmfVar instanceof ahlz) {
                    if (z || ((ahlz) ahmfVar).f(ahjyVar)) {
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    @Override // defpackage.ahlz
    public final boolean g(ahjy ahjyVar) {
        return false;
    }

    @Override // defpackage.ahlz
    public final boolean h(ahjy ahjyVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ahmf ahmfVar = (ahmf) it.next();
            if ((ahmfVar instanceof ahlz) && !((ahlz) ahmfVar).h(ahjyVar)) {
                return false;
            }
        }
        return true;
    }
}
