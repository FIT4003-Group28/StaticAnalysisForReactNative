package defpackage;

import android.net.Uri;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ajdn  reason: default package */
/* loaded from: classes.dex */
public final class ajdn implements ajed {
    private final qys c;
    public int b = 1;
    public ampq a = amon.a;
    private final ajea d = new ajdm(this);

    public ajdn(qys qysVar) {
        this.c = qysVar;
    }

    public static final apih k(String str, String str2) {
        aopa createBuilder = apih.a.createBuilder();
        createBuilder.copyOnWrite();
        apih apihVar = (apih) createBuilder.instance;
        str.getClass();
        apihVar.b |= 1;
        apihVar.e = str;
        if (!amps.e(str2)) {
            createBuilder.copyOnWrite();
            apih apihVar2 = (apih) createBuilder.instance;
            str2.getClass();
            apihVar2.c = 3;
            apihVar2.d = str2;
        }
        return (apih) createBuilder.mo39build();
    }

    private final synchronized void l(final atzm atzmVar) {
        if (atzmVar == null) {
            afus.b(2, 10, "HeartbeatAttestationConfig requires attestation, but PlayerAttestationRenderer is null.");
            return;
        }
        String str = atzmVar.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1);
        sb.append('?');
        sb.append(str);
        Uri parse = Uri.parse(sb.toString());
        String queryParameter = parse.getQueryParameter("c5a");
        this.b = 2;
        if (queryParameter == null) {
            this.a = ampq.j(k(atzmVar.c, ""));
            this.b = 3;
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("challenge", atzmVar.c);
        qyu qyuVar = new qyu() { // from class: ajdl
            @Override // defpackage.qyu
            public final void a(String str2) {
                ajdn ajdnVar = ajdn.this;
                atzm atzmVar2 = atzmVar;
                synchronized (ajdnVar) {
                    if (ajdnVar.b == 2) {
                        ajdnVar.a = ampq.j(ajdn.k(atzmVar2.c, str2));
                        ajdnVar.b = 3;
                    }
                }
            }
        };
        String queryParameter2 = parse.getQueryParameter("c5b");
        qys qysVar = this.c;
        if (true == amps.e(queryParameter2)) {
            queryParameter2 = "yt_player";
        }
        qysVar.a(queryParameter2, hashMap, qyuVar);
    }

    @Override // defpackage.ajed
    public final int a(ajec ajecVar) {
        atzm atzmVar = ajecVar.d;
        arzs arzsVar = ajecVar.c;
        if (arzsVar == null || (arzsVar.b & 1) == 0 || !arzsVar.c) {
            return 5;
        }
        l(atzmVar);
        return 5;
    }

    @Override // defpackage.ajed
    public final aikd c(asaa asaaVar) {
        return null;
    }

    @Override // defpackage.ajed
    public final synchronized aikd d(aart aartVar) {
        if (this.b == 4) {
            this.b = 3;
        }
        return null;
    }

    @Override // defpackage.ajed
    public final ajea e() {
        return this.d;
    }

    @Override // defpackage.ajed
    public final void f(ahhw ahhwVar) {
    }

    @Override // defpackage.ajed
    public final void g(ahhx ahhxVar) {
    }

    @Override // defpackage.ajed
    public final void h(ahia ahiaVar) {
    }

    @Override // defpackage.ajed
    public final void i() {
    }

    @Override // defpackage.ajed
    public final boolean j(ajdy ajdyVar, ajec ajecVar) {
        if (ajecVar == null) {
            return (ajdyVar == null || ajdyVar.g == null) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r3 != 3) goto L10;
     */
    @Override // defpackage.ajed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized int b(defpackage.ajec r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            arzs r0 = r5.c     // Catch: java.lang.Throwable -> L34
            r1 = 5
            r2 = 1
            if (r0 == 0) goto L11
            int r3 = r0.b     // Catch: java.lang.Throwable -> L34
            r3 = r3 & r2
            if (r3 == 0) goto L11
            boolean r0 = r0.c     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L2a
            goto L1c
        L11:
            int r0 = r4.b     // Catch: java.lang.Throwable -> L34
            int r3 = r0 + (-1)
            if (r0 == 0) goto L32
            if (r3 == 0) goto L2a
            r0 = 3
            if (r3 == r0) goto L2a
        L1c:
            int r0 = r4.b     // Catch: java.lang.Throwable -> L34
            if (r0 == r2) goto L23
            r2 = 4
            if (r0 != r2) goto L28
        L23:
            atzm r5 = r5.d     // Catch: java.lang.Throwable -> L34
            r4.l(r5)     // Catch: java.lang.Throwable -> L34
        L28:
            monitor-exit(r4)
            return r1
        L2a:
            r4.b = r2     // Catch: java.lang.Throwable -> L34
            amon r5 = defpackage.amon.a     // Catch: java.lang.Throwable -> L34
            r4.a = r5     // Catch: java.lang.Throwable -> L34
            monitor-exit(r4)
            return r1
        L32:
            r5 = 0
            throw r5     // Catch: java.lang.Throwable -> L34
        L34:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajdn.b(ajec):int");
    }
}
