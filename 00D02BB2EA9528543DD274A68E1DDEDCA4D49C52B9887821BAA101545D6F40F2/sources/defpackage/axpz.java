package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: axpz  reason: default package */
/* loaded from: classes3.dex */
public class axpz implements axoo {
    public final axgi a;
    public final List<axos> b = new ArrayList();
    public final axqa c;
    private final axpf d;
    private final dzsj<gga> e;

    public axpz(axpf axpfVar, dzsj<gga> dzsjVar, final axgi axgiVar) {
        this.d = axpfVar;
        this.e = dzsjVar;
        this.a = axgiVar;
        axgh h = axgiVar.d.h();
        dbsk.s(h);
        boolean z = true;
        if (h.a() != axgg.PARTIALLY_LOADED) {
            axgh h2 = axgiVar.d.h();
            dbsk.s(h2);
            if (h2.a() != axgg.SUBSEQUENT_LOAD_ERROR) {
                z = false;
            }
        }
        this.c = new axqa(z, new Runnable(axgiVar) { // from class: axpv
            private final axgi a;

            {
                this.a = axgiVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d(axok.FOLLOWING);
            }
        });
    }

    @Override // defpackage.axoo
    public dfqc a() {
        if (this.a.b()) {
            return dfqc.SELF_FOLLOWING_LIST;
        }
        return dfqc.OTHERS_FOLLOWING_LIST;
    }

    @Override // defpackage.axot
    public List<axos> b() {
        return this.b;
    }

    @Override // defpackage.axot
    public Boolean c() {
        boolean z = false;
        if (this.b.isEmpty()) {
            axgh h = this.a.d.h();
            dbsk.s(h);
            if (h.a() == axgg.LOADED) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.axot
    public String d() {
        return this.e.a().getString(R.string.ZERO_STATE_TITLE_NO_FOLLOWING);
    }

    @Override // defpackage.axot
    public axor e() {
        return null;
    }

    @Override // defpackage.axot
    public cqqw f() {
        return this.c;
    }

    @Override // defpackage.axot
    public Boolean g() {
        axgh h = this.a.d.h();
        dbsk.s(h);
        return Boolean.valueOf(h.a() == axgg.SUBSEQUENT_LOAD_IN_PROGRESS);
    }

    @Override // defpackage.axot
    public jht h(axos axosVar) {
        return null;
    }

    @Override // defpackage.axot
    public cjtd i() {
        return cjtd.a(dtxy.B);
    }

    public axon j(dqae dqaeVar) {
        return this.d.a(dqaeVar, this);
    }
}
