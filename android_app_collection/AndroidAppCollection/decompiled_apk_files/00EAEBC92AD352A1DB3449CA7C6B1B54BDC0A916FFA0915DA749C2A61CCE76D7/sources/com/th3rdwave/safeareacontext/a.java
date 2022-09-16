package com.th3rdwave.safeareacontext;
/* loaded from: classes.dex */
class a {

    /* renamed from: a  reason: collision with root package name */
    float f10086a;

    /* renamed from: b  reason: collision with root package name */
    float f10087b;

    /* renamed from: c  reason: collision with root package name */
    float f10088c;

    /* renamed from: d  reason: collision with root package name */
    float f10089d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(float f2, float f3, float f4, float f5) {
        this.f10086a = f2;
        this.f10087b = f3;
        this.f10088c = f4;
        this.f10089d = f5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(a aVar) {
        if (this == aVar) {
            return true;
        }
        return this.f10086a == aVar.f10086a && this.f10087b == aVar.f10087b && this.f10088c == aVar.f10088c && this.f10089d == aVar.f10089d;
    }
}
