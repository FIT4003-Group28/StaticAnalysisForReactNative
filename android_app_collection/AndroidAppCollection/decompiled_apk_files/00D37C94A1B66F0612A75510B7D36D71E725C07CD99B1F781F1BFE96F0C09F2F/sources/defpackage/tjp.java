package defpackage;

import android.app.Application;
import android.hardware.display.DisplayManager;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: tjp  reason: default package */
/* loaded from: classes4.dex */
public final class tjp {
    public final tku a;
    private final WeakReference b;

    public tjp(Application application) {
        tku tkuVar = new tku();
        this.a = tkuVar;
        this.b = new WeakReference(application);
        if (tkuVar.b != null) {
            return;
        }
        tkuVar.b = (DisplayManager) application.getApplicationContext().getSystemService("display");
        tkuVar.b.registerDisplayListener(tkuVar, null);
    }

    public final Application a() {
        return (Application) this.b.get();
    }
}
