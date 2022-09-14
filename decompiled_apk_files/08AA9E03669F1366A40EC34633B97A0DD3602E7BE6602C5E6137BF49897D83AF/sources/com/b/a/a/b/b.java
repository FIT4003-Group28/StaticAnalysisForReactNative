package com.b.a.a.b;

import java.util.Collections;
import java.util.List;
/* compiled from: Context.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    final List<String> f1433a;

    /* renamed from: b  reason: collision with root package name */
    final a f1434b = new a();

    /* renamed from: c  reason: collision with root package name */
    int f1435c = 1;

    /* renamed from: d  reason: collision with root package name */
    boolean f1436d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(List<String> list) {
        this.f1433a = Collections.unmodifiableList(list);
    }

    public List<String> a() {
        return this.f1433a;
    }

    public String b() {
        return this.f1434b.b();
    }

    public int c() {
        return this.f1435c;
    }

    public void d() {
        this.f1436d = true;
    }

    public String toString() {
        return "Context [parentComponents=" + this.f1433a + ", unfoldedLine=" + this.f1434b.b() + ", lineNumber=" + this.f1435c + ", stop=" + this.f1436d + "]";
    }
}
