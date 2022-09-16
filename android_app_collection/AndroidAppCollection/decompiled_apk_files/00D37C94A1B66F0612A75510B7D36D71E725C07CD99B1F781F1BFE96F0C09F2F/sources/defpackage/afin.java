package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afin  reason: default package */
/* loaded from: classes.dex */
public final class afin implements afkg {
    public long a;
    final /* synthetic */ afiz b;

    public afin(afiz afizVar) {
        this.b = afizVar;
    }

    @Override // defpackage.afkg
    public final /* synthetic */ void a(afkv afkvVar) {
    }

    @Override // defpackage.afkg
    public final void b(Exception exc) {
        this.b.v(new afkn(afkl.DEFAULT, "cache.exception", this.b.l, exc.getCause()));
    }

    @Override // defpackage.afkg
    public final void c(int i) {
        String str = i != 0 ? i != 1 ? null : "cache.ignored.unsetlength" : "cache.ignored.onerror";
        afiz afizVar = this.b;
        VideoStreamingData videoStreamingData = afizVar.p;
        boolean z = videoStreamingData == null || videoStreamingData.l == 1;
        if (afizVar.o || str == null || !z) {
            return;
        }
        afiw afiwVar = afizVar.e;
        String e = afizVar.e();
        String d = this.b.d();
        String c = afjt.c();
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 3 + str.length() + String.valueOf(d).length() + String.valueOf(c).length());
        sb.append(e);
        sb.append(":");
        sb.append(str);
        sb.append(":");
        sb.append(d);
        sb.append(":");
        sb.append(c);
        afiwVar.a("error", sb.toString());
        this.b.o = true;
    }

    @Override // defpackage.afkg
    public final void rX(long j) {
        this.a += j;
    }
}
