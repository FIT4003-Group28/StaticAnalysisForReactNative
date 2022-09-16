package defpackage;

import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aixt  reason: default package */
/* loaded from: classes.dex */
public final class aixt implements Callable {
    private final asv a;
    private final aixo b;
    private final Uri c;

    public aixt(asv asvVar, Uri uri, aixo aixoVar) {
        this.b = aixoVar;
        this.a = asvVar;
        this.c = uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        char c;
        cwl cwlVar;
        asy asyVar = new asy(this.c, 0L, -1L, null);
        awy awyVar = new awy();
        ayg aygVar = new ayg(this.a, awyVar);
        aygVar.h(asyVar);
        do {
        } while (aygVar.g(new byte[8192], 0, 8192) > 0);
        aygVar.j();
        ByteArrayOutputStream byteArrayOutputStream = awyVar.a;
        byte[] byteArray = byteArrayOutputStream == null ? null : byteArrayOutputStream.toByteArray();
        if (byteArray == null || byteArray.length == 0) {
            throw new IOException("Received empty segment");
        }
        pwu pwuVar = new pwu(byteArray);
        aixr aixrVar = new aixr();
        axjb axjbVar = new axjb(pwuVar.a);
        axiz axizVar = new axiz();
        axizVar.t(axjbVar, axjbVar.c(), aixu.b);
        long j = 1;
        long j2 = 0;
        while (axizVar.hasNext()) {
            cvs mo416next = axizVar.mo416next();
            String d = mo416next.d();
            switch (d.hashCode()) {
                case 3117308:
                    if (d.equals("emsg")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3346442:
                    if (d.equals("mdat")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3357433:
                    if (d.equals("moof")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3357449:
                    if (d.equals("moov")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                Iterator it = ((cwk) mo416next).i().iterator();
                while (true) {
                    if (it.hasNext()) {
                        cvs cvsVar = (cvs) it.next();
                        if (cvsVar instanceof cwl) {
                            cwlVar = (cwl) cvsVar;
                        }
                    } else {
                        cwlVar = null;
                    }
                }
                if (cwlVar != null) {
                    long j3 = cwlVar.c;
                    if (j3 > 0) {
                        j = j3;
                    }
                }
            } else if (c == 1) {
                List x = ((cxj) mo416next).x(cxn.class);
                if (!x.isEmpty()) {
                    List x2 = ((cxn) x.get(0)).x(cxm.class);
                    if (!x2.isEmpty()) {
                        j2 = ((cxm) x2.get(0)).a;
                    }
                }
            } else if (c == 2) {
                pwuVar.G(((int) mo416next.a()) + 8);
                pwuVar.p();
                String t = pwuVar.t();
                pwuVar.t();
                pwuVar.p();
                pwuVar.p();
                pwuVar.p();
                pwuVar.p();
                aeui aeuiVar = new aeui(zgh.h(t), aeui.e(pwuVar));
                if (aeuiVar.a.equals("http://youtube.com/streaming/metadata/segment/102015")) {
                    aixrVar.c = aeuiVar;
                } else if (aeuiVar.a.equals("http://youtube.com/streaming/metadata/streamer/092019")) {
                    aixrVar.d = aeuiVar;
                }
            } else if (c == 3 && this.b != null) {
                pwuVar.G(((int) mo416next.a()) + 8);
                this.b.a(aixrVar, pwuVar, TimeUnit.SECONDS.toMillis(j2 / j), ((int) mo416next.b()) - 8);
            }
        }
        axizVar.close();
        if (aixrVar.c != null) {
            if (aixrVar.b == null) {
                throw pjq.a("Missing segment time", null);
            }
            return new aixs(aixrVar);
        }
        throw pjq.a("Missing emsg", null);
    }
}
