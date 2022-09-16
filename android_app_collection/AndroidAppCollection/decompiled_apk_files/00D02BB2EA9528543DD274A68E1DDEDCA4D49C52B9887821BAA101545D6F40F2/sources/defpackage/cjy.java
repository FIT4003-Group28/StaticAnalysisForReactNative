package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjy  reason: default package */
/* loaded from: classes.dex */
public final class cjy extends cjz {
    private volatile boolean a;

    @Override // defpackage.cjz
    public final void a() {
        if (!this.a) {
            return;
        }
        throw new IllegalStateException("Already released");
    }

    @Override // defpackage.cjz
    public final void b(boolean z) {
        this.a = z;
    }
}
