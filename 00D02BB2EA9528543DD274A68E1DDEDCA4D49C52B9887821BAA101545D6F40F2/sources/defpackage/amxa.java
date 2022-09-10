package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: amxa  reason: default package */
/* loaded from: classes2.dex */
public final class amxa {
    public static final Map<String, String> a;
    public static final int b;
    public final Intent c;
    public String d;
    public Messenger e;
    public double[] f;
    public long g;
    public long h;

    static {
        HashMap d = dcjz.d();
        a = d;
        d.put("com.google.android.googlequicksearchbox", "m");
        d.put("com.google.android.apps.gmm.tools.intent", "i");
        b = (int) TimeUnit.DAYS.toSeconds(3L);
    }

    public amxa(Intent intent) {
        this.c = intent;
    }

    public final void a(int i) {
        try {
            this.e.send(Message.obtain((Handler) null, i));
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(57);
            sb.append("RemoteException attempting to send resultCode ");
            sb.append(i);
            bvoo.f(new RuntimeException(sb.toString(), e));
        }
    }
}
