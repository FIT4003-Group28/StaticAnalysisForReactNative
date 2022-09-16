package defpackage;
/* compiled from: PG */
/* renamed from: vdj  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class vdj implements vdk {
    public final /* synthetic */ Class a;
    private final /* synthetic */ int b;

    public /* synthetic */ vdj(Class cls, int i) {
        this.b = i;
        this.a = cls;
    }

    @Override // defpackage.vdk
    public final Object a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return (Boolean) this.a.cast(obj);
            }
            if (i == 2) {
                return (Long) this.a.cast(obj);
            }
            return (String) this.a.cast(obj);
        }
        return (Double) this.a.cast(obj);
    }
}
