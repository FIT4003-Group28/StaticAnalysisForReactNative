package defpackage;

import android.app.Application;
import android.widget.Toast;
/* compiled from: PG */
/* renamed from: aeqw  reason: default package */
/* loaded from: classes2.dex */
final class aeqw implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ dwjf b;
    final /* synthetic */ aeuh c;
    final /* synthetic */ aeqy d;

    public aeqw(aeqy aeqyVar, boolean z, dwjf dwjfVar, aeuh aeuhVar) {
        this.d = aeqyVar;
        this.a = z;
        this.b = dwjfVar;
        this.c = aeuhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        if (this.a) {
            Application application = this.d.a;
            dwjf dwjfVar = this.b;
            String valueOf = String.valueOf(dwjfVar == null ? "null response" : Integer.valueOf(dwjfVar.b.size()));
            dwjf dwjfVar2 = this.b;
            if (dwjfVar2 == null || (dwjfVar2.b.get(0).a & 1) == 0) {
                str = "";
            } else {
                dvyw dvywVar = this.b.b.get(0).b;
                if (dvywVar == null) {
                    dvywVar = dvyw.bv;
                }
                str = dvywVar.i;
            }
            String valueOf2 = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
            sb.append("STP response: result count = ");
            sb.append(valueOf);
            sb.append(", Top Place: ");
            sb.append(str);
            sb.append(", StateType = ");
            sb.append(valueOf2);
            Toast.makeText(application, sb.toString(), 0).show();
            return;
        }
        Toast.makeText(this.d.a, "new snap-to-place request sent.", 0).show();
    }
}
