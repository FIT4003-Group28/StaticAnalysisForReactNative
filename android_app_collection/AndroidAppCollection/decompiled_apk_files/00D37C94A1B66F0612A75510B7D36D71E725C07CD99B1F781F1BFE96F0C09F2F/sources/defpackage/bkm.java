package defpackage;
/* compiled from: PG */
/* renamed from: bkm  reason: default package */
/* loaded from: classes2.dex */
public abstract class bkm extends bkw {
    public bkm(bks bksVar) {
        super(bksVar);
    }

    public final void a(Object obj) {
        bmb d = d();
        try {
            b(d, obj);
            d.b.executeInsert();
        } finally {
            e(d);
        }
    }

    protected abstract void b(bmb bmbVar, Object obj);
}
