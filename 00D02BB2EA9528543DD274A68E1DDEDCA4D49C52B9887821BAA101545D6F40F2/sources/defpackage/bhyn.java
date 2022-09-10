package defpackage;

import android.app.AlertDialog;
import android.widget.LinearLayout;
import com.google.android.apps.gmm.base.components.edittext.IncognitoAwareEditText;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhyn  reason: default package */
/* loaded from: classes3.dex */
public class bhyn implements bhwy {
    final /* synthetic */ bhyo a;
    private final dnkb b;
    private final int c;
    @dzsi
    private final dnha d;
    @dzsi
    private final String e;

    public bhyn(bhyo bhyoVar, dnkb dnkbVar, @dzsi int i, dnha dnhaVar) {
        this.a = bhyoVar;
        this.b = dnkbVar;
        this.c = i;
        this.d = dnhaVar;
        this.e = dnhaVar != null ? dnhaVar.b : null;
    }

    private final void c(@dzsi String str) {
        String str2;
        AlertDialog.Builder title = new AlertDialog.Builder(this.a.f).setTitle(R.string.ALIAS_UPDATE_CONTACT_ADDRESS_CONFIRMATION_PROMPT);
        bhyo bhyoVar = this.a;
        ff ffVar = bhyoVar.f;
        Object[] objArr = new Object[2];
        objArr[0] = bhyoVar.c;
        dnkb dnkbVar = dnkb.UNKNOWN;
        int ordinal = this.b.ordinal();
        if (ordinal == 1) {
            dnkc dnkcVar = this.d.a;
            if (dnkcVar == null) {
                dnkcVar = dnkc.h;
            }
            str2 = dnkcVar.c;
        } else if (ordinal != 2) {
            str2 = ordinal != 3 ? null : this.a.f.getString(R.string.WORK_LOCATION);
        } else {
            str2 = this.a.f.getString(R.string.HOME_LOCATION);
        }
        objArr[1] = str2;
        AlertDialog.Builder message = title.setMessage(ffVar.getString(R.string.ALIAS_UPDATE_CONTACT_ADDRESS_CONFIRMATION_MESSAGE, objArr));
        message.setPositiveButton(R.string.UPDATE_BUTTON, new bhyl(this, str));
        message.setNegativeButton(R.string.CANCEL_BUTTON, new bhym());
        message.create().show();
    }

    @Override // defpackage.bhwy
    public Boolean a() {
        return Boolean.valueOf(!dbsj.d(this.e));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(@dzsi String str) {
        dvjt bK;
        bhyo bhyoVar = this.a;
        if (bhyoVar.b == null) {
            bK = bhyoVar.i(this.b, str);
        } else {
            dnha dnhaVar = this.d;
            dnkb dnkbVar = this.b;
            dvjr dvjrVar = bhyoVar.i;
            if (dvjrVar == null || (dvjrVar.a & 4) == 0) {
                dvjs bZ = dvjt.h.bZ();
                bZ.bC(bhyoVar.i(dnkbVar, str));
                String str2 = bhyoVar.b.b;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dvjt dvjtVar = (dvjt) bZ.b;
                str2.getClass();
                dvjtVar.a |= 4;
                dvjtVar.e = str2;
                bK = bZ.bK();
            } else {
                dnjz j = bhyoVar.j(dnkbVar, str);
                long j2 = bhyoVar.i.d;
                if (j.c) {
                    j.bF();
                    j.c = false;
                }
                dnkc dnkcVar = (dnkc) j.b;
                dnkc dnkcVar2 = dnkc.h;
                dnkcVar.a |= 16;
                dnkcVar.f = j2;
                dnkc bK2 = j.bK();
                if (dnhaVar == null) {
                    dvjs bZ2 = dvjt.h.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dvjt dvjtVar2 = (dvjt) bZ2.b;
                    bK2.getClass();
                    dvjtVar2.c = bK2;
                    dvjtVar2.a |= 2;
                    dvjt dvjtVar3 = (dvjt) bZ2.b;
                    dvjtVar3.b = 2;
                    int i = dvjtVar3.a | 1;
                    dvjtVar3.a = i;
                    String str3 = bhyoVar.c;
                    str3.getClass();
                    int i2 = i | 8;
                    dvjtVar3.a = i2;
                    dvjtVar3.f = str3;
                    String str4 = bhyoVar.b.b;
                    str4.getClass();
                    dvjtVar3.a = i2 | 4;
                    dvjtVar3.e = str4;
                    bK = bZ2.bK();
                } else {
                    dvjs bZ3 = dvjt.h.bZ();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dvjt dvjtVar4 = (dvjt) bZ3.b;
                    bK2.getClass();
                    dvjtVar4.c = bK2;
                    dvjtVar4.a |= 2;
                    dnkc dnkcVar3 = dnhaVar.a;
                    if (dnkcVar3 == null) {
                        dnkcVar3 = dnkc.h;
                    }
                    dsqp dsqpVar = (dsqp) dnkcVar3.cu(5);
                    dsqpVar.bC(dnkcVar3);
                    dnjz dnjzVar = (dnjz) dsqpVar;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dvjt dvjtVar5 = (dvjt) bZ3.b;
                    dnkc bK3 = dnjzVar.bK();
                    bK3.getClass();
                    dsrj<dnkc> dsrjVar = dvjtVar5.d;
                    if (!dsrjVar.a()) {
                        dvjtVar5.d = dsqw.cl(dsrjVar);
                    }
                    dvjtVar5.d.add(bK3);
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dvjt dvjtVar6 = (dvjt) bZ3.b;
                    dvjtVar6.b = 3;
                    int i3 = dvjtVar6.a | 1;
                    dvjtVar6.a = i3;
                    String str5 = bhyoVar.c;
                    str5.getClass();
                    int i4 = i3 | 8;
                    dvjtVar6.a = i4;
                    dvjtVar6.f = str5;
                    String str6 = bhyoVar.b.b;
                    str6.getClass();
                    dvjtVar6.a = i4 | 4;
                    dvjtVar6.e = str6;
                    bK = bZ3.bK();
                }
            }
        }
        bhyo bhyoVar2 = this.a;
        bhyoVar2.k.a(bK, new bhyd(bhyoVar2), bvrj.BACKGROUND_THREADPOOL);
        bhyo bhyoVar3 = this.a;
        bhyoVar3.h = true;
        cqkx.p(bhyoVar3);
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        return cqrt.g(this.c, irg.j());
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        if (this.b == dnkb.HOME || this.b == dnkb.WORK) {
            if (!a().booleanValue()) {
                b(null);
                return cqkl.a;
            }
            c(null);
        } else if (a().booleanValue()) {
            dnkc dnkcVar = this.d.a;
            if (dnkcVar == null) {
                dnkcVar = dnkc.h;
            }
            c(dnkcVar.c);
        } else {
            bhyo bhyoVar = this.a;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int a = (int) irh.b().a(this.a.f);
            layoutParams.setMarginStart(a);
            layoutParams.setMarginEnd(a);
            IncognitoAwareEditText incognitoAwareEditText = new IncognitoAwareEditText(this.a.f);
            incognitoAwareEditText.setLayoutParams(layoutParams);
            incognitoAwareEditText.setInputType(8193);
            bhyoVar.j = incognitoAwareEditText;
            LinearLayout linearLayout = new LinearLayout(this.a.f);
            linearLayout.addView(this.a.j);
            AlertDialog.Builder view = new AlertDialog.Builder(this.a.f).setTitle(R.string.ALIAS_CONTACT_CUSTOM_LABEL_DIALOG).setView(linearLayout);
            view.setNegativeButton(R.string.CANCEL_BUTTON, new bhyh());
            view.setPositiveButton(R.string.ADD_BUTTON, new bhyi(this));
            AlertDialog create = view.create();
            create.show();
            create.getButton(-1).setEnabled(false);
            this.a.j.addTextChangedListener(new bhyj(create));
            this.a.j.post(new bhyk(this));
        }
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    @dzsi
    public cjtd h() {
        return null;
    }

    @Override // defpackage.jbi
    @dzsi
    public CharSequence m() {
        return this.e;
    }

    @Override // defpackage.jbf
    @dzsi
    public CharSequence l() {
        String string;
        if (this.d == null) {
            dnkb dnkbVar = dnkb.UNKNOWN;
            int ordinal = this.b.ordinal();
            if (ordinal == 1) {
                return this.a.f.getString(R.string.ALIAS_CONTACT_ADD_CUSTOM_LABEL);
            }
            if (ordinal == 2) {
                return this.a.f.getString(R.string.ALIAS_ADD_HOME);
            }
            if (ordinal == 3) {
                return this.a.f.getString(R.string.ALIAS_ADD_WORK);
            }
            return null;
        }
        dnkb dnkbVar2 = dnkb.UNKNOWN;
        int ordinal2 = this.b.ordinal();
        if (ordinal2 == 2) {
            string = this.a.f.getString(R.string.ADDRESS_TYPE_HOME);
        } else if (ordinal2 == 3) {
            string = this.a.f.getString(R.string.ADDRESS_TYPE_WORK);
        } else if (ordinal2 != 4) {
            dnkc dnkcVar = this.d.a;
            if (dnkcVar == null) {
                dnkcVar = dnkc.h;
            }
            string = dnkcVar.c;
        } else {
            string = this.a.f.getString(R.string.ADDRESS_TYPE_OTHER);
        }
        return this.a.f.getString(R.string.ALIAS_CONTACT_REPLACE, new Object[]{string});
    }
}
