package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class w {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f9492a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9493b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9494c;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f9496e;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque<String> f9495d = new ArrayDeque<>();

    /* renamed from: f  reason: collision with root package name */
    private boolean f9497f = false;

    private w(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f9492a = sharedPreferences;
        this.f9493b = str;
        this.f9494c = str2;
        this.f9496e = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w a(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        w wVar = new w(sharedPreferences, str, str2, executor);
        wVar.d();
        return wVar;
    }

    private final boolean a(boolean z) {
        if (z && !this.f9497f) {
            f();
        }
        return z;
    }

    private final void d() {
        synchronized (this.f9495d) {
            this.f9495d.clear();
            String string = this.f9492a.getString(this.f9493b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f9494c)) {
                String[] split = string.split(this.f9494c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f9495d.add(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final void a() {
        synchronized (this.f9495d) {
            this.f9492a.edit().putString(this.f9493b, c()).commit();
        }
    }

    private final void f() {
        this.f9496e.execute(new Runnable(this) { // from class: com.google.firebase.messaging.v

            /* renamed from: b  reason: collision with root package name */
            private final w f9491b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9491b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f9491b.a();
            }
        });
    }

    public final boolean a(Object obj) {
        boolean remove;
        synchronized (this.f9495d) {
            remove = this.f9495d.remove(obj);
            a(remove);
        }
        return remove;
    }

    public final boolean a(String str) {
        boolean add;
        if (TextUtils.isEmpty(str) || str.contains(this.f9494c)) {
            return false;
        }
        synchronized (this.f9495d) {
            add = this.f9495d.add(str);
            a(add);
        }
        return add;
    }

    public final String b() {
        String peek;
        synchronized (this.f9495d) {
            peek = this.f9495d.peek();
        }
        return peek;
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f9495d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.f9494c);
        }
        return sb.toString();
    }
}
