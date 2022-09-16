package defpackage;
/* compiled from: PG */
/* renamed from: cerw  reason: default package */
/* loaded from: classes4.dex */
public enum cerw {
    ALL(true, true, true),
    QUESTIONS_AND_ANSWERS(true, true, false),
    QUESTIONS_ONLY(true, false, false),
    ANSWERS_ONLY(false, true, false),
    REPLIES_ONLY(false, false, true),
    NONE(false, false, false);
    
    public final djbk g;

    cerw(boolean z, boolean z2, boolean z3) {
        djbj bZ = djbk.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djbk djbkVar = (djbk) bZ.b;
        int i = djbkVar.a | 2;
        djbkVar.a = i;
        djbkVar.c = z2;
        int i2 = i | 1;
        djbkVar.a = i2;
        djbkVar.b = z;
        djbkVar.a = i2 | 4;
        djbkVar.d = z3;
        this.g = bZ.bK();
    }

    public static void a(djbk djbkVar) {
        boolean z = djbkVar.b;
        if (!z || !djbkVar.c || !djbkVar.d) {
            if ((z && djbkVar.c) || z || djbkVar.c) {
                return;
            }
            boolean z2 = djbkVar.d;
        }
    }
}
