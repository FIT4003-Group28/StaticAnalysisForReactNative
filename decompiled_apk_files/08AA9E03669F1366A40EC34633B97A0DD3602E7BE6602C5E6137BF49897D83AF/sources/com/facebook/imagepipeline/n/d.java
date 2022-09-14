package com.facebook.imagepipeline.n;

import android.net.Uri;
import com.facebook.common.d.h;
import com.facebook.imagepipeline.n.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: MediaVariations.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f2997a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f2998b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f2999c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3000d;

    private d(a aVar) {
        this.f2997a = aVar.f3001a;
        this.f2998b = aVar.f3002b;
        this.f2999c = aVar.f3003c;
        this.f3000d = aVar.f3004d;
    }

    public String a() {
        return this.f2997a;
    }

    public int b() {
        if (this.f2998b == null) {
            return 0;
        }
        return this.f2998b.size();
    }

    public List<b> a(Comparator<b> comparator) {
        int b2 = b();
        if (b2 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(b2);
        for (int i = 0; i < b2; i++) {
            arrayList.add(this.f2998b.get(i));
        }
        Collections.sort(arrayList, comparator);
        return arrayList;
    }

    public boolean c() {
        return this.f2999c;
    }

    public String d() {
        return this.f3000d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return h.a(this.f2997a, dVar.f2997a) && this.f2999c == dVar.f2999c && h.a(this.f2998b, dVar.f2998b);
    }

    public int hashCode() {
        return h.a(this.f2997a, Boolean.valueOf(this.f2999c), this.f2998b, this.f3000d);
    }

    public String toString() {
        return String.format(null, "%s-%b-%s-%s", this.f2997a, Boolean.valueOf(this.f2999c), this.f2998b, this.f3000d);
    }

    /* compiled from: MediaVariations.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f3005a;

        /* renamed from: b  reason: collision with root package name */
        private final int f3006b;

        /* renamed from: c  reason: collision with root package name */
        private final int f3007c;

        /* renamed from: d  reason: collision with root package name */
        private final b.a f3008d;

        public b(Uri uri, int i, int i2, b.a aVar) {
            this.f3005a = uri;
            this.f3006b = i;
            this.f3007c = i2;
            this.f3008d = aVar;
        }

        public Uri a() {
            return this.f3005a;
        }

        public int b() {
            return this.f3006b;
        }

        public int c() {
            return this.f3007c;
        }

        public b.a d() {
            return this.f3008d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.a(this.f3005a, bVar.f3005a) && this.f3006b == bVar.f3006b && this.f3007c == bVar.f3007c && this.f3008d == bVar.f3008d;
        }

        public int hashCode() {
            return (((this.f3005a.hashCode() * 31) + this.f3006b) * 31) + this.f3007c;
        }

        public String toString() {
            return String.format(null, "%dx%d %s %s", Integer.valueOf(this.f3006b), Integer.valueOf(this.f3007c), this.f3005a, this.f3008d);
        }
    }

    public static a a(String str) {
        return new a(str);
    }

    /* compiled from: MediaVariations.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f3001a;

        /* renamed from: b  reason: collision with root package name */
        private List<b> f3002b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3003c;

        /* renamed from: d  reason: collision with root package name */
        private String f3004d;

        private a(String str) {
            this.f3003c = false;
            this.f3004d = "request";
            this.f3001a = str;
        }

        public a a(Uri uri, int i, int i2, b.a aVar) {
            if (this.f3002b == null) {
                this.f3002b = new ArrayList();
            }
            this.f3002b.add(new b(uri, i, i2, aVar));
            return this;
        }

        public a a(boolean z) {
            this.f3003c = z;
            return this;
        }

        public a a(String str) {
            this.f3004d = str;
            return this;
        }

        public d a() {
            return new d(this);
        }
    }
}
