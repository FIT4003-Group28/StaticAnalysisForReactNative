package defpackage;
/* compiled from: PG */
/* renamed from: gld  reason: default package */
/* loaded from: classes6.dex */
public final class gld<T> extends btrh<T> {
    private final int d;

    public gld(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            gla glaVar = (gla) this.a;
            alhl alhlVar = (alhl) obj;
            if (!glaVar.a.m()) {
                return;
            }
            glaVar.a.d();
        } else if (i == 1) {
            gla glaVar2 = (gla) this.a;
            alim alimVar = (alim) obj;
            if (!glaVar2.a.m()) {
                return;
            }
            glaVar2.a.n();
        } else if (i != 2) {
            gla glaVar3 = (gla) this.a;
            btyj btyjVar = (btyj) obj;
            if (!glaVar3.a.m() || !glaVar3.a.r()) {
                return;
            }
            glaVar3.a.d();
        } else {
            gla glaVar4 = (gla) this.a;
            ardp ardpVar = (ardp) obj;
            if (!glaVar4.a.m()) {
                return;
            }
            glaVar4.a.d();
        }
    }
}
