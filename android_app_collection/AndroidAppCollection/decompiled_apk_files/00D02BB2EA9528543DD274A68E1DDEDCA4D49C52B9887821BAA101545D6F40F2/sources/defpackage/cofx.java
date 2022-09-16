package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.languageprofile.LanguagePreferenceParams;
/* compiled from: PG */
/* renamed from: cofx  reason: default package */
/* loaded from: classes.dex */
public final class cofx extends cla implements IInterface {
    public cofx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.languageprofile.internal.ILanguageProfileService");
    }

    public final void e(String str, LanguagePreferenceParams languagePreferenceParams, cofw cofwVar) {
        Parcel a = a();
        a.writeString(str);
        clc.e(a, languagePreferenceParams);
        clc.f(a, cofwVar);
        Sk(3, a);
    }
}
