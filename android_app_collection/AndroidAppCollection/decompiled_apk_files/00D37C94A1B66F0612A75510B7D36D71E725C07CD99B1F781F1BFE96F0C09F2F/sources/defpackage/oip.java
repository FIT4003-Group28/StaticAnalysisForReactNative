package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: oip  reason: default package */
/* loaded from: classes3.dex */
public final class oip implements fqc {
    private final aafo a;
    private final exy b;

    public oip(aafo aafoVar, aafo aafoVar2, fqd fqdVar) {
        this.a = aafoVar;
        this.b = (exy) aafoVar2;
        if (fqdVar.b) {
            b();
        }
    }

    @Override // defpackage.fqc
    public final void a() {
        exy exyVar = this.b;
        aafo aafoVar = this.a;
        WeakReference weakReference = exyVar.a;
        if (weakReference == null || weakReference.get() != aafoVar) {
            return;
        }
        exyVar.a = null;
    }

    @Override // defpackage.fqc
    public final void b() {
        this.b.a = new WeakReference(this.a);
    }
}
