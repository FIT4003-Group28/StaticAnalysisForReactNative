package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bwfj  reason: default package */
/* loaded from: classes4.dex */
public final class bwfj extends bweo {
    private final String c;
    private final String d;

    public bwfj(String str, String str2, String str3, drrp drrpVar) {
        super(h(drrpVar, str3));
        this.c = str;
        this.d = str2;
    }

    private final String n() {
        String str = this.c;
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("\n");
        sb.append(str2);
        return sb.toString();
    }

    private final String o(boolean z) {
        String b = l().b();
        dbsk.s(b);
        int length = (140 - b.length()) - 2;
        if (z) {
            length -= 12;
        }
        String n = n();
        if (length < n.length()) {
            n = length > 3 ? dbtw.f(n, length) : "";
        }
        return (!z || length < 0) ? n : String.valueOf(n).concat(" #GoogleMaps");
    }

    @Override // defpackage.bweo
    @dzsi
    public final String a(Context context, @dzsi bwfq bwfqVar) {
        String b = l().b();
        dbsk.s(b);
        if (bwfqVar == bwfq.EMAIL) {
            String str = this.d;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + b.length());
            sb.append(str);
            sb.append("\n\n");
            sb.append(b);
            b = sb.toString();
        } else if (bwfqVar == bwfq.SMS) {
            String o = o(false);
            if (!o.isEmpty()) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(o).length() + 2 + b.length());
                sb2.append(o);
                sb2.append("\n\n");
                sb2.append(b);
                b = sb2.toString();
            }
        } else if (bwfqVar == bwfq.TWITTER) {
            String o2 = o(true);
            if (!o2.isEmpty()) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(o2).length() + 2 + b.length());
                sb3.append(o2);
                sb3.append("\n\n");
                sb3.append(b);
                b = sb3.toString();
            }
        } else if (bwfqVar == bwfq.GOOGLE_PLUS || bwfqVar == bwfq.INSTAGRAM || bwfqVar == bwfq.LINKED_IN || bwfqVar == bwfq.PINTEREST) {
            String n = n();
            StringBuilder sb4 = new StringBuilder(String.valueOf(n).length() + 14 + b.length());
            sb4.append(n);
            sb4.append(" #GoogleMaps");
            sb4.append("\n\n");
            sb4.append(b);
            b = sb4.toString();
        } else if (bwfqVar != bwfq.COPY_TO_CLIPBOARD) {
            b = null;
        }
        if (b != null) {
            return i(b);
        }
        return j(this.c, this.d);
    }

    @Override // defpackage.bweo
    @dzsi
    public final String b(Context context, @dzsi bwfq bwfqVar) {
        if (bwfqVar == bwfq.SMS || bwfqVar == bwfq.TWITTER || bwfqVar == bwfq.GOOGLE_PLUS || bwfqVar == bwfq.INSTAGRAM || bwfqVar == bwfq.LINKED_IN || bwfqVar == bwfq.PINTEREST || bwfqVar == bwfq.COPY_TO_CLIPBOARD) {
            return null;
        }
        return this.c;
    }

    @Override // defpackage.bweo
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bweo
    public final int d() {
        return 10;
    }

    @Override // defpackage.bweo
    public final int e() {
        return 2;
    }
}
