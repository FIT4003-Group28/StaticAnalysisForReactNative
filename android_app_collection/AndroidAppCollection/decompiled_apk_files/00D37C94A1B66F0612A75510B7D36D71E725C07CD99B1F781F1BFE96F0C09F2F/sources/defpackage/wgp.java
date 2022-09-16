package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: wgp  reason: default package */
/* loaded from: classes4.dex */
public final class wgp implements afwc, ynl {
    public final wge a;
    public final yni b;
    public boolean c;
    private final wac d;
    private final whp e;
    private final aasc f;

    public wgp(wge wgeVar, wac wacVar, whp whpVar, aasc aascVar, yni yniVar) {
        this.a = wgeVar;
        this.d = wacVar;
        this.e = whpVar;
        this.f = aascVar;
        this.b = yniVar;
        yniVar.g(this);
    }

    @Override // defpackage.afwc
    public final void b(Activity activity, apzg apzgVar, @Deprecated afwa afwaVar) {
        apzg c = wig.c(apzgVar);
        if (afwaVar != null) {
            String name = getClass().getName();
            String name2 = wgh.class.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 46 + String.valueOf(name2).length());
            sb.append(name);
            sb.append(" does not support SignInCallback. use ");
            sb.append(name2);
            sb.append(" instead");
            throw new IllegalStateException(sb.toString());
        } else if (!(activity instanceof dt)) {
            String name3 = getClass().getName();
            String name4 = dt.class.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name3).length() + 15 + String.valueOf(name4).length());
            sb2.append(name3);
            sb2.append(" only supports ");
            sb2.append(name4);
            throw new IllegalStateException(sb2.toString());
        } else if (this.d.t()) {
            this.b.d(new wgh(wgg.FINISHED, true));
        } else if (this.d.s()) {
            this.b.d(new wgh(wgg.CANCELLED, true));
        } else {
            try {
                Account[] h = this.e.h();
                if (h != null && h.length != 0) {
                    wgd.a(this.f, h[0].name, new wgo(this, activity, c));
                    return;
                }
                this.b.d(new wgh(wgg.CANCELLED, true));
            } catch (RemoteException | qsc | qsd unused) {
                this.b.d(new wgh(wgg.CANCELLED, true));
            }
        }
    }

    @Override // defpackage.afwc
    public final void c(Activity activity, byte[] bArr, @Deprecated afwa afwaVar) {
        b(activity, wgs.g(bArr), afwaVar);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                wgh wghVar = (wgh) obj;
                wgg wggVar = wgg.STARTED;
                int ordinal = wghVar.a().ordinal();
                if (ordinal == 0) {
                    return null;
                }
                if (ordinal == 2 && this.c && !wghVar.c()) {
                    this.b.d(new wgh(wgg.CANCELLED, true));
                }
                this.c = false;
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{wgh.class};
    }

    @Override // defpackage.afwc
    public final void qx(String str) {
        this.a.k(str);
    }
}
