package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aldc  reason: default package */
/* loaded from: classes.dex */
public final class aldc extends aldd {
    protected final boolean a;
    protected FileInputStream b;
    private final Context f;
    private long g;
    private AssetFileDescriptor h;

    public aldc(Uri uri, Context context, akze akzeVar, boolean z) {
        super(uri, context.getContentResolver(), akzeVar);
        this.a = z;
        this.f = context;
    }

    private final boolean c(File[] fileArr, final String str) {
        if (fileArr == null) {
            return false;
        }
        return arey.v(Arrays.asList(fileArr), new ampt() { // from class: aldb
            @Override // defpackage.ampt
            public final boolean a(Object obj) {
                aldc aldcVar = aldc.this;
                String str2 = str;
                File file = (File) obj;
                if (file != null) {
                    try {
                        return str2.startsWith(file.getCanonicalPath());
                    } catch (IOException e) {
                        akze akzeVar = aldcVar.e;
                        String valueOf = String.valueOf(str2);
                        akzeVar.b(valueOf.length() != 0 ? "Cannot check source file path ".concat(valueOf) : new String("Cannot check source file path "), e);
                        return false;
                    }
                }
                return false;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
        if (c(r7.f.getExternalCacheDirs(), r0) != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[Catch: all -> 0x00ed, TryCatch #2 {, blocks: (B:4:0x0003, B:7:0x0009, B:42:0x00b2, B:44:0x00b6, B:46:0x00be, B:47:0x00c3, B:49:0x00c5, B:50:0x00ca, B:52:0x00cc, B:53:0x00d3, B:11:0x001d, B:13:0x0021, B:30:0x007c, B:32:0x0084, B:34:0x0089, B:36:0x009c, B:38:0x00a0, B:41:0x00aa, B:57:0x00dd, B:58:0x00e4, B:55:0x00d5, B:56:0x00dc, B:59:0x00e5, B:60:0x00ec, B:33:0x0087, B:16:0x0033, B:19:0x003e, B:22:0x0058, B:25:0x0066, B:29:0x0074, B:35:0x0090, B:10:0x0013), top: B:70:0x0003, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087 A[Catch: all -> 0x00ed, TryCatch #2 {, blocks: (B:4:0x0003, B:7:0x0009, B:42:0x00b2, B:44:0x00b6, B:46:0x00be, B:47:0x00c3, B:49:0x00c5, B:50:0x00ca, B:52:0x00cc, B:53:0x00d3, B:11:0x001d, B:13:0x0021, B:30:0x007c, B:32:0x0084, B:34:0x0089, B:36:0x009c, B:38:0x00a0, B:41:0x00aa, B:57:0x00dd, B:58:0x00e4, B:55:0x00d5, B:56:0x00dc, B:59:0x00e5, B:60:0x00ec, B:33:0x0087, B:16:0x0033, B:19:0x003e, B:22:0x0058, B:25:0x0066, B:29:0x0074, B:35:0x0090, B:10:0x0013), top: B:70:0x0003, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6 A[Catch: all -> 0x00ed, TryCatch #2 {, blocks: (B:4:0x0003, B:7:0x0009, B:42:0x00b2, B:44:0x00b6, B:46:0x00be, B:47:0x00c3, B:49:0x00c5, B:50:0x00ca, B:52:0x00cc, B:53:0x00d3, B:11:0x001d, B:13:0x0021, B:30:0x007c, B:32:0x0084, B:34:0x0089, B:36:0x009c, B:38:0x00a0, B:41:0x00aa, B:57:0x00dd, B:58:0x00e4, B:55:0x00d5, B:56:0x00dc, B:59:0x00e5, B:60:0x00ec, B:33:0x0087, B:16:0x0033, B:19:0x003e, B:22:0x0058, B:25:0x0066, B:29:0x0074, B:35:0x0090, B:10:0x0013), top: B:70:0x0003, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cc A[Catch: all -> 0x00ed, TryCatch #2 {, blocks: (B:4:0x0003, B:7:0x0009, B:42:0x00b2, B:44:0x00b6, B:46:0x00be, B:47:0x00c3, B:49:0x00c5, B:50:0x00ca, B:52:0x00cc, B:53:0x00d3, B:11:0x001d, B:13:0x0021, B:30:0x007c, B:32:0x0084, B:34:0x0089, B:36:0x009c, B:38:0x00a0, B:41:0x00aa, B:57:0x00dd, B:58:0x00e4, B:55:0x00d5, B:56:0x00dc, B:59:0x00e5, B:60:0x00ec, B:33:0x0087, B:16:0x0033, B:19:0x003e, B:22:0x0058, B:25:0x0066, B:29:0x0074, B:35:0x0090, B:10:0x0013), top: B:70:0x0003, inners: #0, #1, #3 }] */
    @Override // defpackage.aldj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aldh f(java.io.File r8) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aldc.f(java.io.File):aldh");
    }

    @Override // defpackage.aldj
    public final void j() {
        synchronized (this.d) {
            try {
                FileInputStream fileInputStream = this.b;
                if (fileInputStream != null) {
                    fileInputStream.close();
                    this.b = null;
                }
                AssetFileDescriptor assetFileDescriptor = this.h;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                    this.h = null;
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.aldj
    public final boolean l() {
        return true;
    }
}
