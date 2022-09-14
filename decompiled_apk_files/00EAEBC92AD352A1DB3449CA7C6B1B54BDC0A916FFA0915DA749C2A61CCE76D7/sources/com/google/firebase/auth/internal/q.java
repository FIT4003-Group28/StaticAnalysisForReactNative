package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import c.e.a.b.d.e.k3;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final c.e.a.b.d.e.w<String> f8383a = c.e.a.b.d.e.w.a("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    /* renamed from: b  reason: collision with root package name */
    private static final q f8384b = new q();

    private q() {
    }

    public static q a() {
        return f8384b;
    }

    public static void a(Context context, k3 k3Var, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("verifyAssertionRequest", com.google.android.gms.common.internal.x.e.b(k3Var));
        edit.putString("operation", str);
        edit.putString("tenantId", str2);
        edit.putLong("timestamp", com.google.android.gms.common.util.h.d().a());
        edit.commit();
    }

    public static void a(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.q());
        edit.putString("statusMessage", status.r());
        edit.putLong("timestamp", com.google.android.gms.common.util.h.d().a());
        edit.commit();
    }

    private static void a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        c.e.a.b.d.e.w<String> wVar = f8383a;
        int size = wVar.size();
        int i = 0;
        while (i < size) {
            String str = wVar.get(i);
            i++;
            edit.remove(str);
        }
        edit.commit();
    }

    public final void a(Context context) {
        com.google.android.gms.common.internal.s.a(context);
        a(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
        if (r4.equals("com.google.firebase.auth.internal.SIGN_IN") == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.firebase.auth.FirebaseAuth r11) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.s.a(r11)
            c.e.b.d r0 = r11.h()
            android.content.Context r0 = r0.b()
            r1 = 0
            java.lang.String r2 = "com.google.firebase.auth.internal.ProcessDeathHelper"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r1)
            java.lang.String r2 = ""
            java.lang.String r3 = "firebaseAppName"
            java.lang.String r3 = r0.getString(r3, r2)
            c.e.b.d r4 = r11.h()
            java.lang.String r4 = r4.c()
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L29
            return
        L29:
            java.lang.String r3 = "verifyAssertionRequest"
            boolean r4 = r0.contains(r3)
            r5 = 0
            java.lang.String r7 = "timestamp"
            if (r4 == 0) goto Lda
            java.lang.String r3 = r0.getString(r3, r2)
            android.os.Parcelable$Creator<c.e.a.b.d.e.k3> r4 = c.e.a.b.d.e.k3.CREATOR
            com.google.android.gms.common.internal.x.d r3 = com.google.android.gms.common.internal.x.e.a(r3, r4)
            c.e.a.b.d.e.k3 r3 = (c.e.a.b.d.e.k3) r3
            java.lang.String r4 = "operation"
            java.lang.String r4 = r0.getString(r4, r2)
            r8 = 0
            java.lang.String r9 = "tenantId"
            java.lang.String r8 = r0.getString(r9, r8)
            java.lang.String r9 = "firebaseUserUid"
            java.lang.String r2 = r0.getString(r9, r2)
            r0.getLong(r7, r5)
            if (r8 == 0) goto L5f
            r11.h(r8)
            r3.a(r8)
        L5f:
            r5 = -1
            int r6 = r4.hashCode()
            r7 = -1843829902(0xffffffff92196372, float:-4.8400863E-28)
            r8 = 2
            r9 = 1
            if (r6 == r7) goto L89
            r7 = -286760092(0xffffffffeee86364, float:-3.596034E28)
            if (r6 == r7) goto L7f
            r7 = 1731327805(0x6731f73d, float:8.404196E23)
            if (r6 == r7) goto L76
            goto L93
        L76:
            java.lang.String r6 = "com.google.firebase.auth.internal.SIGN_IN"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L93
            goto L94
        L7f:
            java.lang.String r1 = "com.google.firebase.auth.internal.LINK"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L93
            r1 = 1
            goto L94
        L89:
            java.lang.String r1 = "com.google.firebase.auth.internal.REAUTHENTICATE"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L93
            r1 = 2
            goto L94
        L93:
            r1 = -1
        L94:
            if (r1 == 0) goto Lcf
            if (r1 == r9) goto Lb5
            if (r1 == r8) goto L9b
            goto Ld6
        L9b:
            com.google.firebase.auth.z r1 = r11.a()
            java.lang.String r1 = r1.i()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Ld6
            com.google.firebase.auth.z r11 = r11.a()
            com.google.firebase.auth.a1 r1 = com.google.firebase.auth.a1.a(r3)
            r11.b(r1)
            goto Ld6
        Lb5:
            com.google.firebase.auth.z r1 = r11.a()
            java.lang.String r1 = r1.i()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Ld6
            com.google.firebase.auth.z r11 = r11.a()
            com.google.firebase.auth.a1 r1 = com.google.firebase.auth.a1.a(r3)
            r11.a(r1)
            goto Ld6
        Lcf:
            com.google.firebase.auth.a1 r1 = com.google.firebase.auth.a1.a(r3)
            r11.a(r1)
        Ld6:
            a(r0)
            return
        Lda:
            java.lang.String r11 = "statusCode"
            boolean r1 = r0.contains(r11)
            if (r1 == 0) goto L100
            r1 = 17062(0x42a6, float:2.3909E-41)
            int r11 = r0.getInt(r11, r1)
            java.lang.String r1 = "statusMessage"
            java.lang.String r1 = r0.getString(r1, r2)
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r2.<init>(r11, r1)
            r0.getLong(r7, r5)
            a(r0)
            c.e.b.f r11 = com.google.firebase.auth.v0.a.a2.a(r2)
            c.e.a.b.g.k.a(r11)
        L100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.q.a(com.google.firebase.auth.FirebaseAuth):void");
    }
}
