package defpackage;

import com.android.billingclient.api.SkuDetails;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cdy  reason: default package */
/* loaded from: classes2.dex */
public final class cdy {
    public String a;
    public ArrayList b;

    public final ceb a() {
        ArrayList arrayList = this.b;
        if (arrayList == null || arrayList.isEmpty()) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        if (this.b.contains(null)) {
            throw new IllegalArgumentException("SKU cannot be null.");
        }
        if (this.b.size() > 1) {
            SkuDetails skuDetails = (SkuDetails) this.b.get(0);
            String d = skuDetails.d();
            ArrayList arrayList2 = this.b;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i);
                if (!d.equals("play_pass_subs") && !skuDetails2.d().equals("play_pass_subs") && !d.equals(skuDetails2.d())) {
                    throw new IllegalArgumentException("SKUs should have the same type.");
                }
            }
            String a = skuDetails.a();
            ArrayList arrayList3 = this.b;
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i2);
                if (!d.equals("play_pass_subs") && !skuDetails3.d().equals("play_pass_subs") && !a.equals(skuDetails3.a())) {
                    throw new IllegalArgumentException("All SKUs must have the same package name.");
                }
            }
        }
        ceb cebVar = new ceb();
        cebVar.a = !((SkuDetails) this.b.get(0)).a().isEmpty();
        cebVar.b = this.a;
        ArrayList arrayList4 = this.b;
        cebVar.d = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
        cebVar.c = amuk.q();
        return cebVar;
    }
}
