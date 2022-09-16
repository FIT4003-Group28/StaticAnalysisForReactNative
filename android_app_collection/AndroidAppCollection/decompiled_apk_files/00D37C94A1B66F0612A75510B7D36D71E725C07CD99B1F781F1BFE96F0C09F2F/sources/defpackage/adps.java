package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
import java.lang.ref.WeakReference;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adps  reason: default package */
/* loaded from: classes.dex */
final class adps extends Handler {
    private final WeakReference a;

    public adps(adpt adptVar) {
        super(Looper.getMainLooper());
        this.a = new WeakReference(adptVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        adpt adptVar = (adpt) this.a.get();
        if (adptVar == null || !adptVar.f) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            adptVar.t();
            if (hasMessages(0)) {
                return;
            }
            sendEmptyMessageDelayed(0, 5000L);
        } else if (i == 1) {
            adptVar.s();
            if (hasMessages(1)) {
                return;
            }
            sendEmptyMessageDelayed(1, 10000L);
        } else if (i == 2) {
            Set<adid> set = (Set) message.obj;
            if (set.isEmpty()) {
                return;
            }
            for (adid adidVar : set) {
                adit aditVar = adidVar.n;
                Integer num = (Integer) adptVar.e.get(aditVar);
                adnt e = ((adoa) adptVar.c.get()).e();
                if (num == null || num.intValue() >= 5 || e == null || !adidVar.i(e.k())) {
                    Uri uri = adidVar.b;
                    if (uri == null) {
                        adptVar.l(adidVar).c(AppStatus.d(-2));
                    } else {
                        String.valueOf(adidVar.d).length();
                        adptVar.d.a(uri, adptVar.l(adidVar));
                    }
                } else {
                    String str = adidVar.d;
                    num.intValue();
                    String.valueOf(str).length();
                    adptVar.e.put(aditVar, Integer.valueOf(num.intValue() + 1));
                }
            }
        }
    }
}
