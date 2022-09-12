package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bwdw  reason: default package */
/* loaded from: classes4.dex */
public final class bwdw extends bweo {
    private final String c;

    public bwdw(String str, String str2) {
        super(g(str2));
        this.c = str;
    }

    private final String n(Context context, int i, int i2) {
        String string = context.getString(i, this.c);
        return string.length() <= i2 ? string : context.getString(i, dbtw.f(this.c, string.length() - i2));
    }

    @Override // defpackage.bweo
    @dzsi
    public final String a(Context context, @dzsi bwfq bwfqVar) {
        String b = l().b();
        dbsk.s(b);
        if (bwfqVar != bwfq.COPY_TO_CLIPBOARD && bwfqVar != bwfq.EMAIL) {
            if (bwfqVar == bwfq.SMS) {
                String b2 = l().b();
                dbsk.s(b2);
                String n = n(context, R.string.SHARE_TITLE, 158 - b2.length());
                if (!n.isEmpty()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 2 + b.length());
                    sb.append(n);
                    sb.append("\n\n");
                    sb.append(b);
                    b = sb.toString();
                }
            } else if (bwfqVar == bwfq.TWITTER) {
                String n2 = n(context, R.string.SHARE_TITLE_HASHTAG, com.google.android.filament.R.styleable.AppCompatTheme_tooltipFrameBackground);
                if (!n2.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(n2).length() + 2 + b.length());
                    sb2.append(n2);
                    sb2.append("\n\n");
                    sb2.append(b);
                    b = sb2.toString();
                }
            } else {
                b = null;
            }
        }
        if (b == null) {
            return j(null, n(context, R.string.SHARE_TITLE, Integer.MAX_VALUE));
        }
        return i(b);
    }

    @Override // defpackage.bweo
    @dzsi
    public final String b(Context context, @dzsi bwfq bwfqVar) {
        if (bwfqVar == bwfq.EMAIL) {
            return n(context, R.string.SHARE_SUBJECT, Integer.MAX_VALUE);
        }
        return null;
    }

    @Override // defpackage.bweo
    public final int d() {
        return 11;
    }
}
