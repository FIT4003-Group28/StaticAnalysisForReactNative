package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: sbf  reason: default package */
/* loaded from: classes4.dex */
public final class sbf {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e;
    public float f = Float.POSITIVE_INFINITY;
    public float g = Float.NEGATIVE_INFINITY;
    public float h = Float.POSITIVE_INFINITY;
    public float i = Float.NEGATIVE_INFINITY;
    public final List j;
    private final List k;
    private final Queue l;

    public sbf() {
        ArrayList d = sbv.d();
        this.k = d;
        this.j = Collections.unmodifiableList(d);
        this.l = new ArrayDeque();
    }

    public final void a(float f, float f2, int i, String str) {
        sbe sbeVar;
        if (this.l.peek() != null) {
            sbeVar = (sbe) this.l.poll();
        } else {
            sbeVar = new sbe();
        }
        sbeVar.a = f;
        sbeVar.b = f2;
        sbeVar.c = i;
        sbeVar.d = str;
        this.k.add(sbeVar);
        this.h = Math.min(this.h, sbeVar.b);
        this.i = Math.max(this.i, sbeVar.b);
        this.f = Math.min(this.f, sbeVar.a);
        this.g = Math.max(this.g, sbeVar.a);
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
