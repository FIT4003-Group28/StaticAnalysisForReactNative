package com.google.android.gms.internal.measurement;

import b.a.a.a.a.d.b;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class zzaap {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzaan zzaanVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zza(zzaanVar, sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f8, code lost:
        if (((java.lang.Boolean) r6).booleanValue() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01fa, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x020a, code lost:
        if (((java.lang.Integer) r6).intValue() == 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x021b, code lost:
        if (((java.lang.Float) r6).floatValue() == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x022d, code lost:
        if (((java.lang.Double) r6).doubleValue() == 0.0d) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zza(com.google.android.gms.internal.measurement.zzaan r12, java.lang.StringBuilder r13, int r14) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzaap.zza(com.google.android.gms.internal.measurement.zzaan, java.lang.StringBuilder, int):void");
    }

    static final void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zzb(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzb(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzabi.zza(zzyy.zzfg((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzyy) {
                sb.append(": \"");
                sb.append(zzabi.zza((zzyy) obj));
                sb.append('\"');
            } else if (obj instanceof zzzs) {
                sb.append(" {");
                zza((zzzs) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj.toString());
            } else {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                zzb(sb, i4, "key", entry2.getKey());
                zzb(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            }
        }
    }

    private static final String zzfi(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append(b.ROLL_OVER_FILE_NAME_SEPARATOR);
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
