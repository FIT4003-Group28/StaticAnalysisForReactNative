package defpackage;
/* compiled from: PG */
/* renamed from: bebm  reason: default package */
/* loaded from: classes3.dex */
public final class bebm<T> extends btrh<T> {
    private final int d;

    public bebm(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            azrf azrfVar = (azrf) obj;
            final bebl beblVar = ((bebk) this.a).a;
            beblVar.u = 4;
            beblVar.g.a().D((ilo) bwrs.b(beblVar.r), 7, null);
            beblVar.e.a(new Runnable(beblVar) { // from class: beax
                private final bebl a;

                {
                    this.a = beblVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.g();
                }
            }, bvrj.UI_THREAD, 200L);
            return;
        }
        bebk bebkVar = (bebk) this.a;
        azrg azrgVar = (azrg) obj;
        bwrs<ilo> bwrsVar = bebkVar.a.r;
        if (bwrsVar == null || bwrsVar.c() == null) {
            return;
        }
        bebkVar.a.l();
        bebkVar.a.g();
    }
}
