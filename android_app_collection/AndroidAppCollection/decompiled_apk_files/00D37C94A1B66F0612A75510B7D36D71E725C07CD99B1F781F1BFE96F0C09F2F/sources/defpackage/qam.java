package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
/* compiled from: PG */
/* renamed from: qam  reason: default package */
/* loaded from: classes4.dex */
public final class qam extends qaq {
    final /* synthetic */ Context a;
    final /* synthetic */ AdSizeParcel b;
    final /* synthetic */ String c;
    final /* synthetic */ qap d;

    public qam(qap qapVar, Context context, AdSizeParcel adSizeParcel, String str) {
        this.d = qapVar;
        this.a = context;
        this.b = adSizeParcel;
        this.c = str;
    }

    @Override // defpackage.qaq
    public final /* bridge */ /* synthetic */ Object a() {
        qap.a(this.a, "search");
        return new qbl();
    }

    @Override // defpackage.qaq
    public final /* bridge */ /* synthetic */ Object b() {
        return this.d.a.a(this.a, this.b, this.c, null, 3);
    }

    @Override // defpackage.qaq
    public final /* bridge */ /* synthetic */ Object c(qbs qbsVar) {
        qbm qbkVar;
        rad a = rac.a(this.a);
        AdSizeParcel adSizeParcel = this.b;
        String str = this.c;
        Parcel pv = qbsVar.pv();
        dve.i(pv, a);
        dve.g(pv, adSizeParcel);
        pv.writeString(str);
        pv.writeInt(213380000);
        Parcel pw = qbsVar.pw(10, pv);
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
