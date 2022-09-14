package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
class j0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f9237a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Pair<String, String>, c.e.a.b.g.h<w>> f9238b = new a.e.a();

    /* loaded from: classes.dex */
    interface a {
        c.e.a.b.g.h<w> start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(Executor executor) {
        this.f9237a = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ c.e.a.b.g.h a(Pair pair, c.e.a.b.g.h hVar) {
        synchronized (this) {
            this.f9238b.remove(pair);
        }
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public synchronized c.e.a.b.g.h<w> a(String str, String str2, a aVar) {
        final Pair pair = new Pair(str, str2);
        c.e.a.b.g.h<w> hVar = this.f9238b.get(pair);
        if (hVar != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            return hVar;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(valueOf2);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
        c.e.a.b.g.h b2 = aVar.start().b(this.f9237a, new c.e.a.b.g.a(this, pair) { // from class: com.google.firebase.iid.i0

            /* renamed from: a  reason: collision with root package name */
            private final j0 f9234a;

            /* renamed from: b  reason: collision with root package name */
            private final Pair f9235b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9234a = this;
                this.f9235b = pair;
            }

            @Override // c.e.a.b.g.a
            public final Object a(c.e.a.b.g.h hVar2) {
                this.f9234a.a(this.f9235b, hVar2);
                return hVar2;
            }
        });
        this.f9238b.put(pair, b2);
        return b2;
    }
}
