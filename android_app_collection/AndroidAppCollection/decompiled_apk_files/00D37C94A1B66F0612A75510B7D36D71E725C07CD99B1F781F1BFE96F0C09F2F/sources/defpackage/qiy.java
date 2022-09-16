package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: PG */
/* renamed from: qiy  reason: default package */
/* loaded from: classes4.dex */
public final class qiy {
    public static final Lock a = new ReentrantLock();
    public static qiy b;
    private final Lock c = new ReentrantLock();
    private final SharedPreferences d;

    public qiy(Context context) {
        this.d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        this.c.lock();
        try {
            return this.d.getString(str, null);
        } finally {
            this.c.unlock();
        }
    }
}
