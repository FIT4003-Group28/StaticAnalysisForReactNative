package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
/* compiled from: PG */
/* renamed from: qan  reason: default package */
/* loaded from: classes4.dex */
public final class qan extends qaq {
    final /* synthetic */ Context a;
    final /* synthetic */ AdSizeParcel b;
    final /* synthetic */ String c;
    final /* synthetic */ qeo d;
    final /* synthetic */ qap e;

    public qan(qap qapVar, Context context, AdSizeParcel adSizeParcel, String str, qeo qeoVar) {
        this.e = qapVar;
        this.a = context;
        this.b = adSizeParcel;
        this.c = str;
        this.d = qeoVar;
    }

    @Override // defpackage.qaq
    public final /* bridge */ /* synthetic */ Object a() {
        qap.a(this.a, "interstitial");
        return new qbl();
    }

    @Override // defpackage.qaq
    public final /* bridge */ /* synthetic */ Object b() {
        return this.e.a.a(this.a, this.b, this.c, this.d, 2);
    }

    @Override // defpackage.qaq
    public final /* bridge */ /* synthetic */ Object c(qbs qbsVar) {
        qbm qbkVar;
        rad a = rac.a(this.a);
        AdSizeParcel adSizeParcel = this.b;
        String str = this.c;
        qeo qeoVar = this.d;
        Parcel pv = qbsVar.pv();
        dve.i(pv, a);
        dve.g(pv, adSizeParcel);
        pv.writeString(str);
        dve.i(pv, qeoVar);
        pv.writeInt(213380000);
        Parcel pw = qbsVar.pw(2, pv);
        IBinder readStrongBinder = pw.readStrongBinder();
        if (readStrongBinder == null) {
            qbkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof qbm) {
                qbkVar = (qbm) queryLocalInterface;
            } else {
                qbkVar = new qbk(readStrongBinder);
            }
        }
        pw.recycle();
        return qbkVar;
    }
}
