package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: coob  reason: default package */
/* loaded from: classes5.dex */
public final class coob extends cntl<cooa> implements cnom {
    public final int b;
    public final Status c;
    private final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public coob(int r7, java.util.List<com.google.android.gms.location.places.internal.NearbyLikelihoodEntity> r8, int r9) {
        /*
            r6 = this;
            java.lang.String[] r0 = defpackage.copv.a
            cnts r0 = com.google.android.gms.common.data.DataHolder.g(r0)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        Lf:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r8.next()
            com.google.android.gms.location.places.internal.NearbyLikelihoodEntity r2 = (com.google.android.gms.location.places.internal.NearbyLikelihoodEntity) r2
            com.google.android.gms.location.places.internal.PlaceEntity r3 = r2.a
            android.content.ContentValues r3 = r3.e()
            float r4 = r2.b
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.String r5 = "place_likelihood"
            r3.put(r5, r4)
            r0.c(r3)
            com.google.android.gms.location.places.internal.PlaceEntity r2 = r2.a
            java.util.List<java.lang.String> r2 = r2.n
            r1.addAll(r2)
            goto Lf
        L37:
            java.lang.String r8 = defpackage.coow.a(r1)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r3 = "com.google.android.gms.location.places.NearbyLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY"
            if (r2 != 0) goto L4b
            r1.putString(r3, r8)
        L4b:
            com.google.android.gms.common.data.DataHolder r7 = r0.b(r7, r1)
            r6.<init>(r7)
            int r8 = r7.e
            com.google.android.gms.common.api.Status r8 = defpackage.coor.a(r8)
            r6.c = r8
            r0 = 1
            boolean r8 = r8.d()
            if (r0 == r8) goto L62
            r9 = 0
        L62:
            r6.b = r9
            android.os.Bundle r7 = r7.f
            if (r7 == 0) goto L6f
            java.lang.String r7 = r7.getString(r3)
        L6c:
            r6.d = r7
            return
        L6f:
            r7 = 0
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coob.<init>(int, java.util.List, int):void");
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.c;
    }

    @Override // defpackage.cntn
    /* renamed from: e */
    public final cooa d(int i) {
        return new coph(this.a, i);
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("status", this.c);
        b.a("attributions", this.d);
        return b.toString();
    }
}
