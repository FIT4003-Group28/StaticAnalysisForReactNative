package defpackage;
/* compiled from: PG */
/* renamed from: cshi  reason: default package */
/* loaded from: classes5.dex */
public final class cshi implements cshs<csgt> {
    final /* synthetic */ boolean a;

    public cshi(boolean z) {
        this.a = z;
    }

    @Override // defpackage.cshs
    /* renamed from: b */
    public final void a(csgt csgtVar) {
        csht<csgt> cshtVar = csgtVar.c;
        cshtVar.d(this);
        boolean z = ((cshd) cshtVar).c;
        if (z && this.a) {
            cshtVar.g();
        }
        csgtVar.g();
        if (!z || !this.a) {
            return;
        }
        cshtVar.f();
    }
}
