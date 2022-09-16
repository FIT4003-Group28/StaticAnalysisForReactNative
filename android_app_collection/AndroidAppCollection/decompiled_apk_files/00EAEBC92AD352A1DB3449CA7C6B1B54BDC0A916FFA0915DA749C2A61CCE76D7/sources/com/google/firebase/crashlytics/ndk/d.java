package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import java.io.File;
/* loaded from: classes.dex */
class d implements com.google.firebase.crashlytics.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final f f9172a;

    d(f fVar) {
        this.f9172a = fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d a(Context context) {
        return new d(new a(context, new JniNativeApi(), new g(new File(context.getFilesDir(), ".com.google.firebase.crashlytics-ndk"))));
    }

    @Override // com.google.firebase.crashlytics.c.a
    public void a(String str, int i, String str2, int i2, long j, long j2, boolean z, int i3, String str3, String str4) {
        this.f9172a.a(str, i, str2, i2, j, j2, z, i3, str3, str4);
    }

    @Override // com.google.firebase.crashlytics.c.a
    public void a(String str, String str2, long j) {
        this.f9172a.a(str, str2, j);
    }

    @Override // com.google.firebase.crashlytics.c.a
    public void a(String str, String str2, String str3, String str4, String str5, int i, String str6) {
        this.f9172a.a(str, str2, str3, str4, str5, i, str6);
    }

    @Override // com.google.firebase.crashlytics.c.a
    public void a(String str, String str2, String str3, boolean z) {
        this.f9172a.a(str, str2, str3, z);
    }

    @Override // com.google.firebase.crashlytics.c.a
    public boolean a(String str) {
        return this.f9172a.a(str);
    }

    @Override // com.google.firebase.crashlytics.c.a
    public boolean b(String str) {
        return this.f9172a.b(str);
    }

    @Override // com.google.firebase.crashlytics.c.a
    public com.google.firebase.crashlytics.c.d c(String str) {
        return new i(this.f9172a.d(str));
    }

    @Override // com.google.firebase.crashlytics.c.a
    public boolean d(String str) {
        boolean c2 = this.f9172a.c(str);
        com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics NDK initialization ");
        sb.append(c2 ? "successful" : "FAILED");
        a2.c(sb.toString());
        return c2;
    }
}
