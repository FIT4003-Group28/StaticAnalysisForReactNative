package defpackage;
/* compiled from: PG */
/* renamed from: aajg  reason: default package */
/* loaded from: classes.dex */
public final class aajg {
    public final aaki a;
    private final aagi b;
    private final aahf c;
    private final aajd d;

    public aajg(aagi aagiVar, aahf aahfVar, aajd aajdVar, aaki aakiVar) {
        this.b = aagiVar;
        this.c = aahfVar;
        this.d = aajdVar;
        this.a = aakiVar;
    }

    private static aajs b(aajl aajlVar, aorw aorwVar) {
        if (aajlVar instanceof aaka) {
            return ((aaka) aajlVar).d(aorwVar);
        }
        String valueOf = String.valueOf(aajlVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 63);
        sb.append("EntityStore does not implement FrameworkRestrictedStoreAccess: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.afvm r12, defpackage.aqvw r13) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aajg.a(afvm, aqvw):void");
    }
}
