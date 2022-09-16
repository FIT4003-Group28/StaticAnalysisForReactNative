package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahob  reason: default package */
/* loaded from: classes.dex */
public final class ahob extends ahlb implements ahod, ahoe {
    public final ahof a;
    public final ahne b;
    public final ahlb c;
    public final List e;
    public ahnx f;
    public boolean g;
    public boolean h;
    public ahnz i;
    public ahny j;
    public ahnv k;
    public ahoa m;
    private final ahli n;
    private final ahky o;
    private final ahjs p;
    private boolean q;
    private boolean r;
    private int s;

    public ahob(Context context, ViewGroup viewGroup, ahof ahofVar) {
        ahofVar.getClass();
        this.a = ahofVar;
        ahne ahneVar = new ahne(viewGroup, context, new Handler(Looper.getMainLooper()), ahofVar.a.c());
        this.b = ahneVar;
        ahlb ahlbVar = new ahlb();
        this.c = ahlbVar;
        this.e = new ArrayList();
        Resources resources = context.getResources();
        Bitmap d = ahom.d(resources, R.raw.vr_button_border_small);
        Bitmap d2 = ahom.d(resources, R.raw.vr_button_fill);
        ahoo clone = ahofVar.c.clone();
        clone.e(false);
        ahjx A = A(d, clone, ahofVar);
        A.a(new ahly(A, 0.8f, 0.0f));
        ahjx A2 = A(d2, clone, ahofVar);
        A2.a(new ahly(A2, 0.0f, 1.0f));
        ahjs ahjsVar = new ahjs(new ahli(clone, 0.0f, 0.0f));
        this.p = ahjsVar;
        ahjsVar.q(A2);
        ahjsVar.q(A);
        this.n = new ahli(ahofVar.c.clone(), ahofVar.h * 3.0f, ahofVar.i * 3.0f);
        this.s = ahofVar.k;
        ahofVar.a(this);
        ahofVar.c(this);
        ahlb ahlbVar2 = new ahlb();
        Handler handler = new Handler(Looper.getMainLooper());
        ahoo clone2 = clone.clone();
        super.q(ahlbVar);
        super.q(ahjsVar);
        super.q(ahlbVar2);
        this.o = new ahky(ahlbVar2, ahneVar, handler, clone2.clone(), ahofVar, resources.getString(R.string.vr_click_to_recenter));
        k(false);
    }

    private static ahjx A(Bitmap bitmap, ahoo ahooVar, ahof ahofVar) {
        float a = ahom.a(bitmap.getWidth());
        int height = bitmap.getHeight();
        ahjx ahjxVar = new ahjx(bitmap, ahon.a(a, ahom.a(height), ahon.c), ahooVar, ahofVar.a.b());
        ahjxVar.a(new ahme(ahjxVar, ahme.b(0.5f), ahme.b(0.05f)));
        return ahjxVar;
    }

    public final ahoo a() {
        return this.a.c;
    }

    @Override // defpackage.ahoe
    public final void c(float f, float f2) {
        this.n.b(f * 3.0f, f2 * 3.0f);
    }

    public final void d(ahlz ahlzVar) {
        this.c.q(ahlzVar);
        l();
    }

    public final void g() {
        this.a.b.l = false;
        ahnz ahnzVar = this.i;
        if (ahnzVar != null) {
            ahpx ahpxVar = (ahpx) ahnzVar;
            ahpxVar.p = true;
            ahpxVar.k();
        }
    }

    public final void h(boolean z) {
        for (ahnw ahnwVar : this.e) {
            ahnwVar.c(z);
        }
    }

    @Override // defpackage.ahlb, defpackage.ahmf
    public final void i() {
        super.i();
        this.a.g(this);
        this.a.h(this);
    }

    @Override // defpackage.ahlb, defpackage.ahmf
    public final void j(ahjy ahjyVar) {
        super.j(ahjyVar);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (!((ahlz) ((ahmf) it.next())).h(ahjyVar)) {
                return;
            }
        }
        this.a.k(ahjyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(boolean z) {
        boolean z2 = !z;
        this.l = z2;
        this.r = z2;
    }

    public final void l() {
        boolean z;
        ahjs ahjsVar = this.p;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            } else if (!((ahmf) it.next()).v()) {
                z = false;
                break;
            }
        }
        ahjsVar.l = z;
    }

    @Override // defpackage.ahlb, defpackage.ahmf
    public final void m(ahjy ahjyVar) {
        boolean z;
        boolean z2;
        if (!v()) {
            Iterator it = this.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                ahmf ahmfVar = (ahmf) it.next();
                if ((ahmfVar instanceof ahlz) && ((ahlz) ahmfVar).g(ahjyVar)) {
                    z = true;
                    break;
                }
            }
            Iterator it2 = this.c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
                ahmf ahmfVar2 = (ahmf) it2.next();
                if ((ahmfVar2 instanceof ahlz) && ((ahlz) ahmfVar2).f(ahjyVar)) {
                    z2 = true;
                    break;
                }
            }
            this.p.qR(!s(), ahjyVar);
            this.p.l = z || !z2;
            int i = this.s;
            if (i != 3 && i != 2) {
                if (!this.n.a(ahjyVar).b()) {
                    if (!this.q) {
                        this.q = true;
                        ahky ahkyVar = this.o;
                        ahkyVar.b.l = false;
                        ahkyVar.a.postAtTime(ahkyVar.c, SystemClock.uptimeMillis() + 5000);
                    }
                } else if (this.q) {
                    this.q = false;
                    ahky ahkyVar2 = this.o;
                    ahkyVar2.b.l = true;
                    ahkyVar2.a.removeCallbacks(ahkyVar2.c);
                }
            }
            super.m(ahjyVar);
        }
        if (this.r) {
            this.a.l(0.0f);
            this.r = false;
        }
    }

    public final void p(String str, String str2) {
        ahny ahnyVar = this.j;
        if (ahnyVar == null) {
            zep.b("Attempted to update the video metadata but the listener is null.");
            return;
        }
        ahpx ahpxVar = (ahpx) ahnyVar;
        ahpxVar.f.c(str);
        ahpxVar.f.a(str2);
        ahpxVar.p = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(boolean z, boolean z2) {
        this.g = z;
        this.h = z2;
    }

    public final boolean w() {
        ahnx ahnxVar = this.f;
        return ahnxVar == null || ((ahpx) ahnxVar).n;
    }

    public final boolean x() {
        ahnv ahnvVar = this.k;
        return ahnvVar != null && !((ahmh) ahnvVar).v();
    }

    public final boolean y() {
        ahoa ahoaVar = this.m;
        return ahoaVar != null && ((ahrj) ahoaVar).j;
    }

    @Override // defpackage.ahod
    public final void z(int i) {
        this.s = i;
    }
}
