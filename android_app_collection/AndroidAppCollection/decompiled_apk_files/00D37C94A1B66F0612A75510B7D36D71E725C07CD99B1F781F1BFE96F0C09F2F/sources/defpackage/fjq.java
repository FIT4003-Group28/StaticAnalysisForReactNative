package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: fjq  reason: default package */
/* loaded from: classes3.dex */
public abstract class fjq {
    public final View a;
    protected final ajmy b;
    protected Object c;

    public fjq(View view, ajmy ajmyVar, fjp fjpVar) {
        view.getClass();
        this.a = view;
        ajmyVar.getClass();
        this.b = ajmyVar;
        if (fjpVar != null) {
            b(fjpVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final ajmu f(int i) {
        fjo fjoVar = new fjo(i);
        ajmt a = ajmu.a();
        a.d(true);
        a.c = fjoVar;
        return a.a();
    }

    public abstract void b(fjp fjpVar);

    public abstract void c(Object obj);

    public void d() {
        this.a.setVisibility(8);
        e(true);
        this.c = null;
    }

    public final void e(boolean z) {
        this.a.setClickable(z);
    }
}
