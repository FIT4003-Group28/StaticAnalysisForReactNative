package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: qpj  reason: default package */
/* loaded from: classes4.dex */
public final class qpj extends qxb {
    private static final Object I;
    public static final Object a;

    /* renamed from: J  reason: collision with root package name */
    private final Bundle f263J;
    private qpi K;
    private Bundle L;
    private final Map M;
    public ApplicationMetadata b;
    public final CastDevice c;
    public final Map d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public double i;
    public EqualizerSettings j;
    public int k;
    public int l;
    public String m;
    public String n;
    public final tfo o;

    static {
        new qpu("CastClientImpl");
        a = new Object();
        I = new Object();
    }

    public qpj(Context context, Looper looper, qwu qwuVar, CastDevice castDevice, tfo tfoVar, Bundle bundle, qsv qsvVar, qsw qswVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(context, looper, 10, qwuVar, qsvVar, qswVar);
        this.c = castDevice;
        this.o = tfoVar;
        this.f263J = bundle;
        this.d = new HashMap();
        new AtomicLong(0L);
        this.M = new HashMap();
        k();
        o();
    }

    private final void P() {
        synchronized (this.d) {
            this.d.clear();
        }
    }

    public static final void p() {
        synchronized (I) {
        }
    }

    @Override // defpackage.qxb, defpackage.qwr, defpackage.qsn
    public final int a() {
        return 12800000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof qpp) {
            return (qpp) queryLocalInterface;
        }
        return new qpp(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // defpackage.qwr
    protected final Bundle i() {
        Bundle bundle = new Bundle();
        this.c.c(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
        Bundle bundle2 = this.f263J;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        this.K = new qpi(this);
        qpi qpiVar = this.K;
        qpiVar.asBinder();
        bundle.putParcelable("listener", new BinderWrapper(qpiVar));
        String str = this.m;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.n;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    public final void k() {
        this.k = -1;
        this.l = -1;
        this.b = null;
        this.e = null;
        this.i = 0.0d;
        o();
        this.f = false;
        this.j = null;
    }

    @Override // defpackage.qwr, defpackage.qsn
    public final void l() {
        w();
        qpi qpiVar = this.K;
        this.K = null;
        if (qpiVar == null || qpiVar.p() == null) {
            return;
        }
        P();
        try {
            ((qpp) D()).a();
        } catch (RemoteException | IllegalStateException unused) {
        } finally {
            super.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    @Override // defpackage.qwr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r3, android.os.IBinder r4, android.os.Bundle r5, int r6) {
        /*
            r2 = this;
            r0 = 2300(0x8fc, float:3.223E-42)
            r1 = 1
            if (r3 == 0) goto L9
            if (r3 != r0) goto Ld
            r3 = 2300(0x8fc, float:3.223E-42)
        L9:
            r2.g = r1
            r2.h = r1
        Ld:
            if (r3 != r0) goto L1c
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r2.L = r3
            java.lang.String r0 = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING"
            r3.putBoolean(r0, r1)
            r3 = 0
        L1c:
            super.m(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpj.m(int, android.os.IBinder, android.os.Bundle, int):void");
    }

    public final void n(long j, int i) {
        qtu qtuVar;
        synchronized (this.M) {
            qtuVar = (qtu) this.M.remove(Long.valueOf(j));
        }
        if (qtuVar != null) {
            qtuVar.d(new Status(i));
        }
    }

    final void o() {
        qnm.n(this.c, "device should not be null");
        if (!this.c.d(2048) && this.c.d(4) && !this.c.d(1)) {
            "Chromecast Audio".equals(this.c.e);
        }
    }

    @Override // defpackage.qwr
    public final void q() {
        System.currentTimeMillis();
        P();
    }

    @Override // defpackage.qwr
    public final void r() {
        if (this.L != null) {
            this.L = null;
        }
    }
}
