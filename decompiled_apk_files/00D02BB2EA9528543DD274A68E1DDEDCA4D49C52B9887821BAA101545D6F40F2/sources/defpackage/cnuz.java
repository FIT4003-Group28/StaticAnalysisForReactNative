package defpackage;

import android.content.ComponentName;
import android.net.Uri;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cnuz  reason: default package */
/* loaded from: classes.dex */
public final class cnuz {
    public static final Uri f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String a;
    public final String b;
    public final ComponentName c;
    public final int d;
    public final boolean e;

    public cnuz(ComponentName componentName) {
        this.a = null;
        this.b = null;
        cnwc.a(componentName);
        this.c = componentName;
        this.d = 4225;
        this.e = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnuz)) {
            return false;
        }
        cnuz cnuzVar = (cnuz) obj;
        return cnvv.a(this.a, cnuzVar.a) && cnvv.a(this.b, cnuzVar.b) && cnvv.a(this.c, cnuzVar.c) && this.d == cnuzVar.d && this.e == cnuzVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    public final String toString() {
        String str = this.a;
        if (str == null) {
            cnwc.a(this.c);
            return this.c.flattenToString();
        }
        return str;
    }

    public cnuz(String str, String str2, int i, boolean z) {
        cnwc.l(str);
        this.a = str;
        cnwc.l(str2);
        this.b = str2;
        this.c = null;
        this.d = i;
        this.e = z;
    }
}
