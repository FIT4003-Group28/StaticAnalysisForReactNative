package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: axjc  reason: default package */
/* loaded from: classes2.dex */
public abstract class axjc implements axjh {
    public final String a;
    public final List b = new ArrayList();
    Map c = new HashMap();

    public axjc(String str) {
        this.a = str;
    }

    @Override // defpackage.axjh
    public final long a() {
        long j = 0;
        for (long j2 : m()) {
            j += j2;
        }
        return j;
    }

    @Override // defpackage.axjh
    public cwy b() {
        throw null;
    }

    @Override // defpackage.axjh
    public final String c() {
        return this.a;
    }

    @Override // defpackage.axjh
    public List d() {
        throw null;
    }

    @Override // defpackage.axjh
    public final List e() {
        return this.b;
    }

    @Override // defpackage.axjh
    public List f() {
        throw null;
    }

    @Override // defpackage.axjh
    public final Map g() {
        return this.c;
    }

    @Override // defpackage.axjh
    public long[] h() {
        throw null;
    }
}
