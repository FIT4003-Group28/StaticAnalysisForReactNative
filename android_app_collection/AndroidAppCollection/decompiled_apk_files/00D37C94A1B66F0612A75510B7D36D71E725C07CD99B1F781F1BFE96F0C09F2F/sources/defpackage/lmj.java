package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lmj  reason: default package */
/* loaded from: classes3.dex */
public final class lmj implements ynl {
    public final Activity a;
    public boolean b = false;
    private final yzj c;

    public lmj(Activity activity, yzj yzjVar) {
        this.a = activity;
        this.c = yzjVar;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afvw afvwVar = (afvw) obj;
                if (this.b) {
                    return null;
                }
                this.c.a(afvwVar.b());
                AlertDialog show = new AlertDialog.Builder(this.a).setMessage(R.string.common_error_authenticating).setPositiveButton(R.string.account_switcher_sign_in, new lmh(this, afvwVar.a())).show();
                this.b = true;
                show.setOnDismissListener(new lmi(this));
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{afvw.class};
    }
}
