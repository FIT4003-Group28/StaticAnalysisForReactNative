package com.google.android.gms.maps.model;
/* loaded from: classes.dex */
public final class CustomCap extends Cap {
    public final BitmapDescriptor bitmapDescriptor;
    public final float refWidth;

    public CustomCap(BitmapDescriptor bitmapDescriptor) {
        this(bitmapDescriptor, 10.0f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CustomCap(com.google.android.gms.maps.model.BitmapDescriptor r4, float r5) {
        /*
            r3 = this;
            java.lang.String r0 = "bitmapDescriptor must not be null"
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
            com.google.android.gms.maps.model.BitmapDescriptor r0 = (com.google.android.gms.maps.model.BitmapDescriptor) r0
            java.lang.String r1 = "refWidth must be positive"
            r2 = 0
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 > 0) goto L15
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r1)
            throw r4
        L15:
            r3.<init>(r0, r5)
            r3.bitmapDescriptor = r4
            r3.refWidth = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.CustomCap.<init>(com.google.android.gms.maps.model.BitmapDescriptor, float):void");
    }

    @Override // com.google.android.gms.maps.model.Cap
    public final String toString() {
        String valueOf = String.valueOf(this.bitmapDescriptor);
        float f = this.refWidth;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
        sb.append("[CustomCap: bitmapDescriptor=");
        sb.append(valueOf);
        sb.append(" refWidth=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}
