package defpackage;
/* compiled from: PG */
/* renamed from: dzx  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dzx implements azqb {
    public final /* synthetic */ eai a;
    private final /* synthetic */ int b;

    public /* synthetic */ dzx(eai eaiVar) {
        this.a = eaiVar;
    }

    public /* synthetic */ dzx(eai eaiVar, int i) {
        this.b = i;
        this.a = eaiVar;
    }

    @Override // defpackage.azqb
    public final Object get() {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? this.a.a : new akwj(this.a.ax);
        }
        return new akwk(this.a.c);
    }
}
