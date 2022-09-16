package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
/* compiled from: PG */
/* renamed from: odp  reason: default package */
/* loaded from: classes3.dex */
public final class odp extends lpi implements ynl {
    private static final ampt a = mem.n;
    private final Activity b;
    private final ajqm c;
    private final ajqm d;
    private final ajrj e;

    public odp(Activity activity, abeb abebVar, ajyi ajyiVar, yni yniVar, yzj yzjVar, acti actiVar, ajxt ajxtVar, ajin ajinVar, snc sncVar, iub iubVar, ampq ampqVar) {
        super(ajyiVar, yniVar, yzjVar, ajinVar, sncVar, iubVar, ampqVar, ajxtVar, abebVar, actiVar, null);
        this.b = activity;
        ajsm ajsmVar = this.i;
        this.c = ajsmVar;
        ajrj ajrjVar = new ajrj();
        this.e = ajrjVar;
        ajrjVar.m(ajsmVar);
        this.d = new ajqv(ajsmVar, a);
        L(new odk(1));
        ajsmVar.mG(new ajyl(this));
    }

    @Override // defpackage.lpi, defpackage.ajyq
    public final void i(aakq aakqVar) {
        super.i(aakqVar);
        r(this.b.getResources().getConfiguration());
    }

    @Override // defpackage.ajxl, defpackage.ajyj
    public final ajqm lA() {
        return this.e;
    }

    @Override // defpackage.ajxl, defpackage.ajyj
    public final void lC(Configuration configuration) {
        r(configuration);
    }

    final void r(Configuration configuration) {
        if (configuration == null) {
            return;
        }
        if (configuration.orientation == 2) {
            this.e.r(this.c, this.d);
        } else {
            this.e.r(this.d, this.c);
        }
    }

    @Override // defpackage.lpi, defpackage.ajyq, defpackage.ajxl, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (cls == odp.class) {
            switch (i) {
                case -1:
                    return new Class[]{isw.class, aabk.class, aabm.class, aawi.class, aawj.class, ajym.class};
                case 0:
                    n((isw) obj);
                    return null;
                case 1:
                    nn((aabk) obj);
                    return null;
                case 2:
                    no((aabm) obj);
                    return null;
                case 3:
                    N((aawi) obj);
                    return null;
                case 4:
                    o((aawj) obj);
                    return null;
                case 5:
                    M((ajym) obj);
                    return null;
                default:
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unsupported op code: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
            }
        }
        return super.ky(cls, obj, i);
    }
}
