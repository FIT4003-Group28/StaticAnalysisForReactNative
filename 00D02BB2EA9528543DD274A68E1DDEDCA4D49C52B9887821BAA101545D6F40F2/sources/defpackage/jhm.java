package defpackage;

import android.view.View;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: jhm  reason: default package */
/* loaded from: classes7.dex */
public final class jhm {
    public cqtd c;
    @dzsi
    public cqss e;
    public cjtd f;
    public jhn g;
    public boolean i;
    public boolean j;
    public Callable<Boolean> k;
    public int l;
    @dzsi
    public Integer m;
    public CharSequence a = "";
    public CharSequence b = "";
    public boolean n = true;
    public boolean o = true;
    public int h = 0;
    public cqss d = ibm.b();

    public static jhm a() {
        jhm jhmVar = new jhm();
        jhmVar.d = ibm.x();
        jhmVar.e = ibm.r();
        return jhmVar;
    }

    public static jhm b(int i) {
        jhm a = a();
        a.l = i;
        a.j = true;
        return a;
    }

    public final jho c() {
        return new jho(this);
    }

    public final void d(final View.OnClickListener onClickListener) {
        this.g = new jhn(onClickListener) { // from class: jhl
            private final View.OnClickListener a;

            {
                this.a = onClickListener;
            }

            @Override // defpackage.jhn
            public final void a(View view, cjqm cjqmVar) {
                this.a.onClick(view);
            }
        };
    }
}
