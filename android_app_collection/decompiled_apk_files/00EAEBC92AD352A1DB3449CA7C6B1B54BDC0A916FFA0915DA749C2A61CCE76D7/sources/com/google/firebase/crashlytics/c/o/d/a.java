package com.google.firebase.crashlytics.c.o.d;

import com.google.firebase.crashlytics.c.o.c.c;
/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final c f9093a;

    /* renamed from: b  reason: collision with root package name */
    private final d f9094b;

    /* renamed from: com.google.firebase.crashlytics.c.o.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0185a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9095a = new int[c.a.values().length];

        static {
            try {
                f9095a[c.a.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9095a[c.a.NATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public a(c cVar, d dVar) {
        this.f9093a = cVar;
        this.f9094b = dVar;
    }

    @Override // com.google.firebase.crashlytics.c.o.d.b
    public boolean a(com.google.firebase.crashlytics.c.o.c.a aVar, boolean z) {
        int i = C0185a.f9095a[aVar.f9085c.getType().ordinal()];
        if (i == 1) {
            this.f9093a.a(aVar, z);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.f9094b.a(aVar, z);
            return true;
        }
    }
}
