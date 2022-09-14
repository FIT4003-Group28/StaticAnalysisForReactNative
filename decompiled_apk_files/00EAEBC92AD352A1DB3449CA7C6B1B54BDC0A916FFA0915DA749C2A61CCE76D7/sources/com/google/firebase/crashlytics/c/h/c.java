package com.google.firebase.crashlytics.c.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c extends q {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.j.v f8621a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8622b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(com.google.firebase.crashlytics.c.j.v vVar, String str) {
        if (vVar != null) {
            this.f8621a = vVar;
            if (str == null) {
                throw new NullPointerException("Null sessionId");
            }
            this.f8622b = str;
            return;
        }
        throw new NullPointerException("Null report");
    }

    @Override // com.google.firebase.crashlytics.c.h.q
    public com.google.firebase.crashlytics.c.j.v a() {
        return this.f8621a;
    }

    @Override // com.google.firebase.crashlytics.c.h.q
    public String b() {
        return this.f8622b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f8621a.equals(qVar.a()) && this.f8622b.equals(qVar.b());
    }

    public int hashCode() {
        return ((this.f8621a.hashCode() ^ 1000003) * 1000003) ^ this.f8622b.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f8621a + ", sessionId=" + this.f8622b + "}";
    }
}
