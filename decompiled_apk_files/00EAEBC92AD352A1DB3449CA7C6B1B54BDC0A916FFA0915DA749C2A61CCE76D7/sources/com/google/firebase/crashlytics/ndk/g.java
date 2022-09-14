package com.google.firebase.crashlytics.ndk;

import java.io.File;
/* loaded from: classes.dex */
class g implements b {

    /* renamed from: a  reason: collision with root package name */
    private final File f9173a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(File file) {
        this.f9173a = file;
    }

    private static File a(File file) {
        if (file != null) {
            if (!file.exists() && !file.mkdirs()) {
                return null;
            }
            return file;
        }
        return null;
    }

    private static void b(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                b(file2);
            }
        }
        file.delete();
    }

    @Override // com.google.firebase.crashlytics.ndk.b
    public File a(String str) {
        return a(new File(this.f9173a, str));
    }

    @Override // com.google.firebase.crashlytics.ndk.b
    public void b(String str) {
        b(new File(this.f9173a, str));
    }

    @Override // com.google.firebase.crashlytics.ndk.b
    public boolean c(String str) {
        return new File(this.f9173a, str).exists();
    }
}
