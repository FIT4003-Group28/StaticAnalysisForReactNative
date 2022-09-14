package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzgk extends zzgh {
    private static final String ID = com.google.android.gms.internal.measurement.zza.UNIVERSAL_ANALYTICS.toString();
    private static final String zzbdl = com.google.android.gms.internal.measurement.zzb.ACCOUNT.toString();
    private static final String zzbdm = com.google.android.gms.internal.measurement.zzb.ANALYTICS_PASS_THROUGH.toString();
    private static final String zzbdn = com.google.android.gms.internal.measurement.zzb.ENABLE_ECOMMERCE.toString();
    private static final String zzbdo = com.google.android.gms.internal.measurement.zzb.ECOMMERCE_USE_DATA_LAYER.toString();
    private static final String zzbdp = com.google.android.gms.internal.measurement.zzb.ECOMMERCE_MACRO_DATA.toString();
    private static final String zzbdq = com.google.android.gms.internal.measurement.zzb.ANALYTICS_FIELDS.toString();
    private static final String zzbdr = com.google.android.gms.internal.measurement.zzb.TRACK_TRANSACTION.toString();
    private static final String zzbds = com.google.android.gms.internal.measurement.zzb.TRANSACTION_DATALAYER_MAP.toString();
    private static final String zzbdt = com.google.android.gms.internal.measurement.zzb.TRANSACTION_ITEM_DATALAYER_MAP.toString();
    private static final List<String> zzbdu = Arrays.asList(ProductAction.ACTION_DETAIL, ProductAction.ACTION_CHECKOUT, ProductAction.ACTION_CHECKOUT_OPTION, "click", ProductAction.ACTION_ADD, ProductAction.ACTION_REMOVE, ProductAction.ACTION_PURCHASE, ProductAction.ACTION_REFUND);
    private static final Pattern zzbdv = Pattern.compile("dimension(\\d+)");
    private static final Pattern zzbdw = Pattern.compile("metric(\\d+)");
    private static Map<String, String> zzbdx;
    private static Map<String, String> zzbdy;
    private final DataLayer zzavu;
    private final Set<String> zzbdz;
    private final zzgf zzbea;

    public zzgk(Context context, DataLayer dataLayer) {
        this(context, dataLayer, new zzgf(context));
    }

    @VisibleForTesting
    private zzgk(Context context, DataLayer dataLayer, zzgf zzgfVar) {
        super(ID, new String[0]);
        this.zzavu = dataLayer;
        this.zzbea = zzgfVar;
        this.zzbdz = new HashSet();
        this.zzbdz.add("");
        this.zzbdz.add("0");
        this.zzbdz.add("false");
    }

    private static boolean zzc(Map<String, com.google.android.gms.internal.measurement.zzm> map, String str) {
        com.google.android.gms.internal.measurement.zzm zzmVar = map.get(str);
        if (zzmVar == null) {
            return false;
        }
        return zzgj.zzg(zzmVar).booleanValue();
    }

    private static void zzd(Map<String, String> map, String str, String str2) {
        if (str2 != null) {
            map.put(str, str2);
        }
    }

    private final String zzdr(String str) {
        Object obj = this.zzavu.get(str);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    private static Product zzh(Map<String, Object> map) {
        String str;
        String valueOf;
        String str2;
        Product product = new Product();
        Object obj = map.get("id");
        if (obj != null) {
            product.setId(String.valueOf(obj));
        }
        Object obj2 = map.get("name");
        if (obj2 != null) {
            product.setName(String.valueOf(obj2));
        }
        Object obj3 = map.get("brand");
        if (obj3 != null) {
            product.setBrand(String.valueOf(obj3));
        }
        Object obj4 = map.get("category");
        if (obj4 != null) {
            product.setCategory(String.valueOf(obj4));
        }
        Object obj5 = map.get("variant");
        if (obj5 != null) {
            product.setVariant(String.valueOf(obj5));
        }
        Object obj6 = map.get("coupon");
        if (obj6 != null) {
            product.setCouponCode(String.valueOf(obj6));
        }
        Object obj7 = map.get("position");
        if (obj7 != null) {
            product.setPosition(zzo(obj7).intValue());
        }
        Object obj8 = map.get("price");
        if (obj8 != null) {
            product.setPrice(zzn(obj8).doubleValue());
        }
        Object obj9 = map.get("quantity");
        if (obj9 != null) {
            product.setQuantity(zzo(obj9).intValue());
        }
        for (String str3 : map.keySet()) {
            Matcher matcher = zzbdv.matcher(str3);
            if (matcher.matches()) {
                try {
                    product.setCustomDimension(Integer.parseInt(matcher.group(1)), String.valueOf(map.get(str3)));
                } catch (NumberFormatException unused) {
                    str = "illegal number in custom dimension value: ";
                    valueOf = String.valueOf(str3);
                    if (valueOf.length() == 0) {
                        str2 = new String(str);
                        zzdi.zzaa(str2);
                    }
                    str2 = str.concat(valueOf);
                    zzdi.zzaa(str2);
                }
            } else {
                Matcher matcher2 = zzbdw.matcher(str3);
                if (matcher2.matches()) {
                    try {
                        product.setCustomMetric(Integer.parseInt(matcher2.group(1)), zzo(map.get(str3)).intValue());
                    } catch (NumberFormatException unused2) {
                        str = "illegal number in custom metric value: ";
                        valueOf = String.valueOf(str3);
                        if (valueOf.length() == 0) {
                            str2 = new String(str);
                            zzdi.zzaa(str2);
                        }
                        str2 = str.concat(valueOf);
                        zzdi.zzaa(str2);
                    }
                }
            }
        }
        return product;
    }

    private static Map<String, String> zzi(com.google.android.gms.internal.measurement.zzm zzmVar) {
        Object zzh = zzgj.zzh(zzmVar);
        if (!(zzh instanceof Map)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) zzh).entrySet()) {
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    private final Map<String, String> zzj(com.google.android.gms.internal.measurement.zzm zzmVar) {
        Map<String, String> zzi;
        if (zzmVar != null && (zzi = zzi(zzmVar)) != null) {
            String str = zzi.get("&aip");
            if (str != null && this.zzbdz.contains(str.toLowerCase())) {
                zzi.remove("&aip");
            }
            return zzi;
        }
        return new HashMap();
    }

    private static Double zzn(Object obj) {
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj);
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(e.getMessage());
                throw new RuntimeException(valueOf.length() != 0 ? "Cannot convert the object to Double: ".concat(valueOf) : new String("Cannot convert the object to Double: "));
            }
        } else if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        } else {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            String valueOf2 = String.valueOf(obj.toString());
            throw new RuntimeException(valueOf2.length() != 0 ? "Cannot convert the object to Double: ".concat(valueOf2) : new String("Cannot convert the object to Double: "));
        }
    }

    private static Integer zzo(Object obj) {
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj);
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(e.getMessage());
                throw new RuntimeException(valueOf.length() != 0 ? "Cannot convert the object to Integer: ".concat(valueOf) : new String("Cannot convert the object to Integer: "));
            }
        } else if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        } else {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            String valueOf2 = String.valueOf(obj.toString());
            throw new RuntimeException(valueOf2.length() != 0 ? "Cannot convert the object to Integer: ".concat(valueOf2) : new String("Cannot convert the object to Integer: "));
        }
    }

    @Override // com.google.android.gms.tagmanager.zzgh, com.google.android.gms.tagmanager.zzbq
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzm zzd(Map map) {
        return super.zzd(map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
        if ((r11 instanceof java.util.Map) != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
        r11 = (java.util.Map) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0041, code lost:
        if ((r11 instanceof java.util.Map) != false) goto L144;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017a  */
    @Override // com.google.android.gms.tagmanager.zzgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.zzm> r11) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzgk.zzf(java.util.Map):void");
    }

    @Override // com.google.android.gms.tagmanager.zzgh, com.google.android.gms.tagmanager.zzbq
    public final /* bridge */ /* synthetic */ boolean zzme() {
        return super.zzme();
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final /* bridge */ /* synthetic */ String zznn() {
        return super.zznn();
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final /* bridge */ /* synthetic */ Set zzno() {
        return super.zzno();
    }
}
