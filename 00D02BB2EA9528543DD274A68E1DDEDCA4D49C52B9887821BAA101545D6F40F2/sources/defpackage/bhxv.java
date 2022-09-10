package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhxv  reason: default package */
/* loaded from: classes3.dex */
public class bhxv implements bhwu {
    public boolean a;
    final /* synthetic */ bhxy b;
    private final int c;
    private final String d;

    public bhxv(bhxy bhxyVar, final int i, String str) {
        this.b = bhxyVar;
        boolean z = true;
        if (i != R.string.SCHOOL_LOCATION && i != R.string.GYM_LOCATION) {
            z = false;
        }
        dbsk.a(z);
        this.c = i;
        this.d = str;
        this.a = false;
        bhxyVar.c.b(new Runnable(this, i) { // from class: bhxt
            private final bhxv a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final bhxv bhxvVar = this.a;
                int i2 = this.b;
                bhxy bhxyVar2 = bhxvVar.b;
                String string = bhxyVar2.a.getString(i2);
                bvrj.BACKGROUND_THREADPOOL.c();
                final boolean j = dcft.j((List) deha.s(bhxyVar2.e.a().m()), new dbsl(bhxyVar2, string) { // from class: bhxc
                    private final bhxy a;
                    private final String b;

                    {
                        this.a = bhxyVar2;
                        this.b = string;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        return this.b.equals(((azva) obj).e(this.a.a));
                    }
                });
                bhxvVar.b.c.b(new Runnable(bhxvVar, j) { // from class: bhxu
                    private final bhxv a;
                    private final boolean b;

                    {
                        this.a = bhxvVar;
                        this.b = j;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bhxv bhxvVar2 = this.a;
                        boolean z2 = !this.b;
                        bhxvVar2.a = z2;
                        if (z2) {
                            cqkx.p(bhxvVar2.b);
                        }
                    }
                }, bvrj.UI_THREAD);
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.jad
    public Boolean a() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.jad
    public cqkl c() {
        this.b.o.setText(this.c);
        bhxy bhxyVar = this.b;
        bhxyVar.h = bhxyVar.a.getString(this.c);
        cqkl z = this.b.z(this.d, dtxj.aB);
        cqkx.p(this.b);
        return z;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.a(this.c == R.string.SCHOOL_LOCATION ? dtxj.aC : dtxj.az);
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return this.b.a.getString(this.c);
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        return jac.b(this);
    }

    @Override // defpackage.jad
    public Boolean h() {
        return jac.a();
    }

    @Override // defpackage.bhwu, defpackage.jad
    public cqtd i() {
        if (this.c == R.string.SCHOOL_LOCATION) {
            return cqrt.g(2131232896, ibm.x());
        }
        return cqrt.g(2131232679, ibm.x());
    }
}
