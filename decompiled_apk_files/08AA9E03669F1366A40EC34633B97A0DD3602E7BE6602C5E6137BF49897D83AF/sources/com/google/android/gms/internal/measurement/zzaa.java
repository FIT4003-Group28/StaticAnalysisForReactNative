package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzaa extends com.google.android.gms.analytics.zzi<zzaa> {
    private ProductAction zzri;
    private final List<Product> zzrl = new ArrayList();
    private final List<Promotion> zzrk = new ArrayList();
    private final Map<String, List<Product>> zzrj = new HashMap();

    public final String toString() {
        HashMap hashMap = new HashMap();
        if (!this.zzrl.isEmpty()) {
            hashMap.put("products", this.zzrl);
        }
        if (!this.zzrk.isEmpty()) {
            hashMap.put("promotions", this.zzrk);
        }
        if (!this.zzrj.isEmpty()) {
            hashMap.put("impressions", this.zzrj);
        }
        hashMap.put("productAction", this.zzri);
        return zza((Object) hashMap);
    }

    public final ProductAction zzat() {
        return this.zzri;
    }

    public final List<Product> zzau() {
        return Collections.unmodifiableList(this.zzrl);
    }

    public final Map<String, List<Product>> zzav() {
        return this.zzrj;
    }

    public final List<Promotion> zzaw() {
        return Collections.unmodifiableList(this.zzrk);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzaa zzaaVar) {
        zzaa zzaaVar2 = zzaaVar;
        zzaaVar2.zzrl.addAll(this.zzrl);
        zzaaVar2.zzrk.addAll(this.zzrk);
        for (Map.Entry<String, List<Product>> entry : this.zzrj.entrySet()) {
            String key = entry.getKey();
            for (Product product : entry.getValue()) {
                if (product != null) {
                    String str = key == null ? "" : key;
                    if (!zzaaVar2.zzrj.containsKey(str)) {
                        zzaaVar2.zzrj.put(str, new ArrayList());
                    }
                    zzaaVar2.zzrj.get(str).add(product);
                }
            }
        }
        if (this.zzri != null) {
            zzaaVar2.zzri = this.zzri;
        }
    }
}
