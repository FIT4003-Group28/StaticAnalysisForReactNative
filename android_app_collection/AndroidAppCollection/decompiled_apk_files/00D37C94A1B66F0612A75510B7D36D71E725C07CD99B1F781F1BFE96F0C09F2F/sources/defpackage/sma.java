package defpackage;

import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import com.google.common.util.concurrent.SettableFuture;
/* compiled from: PG */
/* renamed from: sma  reason: default package */
/* loaded from: classes4.dex */
public final class sma extends dvd implements IInterface {
    public slv a;
    public boolean b;
    public slw c;
    protected SettableFuture d;
    public gpr e;

    public sma(byte[] bArr) {
        super("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback");
        new Handler(Looper.getMainLooper());
        this.d = SettableFuture.f();
        this.c = new slw();
        this.d.o(slx.a);
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.createByteArray();
            Log.w("AIClientCbStub", String.format("callback is not an instance of CallbackExt: %s", this.e));
            return true;
        }
        return false;
    }

    public sma() {
        super("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback");
    }
}
