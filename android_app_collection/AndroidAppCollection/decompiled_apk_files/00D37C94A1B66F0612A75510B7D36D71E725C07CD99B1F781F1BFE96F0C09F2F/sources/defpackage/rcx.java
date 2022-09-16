package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: rcx  reason: default package */
/* loaded from: classes4.dex */
public final class rcx {
    public int a;
    public int b;
    final /* synthetic */ rcy c;
    private final byte[] d;

    public rcx(rcy rcyVar, byte[] bArr) {
        this.c = rcyVar;
        this.d = bArr;
    }

    public final synchronized void a() {
        try {
            rcy rcyVar = this.c;
            if (!rcyVar.a) {
                return;
            }
            rcz rczVar = rcyVar.b;
            byte[] bArr = this.d;
            Parcel pv = rczVar.pv();
            pv.writeByteArray(bArr);
            rczVar.px(5, pv);
            rcz rczVar2 = this.c.b;
            int i = this.a;
            Parcel pv2 = rczVar2.pv();
            pv2.writeInt(i);
            rczVar2.px(6, pv2);
            rcz rczVar3 = this.c.b;
            int i2 = this.b;
            Parcel pv3 = rczVar3.pv();
            pv3.writeInt(i2);
            rczVar3.px(7, pv3);
            rcz rczVar4 = this.c.b;
            Parcel pv4 = rczVar4.pv();
            pv4.writeIntArray(null);
            rczVar4.px(4, pv4);
            rcz rczVar5 = this.c.b;
            rczVar5.px(3, rczVar5.pv());
        } catch (RemoteException unused) {
        }
    }
}
