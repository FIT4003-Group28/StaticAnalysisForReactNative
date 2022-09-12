package defpackage;
/* compiled from: PG */
/* renamed from: cjnt  reason: default package */
/* loaded from: classes.dex */
public final class cjnt<T> extends btrh<T> {
    public cjnt(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        cjns cjnsVar = (cjns) this.a;
        gds gdsVar = (gds) obj;
        btlu j = cjnsVar.e.a().j();
        if (!j.equals(cjnsVar.h)) {
            cjnsVar.h = j;
            if (!j.l()) {
                return;
            }
            cjnsVar.c(j);
        }
    }
}
