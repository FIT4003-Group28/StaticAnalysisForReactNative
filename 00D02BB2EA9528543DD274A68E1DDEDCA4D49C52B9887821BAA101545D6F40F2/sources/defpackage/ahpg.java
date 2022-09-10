package defpackage;
/* compiled from: PG */
/* renamed from: ahpg  reason: default package */
/* loaded from: classes2.dex */
public final class ahpg<T> extends btrh<T> {
    private final int d;

    public ahpg(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            ahpe ahpeVar = ((ahpa) this.a).a;
            boolean z = ((ardm) obj).a;
            ahpeVar.h = z;
            ckcw ckcwVar = ahpeVar.b.a;
            if (ckcwVar == null) {
                return;
            }
            if (z) {
                ((ckco) ckcwVar.a(ckea.a)).a(ahoy.a(1));
                return;
            } else {
                ((ckco) ckcwVar.a(ckea.a)).a(ahoy.a(2));
                return;
            }
        }
        ((ahpa) this.a).a((gdx) obj);
    }
}
