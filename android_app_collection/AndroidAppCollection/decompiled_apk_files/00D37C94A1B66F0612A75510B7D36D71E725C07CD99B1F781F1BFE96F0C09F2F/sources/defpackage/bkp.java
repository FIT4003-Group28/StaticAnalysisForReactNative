package defpackage;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
/* compiled from: PG */
/* renamed from: bkp  reason: default package */
/* loaded from: classes2.dex */
public final class bkp {
    final String[] b;
    final bks c;
    public volatile bmb i;
    lb j = null;
    AtomicBoolean d = new AtomicBoolean(false);
    public volatile boolean e = false;
    final acu g = new acu();
    Runnable h = new bkn(this);
    public bko f = new bko();
    final HashMap a = new HashMap();

    public bkp(bks bksVar, Map map, String... strArr) {
        this.c = bksVar;
        Collections.newSetFromMap(new IdentityHashMap());
        this.b = new String[7];
        for (int i = 0; i < 7; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.a.put(lowerCase, Integer.valueOf(i));
            String str = (String) map.get(strArr[i]);
            if (str != null) {
                this.b[i] = str.toLowerCase(Locale.US);
            } else {
                this.b[i] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(Locale.US);
            if (this.a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(Locale.US);
                HashMap hashMap = this.a;
                hashMap.put(lowerCase3, (Integer) hashMap.get(lowerCase2));
            }
        }
    }

    public final void a(blv blvVar) {
        if (!blvVar.i()) {
            try {
                Lock c = this.c.c();
                c.lock();
                try {
                    synchronized (this.f) {
                    }
                } finally {
                    c.unlock();
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            }
        }
    }
}
