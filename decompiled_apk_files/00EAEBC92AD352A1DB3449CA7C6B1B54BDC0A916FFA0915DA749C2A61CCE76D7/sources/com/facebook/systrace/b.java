package com.facebook.systrace;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final AbstractC0140b f6503a = new c();

    /* renamed from: com.facebook.systrace.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0140b {
        public abstract AbstractC0140b a(String str, int i);

        public abstract AbstractC0140b a(String str, Object obj);

        public abstract void a();
    }

    /* loaded from: classes.dex */
    private static class c extends AbstractC0140b {
        private c() {
        }

        @Override // com.facebook.systrace.b.AbstractC0140b
        public AbstractC0140b a(String str, int i) {
            return this;
        }

        @Override // com.facebook.systrace.b.AbstractC0140b
        public AbstractC0140b a(String str, Object obj) {
            return this;
        }

        @Override // com.facebook.systrace.b.AbstractC0140b
        public void a() {
        }
    }

    public static AbstractC0140b a(long j) {
        return f6503a;
    }

    public static AbstractC0140b a(long j, String str) {
        return f6503a;
    }
}
