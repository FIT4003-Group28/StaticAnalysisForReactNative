package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzgj {
    private static final Object zzbdc = null;
    private static Long zzbdd = new Long(0);
    private static Double zzbde = new Double(0.0d);
    private static zzgi zzbdf = zzgi.zzaj(0);
    private static String zzbdg = new String("");
    private static Boolean zzbdh = new Boolean(false);
    private static List<Object> zzbdi = new ArrayList(0);
    private static Map<Object, Object> zzbdj = new HashMap();
    private static com.google.android.gms.internal.measurement.zzm zzbdk = zzj(zzbdg);

    private static double getDouble(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        zzdi.e("getDouble received non-Number");
        return 0.0d;
    }

    public static String zzc(com.google.android.gms.internal.measurement.zzm zzmVar) {
        return zzi(zzh(zzmVar));
    }

    public static zzgi zzd(com.google.android.gms.internal.measurement.zzm zzmVar) {
        Object zzh = zzh(zzmVar);
        return zzh instanceof zzgi ? (zzgi) zzh : zzl(zzh) ? zzgi.zzaj(zzm(zzh)) : zzk(zzh) ? zzgi.zza(Double.valueOf(getDouble(zzh))) : zzdq(zzi(zzh));
    }

    public static com.google.android.gms.internal.measurement.zzm zzdp(String str) {
        com.google.android.gms.internal.measurement.zzm zzmVar = new com.google.android.gms.internal.measurement.zzm();
        zzmVar.type = 5;
        zzmVar.zzqc = str;
        return zzmVar;
    }

    private static zzgi zzdq(String str) {
        try {
            return zzgi.zzdo(str);
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
            sb.append("Failed to convert '");
            sb.append(str);
            sb.append("' to a number.");
            zzdi.e(sb.toString());
            return zzbdf;
        }
    }

    public static Long zze(com.google.android.gms.internal.measurement.zzm zzmVar) {
        long longValue;
        Object zzh = zzh(zzmVar);
        if (zzl(zzh)) {
            longValue = zzm(zzh);
        } else {
            zzgi zzdq = zzdq(zzi(zzh));
            if (zzdq == zzbdf) {
                return zzbdd;
            }
            longValue = zzdq.longValue();
        }
        return Long.valueOf(longValue);
    }

    public static Double zzf(com.google.android.gms.internal.measurement.zzm zzmVar) {
        double doubleValue;
        Object zzh = zzh(zzmVar);
        if (zzk(zzh)) {
            doubleValue = getDouble(zzh);
        } else {
            zzgi zzdq = zzdq(zzi(zzh));
            if (zzdq == zzbdf) {
                return zzbde;
            }
            doubleValue = zzdq.doubleValue();
        }
        return Double.valueOf(doubleValue);
    }

    public static Boolean zzg(com.google.android.gms.internal.measurement.zzm zzmVar) {
        Object zzh = zzh(zzmVar);
        if (zzh instanceof Boolean) {
            return (Boolean) zzh;
        }
        String zzi = zzi(zzh);
        return "true".equalsIgnoreCase(zzi) ? Boolean.TRUE : "false".equalsIgnoreCase(zzi) ? Boolean.FALSE : zzbdh;
    }

    public static Object zzh(com.google.android.gms.internal.measurement.zzm zzmVar) {
        String str;
        if (zzmVar == null) {
            return null;
        }
        int i = 0;
        switch (zzmVar.type) {
            case 1:
                return zzmVar.string;
            case 2:
                ArrayList arrayList = new ArrayList(zzmVar.zzpy.length);
                com.google.android.gms.internal.measurement.zzm[] zzmVarArr = zzmVar.zzpy;
                int length = zzmVarArr.length;
                while (i < length) {
                    Object zzh = zzh(zzmVarArr[i]);
                    if (zzh == null) {
                        return null;
                    }
                    arrayList.add(zzh);
                    i++;
                }
                return arrayList;
            case 3:
                if (zzmVar.zzpz.length != zzmVar.zzqa.length) {
                    String valueOf = String.valueOf(zzmVar.toString());
                    zzdi.e(valueOf.length() != 0 ? "Converting an invalid value to object: ".concat(valueOf) : new String("Converting an invalid value to object: "));
                    return null;
                }
                HashMap hashMap = new HashMap(zzmVar.zzqa.length);
                while (i < zzmVar.zzpz.length) {
                    Object zzh2 = zzh(zzmVar.zzpz[i]);
                    Object zzh3 = zzh(zzmVar.zzqa[i]);
                    if (zzh2 == null || zzh3 == null) {
                        return null;
                    }
                    hashMap.put(zzh2, zzh3);
                    i++;
                }
                return hashMap;
            case 4:
                str = "Trying to convert a macro reference to object";
                break;
            case 5:
                str = "Trying to convert a function id to object";
                break;
            case 6:
                return Long.valueOf(zzmVar.zzqd);
            case 7:
                StringBuilder sb = new StringBuilder();
                com.google.android.gms.internal.measurement.zzm[] zzmVarArr2 = zzmVar.zzqf;
                int length2 = zzmVarArr2.length;
                while (i < length2) {
                    String zzi = zzi(zzh(zzmVarArr2[i]));
                    if (zzi == zzbdg) {
                        return null;
                    }
                    sb.append(zzi);
                    i++;
                }
                return sb.toString();
            case 8:
                return Boolean.valueOf(zzmVar.zzqe);
            default:
                int i2 = zzmVar.type;
                StringBuilder sb2 = new StringBuilder(46);
                sb2.append("Failed to convert a value of type: ");
                sb2.append(i2);
                str = sb2.toString();
                break;
        }
        zzdi.e(str);
        return null;
    }

    private static String zzi(Object obj) {
        return obj == null ? zzbdg : obj.toString();
    }

    public static com.google.android.gms.internal.measurement.zzm zzj(Object obj) {
        String obj2;
        com.google.android.gms.internal.measurement.zzm zzmVar = new com.google.android.gms.internal.measurement.zzm();
        if (obj instanceof com.google.android.gms.internal.measurement.zzm) {
            return (com.google.android.gms.internal.measurement.zzm) obj;
        }
        boolean z = false;
        if (!(obj instanceof String)) {
            if (obj instanceof List) {
                zzmVar.type = 2;
                List<Object> list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                boolean z2 = false;
                for (Object obj3 : list) {
                    com.google.android.gms.internal.measurement.zzm zzj = zzj(obj3);
                    if (zzj == zzbdk) {
                        return zzbdk;
                    }
                    z2 = z2 || zzj.zzqh;
                    arrayList.add(zzj);
                }
                zzmVar.zzpy = (com.google.android.gms.internal.measurement.zzm[]) arrayList.toArray(new com.google.android.gms.internal.measurement.zzm[0]);
                z = z2;
            } else if (obj instanceof Map) {
                zzmVar.type = 3;
                Set<Map.Entry> entrySet = ((Map) obj).entrySet();
                ArrayList arrayList2 = new ArrayList(entrySet.size());
                ArrayList arrayList3 = new ArrayList(entrySet.size());
                boolean z3 = false;
                for (Map.Entry entry : entrySet) {
                    com.google.android.gms.internal.measurement.zzm zzj2 = zzj(entry.getKey());
                    com.google.android.gms.internal.measurement.zzm zzj3 = zzj(entry.getValue());
                    if (zzj2 == zzbdk || zzj3 == zzbdk) {
                        return zzbdk;
                    }
                    z3 = z3 || zzj2.zzqh || zzj3.zzqh;
                    arrayList2.add(zzj2);
                    arrayList3.add(zzj3);
                }
                zzmVar.zzpz = (com.google.android.gms.internal.measurement.zzm[]) arrayList2.toArray(new com.google.android.gms.internal.measurement.zzm[0]);
                zzmVar.zzqa = (com.google.android.gms.internal.measurement.zzm[]) arrayList3.toArray(new com.google.android.gms.internal.measurement.zzm[0]);
                z = z3;
            } else if (zzk(obj)) {
                zzmVar.type = 1;
                obj2 = obj.toString();
            } else if (zzl(obj)) {
                zzmVar.type = 6;
                zzmVar.zzqd = zzm(obj);
            } else if (!(obj instanceof Boolean)) {
                String valueOf = String.valueOf(obj == null ? "null" : obj.getClass().toString());
                zzdi.e(valueOf.length() != 0 ? "Converting to Value from unknown object type: ".concat(valueOf) : new String("Converting to Value from unknown object type: "));
                return zzbdk;
            } else {
                zzmVar.type = 8;
                zzmVar.zzqe = ((Boolean) obj).booleanValue();
            }
            zzmVar.zzqh = z;
            return zzmVar;
        }
        zzmVar.type = 1;
        obj2 = (String) obj;
        zzmVar.string = obj2;
        zzmVar.zzqh = z;
        return zzmVar;
    }

    private static boolean zzk(Object obj) {
        if ((obj instanceof Double) || (obj instanceof Float)) {
            return true;
        }
        return (obj instanceof zzgi) && ((zzgi) obj).zzpb();
    }

    private static boolean zzl(Object obj) {
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
            return true;
        }
        return (obj instanceof zzgi) && ((zzgi) obj).zzpc();
    }

    private static long zzm(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        zzdi.e("getInt64 received non-Number");
        return 0L;
    }

    public static Object zzpd() {
        return null;
    }

    public static Long zzpe() {
        return zzbdd;
    }

    public static Double zzpf() {
        return zzbde;
    }

    public static Boolean zzpg() {
        return zzbdh;
    }

    public static zzgi zzph() {
        return zzbdf;
    }

    public static String zzpi() {
        return zzbdg;
    }

    public static com.google.android.gms.internal.measurement.zzm zzpj() {
        return zzbdk;
    }
}
