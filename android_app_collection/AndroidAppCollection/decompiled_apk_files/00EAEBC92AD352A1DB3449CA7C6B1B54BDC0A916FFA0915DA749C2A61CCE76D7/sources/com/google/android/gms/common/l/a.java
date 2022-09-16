package com.google.android.gms.common.l;

import android.util.Log;
import com.google.android.gms.common.internal.k;
import java.util.Locale;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f7071a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7072b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7073c;

    private a(String str, String str2) {
        this.f7072b = str2;
        this.f7071a = str;
        new k(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f7071a, i)) {
            i++;
        }
        this.f7073c = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(java.lang.String r7, java.lang.String... r8) {
        /*
            r6 = this;
            int r0 = r8.length
            if (r0 != 0) goto L6
            java.lang.String r8 = ""
            goto L36
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            int r1 = r8.length
            r2 = 0
        L12:
            if (r2 >= r1) goto L28
            r3 = r8[r2]
            int r4 = r0.length()
            r5 = 1
            if (r4 <= r5) goto L22
            java.lang.String r4 = ","
            r0.append(r4)
        L22:
            r0.append(r3)
            int r2 = r2 + 1
            goto L12
        L28:
            r8 = 93
            r0.append(r8)
            r8 = 32
            r0.append(r8)
            java.lang.String r8 = r0.toString()
        L36:
            r6.<init>(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.l.a.<init>(java.lang.String, java.lang.String[]):void");
    }

    private final String d(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f7072b.concat(str);
    }

    public void a(String str, Throwable th, Object... objArr) {
        Log.e(this.f7071a, d(str, objArr), th);
    }

    public void a(String str, Object... objArr) {
        Log.e(this.f7071a, d(str, objArr));
    }

    public void a(Throwable th) {
        Log.wtf(this.f7071a, th);
    }

    public boolean a(int i) {
        return this.f7073c <= i;
    }

    public void b(String str, Throwable th, Object... objArr) {
        Log.wtf(this.f7071a, d(str, objArr), th);
    }

    public void b(String str, Object... objArr) {
        Log.i(this.f7071a, d(str, objArr));
    }

    public void c(String str, Object... objArr) {
        if (a(2)) {
            Log.v(this.f7071a, d(str, objArr));
        }
    }
}
