package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: clcn  reason: default package */
/* loaded from: classes5.dex */
public final class clcn {
    private final String a;

    static {
        new clcn("@@ContextManagerNullAccount@@");
    }

    public clcn(String str) {
        cnwc.l(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof clcn) {
            return TextUtils.equals(this.a, ((clcn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "#account#";
    }
}
