package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: pzo  reason: default package */
/* loaded from: classes4.dex */
public final class pzo extends dvd implements pzp {
    private final dsp a;
    private final dsr b;
    private final dsx c;
    private boolean d;

    public pzo(Context context, Executor executor, dnl dnlVar) {
        this();
        this.d = false;
        dsu dsuVar = new dsu(context, executor, dnlVar);
        this.a = dsuVar;
        this.c = new dsx(dsuVar);
        this.b = dnlVar.f ? null : dsr.n(context);
    }

    @Deprecated
    private final rad b(rad radVar, rad radVar2, boolean z) {
        Uri b;
        try {
            Uri uri = (Uri) rac.b(radVar);
            Context context = (Context) rac.b(radVar2);
            if (z) {
                dsx dsxVar = this.c;
                b = dsxVar.a(uri, dsxVar.d.e(context));
            } else {
                b = this.c.b(uri, context);
            }
            return rac.a(b);
        } catch (dsy unused) {
            return null;
        }
    }

    @Override // defpackage.pzp
    @Deprecated
    public final String a(rad radVar, String str) {
        return this.a.c((Context) rac.b(radVar), str);
    }

    @Override // defpackage.pzp
    @Deprecated
    public final String f(rad radVar, byte[] bArr) {
        String num;
        Context context = (Context) rac.b(radVar);
        String f = this.a.f(context, bArr);
        dsr dsrVar = this.b;
        if (dsrVar == null || !this.d) {
            return f;
        }
        byte[] d = dru.d(f, dsrVar.f(context, bArr));
        if (d != null) {
            num = ehi.j(d, true);
        } else {
            num = Integer.toString(7);
        }
        this.d = false;
        return num;
    }

    @Override // defpackage.pzp
    public final String g() {
        return "ms";
    }

    @Override // defpackage.pzp
    public final void h(rad radVar) {
        this.c.d.h((MotionEvent) rac.b(radVar));
    }

    @Override // defpackage.pzp
    @Deprecated
    public final void i(String str, String str2) {
        dsx dsxVar = this.c;
        dsxVar.a = str;
        dsxVar.b = str2;
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        rad rabVar;
        rad rabVar2;
        rad rabVar3;
        rad rabVar4;
        rad rabVar5;
        rad rabVar6;
        rad rabVar7;
        rad rabVar8;
        boolean z = false;
        rad radVar = null;
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString("ms");
                break;
            case 2:
                i(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface instanceof rad) {
                        radVar = (rad) queryLocalInterface;
                    } else {
                        radVar = new rab(readStrongBinder);
                    }
                }
                Uri uri = (Uri) rac.b(radVar);
                dsx dsxVar = this.c;
                uri.getClass();
                try {
                    if (uri.getHost().equals(dsxVar.a)) {
                        if (uri.getPath().equals(dsxVar.b)) {
                            z = true;
                        }
                    }
                } catch (NullPointerException unused) {
                }
                parcel2.writeNoException();
                dve.e(parcel2, z);
                break;
            case 4:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface2 instanceof rad) {
                        radVar = (rad) queryLocalInterface2;
                    } else {
                        radVar = new rab(readStrongBinder2);
                    }
                }
                Uri uri2 = (Uri) rac.b(radVar);
                dsx dsxVar2 = this.c;
                uri2.getClass();
                try {
                    String host = uri2.getHost();
                    String[] strArr = dsxVar2.c;
                    int length = strArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            if (host.endsWith(strArr[i3])) {
                                z = true;
                            } else {
                                i3++;
                            }
                        }
                    }
                } catch (NullPointerException unused2) {
                }
                parcel2.writeNoException();
                dve.e(parcel2, z);
                break;
            case 5:
                this.c.c = parcel.readString().split(",");
                parcel2.writeNoException();
                break;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    rabVar = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface3 instanceof rad) {
                        rabVar = (rad) queryLocalInterface3;
                    } else {
                        rabVar = new rab(readStrongBinder3);
                    }
                }
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface4 instanceof rad) {
                        radVar = (rad) queryLocalInterface4;
                    } else {
                        radVar = new rab(readStrongBinder4);
                    }
                }
                rad b = b(rabVar, radVar, true);
                parcel2.writeNoException();
                dve.i(parcel2, b);
                break;
            case 7:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 == null) {
                    rabVar2 = null;
                } else {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface5 instanceof rad) {
                        rabVar2 = (rad) queryLocalInterface5;
                    } else {
                        rabVar2 = new rab(readStrongBinder5);
                    }
                }
                String f = f(rabVar2, null);
                parcel2.writeNoException();
                parcel2.writeString(f);
                break;
            case 8:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface6 instanceof rad) {
                        radVar = (rad) queryLocalInterface6;
                    } else {
                        radVar = new rab(readStrongBinder6);
                    }
                }
                String a = a(radVar, parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 9:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface7 instanceof rad) {
                        radVar = (rad) queryLocalInterface7;
                    } else {
                        radVar = new rab(readStrongBinder7);
                    }
                }
                h(radVar);
                parcel2.writeNoException();
                break;
            case 10:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 == null) {
                    rabVar3 = null;
                } else {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface8 instanceof rad) {
                        rabVar3 = (rad) queryLocalInterface8;
                    } else {
                        rabVar3 = new rab(readStrongBinder8);
                    }
                }
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface9 instanceof rad) {
                        radVar = (rad) queryLocalInterface9;
                    } else {
                        radVar = new rab(readStrongBinder9);
                    }
                }
                rad b2 = b(rabVar3, radVar, false);
                parcel2.writeNoException();
                dve.i(parcel2, b2);
                break;
            case 11:
                String readString = parcel.readString();
                boolean j = dve.j(parcel);
                if (this.b != null) {
                    this.b.r = new qaa(readString, j);
                    this.d = true;
                    z = true;
                }
                parcel2.writeNoException();
                dve.e(parcel2, z);
                break;
            case 12:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface10 instanceof rad) {
                        radVar = (rad) queryLocalInterface10;
                    } else {
                        radVar = new rab(readStrongBinder10);
                    }
                }
                String f2 = f(radVar, parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeString(f2);
                break;
            case 13:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface11 instanceof rad) {
                        radVar = (rad) queryLocalInterface11;
                    } else {
                        radVar = new rab(readStrongBinder11);
                    }
                }
                String e = this.a.e((Context) rac.b(radVar));
                parcel2.writeNoException();
                parcel2.writeString(e);
                break;
            case 14:
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 == null) {
                    rabVar4 = null;
                } else {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface12 instanceof rad) {
                        rabVar4 = (rad) queryLocalInterface12;
                    } else {
                        rabVar4 = new rab(readStrongBinder12);
                    }
                }
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 == null) {
                    rabVar5 = null;
                } else {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface13 instanceof rad) {
                        rabVar5 = (rad) queryLocalInterface13;
                    } else {
                        rabVar5 = new rab(readStrongBinder13);
                    }
                }
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface14 instanceof rad) {
                        radVar = (rad) queryLocalInterface14;
                    } else {
                        radVar = new rab(readStrongBinder14);
                    }
                }
                String g = this.a.g((Context) rac.b(rabVar4), (View) rac.b(rabVar5), (Activity) rac.b(radVar));
                parcel2.writeNoException();
                parcel2.writeString(g);
                break;
            case 15:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface15 instanceof rad) {
                        radVar = (rad) queryLocalInterface15;
                    } else {
                        radVar = new rab(readStrongBinder15);
                    }
                }
                this.a.k((View) rac.b(radVar));
                parcel2.writeNoException();
                break;
            case 16:
            default:
                return false;
            case 17:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 == null) {
                    rabVar6 = null;
                } else {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface16 instanceof rad) {
                        rabVar6 = (rad) queryLocalInterface16;
                    } else {
                        rabVar6 = new rab(readStrongBinder16);
                    }
                }
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 == null) {
                    rabVar7 = null;
                } else {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface17 instanceof rad) {
                        rabVar7 = (rad) queryLocalInterface17;
                    } else {
                        rabVar7 = new rab(readStrongBinder17);
                    }
                }
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 == null) {
                    rabVar8 = null;
                } else {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface18 instanceof rad) {
                        rabVar8 = (rad) queryLocalInterface18;
                    } else {
                        rabVar8 = new rab(readStrongBinder18);
                    }
                }
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface19 instanceof rad) {
                        radVar = (rad) queryLocalInterface19;
                    } else {
                        radVar = new rab(readStrongBinder19);
                    }
                }
                String d = this.a.d((Context) rac.b(rabVar6), (String) rac.b(rabVar7), (View) rac.b(rabVar8), (Activity) rac.b(radVar));
                parcel2.writeNoException();
                parcel2.writeString(d);
                break;
        }
        return true;
    }

    @Deprecated
    public pzo(String str, Context context, boolean z) {
        this();
        this.d = false;
        dsw n = dsw.n(str, context, z);
        this.a = n;
        this.c = new dsx(n);
        this.b = z ? null : dsr.n(context);
    }

    public pzo() {
        super("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }
}
