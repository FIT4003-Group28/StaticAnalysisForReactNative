package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.CancellationException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qgu  reason: default package */
/* loaded from: classes7.dex */
public final class qgu implements degu<Bitmap> {
    final /* synthetic */ String a;
    final /* synthetic */ qhu b;
    final /* synthetic */ boolean c;
    final /* synthetic */ qgw d;

    public qgu(qgw qgwVar, String str, qhu qhuVar, boolean z) {
        this.d = qgwVar;
        this.a = str;
        this.b = qhuVar;
        this.c = z;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        String d;
        if (!(th instanceof CancellationException) && (d = this.b.d()) != null) {
            qgw qgwVar = this.d;
            qgwVar.b.add(qgwVar.g(this.b, d));
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Bitmap bitmap) {
        akuh d = this.d.a.e().d(bitmap);
        this.d.c.put(this.a, d);
        this.d.f(d, this.b, this.c);
    }
}
