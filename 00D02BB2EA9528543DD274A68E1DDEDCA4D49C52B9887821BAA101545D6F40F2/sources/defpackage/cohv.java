package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.learning.internal.secagg.PRFInputVectorSpecification;
/* compiled from: PG */
/* renamed from: cohv  reason: default package */
/* loaded from: classes5.dex */
public abstract class cohv extends clb implements cohw {
    public cohv() {
        super("com.google.android.gms.learning.internal.secagg.IPRF");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        coba coayVar;
        coba cobaVar;
        coba coayVar2;
        coba cobaVar2;
        coba coayVar3;
        coba cobaVar3;
        coba coayVar4;
        coba cobaVar4;
        coba coayVar5;
        coba cobaVar5;
        coba coayVar6;
        coba cobaVar6;
        cohx cohxVar = null;
        if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                cobaVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface instanceof coba) {
                    coayVar = (coba) queryLocalInterface;
                } else {
                    coayVar = new coay(readStrongBinder);
                }
                cobaVar = coayVar;
            }
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 == null) {
                cobaVar2 = null;
            } else {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface2 instanceof coba) {
                    coayVar2 = (coba) queryLocalInterface2;
                } else {
                    coayVar2 = new coay(readStrongBinder2);
                }
                cobaVar2 = coayVar2;
            }
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 == null) {
                cobaVar3 = null;
            } else {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface3 instanceof coba) {
                    coayVar3 = (coba) queryLocalInterface3;
                } else {
                    coayVar3 = new coay(readStrongBinder3);
                }
                cobaVar3 = coayVar3;
            }
            PRFInputVectorSpecification[] pRFInputVectorSpecificationArr = (PRFInputVectorSpecification[]) parcel.createTypedArray(PRFInputVectorSpecification.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.learning.internal.secagg.IPRFAbortFlag");
                if (queryLocalInterface4 instanceof cohx) {
                    cohxVar = (cohx) queryLocalInterface4;
                } else {
                    cohxVar = new cohx(readStrongBinder4);
                }
            }
            coba c = c(cobaVar, cobaVar2, cobaVar3, pRFInputVectorSpecificationArr, cohxVar);
            parcel2.writeNoException();
            clc.f(parcel2, c);
            return true;
        } else if (i != 3) {
            if (i != 4) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(b() ? 1 : 0);
            return true;
        } else {
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 == null) {
                cobaVar4 = null;
            } else {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface5 instanceof coba) {
                    coayVar4 = (coba) queryLocalInterface5;
                } else {
                    coayVar4 = new coay(readStrongBinder5);
                }
                cobaVar4 = coayVar4;
            }
            IBinder readStrongBinder6 = parcel.readStrongBinder();
            if (readStrongBinder6 == null) {
                cobaVar5 = null;
            } else {
                IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface6 instanceof coba) {
                    coayVar5 = (coba) queryLocalInterface6;
                } else {
                    coayVar5 = new coay(readStrongBinder6);
                }
                cobaVar5 = coayVar5;
            }
            IBinder readStrongBinder7 = parcel.readStrongBinder();
            if (readStrongBinder7 == null) {
                cobaVar6 = null;
            } else {
                IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface7 instanceof coba) {
                    coayVar6 = (coba) queryLocalInterface7;
                } else {
                    coayVar6 = new coay(readStrongBinder7);
                }
                cobaVar6 = coayVar6;
            }
            PRFInputVectorSpecification[] pRFInputVectorSpecificationArr2 = (PRFInputVectorSpecification[]) parcel.createTypedArray(PRFInputVectorSpecification.CREATOR);
            IBinder readStrongBinder8 = parcel.readStrongBinder();
            if (readStrongBinder8 != null) {
                IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.learning.internal.secagg.IPRFAbortFlag");
                if (queryLocalInterface8 instanceof cohx) {
                    cohxVar = (cohx) queryLocalInterface8;
                } else {
                    cohxVar = new cohx(readStrongBinder8);
                }
            }
            coba d = d(cobaVar4, cobaVar5, cobaVar6, pRFInputVectorSpecificationArr2, cohxVar);
            parcel2.writeNoException();
            clc.f(parcel2, d);
            return true;
        }
    }
}
