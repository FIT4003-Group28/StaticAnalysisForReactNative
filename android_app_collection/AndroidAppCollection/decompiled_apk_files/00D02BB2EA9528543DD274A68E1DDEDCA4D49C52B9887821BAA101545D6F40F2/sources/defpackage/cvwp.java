package defpackage;

import android.widget.TextView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
/* compiled from: PG */
/* renamed from: cvwp  reason: default package */
/* loaded from: classes5.dex */
public final class cvwp<T> {
    public final TextView a;
    private final TextView b;
    private final TextView c;
    private final AccountParticleDisc<T> d;
    private final dbsg<cvwn<T>> e;
    private final cwfn f;

    public cvwp(cvwq cvwqVar, cwfn cwfnVar, dbsg dbsgVar) {
        this.d = cvwqVar.c();
        this.b = cvwqVar.d();
        this.c = cvwqVar.e();
        this.a = cvwqVar.f();
        dbsk.s(cwfnVar);
        this.f = cwfnVar;
        this.e = dbsgVar;
    }

    private static CharSequence c(CharSequence charSequence) {
        if (charSequence != null) {
            return dbsj.f(((String) charSequence).trim());
        }
        return null;
    }

    private static String d(CharSequence charSequence) {
        return charSequence.toString().replace('-', (char) 8209);
    }

    public final void a(T t) {
        CharSequence a;
        CharSequence b;
        a = ((cwfm) t).a();
        CharSequence c = c(a);
        b = ((cwfm) t).b();
        CharSequence c2 = c(b);
        if (c == null) {
            c = c2;
        }
        if (true == czhw.a(c, c2)) {
            c2 = null;
        }
        dbsk.s(c);
        this.b.setText(d(c));
        if (c2 != null) {
            this.c.setText(d(c2));
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(8);
        }
        if (this.a != null) {
            float f = this.c.getVisibility() == 8 ? 0.5f : 1.0f;
            dbsg<cvwn<T>> dbsgVar = this.e;
            if (!dbsgVar.a()) {
                this.a.setVisibility(8);
            } else {
                final cvwm<T> a2 = dbsgVar.b().a();
                v<Integer> a3 = a2.a().a();
                if (a3.h() == null) {
                    this.a.setVisibility(8);
                }
                aa<? super Integer> aaVar = new aa(this, a2) { // from class: cvwo
                    private final cvwp a;
                    private final cvwm b;

                    {
                        this.a = this;
                        this.b = a2;
                    }

                    @Override // defpackage.aa
                    public final void m(Object obj) {
                        cvwp cvwpVar = this.a;
                        cvwm cvwmVar = this.b;
                        Integer num = (Integer) obj;
                        cvwpVar.a.getContext();
                        String c3 = cvwmVar.c();
                        if (c3 == null) {
                            cvwpVar.a.setVisibility(8);
                            return;
                        }
                        cvwpVar.a.setText(c3);
                        cvwpVar.a.setVisibility(0);
                    }
                };
                dq dqVar = (dq) this.a.getLayoutParams();
                dqVar.x = f;
                this.a.setLayoutParams(dqVar);
                a3.b(dbsgVar.b().b(), aaVar);
            }
        }
        this.d.setAccount(t);
    }

    public final String b() {
        TextView textView;
        String m = this.d.m();
        if (!this.e.a() || (textView = this.a) == null || textView.getVisibility() != 0) {
            return m;
        }
        String valueOf = String.valueOf(m);
        cvwl b = this.e.b().a().b();
        this.a.getText().toString();
        String a = b.a();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(a).length());
        sb.append(valueOf);
        sb.append("\n");
        sb.append(a);
        return sb.toString();
    }
}
