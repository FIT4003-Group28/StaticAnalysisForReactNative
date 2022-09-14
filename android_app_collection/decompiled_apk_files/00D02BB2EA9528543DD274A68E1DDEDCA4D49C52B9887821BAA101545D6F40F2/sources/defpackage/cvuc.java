package defpackage;
/* compiled from: PG */
/* renamed from: cvuc  reason: default package */
/* loaded from: classes5.dex */
public final class cvuc extends cvue {
    public Boolean a;
    public int b;

    @Override // defpackage.cvue
    public final void a(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    @Override // defpackage.cvue
    public final void b(int i) {
        if (i != 0) {
            this.b = i;
            return;
        }
        throw new NullPointerException("Null isUnicornUser");
    }
}
