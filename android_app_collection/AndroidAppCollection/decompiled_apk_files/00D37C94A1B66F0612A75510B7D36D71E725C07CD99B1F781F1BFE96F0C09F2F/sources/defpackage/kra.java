package defpackage;
/* compiled from: PG */
/* renamed from: kra  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kra implements azqb {
    public final /* synthetic */ kre a;
    private final /* synthetic */ int b;

    public /* synthetic */ kra(kre kreVar, int i) {
        this.b = i;
        this.a = kreVar;
    }

    @Override // defpackage.azqb
    public final Object get() {
        boolean z = true;
        if (this.b == 0) {
            Boolean bool = this.a.F;
            if (bool == null || bool.booleanValue()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (this.a.d() <= 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
