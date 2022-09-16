package defpackage;
/* compiled from: PG */
/* renamed from: aysn  reason: default package */
/* loaded from: classes2.dex */
public final class aysn extends aynr {
    final aynt a;

    public aysn(aynt ayntVar) {
        this.a = ayntVar;
    }

    @Override // defpackage.aynr
    protected final void V(ayns aynsVar) {
        aysm aysmVar = new aysm(aynsVar);
        aynsVar.sj(aysmVar);
        try {
            this.a.a(aysmVar);
        } catch (Throwable th) {
            bapv.j(th);
            aysmVar.c(th);
        }
    }
}
