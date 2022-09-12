package defpackage;

import android.os.RemoteException;
import com.google.android.gms.googlehelp.GoogleHelp;
/* compiled from: PG */
/* renamed from: coeb  reason: default package */
/* loaded from: classes5.dex */
final class coeb {
    final /* synthetic */ coeh a;
    final /* synthetic */ codq b;
    final /* synthetic */ coec c;
    final /* synthetic */ coen d;

    public coeb(coec coecVar, coen coenVar, coeh coehVar, codq codqVar) {
        this.c = coecVar;
        this.d = coenVar;
        this.a = coehVar;
        this.b = codqVar;
    }

    public final void a(GoogleHelp googleHelp) {
        try {
            coen coenVar = this.d;
            coec coecVar = this.c;
            coeh coehVar = this.a;
            coenVar.f(googleHelp, new coed(coecVar.a, coecVar.k, coehVar, this.b));
        } catch (RemoteException unused) {
            this.c.q(coei.a);
        }
    }
}
