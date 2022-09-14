package com.google.firebase.crashlytics.c.r;
/* loaded from: classes.dex */
public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f9154a;

    /* renamed from: b  reason: collision with root package name */
    private final d[] f9155b;

    /* renamed from: c  reason: collision with root package name */
    private final b f9156c;

    public a(int i, d... dVarArr) {
        this.f9154a = i;
        this.f9155b = dVarArr;
        this.f9156c = new b(i);
    }

    @Override // com.google.firebase.crashlytics.c.r.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        d[] dVarArr;
        if (stackTraceElementArr.length <= this.f9154a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.f9155b) {
            if (stackTraceElementArr2.length <= this.f9154a) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f9154a ? this.f9156c.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
