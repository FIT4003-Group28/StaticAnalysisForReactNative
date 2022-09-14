package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* loaded from: classes.dex */
public class u0 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<u0> CREATOR = new y0();

    /* renamed from: b  reason: collision with root package name */
    private String f8440b;

    /* renamed from: c  reason: collision with root package name */
    private String f8441c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8442d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8443e;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f8444a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f8445b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f8446c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f8447d;

        public a a(Uri uri) {
            if (uri == null) {
                this.f8447d = true;
            } else {
                this.f8445b = uri;
            }
            return this;
        }

        public a a(String str) {
            if (str == null) {
                this.f8446c = true;
            } else {
                this.f8444a = str;
            }
            return this;
        }

        public u0 a() {
            String str = this.f8444a;
            Uri uri = this.f8445b;
            return new u0(str, uri == null ? null : uri.toString(), this.f8446c, this.f8447d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(String str, String str2, boolean z, boolean z2) {
        this.f8440b = str;
        this.f8441c = str2;
        this.f8442d = z;
        this.f8443e = z2;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Uri.parse(str2);
    }

    public String p() {
        return this.f8440b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, p(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f8441c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, this.f8442d);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, this.f8443e);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
