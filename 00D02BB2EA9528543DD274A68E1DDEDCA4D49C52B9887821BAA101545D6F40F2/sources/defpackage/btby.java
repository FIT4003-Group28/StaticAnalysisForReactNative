package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import com.google.android.apps.gmm.base.activities.GmmSimpleRestartActivity;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: btby  reason: default package */
/* loaded from: classes4.dex */
public final class btby {
    private static final dcqe a = dcqe.c("btby");
    private final bvjj b;
    private final gga c;
    private final Runtime d;

    public btby(bvjj bvjjVar, gga ggaVar) {
        Runtime runtime = Runtime.getRuntime();
        this.b = bvjjVar;
        this.c = ggaVar;
        this.d = runtime;
    }

    public final void a(Locale locale) {
        this.b.ac(bvjk.Q, (String) ((dbsu) btbp.a(locale)).a);
        this.b.aq();
        Bundle bundle = new Bundle();
        bundle.putParcelable("GmmSimpleRestartActivity.extra_destination_intent", afft.a(this.c.getBaseContext()).setFlags(268435456));
        Context baseContext = this.c.getBaseContext();
        dcdn k = dcdn.k("GmmSimpleRestartActivity.bundle_key", bundle);
        Intent intent = new Intent();
        intent.setClassName(baseContext.getPackageName(), GmmSimpleRestartActivity.class.getName());
        intent.setFlags(268435456);
        intent.putExtra("GmmSimpleRestartActivity.extra_main_pid", Process.myPid());
        for (String str : k.keySet()) {
            Object obj = k.get(str);
            if (obj instanceof String) {
                intent.putExtra(str, (String) obj);
            } else if (obj instanceof Integer) {
                intent.putExtra(str, ((Integer) obj).intValue());
            } else if (obj instanceof Bundle) {
                intent.putExtra(str, (Bundle) obj);
            } else {
                String valueOf = String.valueOf(obj.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb.append("GmmSimpleRestartActivity.createIntent doesn't know type: ");
                sb.append(valueOf);
                throw new UnsupportedOperationException(sb.toString());
            }
        }
        this.c.getApplicationContext().startActivity(intent);
        this.d.exit(0);
    }
}
