package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: arxa  reason: default package */
/* loaded from: classes2.dex */
public abstract class arxa implements aryd, aryf {
    private final arxj a;
    private final arrh b;
    private final Resources c;
    private final cqkn<aryd> d;
    private final dehq e;
    private final dehq f;
    @dzsi
    private bvpk g;
    @dzsi
    private bvpk h;
    private boolean i = false;
    private final aryg j;
    private final aryg k;
    private final aryg l;
    private final aryg m;
    public final Context o;
    @dzsi
    public arwz p;
    public arwy q;

    public arxa(Context context, arxf arxfVar, cqhn cqhnVar, arrh arrhVar, String str, cqkn<aryd> cqknVar, dehq dehqVar, dehq dehqVar2) {
        this.o = context;
        this.a = arxj.d(context, str);
        this.b = arrhVar;
        Resources resources = context.getResources();
        this.c = resources;
        this.d = cqknVar;
        this.e = dehqVar;
        this.f = dehqVar2;
        this.q = arwy.DISCONNECTED;
        this.j = arxg.i(this, resources);
        this.k = arxg.j(this, resources);
        this.l = arxg.k(this, resources, arxfVar);
        this.m = arxg.l(this, resources, arxfVar);
    }

    private final CharSequence F() {
        CharSequence K = K();
        if (K == null) {
            return this.c.getString(R.string.MEDIA_LOAD_BROWSE_ITEMS_ERROR_NULL_APPNAME_FALLBACK);
        }
        return this.c.getString(R.string.MEDIA_LOAD_BROWSE_ITEMS_ERROR, K);
    }

    private final arwz G() {
        arwz arwzVar = arwz.FAST_FORWARD_REWIND;
        arwy arwyVar = arwy.DISCONNECTED;
        return o().ordinal() != 0 ? (k() || l() || (!m() && !n())) ? arwz.SKIP_NEXT_PREVIOUS : arwz.FAST_FORWARD_REWIND : (m() || n() || (!k() && !l())) ? arwz.FAST_FORWARD_REWIND : arwz.SKIP_NEXT_PREVIOUS;
    }

    public void J(boolean z) {
        this.i = z;
        cqkx.p(this);
    }

    @Override // defpackage.aryd
    @dzsi
    public CharSequence K() {
        return ((arxh) this.a).a;
    }

    @Override // defpackage.aryd, defpackage.aryf
    @dzsi
    public cqtd L() {
        return ((arxh) this.a).b;
    }

    @Override // defpackage.aryd
    public cqtd M() {
        return irm.f(v(), u());
    }

    @Override // defpackage.aryf
    public List<arye> N() {
        btpf c = btpf.c(this.o);
        dcdc<arye> p = p();
        return new ArrayList(p.subList(0, Math.min(p.size(), true != c.f ? 9 : 4)));
    }

    @Override // defpackage.aryf
    @dzsi
    public CharSequence O() {
        CharSequence K = K();
        if (K == null) {
            return null;
        }
        return this.c.getString(R.string.OPEN_MEDIA_APP, K);
    }

    @Override // defpackage.aryd
    @dzsi
    public synchronized CharSequence P() {
        if (this.q == arwy.NOT_LOGGED_IN) {
            return this.c.getString(R.string.NOT_LOGGED_INTO_MEDIA_APP_TITLE);
        }
        return null;
    }

    @Override // defpackage.aryd
    public synchronized CharSequence PS() {
        String string;
        String string2;
        CharSequence K = K();
        arwz arwzVar = arwz.FAST_FORWARD_REWIND;
        arwy arwyVar = arwy.DISCONNECTED;
        int ordinal = this.q.ordinal();
        if (ordinal == 3) {
            CharSequence z = z();
            if (z != null) {
                return z;
            }
        } else if (ordinal == 4) {
            return F();
        } else if (ordinal == 5) {
            if (K == null) {
                string2 = this.c.getString(R.string.NOT_LOGGED_INTO_MEDIA_APP_TEXT_NULL_APPNAME_FALLBACK);
            } else {
                string2 = this.c.getString(R.string.NOT_LOGGED_INTO_MEDIA_APP_TEXT, K);
            }
            return string2;
        }
        if (K == null) {
            string = this.c.getString(R.string.MEDIA_APP_CONNECTION_ERROR_NULL_APPNAME_FALLBACK);
        } else {
            string = this.c.getString(R.string.MEDIA_APP_CONNECTION_ERROR, K);
        }
        return string;
    }

    @Override // defpackage.aryd
    @dzsi
    public CharSequence PT() {
        return null;
    }

    @Override // defpackage.aryd
    public cqkl PU() {
        return cqkl.a;
    }

    @Override // defpackage.aryf
    public CharSequence Q() {
        return F();
    }

    @Override // defpackage.aryd
    public Boolean R() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.aryd
    public Boolean S() {
        boolean z = false;
        if (!V().booleanValue() && !U().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aryd
    public synchronized Boolean T() {
        return Boolean.valueOf(this.p != null);
    }

    @Override // defpackage.aryd
    public Boolean U() {
        boolean z = true;
        if (V().booleanValue() || (!r() && q() == null)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aryd
    public synchronized Boolean V() {
        boolean z;
        z = true;
        if (this.q != arwy.CONNECTION_ERROR && this.q != arwy.APP_ERROR && this.q != arwy.NO_CONTENT_ERROR && this.q != arwy.NOT_LOGGED_IN) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aryd
    public cqkl W() {
        am(arwz.PLAY_PAUSE);
        arye q = q();
        if (r()) {
            c();
        } else if (q != null) {
            q.e();
        }
        return cqkl.a;
    }

    @Override // defpackage.aryd
    public cqkl X() {
        h();
        this.b.a();
        return cqkl.a;
    }

    @Override // defpackage.aryf
    public cqkl Y() {
        this.b.b();
        i();
        return cqkl.a;
    }

    @Override // defpackage.aryd
    public aryg Z() {
        arwz arwzVar = arwz.FAST_FORWARD_REWIND;
        arwy arwyVar = arwy.DISCONNECTED;
        return G().ordinal() != 0 ? this.k : this.m;
    }

    protected abstract void a();

    @Override // defpackage.aryd
    public aryg aa() {
        arwz arwzVar = arwz.FAST_FORWARD_REWIND;
        arwy arwyVar = arwy.DISCONNECTED;
        return G().ordinal() != 0 ? this.j : this.l;
    }

    @Override // defpackage.aryd
    @dzsi
    public CharSequence ab() {
        arye q = q();
        if (r()) {
            return x();
        }
        if (q == null) {
            return null;
        }
        return q.d();
    }

    @Override // defpackage.aryd
    public aryl ac() {
        arye q = q();
        return (r() || q == null) ? y() : q;
    }

    @Override // defpackage.aryd
    public cqkn<aryd> ad() {
        return this.d;
    }

    @Override // defpackage.aryf
    public Integer ae() {
        return Integer.valueOf(true != btpf.c(this.o).f ? 9 : 4);
    }

    @Override // defpackage.aryf
    public Boolean af() {
        boolean z = false;
        if (!t().booleanValue() && p().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public String ag() {
        return ((arxh) this.a).c;
    }

    public void ah() {
        synchronized (this) {
            bvpk bvpkVar = this.h;
            if (bvpkVar != null) {
                bvpkVar.b();
            }
            bvpk a = bvpk.a(new arww(this));
            this.h = a;
            bvqd.a(this.e.d(a, 30L, TimeUnit.SECONDS), this.f);
        }
        a();
    }

    public void ai() {
        synchronized (this) {
            bvpk bvpkVar = this.h;
            if (bvpkVar != null) {
                bvpkVar.b();
            }
        }
        b();
    }

    public final synchronized void aj(arwy arwyVar) {
        if (this.q == arwyVar) {
            return;
        }
        this.q = arwyVar;
        if (arwyVar != arwy.CONNECTED || !this.b.c()) {
            return;
        }
        h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void ak(arwy arwyVar, arwy arwyVar2) {
        if (this.q == arwyVar) {
            aj(arwyVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public final synchronized arwz al() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void am(arwz arwzVar) {
        if (this.p == null) {
            this.p = arwzVar;
            bvpk a = bvpk.a(new arwx(this));
            this.g = a;
            bvqd.a(this.e.d(a, 10L, TimeUnit.SECONDS), this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void an() {
        this.p = null;
        bvpk bvpkVar = this.g;
        if (bvpkVar != null) {
            bvpkVar.b();
            this.g = null;
        }
    }

    protected abstract void b();

    protected abstract void c();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void d();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void f();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void g();

    protected abstract void h();

    protected abstract void i();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean k();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean l();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean m();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean n();

    protected abstract arwz o();

    protected abstract dcdc<arye> p();

    @dzsi
    protected abstract arye q();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean r();

    protected abstract cqss v();

    public abstract ddnk w();

    @dzsi
    protected abstract CharSequence x();

    protected abstract aryl y();

    @dzsi
    protected abstract CharSequence z();
}
