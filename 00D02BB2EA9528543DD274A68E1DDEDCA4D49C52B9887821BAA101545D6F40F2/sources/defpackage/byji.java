package defpackage;

import android.os.Bundle;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: byji  reason: default package */
/* loaded from: classes4.dex */
public class byji extends byjl implements byif {
    private final byjh b;
    private final byny c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byji(defpackage.vtn r2, defpackage.byny r3, defpackage.byjh r4) {
        /*
            r1 = this;
            java.lang.Object r0 = r3.b()
            dozz r0 = (defpackage.dozz) r0
            if (r0 != 0) goto La
            dozz r0 = defpackage.dozz.y
        La:
            r1.<init>(r2, r0)
            r1.b = r4
            r1.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byji.<init>(vtn, byny, byjh):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<byji> f(List<dozz> list, int i, byjj byjjVar, byjh byjhVar) {
        dccx F = dcdc.F();
        for (int i2 = 0; i2 < i; i2++) {
            F.g(byjjVar.a(new byny(list, i2), byjhVar));
        }
        return F.f();
    }

    @Override // defpackage.byif
    public cqkl a() {
        gga ggaVar;
        byev byevVar;
        doyu doyuVar;
        byjh byjhVar = this.b;
        byny bynyVar = this.c;
        dozz b = bynyVar.b();
        if (b != null) {
            byeq byeqVar = (byeq) byjhVar;
            if (byeqVar.a.aD) {
                dozy b2 = dozy.b(b.f);
                if (b2 == null) {
                    b2 = dozy.UNKNOWN;
                }
                if (b2 != dozy.EVENT) {
                    dozy b3 = dozy.b(b.f);
                    if (b3 == null) {
                        b3 = dozy.UNKNOWN;
                    }
                    if (b3 == dozy.TRAFFIC_PROBLEM && (ggaVar = byeqVar.a.aE) != null) {
                        int i = bynyVar.c;
                        ArrayList arrayList = new ArrayList();
                        int i2 = -1;
                        for (int i3 = 0; i3 < bynyVar.size(); i3++) {
                            dozz dozzVar = bynyVar.get(i3);
                            dozy b4 = dozy.b(dozzVar.f);
                            if (b4 == null) {
                                b4 = dozy.UNKNOWN;
                            }
                            if (b4 == dozy.TRAFFIC_PROBLEM) {
                                if (i == i3) {
                                    i2 = arrayList.size();
                                }
                                arrayList.add(dozzVar);
                            }
                        }
                        if (i2 == -1) {
                            bvoo.h("TrafficHubInspectionFragment.newInstance() called with invalid selection.", new Object[0]);
                            byevVar = null;
                        } else {
                            byevVar = new byev();
                            byny bynyVar2 = new byny(arrayList, i2);
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("notice_in_list_list_key", new ProtoBufUtil$ParcelableProtoList(bynyVar2.b));
                            bundle.putInt("notice_in_list_index_key", bynyVar2.c);
                            byevVar.B(bundle);
                        }
                        if (byevVar != null) {
                            ggaVar.D(byevVar);
                        }
                    }
                } else {
                    aagc aagcVar = byeqVar.a.at;
                    if (b.b == 27) {
                        doyuVar = (doyu) b.c;
                    } else {
                        doyuVar = doyu.e;
                    }
                    aagcVar.a(doyuVar.d, 3);
                }
            }
        }
        return cqkl.a;
    }
}
