package defpackage;

import com.google.android.libraries.youtube.innertube.model.ads.AdBreakResponseModel;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: wma  reason: default package */
/* loaded from: classes4.dex */
public final class wma implements wlc {
    private final List a;
    private final yni b;
    private final aasu c;

    public wma(aasu aasuVar, List list, yni yniVar) {
        aasuVar.getClass();
        this.c = aasuVar;
        this.a = list;
        yniVar.getClass();
        this.b = yniVar;
    }

    @Override // defpackage.wlc
    public final AdBreakResponseModel a(String str, byte[] bArr, String str2, String str3, long j, long j2, int i, long j3, zgk zgkVar) {
        try {
            this.b.d(new wxz());
            str2.getClass();
            str.getClass();
            aasu aasuVar = this.c;
            aasr aasrVar = new aasr(aasuVar.e, aasuVar.a.c());
            aasrVar.b = str;
            aasrVar.k(bArr);
            aasrVar.a = str2;
            aasrVar.c = aasr.g(str3);
            aasrVar.d = j2;
            aasrVar.s = j;
            aasrVar.t = i;
            aasrVar.u = j3;
            for (aasq aasqVar : this.a) {
                aasqVar.a(aasrVar);
            }
            afze afzeVar = new afze();
            this.c.b.i(aasrVar, afzeVar);
            long d = zgkVar.b - zgkVar.a.d();
            if (d < 0) {
                d = 0;
            }
            AdBreakResponseModel adBreakResponseModel = (AdBreakResponseModel) afzeVar.get(d, TimeUnit.MILLISECONDS);
            this.b.d(new wxy(adBreakResponseModel));
            return adBreakResponseModel;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e.getMessage());
            zep.b(valueOf.length() != 0 ? "Exception when trying to request AdBreakResponseModel: ".concat(valueOf) : new String("Exception when trying to request AdBreakResponseModel: "));
            return null;
        }
    }
}
