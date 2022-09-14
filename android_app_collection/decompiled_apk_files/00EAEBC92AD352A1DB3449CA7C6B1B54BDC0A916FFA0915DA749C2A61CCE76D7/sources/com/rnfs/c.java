package com.rnfs;

import android.os.AsyncTask;
import android.os.Build;
import com.rnfs.a;
import java.net.HttpURLConnection;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class c extends AsyncTask<com.rnfs.a, long[], b> {

    /* renamed from: a  reason: collision with root package name */
    private com.rnfs.a f9887a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicBoolean f9888b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    b f9889c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c.this.a(c.this.f9887a, c.this.f9889c);
                c.this.f9887a.f9883h.a(c.this.f9889c);
            } catch (Exception e2) {
                c cVar = c.this;
                cVar.f9889c.f9886c = e2;
                cVar.f9887a.f9883h.a(c.this.f9889c);
            }
        }
    }

    private long a(HttpURLConnection httpURLConnection) {
        return Build.VERSION.SDK_INT >= 24 ? httpURLConnection.getContentLengthLong() : httpURLConnection.getContentLength();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.rnfs.a r30, com.rnfs.b r31) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rnfs.c.a(com.rnfs.a, com.rnfs.b):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public b doInBackground(com.rnfs.a... aVarArr) {
        this.f9887a = aVarArr[0];
        this.f9889c = new b();
        new Thread(new a()).start();
        return this.f9889c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        this.f9888b.set(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onProgressUpdate(long[]... jArr) {
        super.onProgressUpdate(jArr);
        a.b bVar = this.f9887a.j;
        if (bVar != null) {
            bVar.a(jArr[0][0], jArr[0][1]);
        }
    }
}
