package defpackage;

import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$DeveloperErrorException;
import java.io.IOException;
/* renamed from: cwns  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cwns implements defg {
    static final defg a = new cwns();

    private cwns() {
    }

    @Override // defpackage.defg
    public final dehn a(Object obj) {
        IOException iOException = (IOException) obj;
        cnob cnobVar = (cnob) cwik.b(iOException, cnob.class);
        if (cnobVar == null || cnobVar.a() != 10) {
            return deha.b(iOException);
        }
        return deha.b(new MdiNotAvailableException$DeveloperErrorException());
    }
}
