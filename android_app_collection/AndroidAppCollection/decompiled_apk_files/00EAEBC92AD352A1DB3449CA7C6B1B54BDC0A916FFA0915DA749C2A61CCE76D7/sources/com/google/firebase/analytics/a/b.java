package com.google.firebase.analytics.a;

import android.content.Context;
import android.os.Bundle;
import c.e.a.b.d.g.h;
import com.google.android.gms.common.internal.s;
import com.google.firebase.analytics.a.a;
import com.google.firebase.analytics.connector.internal.e;
import com.google.firebase.analytics.connector.internal.g;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class b implements com.google.firebase.analytics.a.a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile com.google.firebase.analytics.a.a f8266c;

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.gms.measurement.a.a f8267a;

    /* renamed from: b  reason: collision with root package name */
    final Map<String, com.google.firebase.analytics.connector.internal.a> f8268b;

    /* loaded from: classes.dex */
    class a implements a.InterfaceC0162a {
        a(b bVar, String str) {
        }
    }

    private b(com.google.android.gms.measurement.a.a aVar) {
        s.a(aVar);
        this.f8267a = aVar;
        this.f8268b = new ConcurrentHashMap();
    }

    public static com.google.firebase.analytics.a.a a(c.e.b.d dVar, Context context, c.e.b.l.d dVar2) {
        s.a(dVar);
        s.a(context);
        s.a(dVar2);
        s.a(context.getApplicationContext());
        if (f8266c == null) {
            synchronized (b.class) {
                if (f8266c == null) {
                    Bundle bundle = new Bundle(1);
                    if (dVar.g()) {
                        dVar2.a(c.e.b.a.class, c.f8269a, d.f8270a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", dVar.f());
                    }
                    f8266c = new b(h.a(context, (String) null, (String) null, (String) null, bundle).a());
                }
            }
        }
        return f8266c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void a(c.e.b.l.a aVar) {
        boolean z = ((c.e.b.a) aVar.a()).f4815a;
        synchronized (b.class) {
            ((b) f8266c).f8267a.a(z);
        }
    }

    private final boolean a(String str) {
        return !str.isEmpty() && this.f8268b.containsKey(str) && this.f8268b.get(str) != null;
    }

    @Override // com.google.firebase.analytics.a.a
    public a.InterfaceC0162a a(String str, a.b bVar) {
        s.a(bVar);
        if (com.google.firebase.analytics.connector.internal.b.a(str) && !a(str)) {
            com.google.android.gms.measurement.a.a aVar = this.f8267a;
            com.google.firebase.analytics.connector.internal.a eVar = "fiam".equals(str) ? new e(aVar, bVar) : ("crash".equals(str) || "clx".equals(str)) ? new g(aVar, bVar) : null;
            if (eVar == null) {
                return null;
            }
            this.f8268b.put(str, eVar);
            return new a(this, str);
        }
        return null;
    }

    @Override // com.google.firebase.analytics.a.a
    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.a(str2, bundle) && com.google.firebase.analytics.connector.internal.b.a(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.b.b(str, str2, bundle);
            this.f8267a.a(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.a.a
    public void a(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.a(str, str2)) {
            this.f8267a.a(str, str2, obj);
        }
    }
}
