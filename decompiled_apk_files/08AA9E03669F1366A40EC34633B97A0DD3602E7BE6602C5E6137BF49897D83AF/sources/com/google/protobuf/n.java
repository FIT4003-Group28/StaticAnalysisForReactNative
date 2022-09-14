package com.google.protobuf;

import com.google.protobuf.j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ExtensionRegistry.java */
/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: a  reason: collision with root package name */
    static final n f4681a = new n(true);

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, b> f4682c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, b> f4683d;
    private final Map<a, b> e;
    private final Map<a, b> f;

    /* compiled from: ExtensionRegistry.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final j.f f4686a;

        /* renamed from: b  reason: collision with root package name */
        public final ab f4687b;
    }

    public static n a() {
        return f4681a;
    }

    public b a(j.a aVar, int i) {
        return this.e.get(new a(aVar, i));
    }

    private n() {
        this.f4682c = new HashMap();
        this.f4683d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
    }

    n(boolean z) {
        super(f4690b);
        this.f4682c = Collections.emptyMap();
        this.f4683d = Collections.emptyMap();
        this.e = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExtensionRegistry.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final j.a f4684a;

        /* renamed from: b  reason: collision with root package name */
        private final int f4685b;

        a(j.a aVar, int i) {
            this.f4684a = aVar;
            this.f4685b = i;
        }

        public int hashCode() {
            return (this.f4684a.hashCode() * 65535) + this.f4685b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4684a == aVar.f4684a && this.f4685b == aVar.f4685b;
        }
    }
}
