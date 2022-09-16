package defpackage;
/* compiled from: PG */
/* renamed from: fdd  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fdd implements yuy {
    public final /* synthetic */ vlq a;
    private final /* synthetic */ int b;

    public /* synthetic */ fdd(vlq vlqVar, int i) {
        this.b = i;
        this.a = vlqVar;
    }

    @Override // defpackage.yuy
    public final Object a(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            return Long.valueOf(this.a.b((String) obj, ((Long) obj2).longValue()));
        } else if (i == 1) {
            return Boolean.valueOf(this.a.f((String) obj, ((Boolean) obj2).booleanValue()));
        } else if (i == 2) {
            return this.a.d((String) obj, (String) obj2);
        } else if (i == 3) {
            return Boolean.valueOf(this.a.f((String) obj, ((Boolean) obj2).booleanValue()));
        } else if (i == 4) {
            return Integer.valueOf(this.a.a((String) obj, ((Integer) obj2).intValue()));
        } else {
            return Long.valueOf(this.a.b((String) obj, ((Long) obj2).longValue()));
        }
    }
}
