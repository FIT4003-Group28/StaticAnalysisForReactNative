package com.google.firebase.crashlytics.c.m;

import java.io.File;
import java.io.FilenameFilter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    private static final c f9045a = new c();

    private c() {
    }

    public static FilenameFilter a() {
        return f9045a;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        boolean b2;
        b2 = g.b(file, str);
        return b2;
    }
}
