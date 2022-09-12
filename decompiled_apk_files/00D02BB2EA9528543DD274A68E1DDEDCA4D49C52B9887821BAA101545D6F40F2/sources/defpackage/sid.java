package defpackage;
/* compiled from: PG */
/* renamed from: sid  reason: default package */
/* loaded from: classes7.dex */
public final class sid<T> extends btrh<T> {
    private final int d;

    public sid(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            sia siaVar = (sia) this.a;
            if (((azrh) obj).a() != 2) {
                return;
            }
            siaVar.a.b.e();
            return;
        }
        sia siaVar2 = (sia) this.a;
        azre azreVar = (azre) obj;
        siaVar2.a.f(dndr.HOME, azreVar);
        siaVar2.a.f(dndr.WORK, azreVar);
    }
}
