package defpackage;

import android.app.Activity;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: wgs  reason: default package */
/* loaded from: classes4.dex */
public class wgs implements afwc, ynl {
    protected final wge a;
    public afwa b;
    private final afvn c;

    public wgs(wge wgeVar, yni yniVar, afvn afvnVar) {
        this.a = wgeVar;
        this.c = afvnVar;
        yniVar.g(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static apzg g(byte[] bArr) {
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        if (bArr != null) {
            aoob x = aoob.x(bArr);
            aopcVar.copyOnWrite();
            apzg apzgVar = (apzg) aopcVar.instance;
            apzgVar.b |= 1;
            apzgVar.c = x;
        }
        return (apzg) aopcVar.mo39build();
    }

    protected void a(Activity activity, apzg apzgVar) {
        eo supportFragmentManager = ((dt) activity).getSupportFragmentManager();
        vwy vwyVar = (vwy) supportFragmentManager.f("new-default-sign-in-flow-fragment");
        ex l = supportFragmentManager.l();
        if (vwyVar == null) {
            Bundle bundle = new Bundle();
            if (apzgVar != null) {
                bundle.putByteArray("endpoint", apzgVar.toByteArray());
            }
            wgw wgwVar = new wgw();
            wgwVar.ae(bundle);
            l.r(wgwVar, "new-default-sign-in-flow-fragment");
        } else {
            vwyVar.aE(apzgVar);
            if (!vwyVar.at()) {
                l.n(vwyVar);
            }
        }
        l.a();
    }

    @Override // defpackage.afwc
    public final void b(Activity activity, apzg apzgVar, @Deprecated afwa afwaVar) {
        apzg c = wig.c(apzgVar);
        if (activity instanceof dt) {
            afwa afwaVar2 = this.b;
            if (afwaVar2 != null) {
                afwaVar2.a();
            }
            if (afwaVar == null) {
                afwaVar = afwa.g;
            }
            this.b = afwaVar;
            afvm c2 = this.c.c();
            if (vwr.e(c2)) {
                return;
            }
            if (c2.g()) {
                wpu.e(((dt) activity).getSupportFragmentManager(), new afve() { // from class: wgr
                    @Override // defpackage.afve
                    public final void a() {
                        afwa afwaVar3 = wgs.this.b;
                        if (afwaVar3 != null) {
                            afwaVar3.b();
                        }
                    }
                }, c);
                return;
            } else {
                a(activity, c);
                return;
            }
        }
        String name = getClass().getName();
        String name2 = dt.class.getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 15 + String.valueOf(name2).length());
        sb.append(name);
        sb.append(" only supports ");
        sb.append(name2);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.afwc
    public final void c(Activity activity, byte[] bArr, @Deprecated afwa afwaVar) {
        b(activity, g(bArr), afwaVar);
    }

    public final void d(wgf wgfVar) {
        afwa afwaVar = this.b;
        if (afwaVar != null) {
            afwaVar.c(wgfVar.a());
            this.b = null;
        }
    }

    public final void e(wgh wghVar) {
        afwa afwaVar;
        if (wghVar.a() != wgg.CANCELLED || (afwaVar = this.b) == null) {
            return;
        }
        afwaVar.a();
        this.b = null;
    }

    public final void h() {
        afwa afwaVar = this.b;
        if (afwaVar != null) {
            afwaVar.b();
            this.b = null;
        }
    }

    public Class[] ky(Class cls, Object obj, int i) {
        return wep.a(this, obj, i);
    }

    @Override // defpackage.afwc
    public final void qx(String str) {
        this.a.k(str);
    }
}
