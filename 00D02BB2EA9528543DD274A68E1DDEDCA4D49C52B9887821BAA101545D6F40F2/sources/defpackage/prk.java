package defpackage;

import android.app.Activity;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: prk  reason: default package */
/* loaded from: classes7.dex */
public final class prk {
    public final bnph a;
    public final gfq b;
    public final Activity c;
    private final bvrb d;
    private final btvo e;

    public prk(Activity activity, bvrb bvrbVar, btvo btvoVar, bnph bnphVar, gfq gfqVar) {
        this.c = activity;
        this.d = bvrbVar;
        this.e = btvoVar;
        this.a = bnphVar;
        this.b = gfqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(vnk vnkVar, ges gesVar) {
        amsy aS = vnkVar.aS();
        if (aS == null) {
            return false;
        }
        if ((this.e.getTaxiParameters().a || !vnkVar.g().equals(dqvj.TAXI)) && aS.i() == vnkVar.aG() && vxx.a.contains(vnkVar.g()) && aS.i() > 0) {
            dwaa dwaaVar = aS.a.b;
            if (dwaaVar == null) {
                dwaaVar = dwaa.g;
            }
            String str = dwaaVar.d;
            int i = aS.i() - 1;
            dpjn dpjnVar = aS.h(i).b;
            if (dpjnVar == null) {
                dpjnVar = dpjn.m;
            }
            dpjn dpjnVar2 = dpjnVar;
            Iterator<dpca> it = dpjnVar2.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int a = dpbz.a(it.next().b);
                if (a != 0 && a == 4) {
                    if (!vnkVar.D(i)) {
                        this.d.b(new prj(this, gesVar, vnkVar, i, dpjnVar2, str), bvrj.UI_THREAD);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
