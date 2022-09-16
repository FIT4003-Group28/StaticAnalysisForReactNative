package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: adhf  reason: default package */
/* loaded from: classes.dex */
public class adhf extends bfn {
    public final Handler b;

    public adhf() {
    }

    public static bew c(bgo bgoVar, iwl iwlVar) {
        adhb adhbVar = new adhb();
        adhbVar.aE(bgoVar);
        if (iwlVar != null) {
            adhbVar.av = iwlVar;
        }
        return adhbVar;
    }

    @Override // defpackage.bfn
    public final bew a() {
        return new adhb();
    }

    @Override // defpackage.bfn
    public bfm b() {
        return new adhe();
    }

    public adhf(byte[] bArr) {
        this.b = new Handler(Looper.getMainLooper());
    }
}
