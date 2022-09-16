package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: ywn  reason: default package */
/* loaded from: classes4.dex */
final class ywn {
    final StringBuilder a = new StringBuilder();

    private final void d(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (this.a.length() > 0) {
                this.a.append(',');
            }
            StringBuilder sb = this.a;
            sb.append(str);
            sb.append('=');
            sb.append(str2);
        }
    }

    public final String a() {
        if (this.a.length() > 0) {
            return this.a.toString();
        }
        return null;
    }

    public final void b(ywj ywjVar, long j) {
        if (((Long) ywjVar.b).longValue() == j) {
            return;
        }
        d(ywjVar.a, Long.toString(j));
    }

    public final void c(ywj ywjVar, boolean z) {
        if (((Boolean) ywjVar.b).booleanValue() == z) {
            return;
        }
        d(ywjVar.a, Boolean.toString(z));
    }
}
