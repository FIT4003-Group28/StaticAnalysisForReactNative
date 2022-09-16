package defpackage;
/* compiled from: PG */
/* renamed from: akzt  reason: default package */
/* loaded from: classes.dex */
public abstract class akzt extends akzm {
    private final alct a;

    public akzt(albf albfVar, alct alctVar) {
        super(albfVar);
        this.a = alctVar;
    }

    @Override // defpackage.akzm
    public final void c(aopa aopaVar) {
        try {
            d().a(aopaVar, this.a);
            e(aopaVar);
        } catch (Exception e) {
            throw new RuntimeException("Could not apply the setState BiFunction.", e);
        }
    }

    public abstract aypx d();

    public void e(aopa aopaVar) {
    }
}
