package com.google.firebase.auth;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class n0 {

    /* renamed from: a  reason: collision with root package name */
    private FirebaseAuth f8424a;

    /* loaded from: classes.dex */
    public static class a extends com.google.android.gms.common.internal.x.a {
        public static final Parcelable.Creator<a> CREATOR = new b1();

        public static a f() {
            return new a();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            com.google.android.gms.common.internal.x.c.a(parcel, com.google.android.gms.common.internal.x.c.a(parcel));
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        private static final com.google.android.gms.common.l.a f8425a = new com.google.android.gms.common.l.a("PhoneAuthProvider", new String[0]);

        public abstract void a(c.e.b.f fVar);

        public abstract void a(m0 m0Var);

        public void a(String str) {
            f8425a.b("Sms auto retrieval timed-out.", new Object[0]);
        }

        public void a(String str, a aVar) {
        }
    }

    private n0(FirebaseAuth firebaseAuth) {
        this.f8424a = firebaseAuth;
    }

    public static m0 a(String str, String str2) {
        return new m0(str, str2, false, null, true, null, null);
    }

    public static n0 a(FirebaseAuth firebaseAuth) {
        return new n0(firebaseAuth);
    }

    private final void a(String str, long j, TimeUnit timeUnit, Activity activity, Executor executor, b bVar, a aVar) {
        this.f8424a.a(str, j, timeUnit, bVar, activity, executor, aVar != null, null);
    }

    public void a(String str, long j, TimeUnit timeUnit, Activity activity, b bVar) {
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.a(activity);
        Executor executor = c.e.a.b.g.j.f4610a;
        com.google.android.gms.common.internal.s.a(bVar);
        a(str, j, timeUnit, activity, executor, bVar, null);
    }

    public void a(String str, long j, TimeUnit timeUnit, Activity activity, b bVar, a aVar) {
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.a(activity);
        Executor executor = c.e.a.b.g.j.f4610a;
        com.google.android.gms.common.internal.s.a(bVar);
        a(str, j, timeUnit, activity, executor, bVar, aVar);
    }
}
