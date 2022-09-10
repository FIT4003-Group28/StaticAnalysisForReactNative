package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Base64;
import java.io.File;
import java.util.List;
import java.util.NavigableMap;
/* compiled from: PG */
/* renamed from: aokw  reason: default package */
/* loaded from: classes2.dex */
public final class aokw {
    public final SharedPreferences a;
    private final bdux d;
    private final dxio<NavigableMap<Long, List<aola>>> c = btsp.b(new aokv(this));
    public boolean b = false;

    public aokw(bvju bvjuVar, bdux bduxVar) {
        this.a = bvjuVar.a("receipt");
        this.d = bduxVar;
    }

    public final synchronized dcdc<aola> a(long j, long j2) {
        if (j2 < j) {
            return dcdc.e();
        }
        dccx F = dcdc.F();
        for (List<aola> list : this.c.a().subMap(Long.valueOf(j), Long.valueOf(j2)).values()) {
            F.i(list);
        }
        return F.f();
    }

    public final synchronized void b(aola aolaVar) {
        List list = (List) this.c.a().get(Long.valueOf(aolaVar.b));
        if (list == null) {
            return;
        }
        dddn b = dddn.b(aolaVar.e);
        if (b == null) {
            b = dddn.UNKNOWN;
        }
        if (b != dddn.GMM_GALLERY) {
            dddn b2 = dddn.b(aolaVar.e);
            if (b2 == null) {
                b2 = dddn.UNKNOWN;
            }
            if (b2 != dddn.PICK_INTENT) {
                String a = bdux.a(this.d.a, Uri.parse(aolaVar.c));
                if (a != null) {
                    new File(a).delete();
                }
            }
        }
        list.remove(aolaVar);
        if (!list.isEmpty()) {
            return;
        }
        this.c.a().remove(Long.valueOf(aolaVar.b));
    }

    public final synchronized void c() {
        if (!this.b) {
            return;
        }
        aolb bZ = aolc.b.bZ();
        for (List<aola> list : this.c.a().values()) {
            for (aola aolaVar : list) {
                int a = aokz.a(aolaVar.d);
                if (a != 0 && a == 2) {
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                aolc aolcVar = (aolc) bZ.b;
                aolaVar.getClass();
                dsrj<aola> dsrjVar = aolcVar.a;
                if (!dsrjVar.a()) {
                    aolcVar.a = dsqw.cl(dsrjVar);
                }
                aolcVar.a.add(aolaVar);
            }
        }
        this.a.edit().putString("pendingReceiptUploadDetails", Base64.encodeToString(bZ.bK().bS(), 1)).commit();
    }
}
