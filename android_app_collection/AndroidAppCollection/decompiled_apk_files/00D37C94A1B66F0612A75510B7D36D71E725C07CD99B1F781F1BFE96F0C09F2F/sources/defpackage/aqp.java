package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: aqp  reason: default package */
/* loaded from: classes2.dex */
public class aqp {
    public int d;
    public aqo e;
    public final Context f;
    public boolean g = false;
    public boolean h = false;
    public boolean i = true;
    public boolean j = false;

    public aqp(Context context) {
        this.f = context.getApplicationContext();
    }

    public static final String e(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        if (obj == null) {
            sb.append("null");
        } else {
            sb.append(obj.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
            sb.append("}");
        }
        return sb.toString();
    }

    public void d() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" id=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
