package com.google.firebase.analytics.connector.internal;

import com.google.firebase.analytics.a.a;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    Set<String> f8280a;

    /* renamed from: b  reason: collision with root package name */
    private a.b f8281b;

    /* renamed from: c  reason: collision with root package name */
    private com.google.android.gms.measurement.a.a f8282c;

    /* renamed from: d  reason: collision with root package name */
    private d f8283d = new d(this);

    public e(com.google.android.gms.measurement.a.a aVar, a.b bVar) {
        this.f8281b = bVar;
        this.f8282c = aVar;
        this.f8282c.a(this.f8283d);
        this.f8280a = new HashSet();
    }
}
