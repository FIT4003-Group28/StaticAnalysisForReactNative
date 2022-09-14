package com.google.firebase.crashlytics.c.m;

import java.io.File;
import java.util.Comparator;
/* loaded from: classes.dex */
final /* synthetic */ class e implements Comparator {

    /* renamed from: b  reason: collision with root package name */
    private static final e f9047b = new e();

    private e() {
    }

    public static Comparator a() {
        return f9047b;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int compareTo;
        compareTo = ((File) obj2).getName().compareTo(((File) obj).getName());
        return compareTo;
    }
}
