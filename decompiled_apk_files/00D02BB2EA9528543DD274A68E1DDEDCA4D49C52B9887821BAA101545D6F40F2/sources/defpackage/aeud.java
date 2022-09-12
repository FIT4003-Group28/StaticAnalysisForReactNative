package defpackage;
/* compiled from: PG */
/* renamed from: aeud  reason: default package */
/* loaded from: classes2.dex */
public final class aeud<T> extends btrh<T> {
    private final int d;

    public aeud(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            aety aetyVar = (aety) this.a;
            ahjt ahjtVar = ((ahjy) obj).a;
            boolean b = aetyVar.a.b();
            boolean b2 = ahjtVar.b();
            aetyVar.a = new ahjt(ahjtVar);
            if (b == b2) {
                return;
            }
            if (ahjtVar.b()) {
                int i = aeub.k;
                aetyVar.b.b();
                return;
            }
            int i2 = aeub.k;
            aetyVar.b.a();
            return;
        }
        ardp ardpVar = (ardp) obj;
        int i3 = aeub.k;
        aeub aeubVar = ((aety) this.a).b;
        if (aeubVar.j) {
            return;
        }
        aeubVar.a();
    }
}
