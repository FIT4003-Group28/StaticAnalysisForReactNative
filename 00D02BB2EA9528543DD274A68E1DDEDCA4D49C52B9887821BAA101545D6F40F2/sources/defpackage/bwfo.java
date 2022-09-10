package defpackage;

import android.os.AsyncTask;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwfo  reason: default package */
/* loaded from: classes4.dex */
public final class bwfo extends AsyncTask<Object, Void, Void> {
    final /* synthetic */ bwfp a;

    public bwfo(bwfp bwfpVar) {
        this.a = bwfpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
        if (r13 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006e, code lost:
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
        if (r13 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
        if (r13 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (r13 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
        return null;
     */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Void doInBackground(java.lang.Object[] r13) {
        /*
            r12 = this;
            java.lang.String r0 = "historical-record"
            java.lang.String r1 = "historical-records"
            r2 = 0
            r3 = r13[r2]
            java.util.List r3 = (java.util.List) r3
            r4 = 1
            r13 = r13[r4]
            java.lang.String r13 = (java.lang.String) r13
            r5 = 0
            bwfp r6 = r12.a     // Catch: java.io.FileNotFoundException -> L99
            android.content.Context r6 = r6.a     // Catch: java.io.FileNotFoundException -> L99
            java.io.FileOutputStream r13 = r6.openFileOutput(r13, r2)     // Catch: java.io.FileNotFoundException -> L99
            org.xmlpull.v1.XmlSerializer r6 = android.util.Xml.newSerializer()
            r6.setOutput(r13, r5)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L7e java.lang.IllegalStateException -> L87 java.lang.IllegalArgumentException -> L90
            java.lang.String r7 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L7e java.lang.IllegalStateException -> L87 java.lang.IllegalArgumentException -> L90
            r6.startDocument(r7, r4)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L7e java.lang.IllegalStateException -> L87 java.lang.IllegalArgumentException -> L90
            r6.startTag(r5, r1)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L7e java.lang.IllegalStateException -> L87 java.lang.IllegalArgumentException -> L90
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L7e java.lang.IllegalStateException -> L87 java.lang.IllegalArgumentException -> L90
            r7 = 0
        L2f:
            if (r7 >= r4) goto L61
            java.lang.Object r8 = r3.remove(r2)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L7e java.lang.IllegalStateException -> L87 java.lang.IllegalArgumentException -> L90
            bwfn r8 = (defpackage.bwfn) r8     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L7e java.lang.IllegalStateException -> L87 java.lang.IllegalArgumentException -> L90
            r6.startTag(r5, r0)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L7e java.lang.IllegalStateException -> L87 java.lang.IllegalArgumentException -> L90
            java.lang.String r9 = "activity"
            android.content.ComponentName r10 = r8.a     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L7e java.lang.IllegalStateException -> L87 java.lang.IllegalArgumentException -> L90
            java.lang.String r10 = r10.flattenToString()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L7e java.lang.IllegalStateException -> L87 java.lang.IllegalArgumentException -> L90
            r6.attribute(r5, r9, r10)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L7e java.lang.IllegalStateException -> L87 java.lang.IllegalArgumentException -> L90
            java.lang.String r9 = "time"
            long r10 = r8.b     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L7e java.lang.IllegalStateException -> L87 java.lang.IllegalArgumentException -> L90
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L7e java.lang.IllegalStateException -> L87 java.lang.IllegalArgumentException -> L90
            r6.attribute(r5, r9, r10)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L7e java.lang.IllegalStateException -> L87 java.lang.IllegalArgumentException -> L90
            java.lang.String r9 = "weight"
            float r8 = r8.c     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L7e java.lang.IllegalStateException -> L87 java.lang.IllegalArgumentException -> L90
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L7e java.lang.IllegalStateException -> L87 java.lang.IllegalArgumentException -> L90
            r6.attribute(r5, r9, r8)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L7e java.lang.IllegalStateException -> L87 java.lang.IllegalArgumentException -> L90
            r6.endTag(r5, r0)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L7e java.lang.IllegalStateException -> L87 java.lang.IllegalArgumentException -> L90
            int r7 = r7 + 1
            goto L2f
        L61:
            r6.endTag(r5, r1)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L7e java.lang.IllegalStateException -> L87 java.lang.IllegalArgumentException -> L90
            r6.endDocument()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L7e java.lang.IllegalStateException -> L87 java.lang.IllegalArgumentException -> L90
            bwfp r0 = r12.a
            defpackage.bwfp.e(r0)
            if (r13 == 0) goto L9b
        L6e:
            r13.close()     // Catch: java.io.IOException -> L9b
            goto L9b
        L72:
            r0 = move-exception
            bwfp r1 = r12.a
            defpackage.bwfp.e(r1)
            if (r13 == 0) goto L7d
            r13.close()     // Catch: java.io.IOException -> L7d
        L7d:
            throw r0
        L7e:
            bwfp r0 = r12.a
            defpackage.bwfp.e(r0)
            if (r13 == 0) goto L9b
            goto L6e
        L87:
            bwfp r0 = r12.a
            defpackage.bwfp.e(r0)
            if (r13 == 0) goto L9b
            goto L6e
        L90:
            bwfp r0 = r12.a
            defpackage.bwfp.e(r0)
            if (r13 == 0) goto L9b
            goto L6e
        L99:
            int r13 = defpackage.bwfp.c
        L9b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwfo.doInBackground(java.lang.Object[]):java.lang.Object");
    }
}
