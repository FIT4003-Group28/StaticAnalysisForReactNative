package defpackage;
/* compiled from: PG */
/* renamed from: duc  reason: default package */
/* loaded from: classes3.dex */
public final class duc extends dux {
    private static volatile Long h;
    private static final Object i = new Object();

    public duc(dtq dtqVar, aopa aopaVar, int i2) {
        super(dtqVar, "wWnsnrfaEjgDiT5hP7i+dn7esf1zvlHhC+yrZyt+Oo8EEMo22jHTZ8oimeD7y9Ti", "oWMo7VEx2fkoXIobcreRMHDEMI800p2C3gL485DGf4M=", aopaVar, i2, 44);
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
            dnwVar.c |= 32;
            dnwVar.F = longValue;
        }
    }
}
