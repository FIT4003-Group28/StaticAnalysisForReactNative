package defpackage;
/* renamed from: wgy  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class wgy implements dbsl {
    static final dbsl a = new wgy();

    private wgy() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dpec dpecVar = ((dpdy) obj).c;
        if (dpecVar == null) {
            dpecVar = dpec.o;
        }
        dqvj c = dqvj.c(dpecVar.b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        return c == dqvj.TRANSIT;
    }
}
