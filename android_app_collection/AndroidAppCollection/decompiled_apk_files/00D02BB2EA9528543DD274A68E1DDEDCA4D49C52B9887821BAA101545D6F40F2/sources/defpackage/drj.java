package defpackage;

import android.content.res.Resources;
import android.graphics.Picture;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: drj  reason: default package */
/* loaded from: classes6.dex */
public class drj implements dpu {
    protected final Resources a;
    protected final dpw b;
    public final dbsg<dsf> c;
    @dzsi
    protected ilo d;
    @dzsi
    public dmr e;
    private final dhm f;

    public drj(Resources resources, dpw dpwVar, dbsg<dsf> dbsgVar, dhm dhmVar) {
        this.a = resources;
        this.c = dbsgVar;
        this.b = dpwVar;
        this.f = dhmVar;
    }

    @Override // defpackage.dpu
    public final Picture a(float f) {
        String e = e(f);
        ilo iloVar = this.d;
        dbsk.s(iloVar);
        String q = iloVar.q();
        if (dbsj.d(q)) {
            return this.f.a(e);
        }
        return this.f.b(q, e);
    }

    public void b(ilo iloVar) {
        this.d = iloVar;
        this.b.a(iloVar);
        d(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(@dzsi dsza dszaVar) {
        if (this.d == null || !this.c.a()) {
            return;
        }
        if (this.e != null) {
            dmr dmrVar = this.e;
            dbsk.s(dmrVar);
            this.c.b().b(dmrVar);
            this.e = null;
        }
        ilo iloVar = this.d;
        dbsk.s(iloVar);
        dbsk.s(iloVar.ai());
        dmr d = dmr.d(dmq.PRIMARY_PIN, iloVar.ai());
        dmx dmxVar = new dmx();
        dmxVar.a = d;
        dmxVar.c(iloVar);
        dmv a = dmxVar.a();
        if (dszaVar != null) {
            dmu h = a.h();
            h.b(dszaVar);
            a = h.a();
        }
        this.e = a.a();
        this.c.b().a(a);
    }

    public String e(float f) {
        if (f < 20.0f) {
            return this.a.getString(R.string.AR_PIN_ARRIVED);
        }
        return this.f.c(f);
    }
}
