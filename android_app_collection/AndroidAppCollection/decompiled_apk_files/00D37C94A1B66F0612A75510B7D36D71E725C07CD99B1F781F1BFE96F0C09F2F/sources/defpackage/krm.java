package defpackage;
/* compiled from: PG */
/* renamed from: krm  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class krm implements azqb {
    public final /* synthetic */ krp a;
    private final /* synthetic */ int b;

    public /* synthetic */ krm(krp krpVar, int i) {
        this.b = i;
        this.a = krpVar;
    }

    @Override // defpackage.azqb
    public final Object get() {
        boolean z = true;
        if (this.b == 0) {
            if (this.a.d() <= 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        Boolean bool = this.a.F;
        if (bool == null || bool.booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
