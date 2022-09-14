package defpackage;
/* compiled from: PG */
/* renamed from: cevp  reason: default package */
/* loaded from: classes4.dex */
public final class cevp<T> extends btrh<T> {
    private final int d;

    public cevp(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            ((cevn) this.a).v((azrc) obj);
        } else {
            ((cevn) this.a).u((azrb) obj);
        }
    }
}
