package defpackage;

import com.google.android.apps.maps.R;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: wvo  reason: default package */
/* loaded from: classes7.dex */
public final class wvo implements btzi<djpm, djpu> {
    final /* synthetic */ wvp a;
    final /* synthetic */ wzf b;

    public wvo(wvp wvpVar, wzf wzfVar) {
        this.a = wvpVar;
        this.b = wzfVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djpm> btzrVar, btzy btzyVar) {
        this.b.a();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djpm> btzrVar, djpu djpuVar) {
        djpu djpuVar2 = djpuVar;
        if (djpuVar2.a.size() <= 0 || djpuVar2.a.get(0).a != 3) {
            this.b.a();
            return;
        }
        djpk djpkVar = djpuVar2.a.get(0).c;
        if (djpkVar == null) {
            djpkVar = djpk.e;
        }
        if ((djpkVar.a & 8) != 0) {
            djpj bZ = djpk.e.bZ();
            String str = djpkVar.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djpk djpkVar2 = (djpk) bZ.b;
            str.getClass();
            djpkVar2.a |= 8;
            djpkVar2.d = str;
            djpkVar = bZ.bK();
        }
        HashMap<drhj, drhn> hashMap = this.a.a.get(djpkVar);
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        djpr djprVar = djpuVar2.a.get(0);
        for (drhn drhnVar : (djprVar.a == 3 ? (djpt) djprVar.b : djpt.b).a) {
            if ((drhnVar.a & 8) != 0) {
                drhx drhxVar = drhnVar.e;
                if (drhxVar == null) {
                    drhxVar = drhx.c;
                }
                int i = drhxVar.a;
                char c = 2;
                if (i == 0) {
                    c = 1;
                } else if (i != 1) {
                    c = i != 2 ? (char) 0 : (char) 3;
                }
                if (c == 0) {
                    throw null;
                }
                if (c != 1) {
                    drhj drhjVar = drhnVar.b;
                    if (drhjVar == null) {
                        drhjVar = drhj.c;
                    }
                    hashMap.put(drhjVar, drhnVar);
                }
            }
            drhj drhjVar2 = drhnVar.b;
            if (drhjVar2 == null) {
                drhjVar2 = drhj.c;
            }
            hashMap.remove(drhjVar2);
        }
        this.a.a.put(djpkVar, hashMap);
        wzf wzfVar = this.b;
        djpr djprVar2 = djpuVar2.a.get(0);
        dsrj<drhn> dsrjVar = (djprVar2.a == 3 ? (djpt) djprVar2.b : djpt.b).a;
        wzi wziVar = wzfVar.a;
        wziVar.c = false;
        wziVar.g = false;
        ckos.a(wzfVar.a.b.findViewById(16908290), wzfVar.a.b.getString(R.string.TRANSIT_ATTRIBUTE_SAVE_THANK_YOU_TEXT), 0).c();
        wzfVar.a.a.a();
    }
}
