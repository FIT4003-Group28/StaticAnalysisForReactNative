package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bwdz  reason: default package */
/* loaded from: classes4.dex */
public final class bwdz extends bweo {
    @dzsi
    private final String c;

    public bwdz(@dzsi String str, String str2) {
        super(g(str2));
        this.c = str;
    }

    private final String n(Context context) {
        return p(260, context);
    }

    private final String o(Context context) {
        return p(98, context);
    }

    private final String p(int i, Context context) {
        String q = q(this.c, context);
        if (dbsj.d(this.c) || q.length() <= i) {
            return q;
        }
        String str = this.c;
        return q(dbtw.f(str, str.length() - (q.length() - i)), context);
    }

    private static String q(@dzsi String str, Context context) {
        if (dbsj.d(str)) {
            return context.getString(R.string.SHARE_REVIEW_MESSAGE_WITHOUT_PLACE);
        }
        return context.getString(R.string.SHARE_REVIEW_MESSAGE, str);
    }

    @Override // defpackage.bweo
    @dzsi
    public final String a(Context context, @dzsi bwfq bwfqVar) {
        String b = l().b();
        dbsk.s(b);
        String n = n(context);
        if (bwfqVar != bwfq.EMAIL && bwfqVar != bwfq.COPY_TO_CLIPBOARD) {
            if (bwfqVar == bwfq.SMS) {
                String o = o(context);
                StringBuilder sb = new StringBuilder(String.valueOf(o).length() + 2 + b.length());
                sb.append(o);
                sb.append("\n\n");
                sb.append(b);
                b = sb.toString();
            } else if (bwfqVar == bwfq.TWITTER) {
                String o2 = o(context);
                StringBuilder sb2 = new StringBuilder(String.valueOf(o2).length() + 16 + b.length());
                sb2.append(o2);
                sb2.append(" #OnGoogleMaps");
                sb2.append("\n\n");
                sb2.append(b);
                b = sb2.toString();
            } else if (bwfqVar == bwfq.GOOGLE_PLUS || bwfqVar == bwfq.INSTAGRAM || bwfqVar == bwfq.LINKED_IN || bwfqVar == bwfq.PINTEREST || bwfqVar == bwfq.FACEBOOK) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(n).length() + 16 + b.length());
                sb3.append(n);
                sb3.append(" #OnGoogleMaps");
                sb3.append("\n\n");
                sb3.append(b);
                b = sb3.toString();
            } else {
                b = null;
            }
        }
        if (b != null) {
            return i(b);
        }
        return j(null, n);
    }

    @Override // defpackage.bweo
    @dzsi
    public final String b(Context context, @dzsi bwfq bwfqVar) {
        if (bwfqVar == bwfq.EMAIL) {
            return n(context);
        }
        return null;
    }

    @Override // defpackage.bweo
    public final int d() {
        return 8;
    }
}
