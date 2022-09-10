package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: akxl  reason: default package */
/* loaded from: classes2.dex */
final class akxl extends akxm {
    final /* synthetic */ akxn a;
    private final Bitmap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akxl(akxn akxnVar, Bitmap bitmap) {
        super(akxnVar, akxnVar.a.d(bitmap));
        this.a = akxnVar;
        this.c = bitmap;
    }

    @Override // defpackage.akxm
    protected final void c() {
        if (!this.c.isMutable()) {
            synchronized (this.a) {
                this.a.b.remove(this.c);
            }
        }
    }
}
