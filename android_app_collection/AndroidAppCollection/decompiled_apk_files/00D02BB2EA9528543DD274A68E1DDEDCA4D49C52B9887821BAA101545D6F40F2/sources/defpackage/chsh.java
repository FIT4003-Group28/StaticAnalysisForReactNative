package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chsh  reason: default package */
/* loaded from: classes4.dex */
public final class chsh {
    private static final eaow f = eaow.c(10);
    public final akpm a;
    public final dxio<cgen> b;
    public final dxio<cgep> c;
    public final btnd<chsq, dehn<btzx<dwmp, dwmt>>> d;
    public final btnd<chsa, dehn<btzx<dwnd, dwnf>>> e;
    private final Activity g;
    private final btvo h;
    private final akzh i;
    private final bvjj j;
    private final anhk k;
    private final dxio<ahjq> l;
    private final Executor m;
    private final burv n;
    private final buul o;
    private final chsf p;

    public chsh(Activity activity, btvo btvoVar, akzh akzhVar, bvjj bvjjVar, akpm akpmVar, anhk anhkVar, dxio<ahjq> dxioVar, dxio<cgen> dxioVar2, burv burvVar, buul buulVar, dxio<cgep> dxioVar3, Executor executor, cqat cqatVar, chsf chsfVar) {
        this.g = activity;
        this.h = btvoVar;
        this.i = akzhVar;
        this.l = dxioVar;
        this.j = bvjjVar;
        this.a = akpmVar;
        this.k = anhkVar;
        this.b = dxioVar2;
        this.n = burvVar;
        this.o = buulVar;
        this.c = dxioVar3;
        this.m = executor;
        eaow eaowVar = f;
        this.d = new btnd<>(eaowVar, cqatVar);
        this.e = new btnd<>(eaowVar, cqatVar);
        this.p = chsfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dehn<defpackage.btzx<defpackage.dwmp, defpackage.dwmt>> a(defpackage.btlu r17, defpackage.chtq r18, @defpackage.dzsi java.lang.String r19, defpackage.dbsg<defpackage.dpyv> r20, defpackage.dcdc<defpackage.drrv> r21, @defpackage.dzsi java.lang.Integer r22) {
        /*
            Method dump skipped, instructions count: 1272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chsh.a(btlu, chtq, java.lang.String, dbsg, dcdc, java.lang.Integer):dehn");
    }

    public final dehn<btzx<dwnd, dwnf>> b(@dzsi String str, @dzsi byte[] bArr) {
        dwnc bZ = dwnd.e.bZ();
        if (str != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwnd dwndVar = (dwnd) bZ.b;
            str.getClass();
            dwndVar.a |= 1;
            dwndVar.b = str;
        }
        if (bArr != null) {
            dspd x = dspd.x(bArr);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwnd dwndVar2 = (dwnd) bZ.b;
            x.getClass();
            dwndVar2.a |= 2;
            dwndVar2.c = x;
        }
        return this.o.c(bZ.bK());
    }
}
