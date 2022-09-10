package defpackage;
/* compiled from: PG */
/* renamed from: aika  reason: default package */
/* loaded from: classes2.dex */
public final class aika<T> extends btrh<T> {
    public aika(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        aijx aijxVar = (aijx) this.a;
        gds gdsVar = (gds) obj;
        btlu q = btlu.q(aijxVar.a.b.j());
        if (!dbsd.a(aijxVar.a.q, q)) {
            aijz aijzVar = aijxVar.a;
            aijzVar.q = q;
            if (!aijzVar.d()) {
                return;
            }
            aijxVar.a.b(q);
        }
    }
}
