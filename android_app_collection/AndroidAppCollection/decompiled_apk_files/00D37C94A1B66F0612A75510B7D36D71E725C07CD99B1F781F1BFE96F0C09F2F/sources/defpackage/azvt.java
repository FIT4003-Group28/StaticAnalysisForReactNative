package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azvt  reason: default package */
/* loaded from: classes2.dex */
public final class azvt extends azvs {
    private final azvw a;
    private final azvu e;
    private final azug f;
    private final Object g;

    public azvt(azvw azvwVar, azvu azvuVar, azug azugVar, Object obj) {
        azvuVar.getClass();
        azugVar.getClass();
        this.a = azvwVar;
        this.e = azvuVar;
        this.f = azugVar;
        this.g = obj;
    }

    @Override // defpackage.azsc
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        b((Throwable) obj);
        return azqm.a;
    }

    @Override // defpackage.azum
    public final void b(Throwable th) {
        azvw azvwVar = this.a;
        azvu azvuVar = this.e;
        azug azugVar = this.f;
        Object obj = this.g;
        boolean z = azuy.a;
        azug A = azvw.A(azugVar);
        if (A == null || !azvwVar.y(azvuVar, A, obj)) {
            azvwVar.o(azvuVar, obj);
            azvwVar.g();
        }
    }
}
