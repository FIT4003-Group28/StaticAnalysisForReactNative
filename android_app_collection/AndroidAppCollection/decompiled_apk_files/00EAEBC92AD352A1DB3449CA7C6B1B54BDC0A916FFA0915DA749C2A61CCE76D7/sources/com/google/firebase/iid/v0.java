package com.google.firebase.iid;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.iid.y0;
/* loaded from: classes.dex */
public class v0 extends Binder {

    /* renamed from: a  reason: collision with root package name */
    private final a f9302a;

    /* loaded from: classes.dex */
    public interface a {
        c.e.a.b.g.h<Void> a(Intent intent);
    }

    public v0(a aVar) {
        this.f9302a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final y0.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "service received new intent via bind strategy");
            }
            this.f9302a.a(aVar.f9330a).a(h.a(), new c.e.a.b.g.c(aVar) { // from class: com.google.firebase.iid.u0

                /* renamed from: a  reason: collision with root package name */
                private final y0.a f9300a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f9300a = aVar;
                }

                @Override // c.e.a.b.g.c
                public final void a(c.e.a.b.g.h hVar) {
                    this.f9300a.a();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
