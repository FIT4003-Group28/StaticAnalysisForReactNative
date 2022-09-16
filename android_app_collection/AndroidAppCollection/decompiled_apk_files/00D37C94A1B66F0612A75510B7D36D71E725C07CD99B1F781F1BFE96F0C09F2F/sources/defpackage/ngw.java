package defpackage;
/* compiled from: PG */
/* renamed from: ngw  reason: default package */
/* loaded from: classes3.dex */
public final class ngw extends ngj {
    public ngw(Object obj) {
        super(obj);
    }

    @Override // defpackage.ngj
    public final amvn a(amvn amvnVar) {
        amvl i = amvn.i();
        amzs it = amvnVar.iterator();
        while (it.hasNext()) {
            fry fryVar = (fry) it.next();
            if (!(fryVar instanceof iwa) && !(fryVar instanceof fsd)) {
                i.c(fryVar);
            }
        }
        return i.g();
    }

    @Override // defpackage.ngj
    public final boolean i() {
        return true;
    }
}
