package defpackage;
/* compiled from: PG */
/* renamed from: cvkz  reason: default package */
/* loaded from: classes5.dex */
public abstract class cvkz {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.cvkz f(android.content.Intent r8) {
        /*
            cvkv r0 = new cvkv
            r0.<init>()
            java.lang.String r1 = "casp"
            java.lang.String r1 = r8.getStringExtra(r1)
            r0.b = r1
            java.lang.String r1 = "google.original_priority"
            java.lang.String r1 = r8.getStringExtra(r1)
            int r1 = h(r1)
            r0.d = r1
            java.lang.String r1 = "google.delivered_priority"
            java.lang.String r1 = r8.getStringExtra(r1)
            int r1 = h(r1)
            r0.e = r1
            java.lang.String r1 = "message_type"
            java.lang.String r1 = r8.getStringExtra(r1)
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 != 0) goto L32
        L30:
            r2 = 1
            goto L71
        L32:
            int r5 = r1.hashCode()
            switch(r5) {
                case -2062414158: goto L58;
                case 102161: goto L4e;
                case 814694033: goto L44;
                case 814800675: goto L3a;
                default: goto L39;
            }
        L39:
            goto L62
        L3a:
            java.lang.String r5 = "send_event"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L62
            r1 = 2
            goto L63
        L44:
            java.lang.String r5 = "send_error"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L62
            r1 = 3
            goto L63
        L4e:
            java.lang.String r5 = "gcm"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L62
            r1 = 0
            goto L63
        L58:
            java.lang.String r5 = "deleted_messages"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L62
            r1 = 1
            goto L63
        L62:
            r1 = -1
        L63:
            if (r1 == 0) goto L70
            if (r1 == r4) goto L71
            if (r1 == r3) goto L6e
            if (r1 == r2) goto L6c
            goto L30
        L6c:
            r2 = 5
            goto L71
        L6e:
            r2 = 4
            goto L71
        L70:
            r2 = 2
        L71:
            r0.c = r2
            java.lang.String r1 = "google.message_id"
            java.lang.String r8 = r8.getStringExtra(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L81
            r0.a = r8
        L81:
            cvkw r8 = new cvkw
            java.lang.String r3 = r0.a
            int r4 = r0.c
            int r5 = r0.d
            int r6 = r0.e
            java.lang.String r7 = r0.b
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvkz.f(android.content.Intent):cvkz");
    }

    private static int h(@dzsi String str) {
        char c;
        if (str == null) {
            return 1;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1039745817) {
            if (hashCode == 3202466 && str.equals("high")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("normal")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            return 2;
        }
        return c != 1 ? 1 : 3;
    }

    private static int i(@dzsi int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            return 2;
        }
        return i2 != 2 ? 1 : 3;
    }

    @dzsi
    public abstract String a();

    @dzsi
    public abstract String b();

    @dzsi
    public abstract int c();

    @dzsi
    public abstract int d();

    @dzsi
    public abstract int e();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.drus g() {
        /*
            r7 = this;
            drus r0 = defpackage.drus.f
            dsqp r0 = r0.bZ()
            drup r0 = (defpackage.drup) r0
            int r1 = r7.d()
            int r1 = i(r1)
            boolean r2 = r0.c
            r3 = 0
            if (r2 == 0) goto L1a
            r0.bF()
            r0.c = r3
        L1a:
            MessageType extends dsqw<MessageType, BuilderType> r2 = r0.b
            drus r2 = (defpackage.drus) r2
            int r1 = r1 + (-1)
            r2.d = r1
            int r1 = r2.a
            r4 = 4
            r1 = r1 | r4
            r2.a = r1
            int r1 = r7.e()
            int r1 = i(r1)
            boolean r2 = r0.c
            if (r2 == 0) goto L39
            r0.bF()
            r0.c = r3
        L39:
            MessageType extends dsqw<MessageType, BuilderType> r2 = r0.b
            drus r2 = (defpackage.drus) r2
            int r1 = r1 + (-1)
            r2.e = r1
            int r1 = r2.a
            r1 = r1 | 8
            r2.a = r1
            int r1 = r7.c()
            r2 = 3
            r5 = 2
            r6 = 1
            if (r1 != 0) goto L52
        L50:
            r4 = 1
            goto L62
        L52:
            int r1 = r1 + (-1)
            if (r1 == r6) goto L61
            if (r1 == r5) goto L5f
            if (r1 == r2) goto L62
            if (r1 == r4) goto L5d
            goto L50
        L5d:
            r4 = 5
            goto L62
        L5f:
            r4 = 3
            goto L62
        L61:
            r4 = 2
        L62:
            boolean r1 = r0.c
            if (r1 == 0) goto L6b
            r0.bF()
            r0.c = r3
        L6b:
            MessageType extends dsqw<MessageType, BuilderType> r1 = r0.b
            drus r1 = (defpackage.drus) r1
            int r4 = r4 + (-1)
            r1.c = r4
            int r2 = r1.a
            r2 = r2 | r5
            r1.a = r2
            java.lang.String r1 = r7.a()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L9d
            java.lang.String r1 = r7.a()
            boolean r2 = r0.c
            if (r2 == 0) goto L8f
            r0.bF()
            r0.c = r3
        L8f:
            MessageType extends dsqw<MessageType, BuilderType> r2 = r0.b
            drus r2 = (defpackage.drus) r2
            r1.getClass()
            int r3 = r2.a
            r3 = r3 | r6
            r2.a = r3
            r2.b = r1
        L9d:
            dsqw r0 = r0.bK()
            drus r0 = (defpackage.drus) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvkz.g():drus");
    }
}
