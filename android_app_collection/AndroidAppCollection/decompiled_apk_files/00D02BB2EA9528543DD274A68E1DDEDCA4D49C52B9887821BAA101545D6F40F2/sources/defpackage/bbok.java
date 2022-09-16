package defpackage;

import android.app.Activity;
import android.text.SpannableString;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbok  reason: default package */
/* loaded from: classes3.dex */
public class bbok implements bblx {
    private final CharSequence a;
    private final jic b;
    private final cjtd c;
    private final dqbq d;

    public bbok(final dxio<begg> dxioVar, Activity activity, cjqy cjqyVar, dqbq dqbqVar) {
        String str;
        dpug dpugVar = dqbqVar.c;
        dpugVar = dpugVar == null ? dpug.d : dpugVar;
        int i = 0;
        if (dpugVar.b.size() > 0) {
            dnoj dnojVar = dpugVar.b.get(0);
            String str2 = dnojVar.a;
            dnpq dnpqVar = dnojVar.b;
            String str3 = (dnpqVar == null ? dnpq.g : dnpqVar).d;
            String str4 = dnojVar.c;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
            sb.append(str2);
            sb.append(str3);
            sb.append(str4);
            str = sb.toString();
        } else {
            str = "";
        }
        SpannableString spannableString = new SpannableString(str);
        if (dqbqVar.a == 3) {
            for (final dqbm dqbmVar : ((dqbn) dqbqVar.b).a) {
                String str5 = dqbmVar.b;
                int indexOf = str.indexOf(str5, i);
                if (indexOf >= 0) {
                    int length = str5.length() + indexOf;
                    i += length;
                    spannableString.setSpan(jmw.e(ibm.x().b(activity), cjqyVar, dtxy.bq, new Runnable(dqbmVar, dxioVar) { // from class: bboj
                        private final dqbm a;
                        private final dxio b;

                        {
                            this.a = dqbmVar;
                            this.b = dxioVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            dqbm dqbmVar2 = this.a;
                            dxio dxioVar2 = this.b;
                            ily ilyVar = new ily();
                            ilyVar.k(dqbmVar2.a);
                            begj begjVar = new begj();
                            begjVar.b(ilyVar.d());
                            begjVar.n = true;
                            begjVar.c = jjn.EXPANDED;
                            ((begg) dxioVar2.a()).n(begjVar, false, null);
                        }
                    }), indexOf, length, 33);
                }
            }
        }
        this.a = spannableString;
        dpug dpugVar2 = dqbqVar.c;
        dpugVar2 = dpugVar2 == null ? dpug.d : dpugVar2;
        this.b = new jic((dpugVar2.a & 2) != 0 ? dpugVar2.c : null, ckqc.FULLY_QUALIFIED, cqrt.g(2131232241, ibm.n()), 0, true, null, null);
        this.c = cjtd.a(cjth.d(dqbqVar.d));
        this.d = dqbqVar;
    }

    @Override // defpackage.bblx
    public jic a() {
        return this.b;
    }

    @Override // defpackage.bblx
    public CharSequence b() {
        return this.a;
    }

    @Override // defpackage.bblx
    public cjtd c() {
        return this.c;
    }

    @Override // defpackage.bblx
    public Boolean d() {
        return Boolean.valueOf(this.d.a == 3);
    }
}
