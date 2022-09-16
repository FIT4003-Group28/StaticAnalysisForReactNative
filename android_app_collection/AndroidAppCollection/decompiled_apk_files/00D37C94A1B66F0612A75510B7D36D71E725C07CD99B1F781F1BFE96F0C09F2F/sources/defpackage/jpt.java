package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jpt  reason: default package */
/* loaded from: classes3.dex */
public final class jpt implements akev {
    final /* synthetic */ String a;
    final /* synthetic */ jpu b;

    public jpt(jpu jpuVar, String str) {
        this.b = jpuVar;
        this.a = str;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        akfi akfiVar = (akfi) obj;
        if (i != 1) {
            jpu jpuVar = this.b;
            dt dtVar = jpuVar.a;
            ankt b = jpuVar.d.b(this.a);
            final String str = this.a;
            ylx.n(dtVar, b, new zdt() { // from class: jps
                @Override // defpackage.zdt
                public final void a(Object obj2) {
                    Throwable th = (Throwable) obj2;
                    String valueOf = String.valueOf(str);
                    zep.d(valueOf.length() != 0 ? "Failed to complete delete of video ".concat(valueOf) : new String("Failed to complete delete of video "), th);
                }
            }, ylx.b);
        }
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        akfi akfiVar = (akfi) obj;
        jpu jpuVar = this.b;
        dt dtVar = jpuVar.a;
        joh johVar = jpuVar.d;
        String str = this.a;
        ylx.n(dtVar, anii.i(johVar.b.a(new fct(str, 9)), new jog(johVar, str, 1), anjk.a), hmv.t, ylx.b);
    }
}
