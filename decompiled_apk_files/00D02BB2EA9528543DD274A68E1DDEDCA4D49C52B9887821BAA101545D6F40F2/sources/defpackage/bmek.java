package defpackage;
/* compiled from: PG */
/* renamed from: bmek  reason: default package */
/* loaded from: classes3.dex */
public final class bmek {
    private static final String[] b = {"https://plus.google.com/", "https://www.google.com/maps/contrib/", "https://maps.google.com/maps/contrib/"};
    private static final String[] c = {"https://plus.google.com/photos/"};
    public static final dcdn<String, dkcp> a = dcdn.n("contribute", dkcp.CONTRIBUTE, "reviews", dkcp.REVIEW, "photos", dkcp.PHOTO, "edits", dkcp.EDIT);

    public static Runnable a(cafi cafiVar, @dzsi String str) {
        if (str != null) {
            return new bmeh(cafiVar, str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Runnable b(final android.content.Context r5, defpackage.cafi r6, final defpackage.dxio<defpackage.afha> r7, @defpackage.dzsi java.lang.String r8) {
        /*
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.lang.String[] r1 = defpackage.bmek.c
            int r2 = r1.length
            r2 = 0
            r1 = r1[r2]
            boolean r1 = r8.startsWith(r1)
            if (r1 == 0) goto L12
        L10:
            r1 = r0
            goto L39
        L12:
            java.lang.String[] r1 = defpackage.bmek.b
            int r3 = r1.length
        L15:
            r3 = 3
            if (r2 >= r3) goto L10
            r3 = r1[r2]
            boolean r4 = r8.startsWith(r3)
            if (r4 == 0) goto L36
            int r1 = r3.length()
            r2 = 47
            int r2 = r8.indexOf(r2, r1)
            r3 = -1
            if (r2 != r3) goto L31
            int r2 = r8.length()
        L31:
            java.lang.String r1 = r8.substring(r1, r2)
            goto L39
        L36:
            int r2 = r2 + 1
            goto L15
        L39:
            if (r1 == 0) goto L41
            bmej r5 = new bmej
            r5.<init>(r6, r1, r8)
            return r5
        L41:
            r6 = 1
            android.content.Intent r6 = android.content.Intent.parseUri(r8, r6)     // Catch: java.net.URISyntaxException -> L4c
            bmeg r8 = new bmeg
            r8.<init>(r7, r5, r6)
            return r8
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmek.b(android.content.Context, cafi, dxio, java.lang.String):java.lang.Runnable");
    }

    public static Runnable c(ceet ceetVar, @dzsi String str) {
        return new bmei(ceetVar, str);
    }
}
