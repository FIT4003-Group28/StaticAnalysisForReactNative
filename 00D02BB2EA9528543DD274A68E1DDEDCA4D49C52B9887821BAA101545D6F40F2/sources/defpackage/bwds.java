package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bwds  reason: default package */
/* loaded from: classes4.dex */
public final class bwds extends bweo {
    private final String c;
    private final boolean d;
    private final int e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bwds(java.lang.String r7, java.lang.String r8, boolean r9, int r10, java.lang.String r11) {
        /*
            r6 = this;
            drrp r0 = defpackage.drrp.d
            dsqp r0 = r0.bZ()
            drro r0 = (defpackage.drro) r0
            drrr r1 = defpackage.drrr.j
            dsqp r1 = r1.bZ()
            drrq r1 = (defpackage.drrq) r1
            drot r2 = defpackage.drot.e
            dsqp r2 = r2.bZ()
            droi r2 = (defpackage.droi) r2
            boolean r3 = r2.c
            r4 = 0
            if (r3 == 0) goto L22
            r2.bF()
            r2.c = r4
        L22:
            MessageType extends dsqw<MessageType, BuilderType> r3 = r2.b
            drot r3 = (defpackage.drot) r3
            r11.getClass()
            int r5 = r3.a
            r5 = r5 | 2
            r3.a = r5
            r3.c = r11
            boolean r11 = r1.c
            if (r11 == 0) goto L3a
            r1.bF()
            r1.c = r4
        L3a:
            MessageType extends dsqw<MessageType, BuilderType> r11 = r1.b
            drrr r11 = (defpackage.drrr) r11
            dsqw r2 = r2.bK()
            drot r2 = (defpackage.drot) r2
            r2.getClass()
            r11.e = r2
            int r2 = r11.a
            r2 = r2 | 128(0x80, float:1.794E-43)
            r11.a = r2
            boolean r11 = r0.c
            if (r11 == 0) goto L58
            r0.bF()
            r0.c = r4
        L58:
            MessageType extends dsqw<MessageType, BuilderType> r11 = r0.b
            drrp r11 = (defpackage.drrp) r11
            dsqw r1 = r1.bK()
            drrr r1 = (defpackage.drrr) r1
            r1.getClass()
            r11.c = r1
            int r1 = r11.a
            r1 = r1 | 8
            r11.a = r1
            dsqw r11 = r0.bK()
            drrp r11 = (defpackage.drrp) r11
            dqhg r8 = h(r11, r8)
            r6.<init>(r8)
            r6.c = r7
            r6.d = r9
            r6.e = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwds.<init>(java.lang.String, java.lang.String, boolean, int, java.lang.String):void");
    }

    private final String n(boolean z, Resources resources) {
        if (!this.d) {
            return "";
        }
        if (z) {
            int i = this.e;
            return resources.getQuantityString(R.plurals.LOCAL_GUIDE_CURRENT_LEVEL, i, Integer.valueOf(i));
        }
        int i2 = this.e;
        return resources.getQuantityString(R.plurals.CONTRIBUTIONS_SHARE_DESCRIPTION_LOCAL_GUIDE, i2, Integer.valueOf(i2));
    }

    private final String o(boolean z, Context context) {
        String n = n(z, context.getResources());
        if (n.isEmpty()) {
            return this.c;
        }
        String str = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(n).length());
        sb.append(str);
        sb.append("\n");
        sb.append(n);
        return sb.toString();
    }

    private final String p(boolean z, Context context) {
        String b = l().b();
        dbsk.s(b);
        int length = (140 - b.length()) - 2;
        if (z) {
            length -= q().length();
        }
        return dbtw.f(o(z, context), length);
    }

    private final String q() {
        return true != this.d ? " #GoogleMaps" : " #LocalGuides";
    }

    @Override // defpackage.bweo
    @dzsi
    public final String a(Context context, @dzsi bwfq bwfqVar) {
        String b = l().b();
        dbsk.s(b);
        String n = n(false, context.getResources());
        if (bwfqVar == bwfq.EMAIL) {
            if (!n.isEmpty()) {
                StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 2 + b.length());
                sb.append(n);
                sb.append("\n\n");
                sb.append(b);
                b = sb.toString();
            }
        } else if (bwfqVar == bwfq.SMS) {
            String p = p(false, context);
            StringBuilder sb2 = new StringBuilder(String.valueOf(p).length() + 2 + b.length());
            sb2.append(p);
            sb2.append("\n\n");
            sb2.append(b);
            b = sb2.toString();
        } else if (bwfqVar == bwfq.TWITTER) {
            String p2 = p(true, context);
            String q = q();
            int length = String.valueOf(p2).length();
            StringBuilder sb3 = new StringBuilder(length + 2 + q.length() + b.length());
            sb3.append(p2);
            sb3.append(q);
            sb3.append("\n\n");
            sb3.append(b);
            b = sb3.toString();
        } else if (bwfqVar == bwfq.GOOGLE_PLUS || bwfqVar == bwfq.INSTAGRAM || bwfqVar == bwfq.LINKED_IN || bwfqVar == bwfq.PINTEREST) {
            String o = o(true, context);
            String q2 = q();
            int length2 = String.valueOf(o).length();
            StringBuilder sb4 = new StringBuilder(length2 + 2 + q2.length() + b.length());
            sb4.append(o);
            sb4.append(q2);
            sb4.append("\n\n");
            sb4.append(b);
            b = sb4.toString();
        } else if (bwfqVar != bwfq.COPY_TO_CLIPBOARD) {
            b = null;
        }
        if (b != null) {
            return i(b);
        }
        return j(this.c, n);
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
        return 9;
    }

    @Override // defpackage.bweo
    public final int e() {
        return 5;
    }
}
