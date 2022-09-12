package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: cppd  reason: default package */
/* loaded from: classes5.dex */
public final class cppd {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e;
    public float f = Float.POSITIVE_INFINITY;
    public float g = Float.NEGATIVE_INFINITY;
    public float h = Float.POSITIVE_INFINITY;
    public float i = Float.NEGATIVE_INFINITY;
    public final List<cppc> j;
    private final List<cppc> k;
    private final Queue<cppc> l;

    public cppd() {
        ArrayList a = cpwi.a();
        this.k = a;
        this.j = Collections.unmodifiableList(a);
        this.l = new ArrayDeque();
    }

    public final void a(float f, float f2, int i, String str) {
        cppc cppcVar;
        if (this.l.peek() != null) {
            cppcVar = this.l.poll();
        } else {
            cppcVar = new cppc();
        }
        cppcVar.a = f;
        cppcVar.b = f2;
        cppcVar.c = i;
        cppcVar.d = str;
        this.k.add(cppcVar);
        this.h = Math.min(this.h, cppcVar.b);
        this.i = Math.max(this.i, cppcVar.b);
        this.f = Math.min(this.f, cppcVar.a);
        this.g = Math.max(this.g, cppcVar.a);
    }

    public final void b() {
        this.a = 0.0f;
        this.c = 0.0f;
        this.b = 0.0f;
        this.d = 0.0f;
        this.e = false;
        this.f = Float.POSITIVE_INFINITY;
        this.g = Float.NEGATIVE_INFINITY;
        this.h = Float.POSITIVE_INFINITY;
        this.i = Float.NEGATIVE_INFINITY;
        this.l.addAll(this.k);
        this.k.clear();
    }
}
