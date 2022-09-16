package defpackage;
/* compiled from: PG */
/* renamed from: ntj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ntj implements ayqb {
    public final /* synthetic */ ntk a;
    private final /* synthetic */ int b;

    public /* synthetic */ ntj(ntk ntkVar, int i) {
        this.b = i;
        this.a = ntkVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            this.a.a = ((Boolean) obj).booleanValue();
            return;
        }
        this.a.b = (amvn) obj;
    }
}
