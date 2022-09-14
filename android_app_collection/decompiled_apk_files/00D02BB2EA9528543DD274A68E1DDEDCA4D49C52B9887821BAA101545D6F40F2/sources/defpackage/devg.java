package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: devg  reason: default package */
/* loaded from: classes6.dex */
final class devg {
    private static WeakReference<devg> a;
    private final SharedPreferences b;
    private deve c;
    private final Executor d;

    private devg(SharedPreferences sharedPreferences, Executor executor) {
        this.d = executor;
        this.b = sharedPreferences;
    }

    private final synchronized void c() {
        String[] split;
        deve deveVar = new deve(this.b, this.d);
        synchronized (deveVar.d) {
            deveVar.d.clear();
            String string = deveVar.a.getString(deveVar.b, "");
            if (!TextUtils.isEmpty(string) && string.contains(deveVar.c)) {
                for (String str : string.split(deveVar.c, -1)) {
                    if (!TextUtils.isEmpty(str)) {
                        deveVar.d.add(str);
                    }
                }
            }
        }
        this.c = deveVar;
    }

    public static synchronized devg getInstance(Context context, Executor executor) {
        synchronized (devg.class) {
            WeakReference<devg> weakReference = a;
            devg devgVar = weakReference != null ? weakReference.get() : null;
            if (devgVar == null) {
                devg devgVar2 = new devg(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                devgVar2.c();
                a = new WeakReference<>(devgVar2);
                return devgVar2;
            }
            return devgVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized devf a() {
        String peek;
        deve deveVar = this.c;
        synchronized (deveVar.d) {
            peek = deveVar.d.peek();
        }
        return devf.a(peek);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(devf devfVar) {
        final deve deveVar = this.c;
        String str = devfVar.c;
        synchronized (deveVar.d) {
            if (deveVar.d.remove(str)) {
                deveVar.e.execute(new Runnable(deveVar) { // from class: devd
                    private final deve a;

                    {
                        this.a = deveVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        deve deveVar2 = this.a;
                        synchronized (deveVar2.d) {
                            SharedPreferences.Editor edit = deveVar2.a.edit();
                            String str2 = deveVar2.b;
                            StringBuilder sb = new StringBuilder();
                            Iterator<String> it = deveVar2.d.iterator();
                            while (it.hasNext()) {
                                sb.append(it.next());
                                sb.append(deveVar2.c);
                            }
                            edit.putString(str2, sb.toString()).commit();
                        }
                    }
                });
            }
        }
    }
}
