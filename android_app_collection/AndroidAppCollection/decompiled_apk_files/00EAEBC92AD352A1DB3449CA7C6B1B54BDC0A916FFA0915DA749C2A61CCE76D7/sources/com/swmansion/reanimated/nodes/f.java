package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public abstract class f extends m {

    /* renamed from: a  reason: collision with root package name */
    private int f10000a;

    /* loaded from: classes.dex */
    public static class a extends f {
        public a(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
            super(i, readableMap, bVar);
        }

        @Override // com.swmansion.reanimated.nodes.f
        protected Double a(m mVar) {
            if (mVar instanceof p) {
                ((p) mVar).e();
            } else {
                ((e) mVar).c();
            }
            return m.ZERO;
        }

        @Override // com.swmansion.reanimated.nodes.f, com.swmansion.reanimated.nodes.m
        /* renamed from: evaluate */
        protected /* bridge */ /* synthetic */ Object mo321evaluate() {
            return super.mo321evaluate();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends f {
        public b(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
            super(i, readableMap, bVar);
        }

        @Override // com.swmansion.reanimated.nodes.f
        protected Double a(m mVar) {
            if (mVar instanceof p) {
                ((p) mVar).f();
            } else {
                ((e) mVar).d();
            }
            return m.ZERO;
        }

        @Override // com.swmansion.reanimated.nodes.f, com.swmansion.reanimated.nodes.m
        /* renamed from: evaluate */
        protected /* bridge */ /* synthetic */ Object mo321evaluate() {
            return super.mo321evaluate();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f {
        public c(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
            super(i, readableMap, bVar);
        }

        @Override // com.swmansion.reanimated.nodes.f
        protected Double a(m mVar) {
            double d2 = 1.0d;
            if (mVar instanceof p) {
                if (!((p) mVar).d()) {
                    d2 = 0.0d;
                }
                return Double.valueOf(d2);
            }
            if (!((e) mVar).f9999a) {
                d2 = 0.0d;
            }
            return Double.valueOf(d2);
        }

        @Override // com.swmansion.reanimated.nodes.f, com.swmansion.reanimated.nodes.m
        /* renamed from: evaluate */
        protected /* bridge */ /* synthetic */ Object mo321evaluate() {
            return super.mo321evaluate();
        }
    }

    public f(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i, readableMap, bVar);
        this.f10000a = com.swmansion.reanimated.a.a(readableMap, "clock", "Reanimated: Argument passed to clock node is either of wrong type or is missing.");
    }

    protected abstract Double a(m mVar);

    @Override // com.swmansion.reanimated.nodes.m
    /* renamed from: evaluate */
    protected Double mo321evaluate() {
        return a(this.mNodesManager.a(this.f10000a, m.class));
    }
}
