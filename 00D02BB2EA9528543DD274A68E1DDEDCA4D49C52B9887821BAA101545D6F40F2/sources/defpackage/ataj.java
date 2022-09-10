package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ataj  reason: default package */
/* loaded from: classes2.dex */
public final class ataj extends atyi<crqf> {
    private static final dcqe b = dcqe.c("ataj");
    private final bvjj c;
    private final Context d;
    private final boolean e;
    @dzsi
    private final dxio<jzk> f;

    public ataj(ckcw ckcwVar, broq broqVar, akox akoxVar, akfa akfaVar, bvjj bvjjVar, dxio<cref> dxioVar, Context context, int i, brcw brcwVar, btvo btvoVar, boolean z, @dzsi dxio<jzk> dxioVar2) {
        super(ckcwVar, broqVar, akoxVar, akfaVar, dxioVar, i, brcwVar, btvoVar);
        this.c = bvjjVar;
        this.d = context;
        this.e = z;
        this.f = dxioVar2;
    }

    @Override // defpackage.atyi
    protected final String a(String str) {
        return this.d.getString(R.string.DA_SPEECH_SEARCH_ALONG_ROUTE_CONFIRMATION, str);
    }

    @Override // defpackage.atyi
    protected final /* bridge */ /* synthetic */ amvq b(crqf crqfVar, aste asteVar) {
        doud b2 = brlj.b(crqfVar.g());
        akqq d = akqq.d(b2.a.f(0), b2.b.f(0));
        return new amvq(d.a, d.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
        if (r0.c != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
        r0.bF();
        r0.c = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
        r7 = (defpackage.dodt) r0.b;
        r7.a |= 16;
        r7.f = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a0, code lost:
        if (r0.c != false) goto L18;
     */
    @Override // defpackage.atyi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void c(defpackage.dwim r5, defpackage.crqf r6, defpackage.aste r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ataj.c(dwim, crpx, aste, boolean):void");
    }

    @Override // defpackage.atyi
    protected final /* bridge */ /* synthetic */ boolean d(@dzsi crqf crqfVar) {
        crqf crqfVar2 = crqfVar;
        return (crqfVar2 == null || crqfVar2.g || crqfVar2.a == null) ? false : true;
    }
}
