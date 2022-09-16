package com.facebook.imagepipeline.memory;
/* loaded from: classes.dex */
public class b0 implements h0 {

    /* renamed from: a  reason: collision with root package name */
    private static b0 f5209a;

    private b0() {
    }

    public static synchronized b0 c() {
        b0 b0Var;
        synchronized (b0.class) {
            if (f5209a == null) {
                f5209a = new b0();
            }
            b0Var = f5209a;
        }
        return b0Var;
    }

    @Override // com.facebook.imagepipeline.memory.h0
    public void a() {
    }

    @Override // com.facebook.imagepipeline.memory.h0
    public void a(int i) {
    }

    @Override // com.facebook.imagepipeline.memory.h0
    public void a(a aVar) {
    }

    @Override // com.facebook.imagepipeline.memory.h0
    public void b() {
    }

    @Override // com.facebook.imagepipeline.memory.h0
    public void b(int i) {
    }

    @Override // com.facebook.imagepipeline.memory.h0
    public void c(int i) {
    }

    @Override // com.facebook.imagepipeline.memory.h0
    public void d(int i) {
    }
}
