package com.th3rdwave.safeareacontext;
/* loaded from: classes.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    float f10092a;

    /* renamed from: b  reason: collision with root package name */
    float f10093b;

    /* renamed from: c  reason: collision with root package name */
    float f10094c;

    /* renamed from: d  reason: collision with root package name */
    float f10095d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(float f2, float f3, float f4, float f5) {
        this.f10092a = f2;
        this.f10093b = f3;
        this.f10094c = f4;
        this.f10095d = f5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(c cVar) {
        if (this == cVar) {
            return true;
        }
        return this.f10092a == cVar.f10092a && this.f10093b == cVar.f10093b && this.f10094c == cVar.f10094c && this.f10095d == cVar.f10095d;
    }
}
