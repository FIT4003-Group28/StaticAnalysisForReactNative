package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aocq  reason: default package */
/* loaded from: classes.dex */
final class aocq {
    private static WeakReference a;
    private final SharedPreferences b;
    private aock c;
    private final Executor d;

    private aocq(SharedPreferences sharedPreferences, Executor executor) {
        this.d = executor;
        this.b = sharedPreferences;
    }

    public static synchronized aocq b(Context context, Executor executor) {
        synchronized (aocq.class) {
            WeakReference weakReference = a;
            aocq aocqVar = weakReference != null ? (aocq) weakReference.get() : null;
            if (aocqVar == null) {
                aocq aocqVar2 = new aocq(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                aocqVar2.e();
                a = new WeakReference(aocqVar2);
                return aocqVar2;
            }
            return aocqVar;
        }
    }

    private final synchronized void e() {
        aock aockVar = new aock(this.b, this.d);
        synchronized (aockVar.d) {
            aockVar.d.clear();
            String string = aockVar.a.getString(aockVar.b, "");
            if (!TextUtils.isEmpty(string) && string.contains(aockVar.c)) {
                String[] split = string.split(aockVar.c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        aockVar.d.add(str);
                    }
                }
            }
        }
        this.c = aockVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized aocp a() {
        String str;
        aock aockVar = this.c;
        synchronized (aockVar.d) {
            str = (String) aockVar.d.peek();
        }
        return aocp.a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(aocp aocpVar) {
        aock aockVar = this.c;
        String str = aocpVar.c;
        if (!TextUtils.isEmpty(str) && !str.contains(aockVar.c)) {
            synchronized (aockVar.d) {
                aockVar.a(aockVar.d.add(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(aocp aocpVar) {
        aock aockVar = this.c;
        String str = aocpVar.c;
        synchronized (aockVar.d) {
            aockVar.a(aockVar.d.remove(str));
        }
    }
}
