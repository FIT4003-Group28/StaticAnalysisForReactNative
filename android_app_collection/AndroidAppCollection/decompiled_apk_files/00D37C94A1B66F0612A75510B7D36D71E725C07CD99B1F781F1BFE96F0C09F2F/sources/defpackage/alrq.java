package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: alrq  reason: default package */
/* loaded from: classes.dex */
public class alrq extends dvd implements IInterface {
    public final alvg a;
    final /* synthetic */ alsm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alrq(alsm alsmVar, alvg alvgVar) {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.b = alsmVar;
        this.a = alvgVar;
    }

    public void a(Bundle bundle) {
        this.b.b.e();
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            a((Bundle) dve.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
