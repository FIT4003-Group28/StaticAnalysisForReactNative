package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: jjm  reason: default package */
/* loaded from: classes3.dex */
final class jjm implements yiw {
    final /* synthetic */ fi a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ jjn d;

    public jjm(jjn jjnVar, fi fiVar, String str, int i) {
        this.d = jjnVar;
        this.a = fiVar;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        if (this.d.b.b()) {
            this.d.f(this.a.b(), this.b, this.c);
        }
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        this.a.n(ezv.a(this.d.a, (Bitmap) obj2));
        this.d.f(this.a.b(), this.b, this.c);
    }
}
