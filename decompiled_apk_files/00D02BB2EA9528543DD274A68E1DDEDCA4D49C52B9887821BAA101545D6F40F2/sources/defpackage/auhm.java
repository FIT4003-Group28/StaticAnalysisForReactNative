package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: auhm  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class auhm implements dbrn {
    static final dbrn a = new auhm();

    private auhm() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dpyv b = dpyv.b(((dkpy) obj).a);
        if (b == null) {
            b = dpyv.UNKNOWN_NOTIFICATION_ID;
        }
        return Integer.valueOf(b.dm);
    }
}
