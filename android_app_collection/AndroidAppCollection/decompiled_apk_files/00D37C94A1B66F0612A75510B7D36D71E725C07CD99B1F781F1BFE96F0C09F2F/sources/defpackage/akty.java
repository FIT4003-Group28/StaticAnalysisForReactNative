package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.Choreographer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: akty  reason: default package */
/* loaded from: classes.dex */
public final class akty extends ne implements Choreographer.FrameCallback, aktt {
    public final boolean a;
    public acti b;
    public boolean c;
    private final snc d;
    private final Choreographer e;
    private final aktv f;
    private boolean g;

    public akty(Context context, acrr acrrVar, akwp akwpVar, aacz aaczVar, aktx aktxVar, ExecutorService executorService, snc sncVar) {
        apyy b = aaczVar.b();
        float f = 0.0f;
        if (b != null && (b.b & 4096) != 0) {
            aunf aunfVar = b.l;
            f = (aunfVar == null ? aunf.a : aunfVar).g;
        }
        this.a = akwpVar.b(f, akvj.SCROLL_TRACKER_SAMPLING);
        this.d = sncVar;
        this.e = Choreographer.getInstance();
        this.f = new aktv(context, aktxVar, acrrVar, executorService);
        this.g = false;
        this.c = false;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long j2;
        if (this.g) {
            this.e.postFrameCallback(this);
            aktv aktvVar = this.f;
            long j3 = 0;
            if (aktvVar.h == 0) {
                aktvVar.h = j;
                aktvVar.g = j;
                return;
            }
            long millis = TimeUnit.NANOSECONDS.toMillis(j - aktvVar.g);
            if (millis > 17) {
                long millis2 = TimeUnit.NANOSECONDS.toMillis(j);
                double d = millis;
                Double.isNaN(d);
                int i = (int) (d / 16.67d);
                int i2 = 0;
                int i3 = 0;
                while (i3 < 6 && aktv.a[i3] <= i) {
                    long[] jArr = aktvVar.d;
                    long j4 = jArr[i3];
                    if (j4 != j3) {
                        long[] jArr2 = aktvVar.e;
                        jArr2[i3] = jArr2[i3] + (millis2 - j4);
                        int[] iArr = aktvVar.f;
                        iArr[i3] = iArr[i3] + 1;
                    }
                    jArr[i3] = millis2;
                    int[] iArr2 = aktvVar.c;
                    iArr2[i3] = iArr2[i3] + 1;
                    i3++;
                    j3 = 0;
                }
                long j5 = millis2 - millis;
                amuk a = aktvVar.p.a();
                int size = a.size();
                int i4 = 0;
                while (i4 < size) {
                    aqes aqesVar = (aqes) a.get(i4);
                    aqer aqerVar = (aqer) aqesVar.e.get(i2);
                    amuk amukVar = a;
                    long j6 = aqerVar.c;
                    if (j5 > j6 || j6 > millis2) {
                        j2 = j5;
                    } else {
                        amuf amufVar = aktvVar.n;
                        aopa mo52toBuilder = aqesVar.mo52toBuilder();
                        aopa mo52toBuilder2 = aqerVar.mo52toBuilder();
                        mo52toBuilder2.copyOnWrite();
                        aqer aqerVar2 = (aqer) mo52toBuilder2.instance;
                        j2 = j5;
                        aqerVar2.b |= 8;
                        aqerVar2.f = (int) millis;
                        mo52toBuilder2.copyOnWrite();
                        aqer aqerVar3 = (aqer) mo52toBuilder2.instance;
                        aqerVar3.b |= 4;
                        aqerVar3.e = i;
                        mo52toBuilder.copyOnWrite();
                        aqes aqesVar2 = (aqes) mo52toBuilder.instance;
                        aqer aqerVar4 = (aqer) mo52toBuilder2.mo39build();
                        aqerVar4.getClass();
                        aqesVar2.a();
                        aqesVar2.e.set(0, aqerVar4);
                        amufVar.h((aqes) mo52toBuilder.mo39build());
                    }
                    i4++;
                    a = amukVar;
                    j5 = j2;
                    i2 = 0;
                }
            }
            aktvVar.g = j;
        }
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        aktv aktvVar = this.f;
        if (i != 0) {
            aktvVar.j = true;
            aktvVar.m = auoo.SCROLL_ORIENTATION_HORIZONTAL;
        }
        if (i2 != 0) {
            aktvVar.k = true;
            aktvVar.m = auoo.SCROLL_ORIENTATION_VERTICAL;
        }
        aktvVar.i += i2 + i;
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i != 1 || this.g) {
                return;
            }
            this.e.postFrameCallback(this);
            this.g = true;
            aktv aktvVar = this.f;
            aktvVar.g = 0L;
            aktvVar.h = 0L;
            aktvVar.i = 0;
            aktvVar.c = new int[6];
            aktvVar.d = new long[6];
            aktvVar.e = new long[6];
            aktvVar.f = new int[6];
            aktvVar.j = false;
            aktvVar.k = false;
            aktvVar.l = auon.SCROLL_DIRECTION_UNKNOWN;
            aktvVar.m = auoo.SCROLL_ORIENTATION_UNKNOWN;
            aktvVar.n = amuk.f();
            aktvVar.p.b();
        } else if (!this.g) {
        } else {
            aktv aktvVar2 = this.f;
            long c = this.d.c();
            acti actiVar = this.b;
            String k = actiVar != null ? actiVar.k() : "";
            aktvVar2.p.c();
            long millis = TimeUnit.NANOSECONDS.toMillis(aktvVar2.g - aktvVar2.h);
            if ((!aktvVar2.j || !aktvVar2.k) && millis > 0) {
                aktw aktwVar = new aktw(aktvVar2.c, aktvVar2.e, aktvVar2.f, millis);
                int i2 = aktvVar2.i;
                if (i2 < 0) {
                    aktvVar2.l = auon.SCROLL_DIRECTION_BACKWARDS;
                } else if (i2 > 0) {
                    aktvVar2.l = auon.SCROLL_DIRECTION_FORWARD;
                } else {
                    aktvVar2.l = auon.SCROLL_DIRECTION_UNKNOWN;
                }
                if (!k.isEmpty()) {
                    aktvVar2.q.execute(new aktu(aktvVar2, k, aktwVar, Math.abs(aktvVar2.i), aktvVar2.m, aktvVar2.l, aktvVar2.n.g(), c));
                }
            }
            this.g = false;
        }
    }
}
