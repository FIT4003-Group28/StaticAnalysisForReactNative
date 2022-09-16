package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: afhy  reason: default package */
/* loaded from: classes.dex */
public final class afhy implements afia {
    private final Context a;
    private rtn b;
    private qrq c;
    private final AtomicBoolean d = new AtomicBoolean();

    public afhy(Context context) {
        this.a = context;
    }

    @Override // defpackage.afia
    public final void a() {
        if (!this.d.getAndSet(true)) {
            this.b = new rtr(this.a);
            this.c = qrq.a;
        }
    }

    @Override // defpackage.afia
    public final afhz b(final byte[] bArr, aujo aujoVar) {
        quq quqVar;
        a();
        rtn rtnVar = this.b;
        afms.a(this.c);
        afms.a(rtnVar);
        int i = aujoVar.g;
        qnm.n(rtnVar, "Requested API must not be null.");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(rtnVar);
        arrayList.addAll(Arrays.asList(new qsy[0]));
        synchronized (quq.c) {
            qnm.n(quq.d, "Must guarantee manager is non-null before using getInstance");
            quqVar = quq.d;
        }
        qtq qtqVar = new qtq(arrayList);
        Handler handler = quqVar.o;
        handler.sendMessage(handler.obtainMessage(2, qtqVar));
        rwd.e(qtqVar.b.a.d(qro.a), i, TimeUnit.MILLISECONDS);
        int i2 = aujoVar.f;
        qvx b = qvy.b();
        b.b = new Feature[]{rtm.a};
        b.a = new qvo() { // from class: rtp
            @Override // defpackage.qvo
            public final void a(Object obj, Object obj2) {
                byte[] bArr2 = bArr;
                qig qigVar = new qig((rvh) obj2, 7, (float[]) null);
                rto rtoVar = (rto) ((rts) obj).D();
                Parcel pv = rtoVar.pv();
                dve.i(pv, qigVar);
                pv.writeInt(1);
                pv.writeByteArray(bArr2);
                rtoVar.px(3, pv);
            }
        };
        return (afhz) anii.h(tjk.e(((qst) rtnVar).s(b.a())), adrz.j, anjk.a).get(i2, TimeUnit.MILLISECONDS);
    }
}
