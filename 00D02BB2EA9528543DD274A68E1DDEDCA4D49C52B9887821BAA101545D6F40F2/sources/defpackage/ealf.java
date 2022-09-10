package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ealf  reason: default package */
/* loaded from: classes6.dex */
public final class ealf implements Runnable {
    final /* synthetic */ eamc a;

    public ealf(eamc eamcVar) {
        this.a = eamcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ealz ealzVar = this.a.q;
        if (ealzVar != null) {
            try {
                ealzVar.i();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.a.p;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.a.p = null;
        }
    }
}
