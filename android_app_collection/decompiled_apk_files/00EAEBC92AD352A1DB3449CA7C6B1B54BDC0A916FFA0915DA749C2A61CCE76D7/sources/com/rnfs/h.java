package com.rnfs;

import android.os.AsyncTask;
import android.webkit.MimeTypeMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class h extends AsyncTask<f, int[], g> {

    /* renamed from: a  reason: collision with root package name */
    private f f9904a;

    /* renamed from: b  reason: collision with root package name */
    private g f9905b;

    /* renamed from: c  reason: collision with root package name */
    private AtomicBoolean f9906c = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                h.this.a(h.this.f9904a, h.this.f9905b);
                h.this.f9904a.f9898g.a(h.this.f9905b);
            } catch (Exception e2) {
                h.this.f9905b.f9902c = e2;
                h.this.f9904a.f9898g.a(h.this.f9905b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0141 A[Catch: all -> 0x01de, TryCatch #7 {all -> 0x01de, blocks: (B:21:0x00f7, B:28:0x0130, B:30:0x0141, B:32:0x017c, B:34:0x0185, B:27:0x011f), top: B:125:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.rnfs.f r29, com.rnfs.g r30) {
        /*
            Method dump skipped, instructions count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rnfs.h.a(com.rnfs.f, com.rnfs.g):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public g doInBackground(f... fVarArr) {
        this.f9904a = fVarArr[0];
        this.f9905b = new g();
        new Thread(new a()).start();
        return this.f9905b;
    }

    protected String a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase()) : null;
        return mimeTypeFromExtension == null ? "*/*" : mimeTypeFromExtension;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        this.f9906c.set(true);
    }
}
