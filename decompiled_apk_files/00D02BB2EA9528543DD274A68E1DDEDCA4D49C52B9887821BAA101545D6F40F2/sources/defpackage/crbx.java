package defpackage;

import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.ZipFile;
/* compiled from: PG */
/* renamed from: crbx  reason: default package */
/* loaded from: classes5.dex */
public final class crbx implements Closeable {
    public final Map<Integer, String> a = new TreeMap();
    public final String b;
    @dzsi
    public final ZipFile c;

    public crbx(String str, @dzsi ZipFile zipFile, InputStream inputStream) {
        this.b = str;
        this.c = zipFile;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        try {
            b(inputStreamReader);
            inputStreamReader.close();
        } catch (Throwable th) {
            try {
                inputStreamReader.close();
            } catch (Throwable th2) {
                deki.a(th, th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.crbx a(java.io.File r6) {
        /*
            java.io.File r0 = r6.getParentFile()
            r1 = 0
            java.lang.String r2 = r6.getName()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            java.lang.String r3 = ".zip"
            boolean r2 = r2.endsWith(r3)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            if (r2 == 0) goto L48
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            r3 = 1
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            java.lang.String r3 = "messages.xml"
            java.util.zip.ZipEntry r3 = r2.getEntry(r3)     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
            if (r3 != 0) goto L3f
            java.io.IOException r0 = new java.io.IOException     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
            java.lang.String r3 = "Canned message bundle did not contain index file: "
            java.lang.String r6 = r6.getName()     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
            int r4 = r6.length()     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
            if (r4 == 0) goto L36
            java.lang.String r6 = r3.concat(r6)     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
            goto L3b
        L36:
            java.lang.String r6 = new java.lang.String     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
            r6.<init>(r3)     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
        L3b:
            r0.<init>(r6)     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
            throw r0     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
        L3f:
            java.io.InputStream r1 = r2.getInputStream(r3)     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
            goto L50
        L44:
            r6 = move-exception
            r0 = r1
            r1 = r2
            goto L88
        L48:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            r5 = r2
            r2 = r1
            r1 = r5
        L50:
            if (r1 != 0) goto L72
            java.io.IOException r0 = new java.io.IOException     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
            java.lang.String r3 = "Error getting input steam for bundle: "
            java.lang.String r6 = r6.getName()     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
            int r4 = r6.length()     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
            if (r4 == 0) goto L69
            java.lang.String r6 = r3.concat(r6)     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
            goto L6e
        L69:
            java.lang.String r6 = new java.lang.String     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
            r6.<init>(r3)     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
        L6e:
            r0.<init>(r6)     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
            throw r0     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
        L72:
            crbx r6 = new crbx     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
            if (r0 == 0) goto L7b
            java.lang.String r0 = r0.getPath()     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
            goto L7d
        L7b:
            java.lang.String r0 = ""
        L7d:
            r6.<init>(r0, r2, r1)     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L84
            r1.close()
            return r6
        L84:
            r6 = move-exception
            goto L90
        L86:
            r6 = move-exception
            r0 = r1
        L88:
            if (r1 == 0) goto L8d
            r1.close()     // Catch: java.io.IOException -> L8d java.lang.Throwable -> L8e
        L8d:
            throw r6     // Catch: java.lang.Throwable -> L8e
        L8e:
            r6 = move-exception
            r1 = r0
        L90:
            if (r1 == 0) goto L95
            r1.close()
        L95:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crbx.a(java.io.File):crbx");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059 A[Catch: FileNotFoundException | XmlPullParserException -> 0x00ae, XmlPullParserException -> 0x00b0, TryCatch #2 {FileNotFoundException | XmlPullParserException -> 0x00ae, blocks: (B:2:0x0000, B:7:0x0019, B:22:0x0045, B:23:0x0049, B:27:0x0052, B:30:0x0059, B:32:0x0062, B:34:0x007a, B:36:0x0080, B:37:0x0086, B:38:0x009e, B:39:0x009f, B:40:0x00a6, B:41:0x00a7), top: B:50:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(java.io.Reader r6) {
        /*
            r5 = this;
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            r1 = 0
            r0.setNamespaceAware(r1)     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            r0.setInput(r6)     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            int r6 = r0.getEventType()     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
        L13:
            r2 = 1
            if (r6 == r2) goto Lad
            r3 = 2
            if (r6 != r3) goto La7
            java.lang.String r6 = r0.getName()     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            int r3 = r6.hashCode()     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            r4 = -1512558702(0xffffffffa5d82f92, float:-3.7502262E-16)
            if (r3 == r4) goto L36
            r4 = 305394053(0x1233f185, float:5.6780137E-28)
            if (r3 == r4) goto L2c
            goto L40
        L2c:
            java.lang.String r3 = "canned_message"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L40
            r6 = 0
            goto L41
        L36:
            java.lang.String r3 = "voice_instructions"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L40
            r6 = 1
            goto L41
        L40:
            r6 = -1
        L41:
            if (r6 == 0) goto L59
            if (r6 == r2) goto La7
            int r6 = r0.getDepth()     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
        L49:
            int r3 = r0.next()     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            if (r3 == r2) goto La7
            r4 = 3
            if (r3 != r4) goto L49
            int r3 = r0.getDepth()     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            if (r3 != r6) goto L49
            goto La7
        L59:
            r6 = 0
            java.lang.String r2 = "id"
            java.lang.String r6 = r0.getAttributeValue(r6, r2)     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            if (r6 == 0) goto L9f
            java.lang.Integer r6 = java.lang.Integer.decode(r6)     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            int r6 = r6.intValue()     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            java.lang.String r2 = r0.nextText()     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            java.util.Map<java.lang.Integer, java.lang.String> r3 = r5.a     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            boolean r3 = r3.containsKey(r4)     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            if (r3 != 0) goto L86
            boolean r6 = defpackage.dbsj.d(r2)     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            if (r6 != 0) goto La7
            java.util.Map<java.lang.Integer, java.lang.String> r6 = r5.a     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            r6.put(r4, r2)     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            goto La7
        L86:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            r2 = 38
            r1.<init>(r2)     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            java.lang.String r2 = "Duplicated canned message: "
            r1.append(r2)     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            r1.append(r6)     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            java.lang.String r6 = r1.toString()     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            r0.<init>(r6)     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            throw r0     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
        L9f:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            java.lang.String r0 = "Canned message entry did not contain an id value."
            r6.<init>(r0)     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            throw r6     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
        La7:
            int r6 = r0.next()     // Catch: java.io.FileNotFoundException -> Lae org.xmlpull.v1.XmlPullParserException -> Lb0
            goto L13
        Lad:
            return
        Lae:
            r6 = move-exception
            goto Lb1
        Lb0:
            r6 = move-exception
        Lb1:
            defpackage.bvoo.j(r6)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r6 = r6.getMessage()
            r0.<init>(r6)
            goto Lbf
        Lbe:
            throw r0
        Lbf:
            goto Lbe
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crbx.b(java.io.Reader):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ZipFile zipFile = this.c;
        if (zipFile == null) {
            return;
        }
        zipFile.close();
    }
}
