package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.filament.R;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
/* compiled from: PG */
/* renamed from: cmud  reason: default package */
/* loaded from: classes5.dex */
public final class cmud extends cla implements IInterface {
    public cmud(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void e(cmuc cmucVar, GoogleSignInOptions googleSignInOptions) {
        Parcel a = a();
        clc.f(a, cmucVar);
        clc.e(a, googleSignInOptions);
        Sk(102, a);
    }

    public final void f(cmuc cmucVar, GoogleSignInOptions googleSignInOptions) {
        Parcel a = a();
        clc.f(a, cmucVar);
        clc.e(a, googleSignInOptions);
        Sk(R.styleable.AppCompatTheme_textAppearanceListItem, a);
    }
}
