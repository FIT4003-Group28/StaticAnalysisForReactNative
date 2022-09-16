package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: qad  reason: default package */
/* loaded from: classes4.dex */
public final class qad extends qwr {
    private final int a;

    public qad(Context context, Looper looper, qwi qwiVar, qwj qwjVar, int i) {
        super(context, looper, 116, qwiVar, qwjVar);
        this.a = i;
    }

    @Override // defpackage.qwr, defpackage.qsn
    public final int a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        if (queryLocalInterface instanceof rcq) {
            return (rcq) queryLocalInterface;
        }
        return new rcq(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.gass.START";
    }

    public final rcq e() {
        return (rcq) super.D();
    }
}
