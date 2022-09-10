package defpackage;
/* renamed from: crlk  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class crlk implements dbsl {
    static final dbsl a = new crlk();

    private crlk() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dozs dozsVar;
        dozz dozzVar = (dozz) obj;
        if (dozzVar.b == 22) {
            dozsVar = (dozs) dozzVar.c;
        } else {
            dozsVar = dozs.q;
        }
        return (dozsVar.a & 2048) != 0;
    }
}
