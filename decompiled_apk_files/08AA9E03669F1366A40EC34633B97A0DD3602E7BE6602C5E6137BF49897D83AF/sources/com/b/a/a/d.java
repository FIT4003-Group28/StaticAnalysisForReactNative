package com.b.a.a;
/* compiled from: VObjectProperty.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private String f1462a;

    /* renamed from: b  reason: collision with root package name */
    private String f1463b;

    /* renamed from: c  reason: collision with root package name */
    private c f1464c;

    /* renamed from: d  reason: collision with root package name */
    private String f1465d;

    public d() {
        this(null, null);
    }

    public d(String str, String str2) {
        this(null, str, str2);
    }

    public d(String str, String str2, String str3) {
        this(str, str2, new c(), str3);
    }

    public d(String str, String str2, c cVar, String str3) {
        this.f1462a = str;
        this.f1463b = str2;
        this.f1464c = cVar;
        this.f1465d = str3;
    }

    public String a() {
        return this.f1462a;
    }

    public void a(String str) {
        this.f1462a = str;
    }

    public String b() {
        return this.f1463b;
    }

    public void b(String str) {
        this.f1463b = str;
    }

    public c c() {
        return this.f1464c;
    }

    public String d() {
        return this.f1465d;
    }

    public void c(String str) {
        this.f1465d = str;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((this.f1462a == null ? 0 : this.f1462a.hashCode()) + 31) * 31) + (this.f1463b == null ? 0 : this.f1463b.hashCode())) * 31) + (this.f1464c == null ? 0 : this.f1464c.hashCode())) * 31;
        if (this.f1465d != null) {
            i = this.f1465d.hashCode();
        }
        return hashCode + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f1462a == null) {
            if (dVar.f1462a != null) {
                return false;
            }
        } else if (!this.f1462a.equals(dVar.f1462a)) {
            return false;
        }
        if (this.f1463b == null) {
            if (dVar.f1463b != null) {
                return false;
            }
        } else if (!this.f1463b.equals(dVar.f1463b)) {
            return false;
        }
        if (this.f1464c == null) {
            if (dVar.f1464c != null) {
                return false;
            }
        } else if (!this.f1464c.equals(dVar.f1464c)) {
            return false;
        }
        if (this.f1465d == null) {
            if (dVar.f1465d != null) {
                return false;
            }
        } else if (!this.f1465d.equals(dVar.f1465d)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "VObjectProperty [group=" + this.f1462a + ", name=" + this.f1463b + ", parameters=" + this.f1464c + ", value=" + this.f1465d + "]";
    }
}
