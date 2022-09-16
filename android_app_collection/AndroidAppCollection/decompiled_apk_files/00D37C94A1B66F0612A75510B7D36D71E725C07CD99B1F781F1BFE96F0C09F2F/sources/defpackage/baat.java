package defpackage;
/* compiled from: PG */
/* renamed from: baat  reason: default package */
/* loaded from: classes2.dex */
final class baat implements aopo {
    private final /* synthetic */ int d;
    static final aopo c = new baat(2);
    static final aopo b = new baat(1);
    static final aopo a = new baat();

    private baat() {
    }

    private baat(int i) {
        this.d = i;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i) {
        int i2 = this.d;
        return i2 != 0 ? i2 != 1 ? azst.i(i) != 0 : azst.j(i) != 0 : baau.b(i) != null;
    }
}
