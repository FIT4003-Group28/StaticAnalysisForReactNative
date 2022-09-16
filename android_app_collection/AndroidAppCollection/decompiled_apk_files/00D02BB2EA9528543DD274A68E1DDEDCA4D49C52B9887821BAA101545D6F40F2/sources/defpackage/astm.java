package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: astm  reason: default package */
/* loaded from: classes2.dex */
public abstract class astm implements asuq {
    private final asmp a;
    private final Resources b;
    private final btvo c;
    @dzsi
    private final asuh d;
    @dzsi
    private final audn e;
    private final asuu f;

    public astm(final asmp asmpVar, Resources resources, btvo btvoVar, @dzsi asuh asuhVar, @dzsi audn audnVar) {
        this(asmpVar, resources, btvoVar, null, null, new asud(resources, new Runnable(asmpVar) { // from class: astl
            private final asmp a;

            {
                this.a = asmpVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.E();
            }
        }, dtxw.bi));
    }

    public astm(asmp asmpVar, Resources resources, btvo btvoVar, @dzsi asuh asuhVar, @dzsi audn audnVar, asuu asuuVar) {
        this.a = asmpVar;
        this.b = resources;
        this.c = btvoVar;
        this.d = asuhVar;
        this.e = audnVar;
        this.f = asuuVar;
    }

    @dzsi
    private final astb a() {
        astc x = x();
        if (x != null) {
            return x.g;
        }
        return null;
    }

    @Override // defpackage.asuq
    @dzsi
    /* renamed from: A */
    public asuh p() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean B() {
        audn audnVar = this.e;
        return audnVar != null && audnVar.a().i().booleanValue();
    }

    @Override // defpackage.asuq
    public Boolean h() {
        astc x = x();
        boolean z = false;
        if (x != null && x.a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.asuq
    public Boolean i() {
        astc x = x();
        boolean z = false;
        if (x == null) {
            return false;
        }
        if (x.b == null && a() != astb.NO_SEARCH && vxx.d(x.e(), this.c)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.asuq
    public Boolean j() {
        boolean z = false;
        if (i().booleanValue() && a() == astb.SEARCH_NOT_AUTOREFRESHING) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.asuq
    @dzsi
    public String k() {
        if (i().booleanValue()) {
            if (a() == astb.SEARCH_NOT_AUTOREFRESHING) {
                return this.b.getString(R.string.REFRESH_BUTTON);
            }
            if (a() == astb.SEARCH_AUTOREFRESHING) {
                return this.b.getString(R.string.ENROUTE_CLEAR_RESULTS);
            }
            if (a() != astb.SEARCHING) {
                return null;
            }
            return this.b.getString(R.string.ENROUTE_SEARCHING);
        }
        return null;
    }

    @Override // defpackage.asuq
    @dzsi
    public asup l() {
        if (i().booleanValue()) {
            if (a() == astb.SEARCH_NOT_AUTOREFRESHING) {
                return asup.REFRESH;
            }
            if (a() == astb.SEARCH_AUTOREFRESHING) {
                return asup.CROSS;
            }
            if (a() != astb.SEARCHING) {
                return null;
            }
            return asup.SPINNER;
        }
        return null;
    }

    @Override // defpackage.asuq
    public cqkl m() {
        if (i().booleanValue()) {
            if (a() == astb.SEARCH_NOT_AUTOREFRESHING) {
                this.a.o(true);
            } else if (a() == astb.SEARCH_AUTOREFRESHING || a() == astb.SEARCHING) {
                this.a.j();
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.asuq
    @dzsi
    public cjtd n() {
        astb a = a();
        if (!i().booleanValue() || a == null) {
            return null;
        }
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            return cjtd.a(dtxw.bT);
        }
        if (ordinal == 2) {
            return cjtd.a(dtxw.bR);
        }
        if (ordinal == 3) {
            return cjtd.a(dtxw.bS);
        }
        return null;
    }

    @Override // defpackage.asuq
    public Boolean o() {
        return false;
    }

    @Override // defpackage.asuq
    public Boolean q() {
        asuh asuhVar;
        boolean z = false;
        if (B() && (asuhVar = this.d) != null && asuhVar.A().booleanValue() && !i().booleanValue() && !h().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.asuq
    @dzsi
    public audn r() {
        return this.e;
    }

    @Override // defpackage.asuq
    public Boolean s() {
        return false;
    }

    @Override // defpackage.asuq
    public Boolean t() {
        return false;
    }

    @Override // defpackage.asuq
    public cqkl u() {
        return cqkl.a;
    }

    @Override // defpackage.asuq
    @dzsi
    public View.OnLayoutChangeListener v() {
        return null;
    }

    @Override // defpackage.asuq
    public asuu w() {
        return this.f;
    }

    @dzsi
    protected abstract astc x();

    @Override // defpackage.asuq
    public Boolean y() {
        return false;
    }

    @Override // defpackage.asuq
    public Float z() {
        return Float.valueOf(0.0f);
    }
}
