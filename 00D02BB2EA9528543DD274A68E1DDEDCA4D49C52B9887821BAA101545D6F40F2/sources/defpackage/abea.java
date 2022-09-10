package defpackage;
/* renamed from: abea  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class abea implements dbrn {
    static final dbrn a = new abea();

    private abea() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dqpo dqpoVar = ((dqpw) obj).b;
        if (dqpoVar == null) {
            dqpoVar = dqpo.d;
        }
        int i = dqpoVar.a;
        return (i & 2) != 0 ? dqpoVar.b : (i & 8) != 0 ? dqpoVar.c : "";
    }
}
