package defpackage;

import android.view.View;
import android.view.ViewStub;
/* compiled from: PG */
/* renamed from: zap  reason: default package */
/* loaded from: classes4.dex */
public final class zap {
    public ViewStub a;
    public View b;
    private final Class c;

    private zap(ViewStub viewStub, Class cls) {
        this.c = cls;
        viewStub.getClass();
        this.a = viewStub;
        this.b = null;
    }

    public static zap b(ViewStub viewStub, Class cls) {
        return new zap(viewStub, cls);
    }

    public final View a() {
        if (this.b == null) {
            View view = (View) this.c.cast(this.a.inflate());
            view.getClass();
            this.b = view;
            this.a = null;
        }
        return this.b;
    }

    public final boolean c() {
        return this.b != null;
    }
}
