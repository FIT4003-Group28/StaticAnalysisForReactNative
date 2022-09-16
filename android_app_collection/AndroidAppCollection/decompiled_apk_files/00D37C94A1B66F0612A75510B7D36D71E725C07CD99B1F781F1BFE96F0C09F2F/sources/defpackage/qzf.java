package defpackage;

import android.os.Parcel;
import java.util.Map;
/* compiled from: PG */
/* renamed from: qzf  reason: default package */
/* loaded from: classes4.dex */
final class qzf implements Runnable {
    final /* synthetic */ Map a;
    final /* synthetic */ qyv b;
    final /* synthetic */ qzh c;

    public qzf(qzh qzhVar, Map map, qyv qyvVar) {
        this.c = qzhVar;
        this.a = map;
        this.b = qyvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        try {
            if (this.c.c != null) {
                qzk qzkVar = this.c.c;
                Map map = this.a;
                Parcel pv = qzkVar.pv();
                pv.writeMap(map);
                Parcel pw = qzkVar.pw(2, pv);
                bArr = pw.createByteArray();
                pw.recycle();
            } else {
                bArr = null;
            }
            if (bArr == null) {
                this.c.a = qzv.h("Received null");
                bArr = this.c.a;
            }
        } catch (Exception e) {
            qzh qzhVar = this.c;
            String valueOf = String.valueOf(e.toString());
            qzhVar.a = qzv.h(valueOf.length() != 0 ? "Snapshot failed: ".concat(valueOf) : new String("Snapshot failed: "));
            bArr = this.c.a;
            this.c.b();
        }
        qyv qyvVar = this.b;
        if (!qyvVar.b) {
            qyvVar.b = true;
            qyvVar.a.offer(bArr);
            return;
        }
        throw new RuntimeException("BlockingChannel can be written only once.");
    }
}
