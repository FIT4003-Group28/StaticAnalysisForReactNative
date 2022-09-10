package defpackage;

import android.os.AsyncTask;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aka  reason: default package */
/* loaded from: classes2.dex */
public final class aka extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ akh a;

    public aka(akh akhVar) {
        this.a = akhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004b A[LOOP:0: B:3:0x0002->B:28:0x004b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0058 A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ java.lang.Void doInBackground(java.lang.Void[] r5) {
        /*
            r4 = this;
            java.lang.Void[] r5 = (java.lang.Void[]) r5
        L2:
            akh r5 = r4.a
            akf r0 = r5.f
            r1 = 0
            if (r0 == 0) goto L30
            java.lang.Object r2 = r0.b
            monitor-enter(r2)
            android.app.job.JobParameters r5 = r0.c     // Catch: java.lang.Throwable -> L2d
            if (r5 != 0) goto L13
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
        L11:
            r2 = r1
            goto L49
        L13:
            android.app.job.JobWorkItem r5 = r5.dequeueWork()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L11
            android.content.Intent r2 = r5.getIntent()
            akh r3 = r0.a
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r2.setExtrasClassLoader(r3)
            ake r2 = new ake
            r2.<init>(r0, r5)
            goto L49
        L2d:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r5
        L30:
            java.util.ArrayList<akc> r0 = r5.d
            monitor-enter(r0)
            java.util.ArrayList<akc> r2 = r5.d     // Catch: java.lang.Throwable -> L59
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L59
            if (r2 <= 0) goto L47
            java.util.ArrayList<akc> r5 = r5.d     // Catch: java.lang.Throwable -> L59
            r2 = 0
            java.lang.Object r5 = r5.remove(r2)     // Catch: java.lang.Throwable -> L59
            r2 = r5
            akd r2 = (defpackage.akd) r2     // Catch: java.lang.Throwable -> L59
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            goto L49
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            goto L11
        L49:
            if (r2 == 0) goto L58
            akh r5 = r4.a
            android.content.Intent r0 = r2.a()
            r5.a(r0)
            r2.b()
            goto L2
        L58:
            return r1
        L59:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            goto L5d
        L5c:
            throw r5
        L5d:
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aka.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onCancelled(Void r1) {
        this.a.c();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Void r1) {
        this.a.c();
    }
}
