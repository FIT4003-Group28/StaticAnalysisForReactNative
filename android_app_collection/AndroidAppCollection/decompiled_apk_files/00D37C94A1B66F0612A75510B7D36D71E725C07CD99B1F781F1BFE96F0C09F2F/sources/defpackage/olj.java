package defpackage;
/* compiled from: PG */
/* renamed from: olj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class olj implements ayqf {
    public final /* synthetic */ amvn a;
    private final /* synthetic */ int b;

    public /* synthetic */ olj(amvn amvnVar, int i) {
        this.b = i;
        this.a = amvnVar;
    }

    @Override // defpackage.ayqf
    public final boolean a(Object obj) {
        if (this.b != 0) {
            return this.a.contains(((okw) obj).a);
        }
        return !this.a.contains(((okw) obj).a);
    }
}
