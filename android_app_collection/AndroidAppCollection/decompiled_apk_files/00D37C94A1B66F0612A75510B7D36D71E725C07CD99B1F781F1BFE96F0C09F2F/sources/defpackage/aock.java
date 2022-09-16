package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aock  reason: default package */
/* loaded from: classes.dex */
public final class aock {
    public final SharedPreferences a;
    private final Executor e;
    public final ArrayDeque d = new ArrayDeque();
    public final String b = "topic_operation_queue";
    public final String c = ",";

    public aock(SharedPreferences sharedPreferences, Executor executor) {
        this.a = sharedPreferences;
        this.e = executor;
    }

    public final void a(boolean z) {
        if (z) {
            this.e.execute(new Runnable() { // from class: aocj
                @Override // java.lang.Runnable
                public final void run() {
                    aock aockVar = aock.this;
                    synchronized (aockVar.d) {
                        SharedPreferences.Editor edit = aockVar.a.edit();
                        String str = aockVar.b;
                        StringBuilder sb = new StringBuilder();
                        Iterator it = aockVar.d.iterator();
                        while (it.hasNext()) {
                            sb.append((String) it.next());
                            sb.append(aockVar.c);
                        }
                        edit.putString(str, sb.toString()).commit();
                    }
                }
            });
        }
    }
}
