package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: alsh  reason: default package */
/* loaded from: classes.dex */
public final class alsh extends dvd implements IInterface {
    final /* synthetic */ alsf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alsh(alsf alsfVar) {
        super("com.google.android.play.core.prewarm.protocol.IPrewarmServiceCallback");
        this.a = alsfVar;
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            Bundle bundle = (Bundle) dve.a(parcel, Bundle.CREATOR);
            alsy alsyVar = this.a.b;
            if (alsyVar != null) {
                alsyVar.e();
            }
            return true;
        }
        return false;
    }

    public alsh() {
        super("com.google.android.play.core.prewarm.protocol.IPrewarmServiceCallback");
    }
}
