package defpackage;
/* compiled from: PG */
/* renamed from: ashg  reason: default package */
/* loaded from: classes2.dex */
public final class ashg<T> extends btrh<T> {
    private final int d;

    public ashg(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            ashe asheVar = (ashe) this.a;
            asheVar.a.i = ((crhp) obj).b();
            ashf ashfVar = asheVar.a;
            if (ashfVar.i) {
                return;
            }
            ashfVar.f.a().c();
            asheVar.a.h = 0;
            return;
        }
        ashe asheVar2 = (ashe) this.a;
        crhd crhdVar = (crhd) obj;
        if (!crhdVar.b()) {
            return;
        }
        Integer num = crhdVar.b == 4 ? crhdVar.a : null;
        if (num == null) {
            return;
        }
        asheVar2.a.h = num.intValue();
        ashf ashfVar2 = asheVar2.a;
        if (!ashfVar2.i) {
            return;
        }
        int i = ashfVar2.h;
        if (i <= 0) {
            ashfVar2.f.a().c();
            return;
        }
        ashfVar2.g.getLayoutParams().height = i;
        ashfVar2.a(ashfVar2.e.a().b());
        ashfVar2.f.a().d(ashfVar2.g);
    }
}
