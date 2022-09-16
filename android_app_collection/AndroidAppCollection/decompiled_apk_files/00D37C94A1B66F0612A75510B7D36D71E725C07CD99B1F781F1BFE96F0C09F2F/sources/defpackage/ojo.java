package defpackage;
/* compiled from: PG */
/* renamed from: ojo  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ojo implements ayqb {
    public final /* synthetic */ ojq a;
    private final /* synthetic */ int b;

    public /* synthetic */ ojo(ojq ojqVar, int i) {
        this.b = i;
        this.a = ojqVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            this.a.A = ((Boolean) obj).booleanValue();
            return;
        }
        njd njdVar = (njd) obj;
        this.a.r(2, 1);
    }
}
