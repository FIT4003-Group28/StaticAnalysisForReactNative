package defpackage;
/* compiled from: PG */
/* renamed from: aapy  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aapy implements zds {
    private final /* synthetic */ int d;
    public static final /* synthetic */ aapy c = new aapy(2);
    public static final /* synthetic */ aapy b = new aapy(1);
    public static final /* synthetic */ aapy a = new aapy();

    private /* synthetic */ aapy() {
    }

    private /* synthetic */ aapy(int i) {
        this.d = i;
    }

    @Override // defpackage.zds
    public final void a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            aaqd.d((String) obj, (Throwable) obj2);
        } else if (i == 1) {
            String d = amps.d((String) obj);
            if (obj2 == null) {
                afus.b(1, 18, d);
            } else {
                afus.c(1, 18, d, (Throwable) obj2);
            }
        } else {
            akpq.f((String) obj, (Throwable) obj2);
        }
    }
}
