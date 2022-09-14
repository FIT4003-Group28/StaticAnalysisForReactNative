package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: azsg  reason: default package */
/* loaded from: classes3.dex */
public abstract class azsg implements Serializable {
    @dzsi
    public transient axuc a = null;

    public static azsg g(dndr dndrVar, @dzsi ddho ddhoVar, @dzsi String str, @dzsi axuc axucVar, boolean z, boolean z2, bwqv bwqvVar) {
        azrq azrqVar = new azrq();
        if (dndrVar != null) {
            azrqVar.a = dndrVar;
            azrqVar.b = ddhoVar;
            azrqVar.c = str;
            if (axucVar == null) {
                azrqVar.d = null;
            } else {
                Bundle bundle = new Bundle();
                bwqvVar.c(bundle, "serializableAliasFlowData", axucVar);
                Parcel obtain = Parcel.obtain();
                bundle.writeToParcel(obtain, 0);
                azrqVar.d = obtain.marshall();
            }
            azrqVar.e = Boolean.valueOf(z);
            azrqVar.f = Boolean.valueOf(z2);
            String str2 = azrqVar.a == null ? " aliasType" : "";
            if (azrqVar.e == null) {
                str2 = str2.concat(" popBackStackOnSuccess");
            }
            if (azrqVar.f == null) {
                str2 = String.valueOf(str2).concat(" showGdprMessage");
            }
            if (str2.isEmpty()) {
                return new azrr(azrqVar.a, azrqVar.b, azrqVar.c, azrqVar.d, azrqVar.e.booleanValue(), azrqVar.f.booleanValue());
            }
            String valueOf = String.valueOf(str2);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        throw new NullPointerException("Null aliasType");
    }

    public abstract dndr a();

    @dzsi
    public abstract ddho b();

    @dzsi
    public abstract String c();

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public abstract byte[] d();

    public abstract boolean e();

    public abstract boolean f();
}
