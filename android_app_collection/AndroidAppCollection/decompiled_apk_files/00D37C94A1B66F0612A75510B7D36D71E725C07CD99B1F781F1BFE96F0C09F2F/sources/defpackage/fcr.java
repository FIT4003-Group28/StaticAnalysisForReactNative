package defpackage;

import android.accounts.Account;
import android.util.Pair;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: fcr  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fcr implements ayqe {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ fcr(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                String str = this.a;
                fcv fcvVar = fcv.a;
                aoqp aoqpVar = ((fda) obj).j;
                if (aoqpVar.containsKey(str)) {
                    fcvVar = (fcv) aoqpVar.get(str);
                }
                return Boolean.valueOf(fcvVar.e);
            case 1:
                String str2 = this.a;
                int i = esl.g;
                zgh.m(str2);
                return ampr.a(str2, (Account) obj);
            case 2:
                return ((ayoi) obj).Z(false, new mhi(this.a, 1)).ad(false).B().ah(ikb.k);
            case 3:
                return Boolean.valueOf(((amvn) obj).contains(this.a));
            case 4:
                return Boolean.valueOf(((amvn) obj).contains(this.a));
            case 5:
                return Boolean.valueOf(((amvn) obj).contains(this.a));
            case 6:
                return Boolean.valueOf(((amvn) obj).contains(this.a));
            case 7:
                String str3 = this.a;
                ArrayList arrayList = new ArrayList(((atjj) obj).getSelectedVideoIds());
                if (arrayList.contains(str3)) {
                    arrayList.remove(str3);
                } else {
                    arrayList.add(str3);
                }
                return arrayList;
            case 8:
                String str4 = this.a;
                zgh.m(str4);
                return ampr.a(str4, (Account) obj);
            case 9:
                return ((ayoi) obj).Z(false, new mhi(this.a)).ad(false).B().ah(kth.l);
            case 10:
                return Pair.create(this.a, (ampq) obj);
            case 11:
                return Pair.create(this.a, (ampq) obj);
            case 12:
                return Pair.create(this.a, (ampq) obj);
            case 13:
                String str5 = this.a;
                zgh.m(str5);
                return ampr.a(str5, (Account) obj);
            default:
                String str6 = this.a;
                aakd aakdVar = (aakd) obj;
                aajn a = aajp.a();
                a.c(str6);
                a.b = aakdVar.b;
                a.b(aakdVar.c);
                return a.a();
        }
    }
}
