package defpackage;

import android.app.Application;
import android.graphics.Bitmap;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bepk  reason: default package */
/* loaded from: classes3.dex */
public class bepk extends benz {
    static final cqtv d = cqrp.d(40.0d);
    static final cqtv e = cqrp.d(18.0d);
    public final beoq f;
    public final czsy g;
    public final String h;
    public final bvrb i;
    @dzsi
    public String j;
    @dzsi
    cqtd k;
    @dzsi
    public Bitmap l;
    public cqtd m;
    private final String n;
    private final String o;
    private final benm p;
    private final boolean q;
    private final cqtd r;
    @dzsi
    private String s;
    @dzsi
    private String t;
    private String u;
    private String v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bepk(defpackage.beor r24, android.app.Application r25, defpackage.apny r26, defpackage.dxio<defpackage.beii> r27, defpackage.benm r28, defpackage.bgyg r29, defpackage.cqhn r30, defpackage.czsx r31, defpackage.czsy r32, defpackage.bvrb r33, defpackage.apnm r34, defpackage.dfzs r35, int r36, defpackage.beny r37, defpackage.bwrs<defpackage.bvrt<defpackage.benb>> r38, defpackage.bwrs<defpackage.ilo> r39, boolean[] r40) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bepk.<init>(beor, android.app.Application, apny, dxio, benm, bgyg, cqhn, czsx, czsy, bvrb, apnm, dfzs, int, beny, bwrs, bwrs, boolean[]):void");
    }

    private static StringBuilder u(Application application, dfzs dfzsVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(application.getString(z ? R.string.MERCHANT_PANEL_CALLS_LIST_ITEM_ANSWERED_CALL : R.string.MERCHANT_PANEL_CALLS_LIST_ITEM_MISSED_CALL));
        if (!z && (dfzsVar.a & 32) != 0 && dfzsVar.f > 1) {
            sb.append(" (");
            sb.append(dfzsVar.f);
            sb.append(")");
        }
        return sb;
    }

    private static String v(Application application, dfzs dfzsVar, String str, boolean z) {
        StringBuilder u = u(application, dfzsVar, z);
        u.append(" · ");
        u.append(str);
        return u.toString();
    }

    @Override // defpackage.benu
    public String a() {
        String str = this.j;
        if (str != null) {
            return str;
        }
        String str2 = this.s;
        return str2 != null ? str2 : this.h;
    }

    @Override // defpackage.benu
    public String b() {
        String a = a();
        if (this.j == null && this.s == null) {
            String valueOf = String.valueOf(this.o);
            String valueOf2 = String.valueOf(a);
            return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        String valueOf3 = String.valueOf(this.n);
        String valueOf4 = String.valueOf(a);
        return valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
    }

    @Override // defpackage.benu
    public String c() {
        return this.v;
    }

    @Override // defpackage.benu
    public jic f() {
        return new jic(this.j == null ? this.t : null, ckqc.FIFE_MONOGRAM_CIRCLE_CROP, this.m, 0);
    }

    @Override // defpackage.benu
    public cqtv g() {
        return d;
    }

    @Override // defpackage.benu
    public cqtd i() {
        return this.r;
    }

    @Override // defpackage.benu
    public benq k() {
        return this.f;
    }

    @Override // defpackage.benz
    public void q(int i) {
        super.q(i);
        String a = this.p.a(this.b.e);
        if (!this.u.equals(a)) {
            this.u = a;
            this.v = v(this.a, this.b, a, this.q);
        }
    }

    public void s() {
        String str;
        dfzs dfzsVar = this.b;
        if ((dfzsVar.a & 64) != 0) {
            this.s = dfzsVar.g;
            this.m = t(this.a, this.g, this.s);
        }
        dfzs dfzsVar2 = this.b;
        if ((dfzsVar2.a & 128) != 0) {
            dgbo dgboVar = dfzsVar2.h;
            if (dgboVar == null) {
                dgboVar = dgbo.e;
            }
            str = dgboVar.c;
        } else {
            str = null;
        }
        this.t = str;
        this.f.q(a(), this.l, this.t);
        this.i.b(new Runnable(this) { // from class: bepi
            private final bepk a;

            {
                this.a = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 272
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bepi.run():void");
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    public final cqtd t(Application application, czsy czsyVar, String str) {
        int e2 = cqrp.d(40.0d).e(application);
        this.l = Bitmap.createBitmap(e2, e2, Bitmap.Config.ARGB_8888);
        czsyVar.b(str);
        cztn bZ = czto.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        czto cztoVar = (czto) bZ.b;
        str.getClass();
        cztoVar.a |= 8;
        cztoVar.e = str;
        czsyVar.c(czta.a(bZ.bK()));
        Bitmap bitmap = this.l;
        dbsk.s(bitmap);
        czsyVar.a(bitmap);
        Bitmap bitmap2 = this.l;
        dbsk.s(bitmap2);
        return cqtt.a(bitmap2);
    }
}
