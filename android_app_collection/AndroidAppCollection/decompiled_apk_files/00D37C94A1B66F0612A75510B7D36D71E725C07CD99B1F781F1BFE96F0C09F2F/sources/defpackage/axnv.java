package defpackage;

import android.app.Activity;
import android.app.Application;
/* compiled from: PG */
/* renamed from: axnv  reason: default package */
/* loaded from: classes2.dex */
public class axnv implements axon {
    protected final Activity a;
    private volatile Object b;
    private final Object c = new Object();
    private final axon d;

    public axnv(Activity activity) {
        this.a = activity;
        this.d = new axob((abp) activity);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object b() {
        if (!(this.a.getApplication() instanceof axon)) {
            if (Application.class.equals(this.a.getApplication().getClass())) {
                throw new IllegalStateException("Sting Activity must be attached to an @Sting Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
            }
            String valueOf = String.valueOf(this.a.getApplication().getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 65);
            sb.append("Sting Activity must be attached to an @Sting Application. Found: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        dwo b = ((axnu) awwc.u(this.d, axnu.class)).b();
        b.b = this.a;
        return new dwq(b.a, b.c, b.b);
    }

    @Override // defpackage.axon
    public final Object lI() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = b();
                }
            }
        }
        return this.b;
    }
}
