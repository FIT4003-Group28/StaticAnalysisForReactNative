package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: qcl  reason: default package */
/* loaded from: classes4.dex */
public final class qcl {
    public final qem a;
    public final qai b;
    public final pzj c;
    public final qas d;
    public pzb[] e;
    public qbm f;
    public String g;
    public final ViewGroup h;
    public doy i;
    public doy j;

    public qcl(ViewGroup viewGroup) {
        qai qaiVar = qai.a;
        this.a = new qem();
        this.c = new pzj();
        this.d = new qck(this);
        this.h = viewGroup;
        this.b = qaiVar;
        this.f = null;
        new AtomicBoolean(false);
    }

    public static AdSizeParcel b(Context context, pzb[] pzbVarArr) {
        int length = pzbVarArr.length;
        for (int i = 0; i <= 0; i++) {
            if (pzbVarArr[i].equals(pzb.b)) {
                return new AdSizeParcel("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        AdSizeParcel adSizeParcel = new AdSizeParcel(context, pzbVarArr);
        adSizeParcel.j = false;
        return adSizeParcel;
    }

    public final qcg a() {
        qbm qbmVar = this.f;
        if (qbmVar != null) {
            try {
                return qbmVar.f();
            } catch (RemoteException e) {
                qfl.h("#007 Could not call remote method.", e);
            }
        }
        return null;
    }
}
