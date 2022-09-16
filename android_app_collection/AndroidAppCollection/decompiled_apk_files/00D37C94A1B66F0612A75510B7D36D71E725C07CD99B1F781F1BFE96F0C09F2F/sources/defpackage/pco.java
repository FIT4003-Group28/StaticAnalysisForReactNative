package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: pco  reason: default package */
/* loaded from: classes4.dex */
public class pco implements pbv {
    public final pcb a;
    public final pca b;
    public final int c;
    public volatile String d;
    public int e;
    public pbz f;
    public pcc g;
    public long h;
    public int i;
    public long j;
    public pcm k;
    public volatile Object l;
    public volatile long m;
    public volatile long n;

    public pco(String str, pca pcaVar, pcb pcbVar, int i) {
        this.a = pcbVar;
        this.d = str;
        this.b = pcaVar;
        this.c = i;
    }

    @Override // defpackage.pbv
    public void n(pbx pbxVar) {
        pcc pccVar = this.g;
        if (pccVar != pbxVar) {
            return;
        }
        this.l = pccVar.a;
        this.m = this.h;
        this.n = SystemClock.elapsedRealtime();
        this.i = 0;
        this.k = null;
        if (!(this.l instanceof owf)) {
            return;
        }
        String str = ((owf) this.l).f;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.d = str;
    }

    @Override // defpackage.pbv
    public void o(pbx pbxVar, IOException iOException) {
        if (this.g != pbxVar) {
            return;
        }
        this.i++;
        this.j = SystemClock.elapsedRealtime();
        this.k = new pcm(iOException);
    }

    @Override // defpackage.pbv
    public final void p() {
    }
}
