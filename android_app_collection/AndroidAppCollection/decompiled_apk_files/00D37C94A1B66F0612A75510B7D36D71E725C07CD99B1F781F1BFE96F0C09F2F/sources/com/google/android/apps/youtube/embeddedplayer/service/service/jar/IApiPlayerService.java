package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.KeyEvent;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.a;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.EmbedsPrewarmData;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IApiPlayerService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public abstract class Stub extends dvd implements IApiPlayerService {

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public class Proxy extends dvc implements IApiPlayerService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService");
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void A(EmbedsPrewarmData embedsPrewarmData) {
                Parcel pv = pv();
                dve.g(pv, embedsPrewarmData);
                px(41, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void B(boolean z) {
                Parcel pv = pv();
                dve.e(pv, z);
                px(14, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void D(CommandWrapper commandWrapper) {
                Parcel pv = pv();
                dve.g(pv, commandWrapper);
                px(40, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void E(int i) {
                Parcel pv = pv();
                pv.writeInt(i);
                px(18, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void F(int i) {
                Parcel pv = pv();
                pv.writeInt(i);
                px(17, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void G(boolean z) {
                Parcel pv = pv();
                dve.e(pv, z);
                px(19, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void H(boolean z) {
                Parcel pv = pv();
                dve.e(pv, z);
                px(22, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void I(boolean z) {
                Parcel pv = pv();
                dve.e(pv, z);
                px(20, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void J() {
                px(21, pv());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void K(String str) {
                Parcel pv = pv();
                pv.writeString(str);
                px(36, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void L() {
                px(37, pv());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void M() {
                px(10, pv());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void N() {
                px(11, pv());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final boolean O() {
                Parcel pw = pw(13, pv());
                boolean j = dve.j(pw);
                pw.recycle();
                return j;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final boolean P(byte[] bArr) {
                Parcel pv = pv();
                pv.writeByteArray(bArr);
                Parcel pw = pw(29, pv);
                boolean j = dve.j(pw);
                pw.recycle();
                return j;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final byte[] Q() {
                Parcel pw = pw(33, pv());
                byte[] createByteArray = pw.createByteArray();
                pw.recycle();
                return createByteArray;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final byte[] R() {
                Parcel pw = pw(28, pv());
                byte[] createByteArray = pw.createByteArray();
                pw.recycle();
                return createByteArray;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final d a() {
                d bVar;
                Parcel pw = pw(39, pv());
                IBinder readStrongBinder = pw.readStrongBinder();
                if (readStrongBinder == null) {
                    bVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.csi.shared.ICsiControllerService");
                    if (queryLocalInterface instanceof d) {
                        bVar = (d) queryLocalInterface;
                    } else {
                        bVar = new b(readStrongBinder);
                    }
                }
                pw.recycle();
                return bVar;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final c b() {
                c aVar;
                Parcel pw = pw(42, pv());
                IBinder readStrongBinder = pw.readStrongBinder();
                if (readStrongBinder == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.IEmbedErrorLoggingService");
                    if (queryLocalInterface instanceof c) {
                        aVar = (c) queryLocalInterface;
                    } else {
                        aVar = new a(readStrongBinder);
                    }
                }
                pw.recycle();
                return aVar;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d d() {
                com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d bVar;
                Parcel pw = pw(35, pv());
                IBinder readStrongBinder = pw.readStrongBinder();
                if (readStrongBinder == null) {
                    bVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.IEmbedInteractionLoggingService");
                    if (queryLocalInterface instanceof com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d) {
                        bVar = (com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d) queryLocalInterface;
                    } else {
                        bVar = new com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.b(readStrongBinder);
                    }
                }
                pw.recycle();
                return bVar;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c e() {
                com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c aVar;
                Parcel pw = pw(32, pv());
                IBinder readStrongBinder = pw.readStrongBinder();
                if (readStrongBinder == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.ISelectableItemRegistryService");
                    if (queryLocalInterface instanceof com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c) {
                        aVar = (com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c) queryLocalInterface;
                    } else {
                        aVar = new com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.a(readStrongBinder);
                    }
                }
                pw.recycle();
                return aVar;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void f() {
                px(23, pv());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void g() {
                px(12, pv());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void h(String str, int i, int i2, int i3) {
                Parcel pv = pv();
                pv.writeString(str);
                pv.writeInt(i);
                pv.writeInt(i2);
                pv.writeInt(i3);
                px(4, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void i(String str, int i, int i2) {
                Parcel pv = pv();
                pv.writeString(str);
                pv.writeInt(i);
                pv.writeInt(i2);
                px(2, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void j(List list, int i, int i2, int i3) {
                Parcel pv = pv();
                pv.writeStringList(list);
                pv.writeInt(i);
                pv.writeInt(i2);
                pv.writeInt(i3);
                px(6, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void k(boolean z) {
                Parcel pv = pv();
                dve.e(pv, z);
                px(24, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void l(String str) {
                Parcel pv = pv();
                pv.writeString(str);
                px(38, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void m() {
                px(31, pv());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void n() {
                px(30, pv());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void o(String str, int i, int i2, boolean z, int i3) {
                Parcel pv = pv();
                pv.writeString(str);
                pv.writeInt(i);
                pv.writeInt(i2);
                dve.e(pv, z);
                pv.writeInt(i3);
                px(5, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void p(String str, boolean z, int i, boolean z2, int i2) {
                Parcel pv = pv();
                pv.writeString(str);
                dve.e(pv, z);
                pv.writeInt(i);
                dve.e(pv, z2);
                pv.writeInt(i2);
                px(3, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void q(List list, int i, int i2, boolean z, int i3) {
                Parcel pv = pv();
                pv.writeStringList(list);
                pv.writeInt(i);
                pv.writeInt(i2);
                dve.e(pv, z);
                pv.writeInt(i3);
                px(7, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void r() {
                px(15, pv());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void s(VisibilityChangeEventData visibilityChangeEventData) {
                Parcel pv = pv();
                dve.g(pv, visibilityChangeEventData);
                px(1, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void t(byte[] bArr) {
                Parcel pv = pv();
                pv.writeByteArray(bArr);
                px(34, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void u(int i, KeyEvent keyEvent) {
                Parcel pv = pv();
                pv.writeInt(i);
                dve.g(pv, keyEvent);
                px(25, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void v(int i, KeyEvent keyEvent) {
                Parcel pv = pv();
                pv.writeInt(i);
                dve.g(pv, keyEvent);
                px(26, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void w() {
                px(27, pv());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void x() {
                px(9, pv());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void y() {
                px(8, pv());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void z() {
                px(16, pv());
            }
        }

        public Stub() {
            super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService");
        }

        @Override // defpackage.dvd
        protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    s((VisibilityChangeEventData) dve.a(parcel, VisibilityChangeEventData.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    i(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    p(parcel.readString(), dve.j(parcel), parcel.readInt(), dve.j(parcel), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    h(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    o(parcel.readString(), parcel.readInt(), parcel.readInt(), dve.j(parcel), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    j(parcel.createStringArrayList(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    q(parcel.createStringArrayList(), parcel.readInt(), parcel.readInt(), dve.j(parcel), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    y();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    x();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    M();
                    parcel2.writeNoException();
                    return true;
                case 11:
                    N();
                    parcel2.writeNoException();
                    return true;
                case 12:
                    g();
                    parcel2.writeNoException();
                    return true;
                case 13:
                    boolean O = O();
                    parcel2.writeNoException();
                    dve.e(parcel2, O);
                    return true;
                case 14:
                    B(dve.j(parcel));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    r();
                    parcel2.writeNoException();
                    return true;
                case 16:
                    z();
                    parcel2.writeNoException();
                    return true;
                case 17:
                    F(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    E(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 19:
                    G(dve.j(parcel));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    I(dve.j(parcel));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    J();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    H(dve.j(parcel));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    f();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    k(dve.j(parcel));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    u(parcel.readInt(), (KeyEvent) dve.a(parcel, KeyEvent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    v(parcel.readInt(), (KeyEvent) dve.a(parcel, KeyEvent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    w();
                    parcel2.writeNoException();
                    return true;
                case 28:
                    byte[] R = R();
                    parcel2.writeNoException();
                    parcel2.writeByteArray(R);
                    return true;
                case 29:
                    boolean P = P(parcel.createByteArray());
                    parcel2.writeNoException();
                    dve.e(parcel2, P);
                    return true;
                case 30:
                    n();
                    parcel2.writeNoException();
                    return true;
                case 31:
                    m();
                    parcel2.writeNoException();
                    return true;
                case 32:
                    com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c e = e();
                    parcel2.writeNoException();
                    dve.i(parcel2, e);
                    return true;
                case 33:
                    byte[] Q = Q();
                    parcel2.writeNoException();
                    parcel2.writeByteArray(Q);
                    return true;
                case 34:
                    t(parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 35:
                    com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d d = d();
                    parcel2.writeNoException();
                    dve.i(parcel2, d);
                    return true;
                case 36:
                    K(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 37:
                    L();
                    parcel2.writeNoException();
                    return true;
                case 38:
                    l(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 39:
                    d a = a();
                    parcel2.writeNoException();
                    dve.i(parcel2, a);
                    return true;
                case 40:
                    D((CommandWrapper) dve.a(parcel, CommandWrapper.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 41:
                    A((EmbedsPrewarmData) dve.a(parcel, EmbedsPrewarmData.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 42:
                    c b = b();
                    parcel2.writeNoException();
                    dve.i(parcel2, b);
                    return true;
                default:
                    return false;
            }
        }
    }

    void A(EmbedsPrewarmData embedsPrewarmData);

    void B(boolean z);

    void D(CommandWrapper commandWrapper);

    void E(int i);

    void F(int i);

    void G(boolean z);

    void H(boolean z);

    void I(boolean z);

    void J();

    void K(String str);

    void L();

    void M();

    void N();

    boolean O();

    boolean P(byte[] bArr);

    byte[] Q();

    byte[] R();

    d a();

    c b();

    com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d d();

    com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c e();

    void f();

    void g();

    void h(String str, int i, int i2, int i3);

    void i(String str, int i, int i2);

    void j(List list, int i, int i2, int i3);

    void k(boolean z);

    void l(String str);

    void m();

    void n();

    void o(String str, int i, int i2, boolean z, int i3);

    void p(String str, boolean z, int i, boolean z2, int i2);

    void q(List list, int i, int i2, boolean z, int i3);

    void r();

    void s(VisibilityChangeEventData visibilityChangeEventData);

    void t(byte[] bArr);

    void u(int i, KeyEvent keyEvent);

    void v(int i, KeyEvent keyEvent);

    void w();

    void x();

    void y();

    void z();
}
