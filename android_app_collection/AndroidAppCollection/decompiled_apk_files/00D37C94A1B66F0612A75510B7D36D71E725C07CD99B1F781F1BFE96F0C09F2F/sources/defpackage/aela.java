package defpackage;

import java.io.IOException;
import java.util.List;
/* compiled from: PG */
/* renamed from: aela  reason: default package */
/* loaded from: classes.dex */
public final class aela {
    private final aaqk a;
    private final aenb b;
    private final aenv c;

    public aela(aaqk aaqkVar, aenb aenbVar, aenv aenvVar) {
        afms.a(aaqkVar);
        this.a = aaqkVar;
        this.b = aenbVar;
        this.c = aenvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ankt a(aekp aekpVar) {
        try {
            return anlz.q((arzc) aaqp.c(this.b.c(aekpVar.a.I(), aekpVar.b.I(), aekpVar.c.I(), aekpVar.d), arzc.a));
        } catch (aena e) {
            this.c.c("response.decrypt", e);
            return anlz.p(e);
        } catch (IllegalArgumentException e2) {
            this.c.c("response.parse", e2);
            return anlz.p(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ankt b(arzc arzcVar) {
        int z = akpq.z(arzcVar.b);
        if (z == 0 || z != 2) {
            int z2 = akpq.z(arzcVar.b);
            if (z2 == 0) {
                z2 = 1;
            }
            StringBuilder sb = new StringBuilder(48);
            sb.append("Non-OK Onesie proxy status received: ");
            sb.append(z2 - 1);
            IOException iOException = new IOException(sb.toString());
            this.c.c("response.badproxystatus", iOException);
            return anlz.p(iOException);
        }
        int i = arzcVar.c;
        if (i != 200) {
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append("Non-200 Apiary response: ");
            sb2.append(i);
            IOException iOException2 = new IOException(sb2.toString());
            this.c.c("response.badstatus", iOException2);
            return anlz.p(iOException2);
        }
        aaqk aaqkVar = this.a;
        byte[] I = arzcVar.e.I();
        amuf h = amuk.h(arzcVar.d.size());
        for (arza arzaVar : arzcVar.d) {
            h.h(new ceu(arzaVar.c, arzaVar.d));
        }
        cfb qy = aaqkVar.qy(new cew(200, I, false, 0L, (List) h.g()));
        Object obj = qy.a;
        if (obj != null) {
            return anlz.q((aoqu) obj);
        }
        afms.a(qy.c);
        return anlz.p(qy.c);
    }
}
