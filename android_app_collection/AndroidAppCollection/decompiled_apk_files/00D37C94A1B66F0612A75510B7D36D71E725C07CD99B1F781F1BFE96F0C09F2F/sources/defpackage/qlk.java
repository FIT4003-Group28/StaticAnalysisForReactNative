package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qlk  reason: default package */
/* loaded from: classes4.dex */
public final class qlk extends dvd implements IInterface {
    private final qlt a;
    private final Class b;

    public qlk() {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
    }

    public qlk(qlt qltVar, Class cls) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
        this.a = qltVar;
        this.b = cls;
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        qlt qltVar;
        qlt qltVar2;
        qlt qltVar3;
        qlt qltVar4;
        qlt qltVar5;
        qlt qltVar6;
        qlt qltVar7;
        qlt qltVar8;
        qlt qltVar9;
        rad radVar = null;
        switch (i) {
            case 1:
                rad a = rac.a(this.a);
                parcel2.writeNoException();
                dve.i(parcel2, a);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface instanceof rad) {
                        radVar = (rad) queryLocalInterface;
                    } else {
                        radVar = new rab(readStrongBinder);
                    }
                }
                qlr qlrVar = (qlr) rac.b(radVar);
                if (this.b.isInstance(qlrVar) && (qltVar = this.a) != null) {
                    qltVar.h((qlr) this.b.cast(qlrVar));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface2 instanceof rad) {
                        radVar = (rad) queryLocalInterface2;
                    } else {
                        radVar = new rab(readStrongBinder2);
                    }
                }
                String readString = parcel.readString();
                qlr qlrVar2 = (qlr) rac.b(radVar);
                if (this.b.isInstance(qlrVar2) && (qltVar2 = this.a) != null) {
                    qltVar2.g((qlr) this.b.cast(qlrVar2), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface3 instanceof rad) {
                        radVar = (rad) queryLocalInterface3;
                    } else {
                        radVar = new rab(readStrongBinder3);
                    }
                }
                int readInt = parcel.readInt();
                qlr qlrVar3 = (qlr) rac.b(radVar);
                if (this.b.isInstance(qlrVar3) && (qltVar3 = this.a) != null) {
                    qltVar3.f((qlr) this.b.cast(qlrVar3), readInt);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface4 instanceof rad) {
                        radVar = (rad) queryLocalInterface4;
                    } else {
                        radVar = new rab(readStrongBinder4);
                    }
                }
                qlr qlrVar4 = (qlr) rac.b(radVar);
                if (this.b.isInstance(qlrVar4) && (qltVar4 = this.a) != null) {
                    qltVar4.b((qlr) this.b.cast(qlrVar4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface5 instanceof rad) {
                        radVar = (rad) queryLocalInterface5;
                    } else {
                        radVar = new rab(readStrongBinder5);
                    }
                }
                int readInt2 = parcel.readInt();
                qlr qlrVar5 = (qlr) rac.b(radVar);
                if (this.b.isInstance(qlrVar5) && (qltVar5 = this.a) != null) {
                    qltVar5.a((qlr) this.b.cast(qlrVar5), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface6 instanceof rad) {
                        radVar = (rad) queryLocalInterface6;
                    } else {
                        radVar = new rab(readStrongBinder6);
                    }
                }
                String readString2 = parcel.readString();
                qlr qlrVar6 = (qlr) rac.b(radVar);
                if (this.b.isInstance(qlrVar6) && (qltVar6 = this.a) != null) {
                    qltVar6.e((qlr) this.b.cast(qlrVar6), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface7 instanceof rad) {
                        radVar = (rad) queryLocalInterface7;
                    } else {
                        radVar = new rab(readStrongBinder7);
                    }
                }
                boolean j = dve.j(parcel);
                qlr qlrVar7 = (qlr) rac.b(radVar);
                if (this.b.isInstance(qlrVar7) && (qltVar7 = this.a) != null) {
                    qltVar7.d((qlr) this.b.cast(qlrVar7), j);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface8 instanceof rad) {
                        radVar = (rad) queryLocalInterface8;
                    } else {
                        radVar = new rab(readStrongBinder8);
                    }
                }
                int readInt3 = parcel.readInt();
                qlr qlrVar8 = (qlr) rac.b(radVar);
                if (this.b.isInstance(qlrVar8) && (qltVar8 = this.a) != null) {
                    qltVar8.c((qlr) this.b.cast(qlrVar8), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface9 instanceof rad) {
                        radVar = (rad) queryLocalInterface9;
                    } else {
                        radVar = new rab(readStrongBinder9);
                    }
                }
                int readInt4 = parcel.readInt();
                qlr qlrVar9 = (qlr) rac.b(radVar);
                if (this.b.isInstance(qlrVar9) && (qltVar9 = this.a) != null) {
                    qltVar9.i((qlr) this.b.cast(qlrVar9), readInt4);
                }
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(213380000);
                return true;
            default:
                return false;
        }
    }
}
