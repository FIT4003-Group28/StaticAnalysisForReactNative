package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: lnc  reason: default package */
/* loaded from: classes3.dex */
public final class lnc implements ynl {
    public final Activity a;
    public final ajxz b;
    public final aafo c;
    public final acti d;
    public final yni e;
    public nx f;

    public lnc(Activity activity, ajxz ajxzVar, aafo aafoVar, acut acutVar, yni yniVar) {
        this.a = activity;
        this.b = ajxzVar;
        this.c = aafoVar;
        this.d = acutVar;
        this.e = yniVar;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        nx nxVar;
        if (i != -1) {
            if (i == 0) {
                if (((ypy) obj).a() || (nxVar = this.f) == null || !nxVar.isShowing()) {
                    return null;
                }
                this.f.dismiss();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ypy.class};
    }
}
