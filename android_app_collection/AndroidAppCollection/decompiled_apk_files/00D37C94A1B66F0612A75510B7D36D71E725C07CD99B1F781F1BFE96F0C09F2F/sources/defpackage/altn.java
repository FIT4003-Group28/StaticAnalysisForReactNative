package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: altn  reason: default package */
/* loaded from: classes.dex */
public final class altn extends alrw {
    private static altn b;
    private final altc c;
    private final Set d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public altn(Context context, altc altcVar) {
        super(new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        new alrz("SplitInstallListenerRegistry");
        new Handler(Looper.getMainLooper());
        this.d = new LinkedHashSet();
        this.c = altcVar;
    }

    public static synchronized altn e(Context context) {
        altn altnVar;
        synchronized (altn.class) {
            if (b == null) {
                b = new altn(context, alth.a);
            }
            altnVar = b;
        }
        return altnVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alrw
    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        altz b2 = altz.b(bundleExtra);
        altd a = this.c.a();
        if (b2.b != 3 || a == null) {
            f(b2);
        } else {
            a.a();
        }
    }

    public final synchronized void f(altz altzVar) {
        Iterator it = new LinkedHashSet(this.d).iterator();
        while (it.hasNext()) {
            ((alub) it.next()).i(altzVar);
        }
        super.d(altzVar);
    }
}
