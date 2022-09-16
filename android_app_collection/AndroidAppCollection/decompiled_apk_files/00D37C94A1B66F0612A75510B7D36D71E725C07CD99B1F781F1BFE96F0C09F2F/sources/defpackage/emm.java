package defpackage;
/* compiled from: PG */
/* renamed from: emm  reason: default package */
/* loaded from: classes3.dex */
public final class emm {
    public final airw a;
    private final aacz b;

    public emm(aacz aaczVar, azqb azqbVar) {
        this.b = aaczVar;
        this.a = (airw) azqbVar.get();
    }

    public final aynx a() {
        return this.a.V();
    }

    public final aynx b() {
        return this.a.G().d;
    }

    public final Boolean c() {
        apzt apztVar = this.b.b().z;
        if (apztVar == null) {
            apztVar = apzt.a;
        }
        boolean z = false;
        if (apztVar.d) {
            if (this.a.E() != null && this.a.E().R()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    public final Long d() {
        if (this.a.E() == null || this.a.E().o() == null) {
            return null;
        }
        return Long.valueOf(this.a.E().o().b());
    }
}
