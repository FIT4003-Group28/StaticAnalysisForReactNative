package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: fhx  reason: default package */
/* loaded from: classes3.dex */
final class fhx implements yiw {
    private final fib a;
    private final teb b;
    private final int c;

    public fhx(fib fibVar, teb tebVar, int i) {
        this.a = fibVar;
        this.b = tebVar;
        this.c = i;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        this.b.b(28, "Image zoom bytes load error");
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        fib fibVar = this.a;
        fibVar.r = this.c;
        fibVar.q = (byte[]) obj2;
        fibVar.b();
    }
}
