package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: qev  reason: default package */
/* loaded from: classes4.dex */
public final class qev extends dvd implements qew {
    private final qgs a;

    public qev() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public qev(qgs qgsVar) {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        this.a = qgsVar;
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        rad rabVar;
        rad rabVar2;
        rad rabVar3;
        qdm qdmVar = null;
        rad radVar = null;
        rad radVar2 = null;
        rad radVar3 = null;
        qcg qcgVar = null;
        switch (i) {
            case 2:
                String str = this.a.a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List<pzt> list = this.a.b;
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    for (pzt pztVar : list) {
                        arrayList.add(new qdm(pztVar.d(), pztVar.e(), pztVar.a(), pztVar.c(), pztVar.b()));
                    }
                }
                parcel2.writeNoException();
                parcel2.writeList(arrayList);
                return true;
            case 4:
                String str2 = this.a.c;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 5:
                pzt pztVar2 = this.a.d;
                if (pztVar2 != null) {
                    qdo qdoVar = (qdo) pztVar2;
                    qdmVar = new qdm(qdoVar.a, qdoVar.b, qdoVar.c, qdoVar.d, qdoVar.e);
                }
                parcel2.writeNoException();
                dve.i(parcel2, qdmVar);
                return true;
            case 6:
                String str3 = this.a.e;
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case 7:
                String str4 = this.a.f;
                parcel2.writeNoException();
                parcel2.writeString(str4);
                return true;
            case 8:
                Double d = this.a.g;
                double doubleValue = d != null ? d.doubleValue() : -1.0d;
                parcel2.writeNoException();
                parcel2.writeDouble(doubleValue);
                return true;
            case 9:
                String str5 = this.a.h;
                parcel2.writeNoException();
                parcel2.writeString(str5);
                return true;
            case 10:
                String str6 = this.a.i;
                parcel2.writeNoException();
                parcel2.writeString(str6);
                return true;
            case 11:
                pzj pzjVar = this.a.j;
                if (pzjVar != null) {
                    qcgVar = pzjVar.a();
                }
                parcel2.writeNoException();
                dve.i(parcel2, qcgVar);
                return true;
            case 12:
                parcel2.writeNoException();
                dve.i(parcel2, null);
                return true;
            case 13:
                parcel2.writeNoException();
                dve.i(parcel2, null);
                return true;
            case 14:
                parcel2.writeNoException();
                dve.i(parcel2, null);
                return true;
            case 15:
                Object obj = this.a.k;
                if (obj != null) {
                    radVar3 = rac.a(obj);
                }
                parcel2.writeNoException();
                dve.i(parcel2, radVar3);
                return true;
            case 16:
                Bundle bundle = this.a.l;
                parcel2.writeNoException();
                dve.h(parcel2, bundle);
                return true;
            case 17:
                boolean z = this.a.m;
                parcel2.writeNoException();
                dve.e(parcel2, z);
                return true;
            case 18:
                boolean z2 = this.a.n;
                parcel2.writeNoException();
                dve.e(parcel2, z2);
                return true;
            case 19:
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface instanceof rad) {
                        radVar2 = (rad) queryLocalInterface;
                    } else {
                        radVar2 = new rab(readStrongBinder);
                    }
                }
                View view = (View) rac.b(radVar2);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    rabVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface2 instanceof rad) {
                        rabVar = (rad) queryLocalInterface2;
                    } else {
                        rabVar = new rab(readStrongBinder2);
                    }
                }
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    rabVar2 = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface3 instanceof rad) {
                        rabVar2 = (rad) queryLocalInterface3;
                    } else {
                        rabVar2 = new rab(readStrongBinder3);
                    }
                }
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    rabVar3 = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface4 instanceof rad) {
                        rabVar3 = (rad) queryLocalInterface4;
                    } else {
                        rabVar3 = new rab(readStrongBinder4);
                    }
                }
                HashMap hashMap = (HashMap) rac.b(rabVar2);
                HashMap hashMap2 = (HashMap) rac.b(rabVar3);
                qgs qgsVar = this.a;
                View view2 = (View) rac.b(rabVar);
                if (view2 instanceof pzx) {
                    pzx pzxVar = (pzx) view2;
                    qyj qyjVar = qgsVar.o;
                    throw null;
                } else if (((pzw) pzw.a.get(view2)) == null) {
                    parcel2.writeNoException();
                    return true;
                } else {
                    qyj qyjVar2 = qgsVar.o;
                    throw null;
                }
            case 22:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface5 instanceof rad) {
                        radVar = (rad) queryLocalInterface5;
                    } else {
                        radVar = new rab(readStrongBinder5);
                    }
                }
                View view3 = (View) rac.b(radVar);
                parcel2.writeNoException();
                return true;
            case 23:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 24:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 25:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            default:
                return false;
        }
    }
}
