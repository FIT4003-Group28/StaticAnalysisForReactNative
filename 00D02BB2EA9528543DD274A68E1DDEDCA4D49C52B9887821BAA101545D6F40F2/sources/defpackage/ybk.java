package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ybk  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class ybk implements dbsl {
    static final dbsl a = new ybk();

    private ybk() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        int i = ybn.a;
        dour b = dour.b(((dpgc) obj).c);
        if (b == null) {
            b = dour.UNKNOWN_DIRECTION_OF_MOTION;
        }
        return !b.equals(dour.UNKNOWN_DIRECTION_OF_MOTION);
    }
}
