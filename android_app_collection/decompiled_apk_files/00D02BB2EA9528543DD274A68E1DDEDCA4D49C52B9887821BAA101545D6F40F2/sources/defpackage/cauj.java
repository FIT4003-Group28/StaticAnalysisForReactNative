package defpackage;
/* compiled from: PG */
/* renamed from: cauj  reason: default package */
/* loaded from: classes4.dex */
public enum cauj {
    ALL(true, true, true),
    QUESTIONS_AND_ANSWERS(true, true, false),
    QUESTIONS_ONLY(true, false, false),
    ANSWERS_ONLY(false, true, false),
    REPLIES_ONLY(false, false, true);
    
    public final djbk f;

    cauj(boolean z, boolean z2, boolean z3) {
        djbj bZ = djbk.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djbk djbkVar = (djbk) bZ.b;
        int i = djbkVar.a | 1;
        djbkVar.a = i;
        djbkVar.b = z;
        int i2 = i | 2;
        djbkVar.a = i2;
        djbkVar.c = z2;
        djbkVar.a = i2 | 4;
        djbkVar.d = z3;
        this.f = bZ.bK();
    }
}
