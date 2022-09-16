package defpackage;
/* compiled from: PG */
/* renamed from: dus  reason: default package */
/* loaded from: classes3.dex */
public final class dus extends dux {
    private static volatile Long h;
    private static final Object i = new Object();

    public dus(dtq dtqVar, aopa aopaVar, int i2) {
        super(dtqVar, "VNPv7YZKewavdQDinNfpPD3Uz8E+OxSZlMO5yp59uh/qLaDK+tJnelblHJ9uQcZS", "bt6ywc4sDyIrNGz1BkT7NjFxbJ6bQgz1ccyHNtYdKM8=", aopaVar, i2, 33);
    }

    @Override // defpackage.dux
    protected final void a() {
        if (h == null) {
            synchronized (i) {
                if (h == null) {
                    h = (Long) this.d.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            aopa aopaVar = this.g;
            long longValue = h.longValue();
            aopaVar.copyOnWrite();
            dnw dnwVar = (dnw) aopaVar.instance;
            dnw dnwVar2 = dnw.a;
            dnwVar.b |= 134217728;
            dnwVar.w = longValue;
        }
    }
}
