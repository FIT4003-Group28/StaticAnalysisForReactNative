package defpackage;

import android.arch.lifecycle.SavedStateHandleController;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: a  reason: default package */
/* loaded from: classes.dex */
public abstract class a extends af {
    private final blj a;
    private final apu b;
    private final Bundle c;

    public a(bll bllVar, Bundle bundle) {
        this.a = bllVar.getSavedStateRegistry();
        this.b = bllVar.getLifecycle();
        this.c = bundle;
    }

    @Override // defpackage.af, defpackage.ae
    public final ac a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b(canonicalName, cls);
    }

    @Override // defpackage.af
    public final ac b(String str, Class cls) {
        SavedStateHandleController b = SavedStateHandleController.b(this.a, this.b, str, this.c);
        ac d = d(cls, b.a);
        d.c(b);
        return d;
    }

    @Override // defpackage.ah
    public final void c(ac acVar) {
        SavedStateHandleController.c(acVar, this.a, this.b);
    }

    protected abstract ac d(Class cls, x xVar);
}
