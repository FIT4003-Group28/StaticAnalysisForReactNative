package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import java.util.Stack;
/* loaded from: classes.dex */
public class p extends u {

    /* renamed from: b  reason: collision with root package name */
    private final Stack<Integer> f10018b;

    /* renamed from: c  reason: collision with root package name */
    private String f10019c;

    public p(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i, readableMap, bVar);
        this.f10018b = new Stack<>();
    }

    public void a(Integer num, String str) {
        this.f10019c = str;
        this.f10018b.push(num);
    }

    @Override // com.swmansion.reanimated.nodes.u
    public void a(Object obj) {
        m a2 = this.mNodesManager.a(this.f10018b.peek().intValue(), m.class);
        com.swmansion.reanimated.d dVar = this.mUpdateContext;
        String str = dVar.f9976b;
        dVar.f9976b = this.f10019c;
        ((u) a2).a(obj);
        this.mUpdateContext.f9976b = str;
    }

    public void c() {
        this.f10018b.pop();
    }

    public boolean d() {
        m a2 = this.mNodesManager.a(this.f10018b.peek().intValue(), m.class);
        return a2 instanceof p ? ((p) a2).d() : ((e) a2).f9999a;
    }

    public void e() {
        m a2 = this.mNodesManager.a(this.f10018b.peek().intValue(), m.class);
        if (a2 instanceof p) {
            ((p) a2).e();
        } else {
            ((e) a2).c();
        }
    }

    @Override // com.swmansion.reanimated.nodes.u, com.swmansion.reanimated.nodes.m
    /* renamed from: evaluate */
    protected Object mo321evaluate() {
        com.swmansion.reanimated.d dVar = this.mUpdateContext;
        String str = dVar.f9976b;
        dVar.f9976b = this.f10019c;
        Object value = this.mNodesManager.a(this.f10018b.peek().intValue(), m.class).value();
        this.mUpdateContext.f9976b = str;
        return value;
    }

    public void f() {
        m a2 = this.mNodesManager.a(this.f10018b.peek().intValue(), m.class);
        if (a2 instanceof p) {
            ((p) a2).f();
        } else {
            ((e) a2).d();
        }
    }
}
