package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: vyx  reason: default package */
/* loaded from: classes4.dex */
public final class vyx extends wgs implements ynl {
    public vyx(wge wgeVar, yni yniVar, afvn afvnVar, wgq wgqVar) {
        super(wgeVar, yniVar, afvnVar);
    }

    @Override // defpackage.wgs
    protected final void a(Activity activity, apzg apzgVar) {
        eo supportFragmentManager = ((dt) activity).getSupportFragmentManager();
        vyy vyyVar = (vyy) supportFragmentManager.f("new-fusion-sign-in-flow-fragment");
        ex l = supportFragmentManager.l();
        if (vyyVar != null) {
            vyyVar.aE(apzgVar);
            if (!vyyVar.at()) {
                l.n(vyyVar);
            }
        } else {
            l.r(vyy.aF(apzgVar), "new-fusion-sign-in-flow-fragment");
        }
        l.a();
    }

    @Override // defpackage.wgs, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (cls == vyx.class) {
            if (i == -1) {
                return new Class[]{wgf.class, wgh.class, afwb.class};
            }
            if (i == 0) {
                d((wgf) obj);
                return null;
            } else if (i == 1) {
                e((wgh) obj);
                return null;
            } else if (i == 2) {
                afwb afwbVar = (afwb) obj;
                h();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return wep.a(this, obj, i);
    }
}
