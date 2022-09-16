package com.google.android.libraries.youtube.mdx.model;

import android.net.Uri;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AutoValue_AppStatus extends AppStatus {
    public final int a;
    public final boolean b;
    public final String c;
    public final Map d;
    public final ampq e;
    private final boolean f;
    private final boolean g;
    private final Uri h;
    private final ScreenId i;
    private final adit j;

    public AutoValue_AppStatus(int i, boolean z, boolean z2, boolean z3, Uri uri, ScreenId screenId, adit aditVar, String str, Map map, ampq ampqVar) {
        this.a = i;
        this.f = z;
        this.g = z2;
        this.b = z3;
        this.h = uri;
        this.i = screenId;
        this.j = aditVar;
        this.c = str;
        this.d = map;
        this.e = ampqVar;
    }

    @Override // com.google.android.libraries.youtube.mdx.model.AppStatus
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.libraries.youtube.mdx.model.AppStatus
    public final Uri b() {
        return this.h;
    }

    @Override // com.google.android.libraries.youtube.mdx.model.AppStatus
    public final ScreenId e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        ScreenId screenId;
        adit aditVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AppStatus) {
            AppStatus appStatus = (AppStatus) obj;
            if (this.a == appStatus.a() && this.f == appStatus.k() && this.g == appStatus.j() && this.b == appStatus.i() && ((uri = this.h) != null ? uri.equals(appStatus.b()) : appStatus.b() == null) && ((screenId = this.i) != null ? screenId.equals(appStatus.e()) : appStatus.e() == null) && ((aditVar = this.j) != null ? aditVar.equals(appStatus.l()) : appStatus.l() == null) && ((str = this.c) != null ? str.equals(appStatus.g()) : appStatus.g() == null) && this.d.equals(appStatus.h()) && this.e.equals(appStatus.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.youtube.mdx.model.AppStatus
    public final ampq f() {
        return this.e;
    }

    @Override // com.google.android.libraries.youtube.mdx.model.AppStatus
    public final String g() {
        return this.c;
    }

    @Override // com.google.android.libraries.youtube.mdx.model.AppStatus
    public final Map h() {
        return this.d;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = (((((this.a ^ 1000003) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        if (true == this.b) {
            i = 1231;
        }
        int i3 = (i2 ^ i) * 1000003;
        Uri uri = this.h;
        int i4 = 0;
        int hashCode = (i3 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        ScreenId screenId = this.i;
        int hashCode2 = (hashCode ^ (screenId == null ? 0 : screenId.hashCode())) * 1000003;
        adit aditVar = this.j;
        int hashCode3 = (hashCode2 ^ (aditVar == null ? 0 : aditVar.hashCode())) * 1000003;
        String str = this.c;
        if (str != null) {
            i4 = str.hashCode();
        }
        return ((((hashCode3 ^ i4) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    @Override // com.google.android.libraries.youtube.mdx.model.AppStatus
    public final boolean i() {
        return this.b;
    }

    @Override // com.google.android.libraries.youtube.mdx.model.AppStatus
    public final boolean j() {
        return this.g;
    }

    @Override // com.google.android.libraries.youtube.mdx.model.AppStatus
    public final boolean k() {
        return this.f;
    }

    @Override // com.google.android.libraries.youtube.mdx.model.AppStatus
    public final adit l() {
        return this.j;
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.b;
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.i);
        String valueOf3 = String.valueOf(this.j);
        String str = this.c;
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 197 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("AppStatus{status=");
        sb.append(i);
        sb.append(", stopAllowed=");
        sb.append(z);
        sb.append(", inAppDial=");
        sb.append(z2);
        sb.append(", castSupported=");
        sb.append(z3);
        sb.append(", installUrl=");
        sb.append(valueOf);
        sb.append(", screenId=");
        sb.append(valueOf2);
        sb.append(", loungeDeviceId=");
        sb.append(valueOf3);
        sb.append(", runningPathSegment=");
        sb.append(str);
        sb.append(", additionalData=");
        sb.append(valueOf4);
        sb.append(", shortLivedLoungeTokenOptional=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
