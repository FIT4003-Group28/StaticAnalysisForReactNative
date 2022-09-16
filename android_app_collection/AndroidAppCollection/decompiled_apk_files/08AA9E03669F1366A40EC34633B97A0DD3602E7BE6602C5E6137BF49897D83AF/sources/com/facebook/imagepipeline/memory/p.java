package com.facebook.imagepipeline.memory;
/* compiled from: NoOpPoolStatsTracker.java */
/* loaded from: classes.dex */
public class p implements u {

    /* renamed from: a  reason: collision with root package name */
    private static p f2963a;

    @Override // com.facebook.imagepipeline.memory.u
    public void a(int i) {
    }

    @Override // com.facebook.imagepipeline.memory.u
    public void a(a aVar) {
    }

    @Override // com.facebook.imagepipeline.memory.u
    public void b() {
    }

    @Override // com.facebook.imagepipeline.memory.u
    public void b(int i) {
    }

    @Override // com.facebook.imagepipeline.memory.u
    public void c() {
    }

    @Override // com.facebook.imagepipeline.memory.u
    public void c(int i) {
    }

    @Override // com.facebook.imagepipeline.memory.u
    public void d(int i) {
    }

    private p() {
    }

    public static synchronized p a() {
        p pVar;
        synchronized (p.class) {
            if (f2963a == null) {
                f2963a = new p();
            }
            pVar = f2963a;
        }
        return pVar;
    }
}
