package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: bonn  reason: default package */
/* loaded from: classes3.dex */
public abstract class bonn {
    public static final Comparator<bonn> a = new bonm();

    public static bonn e(int i, int i2, int i3, int i4) {
        return new boni(i, i2, i3, i4);
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public final boolean f() {
        return a() == 0 && b() == 0 && c() == 0 && d() == 0;
    }

    public final boolean g(bonn bonnVar) {
        return a() > bonnVar.c() || (a() == bonnVar.c() && b() > bonnVar.d());
    }
}
