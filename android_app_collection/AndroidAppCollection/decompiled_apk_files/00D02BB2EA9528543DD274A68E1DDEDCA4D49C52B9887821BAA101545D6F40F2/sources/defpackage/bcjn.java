package defpackage;
/* compiled from: PG */
/* renamed from: bcjn  reason: default package */
/* loaded from: classes3.dex */
public final class bcjn extends aeh {
    private final bclj j;

    public bcjn(bclj bcljVar) {
        super(2);
        this.j = bcljVar;
    }

    @Override // defpackage.aeh, defpackage.abs
    public final int R(aci aciVar) {
        return this.j.c() + super.q(aciVar);
    }

    @Override // defpackage.aeh, defpackage.abs
    public final int V(aci aciVar) {
        return this.j.b() + this.j.c() + super.t(aciVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [bcjm] */
    @Override // defpackage.aeh, defpackage.abs
    public final int n(int i, final aca acaVar, final aci aciVar) {
        int i2;
        bclj bcljVar = this.j;
        ?? r1 = new Object(this, acaVar, aciVar) { // from class: bcjm
            private final bcjn a;
            private final aca b;
            private final aci c;

            {
                this.a = this;
                this.b = acaVar;
                this.c = aciVar;
            }

            public final int a(int i3) {
                return this.a.J(i3, this.b, this.c);
            }
        };
        bclm bclmVar = (bclm) bcljVar;
        if (!bclmVar.g()) {
            return r1.a(i);
        }
        if (i < 0) {
            i2 = r1.a(i);
            if (Math.abs(i2) >= Math.abs(i)) {
                return i2;
            }
            i -= i2;
        } else {
            i2 = 0;
        }
        int i3 = bclmVar.b;
        int h = decl.h(i3 + i, 0, bclmVar.b());
        bclmVar.b = h;
        int i4 = h - i3;
        int i5 = i - i4;
        int i6 = i4 + i2;
        return i5 == 0 ? i6 : i6 + r1.a(i5);
    }
}
