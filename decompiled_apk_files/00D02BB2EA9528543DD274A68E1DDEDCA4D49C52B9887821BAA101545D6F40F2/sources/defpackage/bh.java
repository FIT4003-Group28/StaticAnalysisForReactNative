package defpackage;

import android.database.sqlite.SQLiteException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
/* compiled from: PG */
/* renamed from: bh  reason: default package */
/* loaded from: classes3.dex */
public final class bh {
    final HashMap<String, Integer> a;
    final String[] b;
    final bn c;
    public bi g;
    volatile awj i;
    private bf j;
    AtomicBoolean d = new AtomicBoolean(false);
    public volatile boolean e = false;
    final aho<Object, bg> f = new aho<>();
    Runnable h = new be(this);

    public bh(bn bnVar, Map<String, String> map, String... strArr) {
        this.c = bnVar;
        int length = strArr.length;
        this.j = new bf(length);
        this.a = new HashMap<>();
        new bd();
        this.b = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.a.put(lowerCase, Integer.valueOf(i));
            String str = map.get(strArr[i]);
            if (str != null) {
                this.b[i] = str.toLowerCase(Locale.US);
            } else {
                this.b[i] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String lowerCase2 = entry.getValue().toLowerCase(Locale.US);
            if (this.a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(Locale.US);
                HashMap<String, Integer> hashMap = this.a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(avu avuVar) {
        if (!avuVar.e()) {
            try {
                Lock A = this.c.A();
                A.lock();
                synchronized (this.j) {
                }
                A.unlock();
            } catch (SQLiteException | IllegalStateException unused) {
            }
        }
    }
}
