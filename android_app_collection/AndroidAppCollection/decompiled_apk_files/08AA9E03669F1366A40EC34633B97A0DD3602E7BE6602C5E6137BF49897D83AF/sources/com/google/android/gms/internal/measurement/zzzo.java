package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzzq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class zzzo<FieldDescriptorType extends zzzq<FieldDescriptorType>> {
    private static final zzzo zzbse = new zzzo(true);
    private boolean zzbme;
    private boolean zzbsd = false;
    private final zzaba<FieldDescriptorType, Object> zzbsc = zzaba.zzag(16);

    private zzzo() {
    }

    private zzzo(boolean z) {
        if (!this.zzbme) {
            this.zzbsc.zzrp();
            this.zzbme = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzzu) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzzw) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zza(com.google.android.gms.internal.measurement.zzabr r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.zzzt.checkNotNull(r3)
            int[] r0 = com.google.android.gms.internal.measurement.zzzp.zzbsf
            com.google.android.gms.internal.measurement.zzabw r2 = r2.zzve()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L31;
                case 7: goto L28;
                case 8: goto L1e;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L43
        L15:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzaan
            if (r2 != 0) goto L26
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzzw
            if (r2 == 0) goto L43
            goto L26
        L1e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L26
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzzu
            if (r2 == 0) goto L43
        L26:
            r1 = 1
            goto L43
        L28:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzyy
            if (r2 != 0) goto L26
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L43
            goto L26
        L31:
            boolean r0 = r3 instanceof java.lang.String
            goto L42
        L34:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L42
        L37:
            boolean r0 = r3 instanceof java.lang.Double
            goto L42
        L3a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L42
        L3d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L42
        L40:
            boolean r0 = r3 instanceof java.lang.Integer
        L42:
            r1 = r0
        L43:
            if (r1 != 0) goto L4d
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzzo.zza(com.google.android.gms.internal.measurement.zzabr, java.lang.Object):void");
    }

    private final void zza(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.zztt()) {
            zza(fielddescriptortype.zzts(), obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(fielddescriptortype.zzts(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzzw) {
            this.zzbsd = true;
        }
        this.zzbsc.zza((zzaba<FieldDescriptorType, Object>) fielddescriptortype, (FieldDescriptorType) obj);
    }

    public static <T extends zzzq<T>> zzzo<T> zztr() {
        return zzbse;
    }

    public final /* synthetic */ Object clone() {
        zzzo zzzoVar = new zzzo();
        for (int i = 0; i < this.zzbsc.zzus(); i++) {
            Map.Entry<FieldDescriptorType, Object> zzah = this.zzbsc.zzah(i);
            zzzoVar.zza((zzzo) zzah.getKey(), zzah.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzbsc.zzut()) {
            zzzoVar.zza((zzzo) entry.getKey(), entry.getValue());
        }
        zzzoVar.zzbsd = this.zzbsd;
        return zzzoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzzo) {
            return this.zzbsc.equals(((zzzo) obj).zzbsc);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzbsc.hashCode();
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        return this.zzbsd ? new zzzz(this.zzbsc.entrySet().iterator()) : this.zzbsc.entrySet().iterator();
    }
}
