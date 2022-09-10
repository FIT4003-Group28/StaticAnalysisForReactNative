package defpackage;
/* renamed from: auef  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class auef implements dbsl {
    static final dbsl a = new auef();

    private auef() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dkxe b = dkxe.b(((dkxf) obj).b);
        if (b == null) {
            b = dkxe.UNKNOWN_USER_INCIDENT_TYPE;
        }
        return b != dkxe.INCIDENT_SUSPECTED_CLOSURE;
    }
}
