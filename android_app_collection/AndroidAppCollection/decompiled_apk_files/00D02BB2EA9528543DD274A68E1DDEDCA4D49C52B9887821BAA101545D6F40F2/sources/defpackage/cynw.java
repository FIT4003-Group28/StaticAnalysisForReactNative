package defpackage;
/* renamed from: cynw  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cynw implements dbsl {
    static final dbsl a = new cynw();

    private cynw() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dugc dugcVar = (dugc) obj;
        duej b = duej.b(dugcVar.a);
        if (b == null) {
            b = duej.UNKNOWN_CONTAINER;
        }
        return cynb.a(b) == 3 && !dugcVar.b.isEmpty();
    }
}
