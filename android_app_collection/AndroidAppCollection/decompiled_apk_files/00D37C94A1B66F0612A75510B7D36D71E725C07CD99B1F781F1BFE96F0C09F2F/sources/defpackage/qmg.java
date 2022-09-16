package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.cast.framework.CastOptions;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: qmg  reason: default package */
/* loaded from: classes4.dex */
public final class qmg extends dvd implements qmh {
    public final Map a;
    public qmu b;
    private final bhd c;

    public qmg() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    public final void a(bgo bgoVar, int i) {
        for (kt ktVar : (Set) this.a.get(bgoVar)) {
            this.c.q(bgoVar, ktVar, i);
        }
    }

    public final void b(bgo bgoVar) {
        for (kt ktVar : (Set) this.a.get(bgoVar)) {
            this.c.r(ktVar);
        }
    }

    public qmg(bhd bhdVar, CastOptions castOptions) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
        this.a = new HashMap();
        this.c = bhdVar;
        if (Build.VERSION.SDK_INT > 30) {
            boolean z = castOptions.i;
            boolean z2 = castOptions.j;
            bhl bhlVar = new bhl();
            if (Build.VERSION.SDK_INT >= 30) {
                bhlVar.a = z;
            }
            bhlVar.b(z2);
            bhd.n(bhlVar.a());
            if (z) {
                qmc.d(anfx.CAST_OUTPUT_SWITCHER_ENABLED);
            }
            if (!z2) {
                return;
            }
            this.b = new qmu();
            qmm qmmVar = new qmm(this.b);
            bhd.c();
            bhd.a().z = qmmVar;
            qmc.d(anfx.CAST_TRANSFER_TO_LOCAL_ENABLED);
        }
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        qmj qmjVar = null;
        bhc bhcVar = null;
        Bundle bundle = null;
        boolean z = false;
        switch (i) {
            case 1:
                Bundle bundle2 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    if (queryLocalInterface instanceof qmj) {
                        qmjVar = (qmj) queryLocalInterface;
                    } else {
                        qmjVar = new qmi(readStrongBinder);
                    }
                }
                bgo a = bgo.a(bundle2);
                if (!this.a.containsKey(a)) {
                    this.a.put(a, new HashSet());
                }
                ((Set) this.a.get(a)).add(new qmk(qmjVar));
                parcel2.writeNoException();
                break;
            case 2:
                final int readInt = parcel.readInt();
                final bgo a2 = bgo.a((Bundle) dve.a(parcel, Bundle.CREATOR));
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    a(a2, readInt);
                } else {
                    new rfm(Looper.getMainLooper()).post(new Runnable() { // from class: qmo
                        @Override // java.lang.Runnable
                        public final void run() {
                            qmg qmgVar = qmg.this;
                            bgo bgoVar = a2;
                            int i3 = readInt;
                            synchronized (qmgVar.a) {
                                qmgVar.a(bgoVar, i3);
                            }
                        }
                    });
                }
                parcel2.writeNoException();
                break;
            case 3:
                final bgo a3 = bgo.a((Bundle) dve.a(parcel, Bundle.CREATOR));
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    b(a3);
                } else {
                    new rfm(Looper.getMainLooper()).post(new Runnable() { // from class: qmn
                        @Override // java.lang.Runnable
                        public final void run() {
                            qmg.this.b(a3);
                        }
                    });
                }
                parcel2.writeNoException();
                break;
            case 4:
                boolean k = bhd.k(bgo.a((Bundle) dve.a(parcel, Bundle.CREATOR)), parcel.readInt());
                parcel2.writeNoException();
                dve.e(parcel2, k);
                break;
            case 5:
                String readString = parcel.readString();
                Iterator it = bhd.i().iterator();
                while (true) {
                    if (it.hasNext()) {
                        bhc bhcVar2 = (bhc) it.next();
                        if (bhcVar2.c.equals(readString)) {
                            bhd.l(bhcVar2);
                        }
                    }
                }
                parcel2.writeNoException();
                break;
            case 6:
                bhd.l(bhd.g());
                parcel2.writeNoException();
                break;
            case 7:
                boolean equals = bhd.j().c.equals(bhd.g().c);
                parcel2.writeNoException();
                dve.e(parcel2, equals);
                break;
            case 8:
                String readString2 = parcel.readString();
                Iterator it2 = bhd.i().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        bhc bhcVar3 = (bhc) it2.next();
                        if (bhcVar3.c.equals(readString2)) {
                            bundle = bhcVar3.q;
                        }
                    }
                }
                parcel2.writeNoException();
                dve.h(parcel2, bundle);
                break;
            case 9:
                String str = bhd.j().c;
                parcel2.writeNoException();
                parcel2.writeString(str);
                break;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(213380000);
                break;
            case 11:
                for (Set<kt> set : this.a.values()) {
                    for (kt ktVar : set) {
                        this.c.r(ktVar);
                    }
                }
                this.a.clear();
                parcel2.writeNoException();
                break;
            case 12:
                bhd.c();
                bgw a4 = bhd.a();
                if (a4 != null) {
                    bhcVar = a4.r;
                }
                if (bhcVar != null && bhd.j().c.equals(bhcVar.c)) {
                    z = true;
                }
                parcel2.writeNoException();
                dve.e(parcel2, z);
                break;
            case 13:
                bhd.o(parcel.readInt());
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
