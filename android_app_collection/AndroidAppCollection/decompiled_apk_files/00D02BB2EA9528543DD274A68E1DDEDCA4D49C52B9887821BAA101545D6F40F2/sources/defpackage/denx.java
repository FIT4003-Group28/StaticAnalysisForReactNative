package defpackage;

import com.google.firebase.appindexing.internal.CallStatus;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: denx  reason: default package */
/* loaded from: classes6.dex */
public final class denx extends cntd<dens, Void> {
    final /* synthetic */ deny a;

    public denx(deny denyVar) {
        this.a = denyVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cntd
    public final /* bridge */ /* synthetic */ void a(dens densVar, cpct<Void> cpctVar) {
        CallStatus e = ((deoh) densVar.L()).e(new denw(this, cpctVar), this.a.a);
        int i = e == null ? 2 : e.a;
        boolean z = false;
        boolean z2 = true;
        deny denyVar = null;
        if (i != 3) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("API call failed. Status code: ");
                sb.append(i);
                sb.toString();
                if (cpctVar.b(null)) {
                    this.a.b.c(new delr("Indexing error."));
                }
            }
            synchronized (this.a.c.b) {
                if (this.a.c.b.poll() != this.a) {
                    z2 = false;
                }
                cnwc.b(z2);
                denyVar = this.a.c.b.peek();
                this.a.c.c = 0;
            }
        } else if (cpctVar.b(null)) {
            synchronized (this.a.c.b) {
                denz denzVar = this.a.c;
                if (denzVar.c == 0) {
                    deny peek = denzVar.b.peek();
                    if (peek == this.a) {
                        z = true;
                    }
                    cnwc.b(z);
                    denyVar = peek;
                } else {
                    denzVar.c = 2;
                }
            }
        }
        if (denyVar != null) {
            denyVar.a();
        }
    }
}
