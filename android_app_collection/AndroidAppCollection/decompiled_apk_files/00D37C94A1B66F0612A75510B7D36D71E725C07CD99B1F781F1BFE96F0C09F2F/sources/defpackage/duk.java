package defpackage;
/* compiled from: PG */
/* renamed from: duk  reason: default package */
/* loaded from: classes3.dex */
public final class duk extends dux {
    private static volatile String h;
    private static final Object i = new Object();

    public duk(dtq dtqVar, aopa aopaVar, int i2) {
        super(dtqVar, "8FOfoSg6GUzmarTjoVEwRHyv/8uoJJi2g1L+rZUBWUhEOtIQPWlgr7FjPEHoFhoH", "0HdAPxfDHFp5HJKoXONtKzTL3Y8sTcLsbw89UYSrmrg=", aopaVar, i2, 1);
    }

    @Override // defpackage.dux
    protected final void a() {
        aopa aopaVar = this.g;
        aopaVar.copyOnWrite();
        dnw dnwVar = (dnw) aopaVar.instance;
        dnw dnwVar2 = dnw.a;
        dnwVar.b |= 1;
        dnwVar.e = "E";
        if (h == null) {
            synchronized (i) {
                if (h == null) {
                    h = (String) this.d.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            aopa aopaVar2 = this.g;
            String str = h;
            aopaVar2.copyOnWrite();
            dnw dnwVar3 = (dnw) aopaVar2.instance;
            str.getClass();
            dnwVar3.b |= 1;
            dnwVar3.e = str;
        }
    }
}
