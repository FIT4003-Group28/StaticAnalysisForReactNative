package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: omj  reason: default package */
/* loaded from: classes3.dex */
public final class omj extends vfk {
    private vfk a = new oml();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(vfk vfkVar) {
        for (vfk vfkVar2 = vfkVar; vfkVar2 instanceof omj; vfkVar2 = ((omj) vfkVar2).a) {
            if (vfkVar2 == this) {
                throw new IllegalStateException("Circular dependency detected! DelegatingUrlChecker cannot delegate to itself.");
            }
        }
        vfkVar.getClass();
        this.a = vfkVar;
    }

    @Override // defpackage.vfk
    protected final boolean b(String str) {
        return this.a.c(Uri.parse(str));
    }
}
