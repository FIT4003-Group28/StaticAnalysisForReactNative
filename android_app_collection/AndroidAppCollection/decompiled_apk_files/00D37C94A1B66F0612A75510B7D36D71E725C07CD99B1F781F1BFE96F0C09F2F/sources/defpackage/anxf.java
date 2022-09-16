package defpackage;

import android.os.Parcel;
import android.util.Log;
import com.google.firebase.appindexing.internal.CallStatus;
import com.google.firebase.appindexing.internal.MutateRequest;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anxf  reason: default package */
/* loaded from: classes.dex */
public final class anxf extends qvy {
    final /* synthetic */ anxg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anxf(anxg anxgVar) {
        super(null, false, 9002);
        this.a = anxgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qvy
    public final /* bridge */ /* synthetic */ void a(qsi qsiVar, rvh rvhVar) {
        anxj anxjVar = (anxj) ((anxc) qsiVar).D();
        anxe anxeVar = new anxe(this, rvhVar);
        MutateRequest mutateRequest = this.a.a;
        Parcel pv = anxjVar.pv();
        dve.i(pv, anxeVar);
        dve.g(pv, mutateRequest);
        Parcel pw = anxjVar.pw(8, pv);
        CallStatus callStatus = (CallStatus) dve.a(pw, CallStatus.CREATOR);
        pw.recycle();
        int i = callStatus == null ? 2 : callStatus.a;
        boolean z = false;
        boolean z2 = true;
        anxg anxgVar = null;
        if (i != 3) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("API call failed. Status code: ");
                sb.append(i);
                String sb2 = sb.toString();
                if (Log.isLoggable("FirebaseAppIndex", 6) || Log.isLoggable("FirebaseAppIndex", 6)) {
                    Log.e("FirebaseAppIndex", sb2);
                }
                if (rvhVar.d(null)) {
                    this.a.b.a(new anwu("Indexing error."));
                }
            }
            synchronized (this.a.c.b) {
                if (((anxg) this.a.c.b.poll()) != this.a) {
                    z2 = false;
                }
                qnm.j(z2);
                anxgVar = (anxg) this.a.c.b.peek();
                this.a.c.c = 0;
            }
        } else if (rvhVar.d(null)) {
            synchronized (this.a.c.b) {
                anxh anxhVar = this.a.c;
                if (anxhVar.c == 0) {
                    anxg anxgVar2 = (anxg) anxhVar.b.peek();
                    if (anxgVar2 == this.a) {
                        z = true;
                    }
                    qnm.j(z);
                    anxgVar = anxgVar2;
                } else {
                    anxhVar.c = 2;
                }
            }
        }
        if (anxgVar != null) {
            anxgVar.a();
        }
    }
}
