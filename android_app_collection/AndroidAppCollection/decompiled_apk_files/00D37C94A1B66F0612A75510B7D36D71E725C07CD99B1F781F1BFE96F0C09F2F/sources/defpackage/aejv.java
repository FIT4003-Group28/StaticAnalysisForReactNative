package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: aejv  reason: default package */
/* loaded from: classes.dex */
public final class aejv {
    public final aeuo a;
    private final boolean b;
    private final boolean c;
    private final Handler d = new Handler(Looper.getMainLooper());

    public aejv(aeuo aeuoVar, boolean z, boolean z2) {
        this.a = aeuoVar;
        this.b = z;
        this.c = z2;
    }

    private final void b(final String str, final afip afipVar) {
        this.d.post(new Runnable() { // from class: aejr
            @Override // java.lang.Runnable
            public final void run() {
                aejv aejvVar = aejv.this;
                aejvVar.a.i(str, afipVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(aejp aejpVar) {
        if (this.b) {
            aepk aepkVar = aejpVar.i;
            long j = aepkVar.b;
            if (j > 0) {
                int i = aejpVar.a;
                int i2 = aepkVar.c;
                StringBuilder sb = new StringBuilder(54);
                sb.append("rn.");
                sb.append(i);
                sb.append(";bw.");
                sb.append(j);
                sb.append(";src.");
                sb.append(i2);
                b("bwinfo", new aest(sb.toString()));
            }
        }
        if (this.b) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("rn.");
            sb2.append(aejpVar.a);
            sb2.append(";rt.");
            sb2.append(aejpVar.j);
            long j2 = aejpVar.i.b;
            if (j2 > 0) {
                long j3 = aejpVar.e;
                if (j3 > 0) {
                    sb2.append(";pt.");
                    sb2.append((j3 * 8000) / j2);
                    sb2.append(";ps.");
                    sb2.append(aejpVar.e);
                }
            }
            if (aejpVar.d > 0) {
                sb2.append(";pmd.");
                sb2.append(aejpVar.d);
            }
            if (aejpVar.k > 0) {
                sb2.append(";ct.");
                sb2.append(aejpVar.k);
            }
            if (aejpVar.l != null) {
                sb2.append(";ec.");
                sb2.append(aejpVar.l);
            }
            b("rqs", new aejs(sb2.toString(), aejpVar.b + aejpVar.j));
        }
        if (this.c) {
            int i3 = 0;
            while (i3 < aejpVar.c.length()) {
                int i4 = aejpVar.a;
                StringBuilder sb3 = aejpVar.c;
                int i5 = i3 + 260;
                String substring = sb3.substring(i3, Math.min(i5, sb3.length()));
                StringBuilder sb4 = new StringBuilder(String.valueOf(substring).length() + 33);
                sb4.append("rn.");
                sb4.append(i4);
                sb4.append(";idx.");
                sb4.append(i3 / 260);
                sb4.append(";d.");
                sb4.append(substring);
                b("rqd", new aest(sb4.toString()));
                i3 = i5;
            }
        }
    }
}
