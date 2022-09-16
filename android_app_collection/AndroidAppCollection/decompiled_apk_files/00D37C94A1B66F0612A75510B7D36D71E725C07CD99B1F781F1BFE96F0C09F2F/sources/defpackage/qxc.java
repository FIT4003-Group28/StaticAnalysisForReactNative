package defpackage;

import android.content.ComponentName;
import android.net.Uri;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: qxc  reason: default package */
/* loaded from: classes4.dex */
public final class qxc {
    public static final Uri a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String b;
    public final String c;
    public final ComponentName d;
    public final int e;
    public final boolean f;

    public qxc(ComponentName componentName) {
        this.b = null;
        this.c = null;
        qnm.b(componentName);
        this.d = componentName;
        this.e = 4225;
        this.f = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxc)) {
            return false;
        }
        qxc qxcVar = (qxc) obj;
        if (tnk.j(this.b, qxcVar.b) && tnk.j(this.c, qxcVar.c) && tnk.j(this.d, qxcVar.d)) {
            int i = qxcVar.e;
            if (this.f == qxcVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, 4225, Boolean.valueOf(this.f)});
    }

    public final String toString() {
        String str = this.b;
        if (str == null) {
            qnm.b(this.d);
            return this.d.flattenToString();
        }
        return str;
    }

    public qxc(String str, boolean z) {
        qnm.l(str);
        this.b = str;
        qnm.l("com.google.android.gms");
        this.c = "com.google.android.gms";
        this.d = null;
        this.e = 4225;
        this.f = z;
    }
}
