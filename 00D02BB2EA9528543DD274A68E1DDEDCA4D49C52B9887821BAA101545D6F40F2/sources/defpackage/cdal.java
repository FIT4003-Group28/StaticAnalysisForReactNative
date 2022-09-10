package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: cdal  reason: default package */
/* loaded from: classes4.dex */
public class cdal implements cdai {
    private final Context a;
    private final cdbb b;
    private final jlp c;
    private volatile int d;
    private volatile boolean e;
    private final boolean f;
    @dzsi
    private jmb g;

    public cdal(cdbb cdbbVar, Context context, int i, cqhn cqhnVar, cqhu cqhuVar, jlp jlpVar, btvo btvoVar) {
        this.b = cdbbVar;
        this.a = context;
        this.d = i;
        this.c = jlpVar;
        this.f = !btvoVar.getPhotoUploadParameters().g;
    }

    private final CharSequence k() {
        if (this.d == 0) {
            return this.a.getResources().getString(R.string.TODO_PHOTO_POINTS_COUNTER_TOOLTIP_ZERO_PHOTOS);
        }
        return this.a.getResources().getQuantityString(R.plurals.TODO_PHOTO_POINTS_COUNTER_TOOLTIP_N_PHOTOS, this.d, Integer.valueOf(this.d));
    }

    @Override // defpackage.cdai
    public Integer a() {
        return Integer.valueOf(this.d);
    }

    @Override // defpackage.cdai
    public Integer b(int i, int i2) {
        int i3 = this.d;
        while (i < 3) {
            i3 /= 10;
            i++;
        }
        return Integer.valueOf(i3 % 10);
    }

    @Override // defpackage.cdai
    public void c(int i) {
        bvrj.UI_THREAD.c();
        this.d = i;
        cqkx.p(this);
    }

    @Override // defpackage.cdai
    public CharSequence d() {
        return this.a.getResources().getQuantityString(R.plurals.TODO_PHOTO_MESSAGE_IN_POINTS_COUNTER_BOX, this.d, Integer.valueOf(this.d));
    }

    @Override // defpackage.cdai
    public CharSequence e() {
        return k();
    }

    @Override // defpackage.cdai
    public Boolean f() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.cdai
    public void g(boolean z) {
        bvrj.UI_THREAD.c();
        this.e = z;
        cqkx.p(this);
    }

    @Override // defpackage.cdai
    public Boolean h() {
        boolean z = false;
        if (this.f) {
            cdbb cdbbVar = this.b;
            bvrj.UI_THREAD.c();
            if (cdbbVar.d) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cdai
    public cqkl i() {
        jmb jmbVar = this.g;
        if (jmbVar != null) {
            jmbVar.a();
        }
        View view = this.b.P;
        dbuh.d(view);
        View a = cqhu.a(view, cdeg.e);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        jlp jlpVar = this.c;
        String charSequence = k().toString();
        dbuh.d(a);
        jlo a2 = jlpVar.a(charSequence, a);
        a2.l(20);
        a2.i();
        a2.f(new Runnable(atomicBoolean) { // from class: cdaj
            private final AtomicBoolean a;

            {
                this.a = atomicBoolean;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.set(true);
            }
        }, dege.a);
        a2.c(new dbty(atomicBoolean) { // from class: cdak
            private final AtomicBoolean a;

            {
                this.a = atomicBoolean;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(!this.a.get());
            }
        });
        a2.m(5000);
        a2.o(true);
        a2.p();
        a2.u(irg.a().b(this.a));
        a2.q(iva.c(R.color.qu_orange_400, R.color.quantum_orange500).b(this.a));
        this.g = a2.a();
        return cqkl.a;
    }

    @Override // defpackage.cdai
    public cjtd j() {
        return cjtd.a(dtxy.oV);
    }
}
