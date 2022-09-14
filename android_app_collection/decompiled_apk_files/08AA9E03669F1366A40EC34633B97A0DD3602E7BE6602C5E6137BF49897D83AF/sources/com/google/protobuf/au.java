package com.google.protobuf;

import java.util.Arrays;
/* compiled from: UnknownFieldSetLite.java */
/* loaded from: classes.dex */
public final class au {

    /* renamed from: a  reason: collision with root package name */
    private static final au f4387a = new au(0, new int[0], new Object[0], false);

    /* renamed from: b  reason: collision with root package name */
    private int f4388b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f4389c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f4390d;
    private int e;
    private boolean f;

    public static au a() {
        return f4387a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static au a(au auVar, au auVar2) {
        int i = auVar.f4388b + auVar2.f4388b;
        int[] copyOf = Arrays.copyOf(auVar.f4389c, i);
        System.arraycopy(auVar2.f4389c, 0, copyOf, auVar.f4388b, auVar2.f4388b);
        Object[] copyOf2 = Arrays.copyOf(auVar.f4390d, i);
        System.arraycopy(auVar2.f4390d, 0, copyOf2, auVar.f4388b, auVar2.f4388b);
        return new au(i, copyOf, copyOf2, true);
    }

    private au() {
        this(0, new int[8], new Object[8], true);
    }

    private au(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.f4388b = i;
        this.f4389c = iArr;
        this.f4390d = objArr;
        this.f = z;
    }

    public void b() {
        this.f = false;
    }

    private static boolean a(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        return this.f4388b == auVar.f4388b && a(this.f4389c, auVar.f4389c, this.f4388b) && a(this.f4390d, auVar.f4390d, this.f4388b);
    }

    public int hashCode() {
        return ((((527 + this.f4388b) * 31) + Arrays.hashCode(this.f4389c)) * 31) + Arrays.deepHashCode(this.f4390d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f4388b; i2++) {
            ae.a(sb, i, String.valueOf(ay.b(this.f4389c[i2])), this.f4390d[i2]);
        }
    }
}
