package com.google.gson.internal;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class Excluder implements Cloneable, dgtm {
    public static final Excluder a = new Excluder();
    public double b = -1.0d;
    public int c = 136;
    public boolean d = true;
    public List<dgso> e = Collections.emptyList();
    public List<dgso> f = Collections.emptyList();

    @Override // defpackage.dgtm
    public final <T> dgtl<T> a(dgsx dgsxVar, dgxd<T> dgxdVar) {
        boolean c = c(dgxdVar.a);
        boolean z = c || g(true);
        boolean z2 = c || g(false);
        if (z || z2) {
            return new dgul(this, z2, z, dgsxVar, dgxdVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean c(Class<?> cls) {
        if (this.b == -1.0d || f((dgtp) cls.getAnnotation(dgtp.class), (dgtq) cls.getAnnotation(dgtq.class))) {
            return (!this.d && e(cls)) || d(cls);
        }
        return true;
    }

    public final boolean d(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public final boolean e(Class<?> cls) {
        return cls.isMemberClass() && (cls.getModifiers() & 8) == 0;
    }

    public final boolean f(dgtp dgtpVar, dgtq dgtqVar) {
        if (dgtpVar == null || dgtpVar.a() <= this.b) {
            return dgtqVar == null || dgtqVar.a() > this.b;
        }
        return false;
    }

    public final boolean g(boolean z) {
        for (dgso dgsoVar : z ? this.e : this.f) {
            if (dgsoVar.a()) {
                return true;
            }
        }
        return false;
    }
}
