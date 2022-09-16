package defpackage;
/* compiled from: PG */
/* renamed from: auaz  reason: default package */
/* loaded from: classes2.dex */
public final class auaz<T> extends btrh<T> {
    private final int d;

    public auaz(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            auay auayVar = (auay) this.a;
            if (!(((crhy) obj).a instanceof crra)) {
                return;
            }
            dbsk.s(auayVar.b);
            auax auaxVar = auayVar.b.a;
            auaxVar.p = false;
            auaxVar.d();
            return;
        }
        auay auayVar2 = (auay) this.a;
        if (!(((cria) obj).a instanceof crra)) {
            return;
        }
        dbsk.s(auayVar2.b);
        auax auaxVar2 = auayVar2.b.a;
        auaxVar2.p = true;
        auaxVar2.d();
    }
}
