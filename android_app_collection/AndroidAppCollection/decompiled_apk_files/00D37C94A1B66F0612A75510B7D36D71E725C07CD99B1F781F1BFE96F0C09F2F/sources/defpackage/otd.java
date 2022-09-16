package defpackage;

import android.os.Handler;
import android.util.Pair;
import com.google.android.exoplayer.MediaFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: otd  reason: default package */
/* loaded from: classes4.dex */
public final class otd implements otb {
    public final ote a;
    public final MediaFormat[][] c;
    public int f;
    private final Handler g;
    private final int[] h;
    public boolean d = false;
    public int e = 1;
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();

    public otd(int i, int i2, int i3) {
        this.c = new MediaFormat[i];
        int[] iArr = new int[i];
        this.h = iArr;
        otc otcVar = new otc(this);
        this.g = otcVar;
        this.a = new ote(otcVar, this.d, iArr, i2, i3);
    }

    @Override // defpackage.otb
    public final int a() {
        throw null;
    }

    @Override // defpackage.otb
    public final int b(int i) {
        return this.h[i];
    }

    @Override // defpackage.otb
    public final long c() {
        ote oteVar = this.a;
        return oteVar.c.get() > 0 ? oteVar.e : oteVar.g / 1000;
    }

    @Override // defpackage.otb
    public final long d() {
        ote oteVar = this.a;
        if (oteVar.f == -1) {
            return -1L;
        }
        return oteVar.f / 1000;
    }

    @Override // defpackage.otb
    public final void e(ota otaVar) {
        this.b.add(otaVar);
    }

    @Override // defpackage.otb
    public final void f(osy osyVar, int i, Object obj) {
        this.a.a(osyVar, i, obj);
    }

    @Override // defpackage.otb
    public final void g(ouo... ouoVarArr) {
        Arrays.fill(this.c, (Object) null);
        this.a.a.obtainMessage(1, ouoVarArr).sendToTarget();
    }

    @Override // defpackage.otb
    public final void h() {
        this.a.b();
        this.g.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.otb
    public final void i(ota otaVar) {
        this.b.remove(otaVar);
    }

    @Override // defpackage.otb
    public final void j(long j) {
        ote oteVar = this.a;
        oteVar.e = j;
        oteVar.c.incrementAndGet();
        oteVar.a.obtainMessage(6, pcx.e(j), pcx.b(j)).sendToTarget();
    }

    @Override // defpackage.otb
    public final void k(osy osyVar, int i, Object obj) {
        ote oteVar = this.a;
        oteVar.d++;
        oteVar.a.obtainMessage(9, i, 0, Pair.create(osyVar, obj)).sendToTarget();
    }

    @Override // defpackage.otb
    public final void l(boolean z) {
        if (this.d != z) {
            this.d = z;
            this.f++;
            this.a.a.obtainMessage(3, z ? 1 : 0, 0).sendToTarget();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((ota) it.next()).rN(z, this.e);
            }
        }
    }

    @Override // defpackage.otb
    public final void m(int i, int i2) {
        int[] iArr = this.h;
        if (iArr[i] != i2) {
            iArr[i] = i2;
            this.a.a.obtainMessage(8, i, i2).sendToTarget();
        }
    }

    @Override // defpackage.otb
    public final void n() {
        this.a.a.sendEmptyMessage(4);
    }

    @Override // defpackage.otb
    public final boolean o() {
        throw null;
    }
}
