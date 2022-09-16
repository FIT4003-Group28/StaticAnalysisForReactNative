package defpackage;
/* compiled from: PG */
/* renamed from: hda  reason: default package */
/* loaded from: classes3.dex */
public final class hda extends ajqd {
    private final hcy a;

    public hda(hcy hcyVar, ypf ypfVar) {
        this.a = hcyVar;
        hcyVar.b().q(zna.t(ypfVar.a())).X(aypa.a()).as(new ayqb() { // from class: hcz
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                hda hdaVar = hda.this;
                int i = ((hcx) obj).a;
                hdaVar.v();
            }
        });
    }

    @Override // defpackage.ajqm
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.ajqm
    public final long b(int i) {
        return c(i).a();
    }

    @Override // defpackage.ajqm
    public final boolean contains(Object obj) {
        throw null;
    }

    @Override // defpackage.ajqm
    /* renamed from: d */
    public final hcv c(int i) {
        return (hcv) this.a.b.get(i);
    }

    @Override // defpackage.ajqm
    public final boolean isEmpty() {
        return this.a.a() == 0;
    }
}
