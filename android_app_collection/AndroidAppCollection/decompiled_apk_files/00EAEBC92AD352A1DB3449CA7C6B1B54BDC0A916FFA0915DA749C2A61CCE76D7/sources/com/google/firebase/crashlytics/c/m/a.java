package com.google.firebase.crashlytics.c.m;

import java.io.File;
import java.io.FilenameFilter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    private final String f9043a;

    private a(String str) {
        this.f9043a = str;
    }

    public static FilenameFilter a(String str) {
        return new a(str);
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        boolean startsWith;
        startsWith = str.startsWith(this.f9043a);
        return startsWith;
    }
}
