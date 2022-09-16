package defpackage;
/* renamed from: zfs  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class zfs implements dbsl {
    static final dbsl a = new zfs();

    private zfs() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dcep<doxb> dcepVar = zfu.a;
        doxb b = doxb.b(((doxc) obj).b);
        if (b == null) {
            b = doxb.TYPE_UNKNOWN;
        }
        return dcepVar.contains(b);
    }
}
