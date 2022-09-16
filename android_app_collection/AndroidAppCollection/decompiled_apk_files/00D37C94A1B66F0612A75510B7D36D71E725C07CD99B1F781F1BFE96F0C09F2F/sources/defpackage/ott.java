package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: ott  reason: default package */
/* loaded from: classes4.dex */
final class ott {
    public final String a;
    public final boolean b;

    public ott(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == ott.class) {
            ott ottVar = (ott) obj;
            if (TextUtils.equals(this.a, ottVar.a) && this.b == ottVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (true != this.b ? 1237 : 1231);
    }
}
