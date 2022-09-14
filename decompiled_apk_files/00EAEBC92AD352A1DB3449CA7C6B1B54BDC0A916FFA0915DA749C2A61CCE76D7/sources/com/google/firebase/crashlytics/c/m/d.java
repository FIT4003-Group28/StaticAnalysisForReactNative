package com.google.firebase.crashlytics.c.m;

import java.io.File;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: b  reason: collision with root package name */
    private static final d f9046b = new d();

    private d() {
    }

    public static Comparator a() {
        return f9046b;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int c2;
        c2 = g.c((File) obj, (File) obj2);
        return c2;
    }
}
