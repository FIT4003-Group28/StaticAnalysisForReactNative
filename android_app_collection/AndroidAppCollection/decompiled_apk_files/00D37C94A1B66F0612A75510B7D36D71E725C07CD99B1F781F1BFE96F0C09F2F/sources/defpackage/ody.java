package defpackage;
/* compiled from: PG */
/* renamed from: ody  reason: default package */
/* loaded from: classes3.dex */
public final class ody implements airt, wlr, ynl {
    public final ajsm a;
    public fkh b;
    public aqef c;
    final odx d;
    public fmo e;
    private final tdb f;
    private boolean g = false;
    private boolean h = false;

    public ody(tdb tdbVar) {
        ajsm ajsmVar = new ajsm();
        this.a = ajsmVar;
        this.f = tdbVar;
        odx odxVar = new odx(this);
        this.d = odxVar;
        ajsmVar.i(odxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ahhw ahhwVar) {
        odx odxVar = this.d;
        odxVar.a = ahhwVar.c();
        boolean z = false;
        if (odxVar.a == aika.NEW) {
            odxVar.b.d(false);
        } else if (odxVar.a == aika.VIDEO_REQUESTED) {
            odxVar.f();
        }
        int ordinal = ahhwVar.c().ordinal();
        if (ordinal == 0) {
            this.g = false;
            this.h = false;
        } else if (ordinal != 7 || this.h) {
        } else {
            this.h = true;
            if (ahhwVar.b() != null) {
                z = true;
            }
            this.g = z;
            b();
            c();
        }
    }

    public final void b() {
        fmo fmoVar;
        if (!this.h || (fmoVar = this.e) == null || this.a.contains(fmoVar) || !this.g || this.a.size() != 0) {
            return;
        }
        this.a.add(this.e);
    }

    public final void c() {
        aqef aqefVar;
        if (!this.g || this.a.size() != 0 || !this.h || (aqefVar = this.c) == null) {
            return;
        }
        this.a.add(aqefVar);
    }

    public final void d(boolean z) {
        aopa createBuilder = aqfe.a.createBuilder();
        createBuilder.copyOnWrite();
        aqfe aqfeVar = (aqfe) createBuilder.instance;
        aqfeVar.c |= 1;
        aqfeVar.d = z;
        this.f.b(aakj.d(aqfe.b.a(), "COMPANION_AD_SLOT_STATE_CLIENT"), ((aqfe) createBuilder.mo39build()).toByteArray());
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().b.aa(new ayqb() { // from class: odw
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ody.this.a((ahhw) obj);
            }
        }, npy.p)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                a((ahhw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhw.class};
    }
}
