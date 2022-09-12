package defpackage;
/* compiled from: PG */
/* renamed from: ajjo  reason: default package */
/* loaded from: classes2.dex */
public final class ajjo<T> extends btrh<T> {
    private final int d;

    public ajjo(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            ajjm ajjmVar = (ajjm) this.a;
            ajjmVar.a.i = ((crhp) obj).d();
            ajjn ajjnVar = ajjmVar.a;
        } else if (i == 1) {
            ajjm ajjmVar2 = (ajjm) this.a;
            ((crhq) obj).d();
        } else if (i == 2) {
            ajjm ajjmVar3 = (ajjm) this.a;
            crmk crmkVar = (crmk) obj;
        } else if (i != 3) {
            ((ajjm) this.a).a.a(dbsg.j(((crmh) obj).a));
        } else {
            ((ajjm) this.a).a.a(dbsg.j(((crmj) obj).c));
        }
    }
}
