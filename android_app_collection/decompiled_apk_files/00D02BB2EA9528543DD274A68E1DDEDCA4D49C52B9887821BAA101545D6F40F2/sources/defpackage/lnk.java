package defpackage;

import com.google.android.apps.maps.R;
import com.google.android.libraries.social.populous.Autocompletion;
import com.google.android.libraries.social.populous.Person;
import com.google.android.libraries.social.populous.core.Name;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lnk  reason: default package */
/* loaded from: classes7.dex */
public final class lnk implements cxyp {
    final /* synthetic */ lnm a;
    private final Object b = new Object();
    private final dccx<Person> c = dcdc.F();
    private int d = 0;

    public lnk(lnm lnmVar) {
        this.a = lnmVar;
    }

    @Override // defpackage.cxyp
    public final void a(Autocompletion[] autocompletionArr, cxyh cxyhVar) {
        dcdc<Person> f;
        dqzx bK;
        String str;
        cydx cydxVar = cxyhVar.d;
        if (cydxVar != null) {
            String str2 = cydxVar.b().u;
        } else {
            int length = autocompletionArr.length;
            synchronized (this.b) {
                this.d += length;
            }
            for (Autocompletion autocompletion : autocompletionArr) {
                Person b = autocompletion.b();
                if (b != null) {
                    if (b.l().length != 0) {
                        synchronized (this.b) {
                            this.c.g(b);
                        }
                    } else if (b.k().length != 0) {
                        b.k()[0].a().toString();
                    }
                }
            }
        }
        if (cxyhVar.b) {
            synchronized (this.b) {
            }
            synchronized (this.b) {
                f = this.c.f();
            }
            ((ckco) this.a.g.a(ckee.A)).a(f.size());
            if (f.isEmpty()) {
                if (cydxVar == null) {
                    lnm lnmVar = this.a;
                    lnmVar.l.j(new jwe(lnmVar.b.getString(R.string.CAR_NO_CONTACTS_FOUND)));
                    return;
                }
                String str3 = cydxVar.b().u;
                lnm lnmVar2 = this.a;
                lnmVar2.l.j(new jwe(lnmVar2.b.getString(R.string.CAR_ERROR_JOURNEY_SHARING_OFFLINE)));
                return;
            }
            dccx F = dcdc.F();
            int size = f.size();
            for (int i = 0; i < size; i++) {
                final Person person = f.get(i);
                final lnm lnmVar3 = this.a;
                String a = person.a().a();
                if (!dbsj.d(a)) {
                    String charSequence = person.k().length != 0 ? person.k()[0].a().toString() : person.l()[0].a().toString();
                    int i2 = 1;
                    while (true) {
                        if (i2 >= person.k().length) {
                            break;
                        }
                        Name name = person.k()[i2];
                        if (name.b().a()) {
                            charSequence = name.a().toString();
                            break;
                        }
                        i2++;
                    }
                    dqyi bZ = dqyj.f.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dqyj dqyjVar = (dqyj) bZ.b;
                    a.getClass();
                    int i3 = dqyjVar.a | 1;
                    dqyjVar.a = i3;
                    dqyjVar.b = a;
                    charSequence.getClass();
                    dqyjVar.a = i3 | 8;
                    dqyjVar.d = charSequence;
                    if (person.n().length > 0) {
                        String c = person.n()[0].c();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dqyj dqyjVar2 = (dqyj) bZ.b;
                        c.getClass();
                        dqyjVar2.a |= 4;
                        dqyjVar2.c = c;
                    }
                    dqzw bZ2 = dqzx.c.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dqzx dqzxVar = (dqzx) bZ2.b;
                    dqyj bK2 = bZ.bK();
                    bK2.getClass();
                    dqzxVar.b = bK2;
                    dqzxVar.a = 1;
                    bK = bZ2.bK();
                } else {
                    String charSequence2 = person.k().length != 0 ? person.k()[0].a().toString() : person.l()[0].a().toString();
                    dqxz bZ3 = dqya.e.bZ();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dqya dqyaVar = (dqya) bZ3.b;
                    charSequence2.getClass();
                    dqyaVar.a |= 1;
                    dqyaVar.b = charSequence2;
                    if (person.l().length > 0) {
                        String charSequence3 = person.l()[0].a().toString();
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dqya dqyaVar2 = (dqya) bZ3.b;
                        charSequence3.getClass();
                        dqyaVar2.a |= 2;
                        dqyaVar2.c = charSequence3;
                    }
                    if (person.m().length > 0) {
                        String charSequence4 = person.m()[0].a().toString();
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dqya dqyaVar3 = (dqya) bZ3.b;
                        charSequence4.getClass();
                        dqyaVar3.a |= 4;
                        dqyaVar3.d = charSequence4;
                    }
                    dqzw bZ4 = dqzx.c.bZ();
                    dqxy bZ5 = dqyb.j.bZ();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dqyb dqybVar = (dqyb) bZ5.b;
                    dqya bK3 = bZ3.bK();
                    bK3.getClass();
                    dqybVar.c = bK3;
                    dqybVar.b = 6;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dqzx dqzxVar2 = (dqzx) bZ4.b;
                    dqyb bK4 = bZ5.bK();
                    bK4.getClass();
                    dqzxVar2.b = bK4;
                    dqzxVar2.a = 2;
                    bK = bZ4.bK();
                }
                int i4 = bK.a;
                if (i4 == 1) {
                    str = ((dqyj) bK.b).d;
                } else {
                    dqyb dqybVar2 = i4 == 2 ? (dqyb) bK.b : dqyb.j;
                    str = (dqybVar2.b == 6 ? (dqya) dqybVar2.c : dqya.e).b;
                }
                String str4 = str;
                final lnp lnpVar = new lnp(lnmVar3.m, lnmVar3.h, bK);
                String str5 = bK.a == 1 ? ((dqyj) bK.b).c : "";
                lnmVar3.j.d(ckqc.FIFE_MONOGRAM_CIRCLE_CROP.a(str5, 144, 144, null), new lnl(lnpVar), null);
                String charSequence5 = person.l()[0].a().toString();
                final int length2 = charSequence5.length();
                F.g(new jyv(str4, charSequence5, str5, new Runnable(lnmVar3, person, lnpVar, length2) { // from class: lnj
                    private final lnm a;
                    private final Person b;
                    private final lnp c;
                    private final int d;

                    {
                        this.a = lnmVar3;
                        this.b = person;
                        this.c = lnpVar;
                        this.d = length2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        lnm lnmVar4 = this.a;
                        Person person2 = this.b;
                        lnp lnpVar2 = this.c;
                        int i5 = this.d;
                        if (!lnmVar4.e.i()) {
                            lnmVar4.f.k(lnmVar4.b.getString(R.string.CAR_ERROR_JOURNEY_SHARING_OFFLINE), 1);
                            return;
                        }
                        lnmVar4.h.d(person2);
                        lnmVar4.d.b(new lnq(lnpVar2));
                        ((ckco) lnmVar4.g.a(ckee.B)).a(i5);
                        lnmVar4.m = null;
                        lnmVar4.c.a();
                    }
                }, dtxm.bd, dtxm.bd));
                this.a.h.c(person);
            }
            f.size();
            this.a.l.j(new jwe(F.f()));
        }
    }
}
