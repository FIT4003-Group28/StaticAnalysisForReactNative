package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: akyz  reason: default package */
/* loaded from: classes.dex */
public enum akyz implements akyw {
    UNKNOWN(0),
    UPLOAD_FLOW(2),
    BACKGROUND_TASK(3);
    
    static final SparseArray d = new SparseArray();
    private final int f;

    static {
        akyz[] values;
        for (akyz akyzVar : values()) {
            d.put(akyzVar.f, akyzVar);
        }
    }

    akyz(int i) {
        this.f = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
        if (r1 != 5) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(defpackage.alcu r1, defpackage.apyy r2, defpackage.aqxo r3) {
        /*
            alcu r0 = defpackage.alcu.UNKNOWN_UPLOAD
            int r1 = r1.ordinal()
            r0 = 1
            if (r1 == r0) goto L1a
            r0 = 3
            if (r1 == r0) goto L1a
            r0 = 4
            if (r1 == r0) goto L13
            r0 = 5
            if (r1 == r0) goto L1a
            goto L2e
        L13:
            akyz r1 = defpackage.akyz.UNKNOWN
            java.lang.String r1 = r1.c()
            return r1
        L1a:
            r3.Q()
            avve r1 = r2.s
            if (r1 != 0) goto L23
            avve r1 = defpackage.avve.a
        L23:
            boolean r1 = r1.e
            if (r1 == 0) goto L2e
            akyz r1 = defpackage.akyz.UPLOAD_FLOW
            java.lang.String r1 = r1.c()
            return r1
        L2e:
            akyz r1 = defpackage.akyz.UPLOAD_FLOW
            java.lang.String r1 = r1.c()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akyz.d(alcu, apyy, aqxo):java.lang.String");
    }

    @Override // defpackage.akyw
    public final /* bridge */ /* synthetic */ akyw a(int i) {
        return (akyz) d.get(i);
    }

    @Override // defpackage.akyw
    public final String b() {
        return "um";
    }

    public final String c() {
        int i = this.f;
        StringBuilder sb = new StringBuilder(14);
        sb.append("um=");
        sb.append(i);
        return sb.toString();
    }
}
