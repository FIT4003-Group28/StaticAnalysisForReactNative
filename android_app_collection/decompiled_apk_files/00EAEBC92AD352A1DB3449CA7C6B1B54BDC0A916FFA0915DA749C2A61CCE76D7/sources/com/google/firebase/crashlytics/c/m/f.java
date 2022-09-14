package com.google.firebase.crashlytics.c.m;

import java.io.File;
import java.io.FilenameFilter;
/* loaded from: classes.dex */
final /* synthetic */ class f implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    private static final f f9048a = new f();

    private f() {
    }

    public static FilenameFilter a() {
        return f9048a;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        boolean startsWith;
        startsWith = str.startsWith("event");
        return startsWith;
    }
}
