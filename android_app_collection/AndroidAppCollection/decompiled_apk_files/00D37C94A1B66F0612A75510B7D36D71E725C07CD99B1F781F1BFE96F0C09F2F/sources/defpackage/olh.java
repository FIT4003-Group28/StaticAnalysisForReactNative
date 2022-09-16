package defpackage;
/* compiled from: PG */
/* renamed from: olh  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class olh implements ayqf {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ olh(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.ayqf
    public final boolean a(Object obj) {
        if (this.b != 0) {
            return ((okw) obj).c != this.a;
        }
        return ((Integer) obj).intValue() != this.a;
    }
}
