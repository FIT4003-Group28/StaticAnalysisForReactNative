package defpackage;

import j$.util.Objects;
/* compiled from: PG */
/* renamed from: aiog  reason: default package */
/* loaded from: classes.dex */
public final class aiog implements aioe {
    private static final acup c = acuo.a(28631);
    public final acti a;
    public String b;
    private final airw d;
    private final aypf e = new aypf();
    private final aynx f;
    private String g;

    public aiog(acti actiVar, airw airwVar, aynx aynxVar) {
        this.a = actiVar;
        this.d = airwVar;
        this.f = aynxVar;
    }

    @Override // defpackage.aioe
    public final void a(aino ainoVar) {
        if (ainoVar.c().h()) {
            this.a.n(new acte((actj) ainoVar.c().c()));
        }
    }

    @Override // defpackage.aioe
    public final void b(aino ainoVar) {
        if (ainoVar.c().h()) {
            this.a.H(3, new acte((actj) ainoVar.c().c()), null);
        }
    }

    @Override // defpackage.aioe
    public final void c() {
        if (this.e.a() == 0) {
            this.e.d(this.d.ae(aihl.d, aihl.e).Z(new aiof(this)));
            this.e.d(this.f.Z(new aiof(this, 1)));
        }
        String str = this.b;
        if (str == null || Objects.equals(this.g, str)) {
            return;
        }
        this.a.d(c, null, null);
        this.g = this.b;
    }

    @Override // defpackage.aioe
    public final void d() {
        this.a.H(3, new acte(actj.PUSH_NOTIFICATION), null);
    }

    @Override // defpackage.aioe
    public final void e() {
        if (this.e.a() > 0) {
            this.a.t();
            this.g = null;
            this.b = null;
            this.e.c();
        }
    }
}
