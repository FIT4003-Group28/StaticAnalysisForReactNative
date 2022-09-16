package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.AsyncTask;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abti  reason: default package */
/* loaded from: classes.dex */
public final class abti extends AsyncTask {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ Point c;
    final /* synthetic */ boolean d;
    final /* synthetic */ zuk e;
    final /* synthetic */ abtj f;
    final /* synthetic */ zsk g;

    public abti(abtj abtjVar, Context context, String str, Point point, boolean z, zsk zskVar, zuk zukVar) {
        this.f = abtjVar;
        this.a = context;
        this.b = str;
        this.c = point;
        this.d = z;
        this.g = zskVar;
        this.e = zukVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        synchronized (this.f.l) {
            while (true) {
                abtj abtjVar = this.f;
                if (abtjVar.j != null || abtjVar.m) {
                    break;
                }
                try {
                    abtjVar.l.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        if (this.f.m) {
            return null;
        }
        Bitmap a = new abtc(this.a, new zgi()).a(this.b);
        if (a == null) {
            throw new IllegalStateException("Thumbnail not found");
        }
        this.f.n.g();
        Point point = this.c;
        boolean z = this.d;
        abtj.i(point, z);
        if (z) {
            point.set(Math.min(point.x, 720), Math.min(point.y, 1280));
        } else {
            point.set(Math.min(point.x, 1280), Math.min(point.y, 720));
        }
        int i = this.c.x;
        int i2 = this.c.y;
        abtj abtjVar2 = this.f;
        abtjVar2.k = new zqq(this.a, abtjVar2, abtjVar2.h);
        this.f.k.l(this.g, this.e);
        this.f.k.E();
        abtj abtjVar3 = this.f;
        zqq zqqVar = abtjVar3.k;
        ask askVar = abtjVar3.j;
        boolean z2 = true;
        aqxo.y(!zqqVar.n);
        aqxo.p(i > 0);
        if (i2 <= 0) {
            z2 = false;
        }
        aqxo.p(z2);
        zou zouVar = zqqVar.i;
        zouVar.B = abtjVar3;
        Handler handler = zouVar.b;
        handler.sendMessage(handler.obtainMessage(8, i, i2, askVar));
        zqqVar.B();
        zqqVar.i.n(i, i2);
        if (zqqVar.r) {
            zqqVar.i.l();
        }
        zqq zqqVar2 = this.f.k;
        zqqVar2.p = a;
        zqqVar2.q = 10L;
        zqqVar2.A();
        abtj abtjVar4 = this.f;
        abtjVar4.k.z(abtjVar4.e);
        abtj abtjVar5 = this.f;
        abtjVar5.k.g(abtjVar5.b());
        abtj abtjVar6 = this.f;
        zqq zqqVar3 = abtjVar6.k;
        zqqVar3.i.A = abtjVar6;
        zqqVar3.j();
        return null;
    }
}
