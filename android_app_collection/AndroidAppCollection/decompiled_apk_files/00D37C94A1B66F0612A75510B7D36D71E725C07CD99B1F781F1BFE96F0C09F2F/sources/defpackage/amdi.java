package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: amdi  reason: default package */
/* loaded from: classes.dex */
public final class amdi implements vld {
    final /* synthetic */ amdk c;
    final /* synthetic */ amdn d;
    final /* synthetic */ String b = "accountmanager";
    public final AtomicReference a = new AtomicReference();

    public amdi(amdk amdkVar, amdn amdnVar) {
        this.c = amdkVar;
        this.d = amdnVar;
        "accountmanager".concat("_account_data_cleared_to_fix_downgrade");
    }

    @Override // defpackage.vld
    public final ankt a() {
        return anlz.m(this.c.b.qp(new amdh(this, 1)), this.c.c.b(new amcf(5), anjk.a)).a(almu.o(), anjk.a);
    }

    @Override // defpackage.vld
    public final ankt b(aoqu aoquVar) {
        final amdn amdnVar = this.d;
        final amdj amdjVar = (amdj) this.a.get();
        final amdp amdpVar = (amdp) aoquVar;
        return anlz.v(ammo.b(new aniq() { // from class: amdl
            @Override // defpackage.aniq
            public final ankt a() {
                String str;
                amdn amdnVar2 = amdn.this;
                final amdj amdjVar2 = amdjVar;
                final amdp amdpVar2 = amdpVar;
                final ArrayList arrayList = new ArrayList();
                int a = amdjVar2.a();
                amuf f = amuk.f();
                char c = 0;
                for (int i = 0; i < a; i++) {
                    if (amdjVar2.a.contains(amdj.c(i, "created"))) {
                        f.h(AccountId.b(i));
                    }
                }
                amuk g = f.g();
                int i2 = ((amxx) g).c;
                int i3 = 0;
                while (i3 < i2) {
                    AccountId accountId = (AccountId) g.get(i3);
                    String[] strArr = new String[12];
                    strArr[c] = "display_name";
                    strArr[1] = "account_name";
                    strArr[2] = "effective_gaia_id";
                    strArr[3] = "gaia_id";
                    strArr[4] = "profile_photo_url";
                    strArr[5] = "is_managed_account";
                    strArr[6] = "display_name";
                    strArr[7] = "avatar_url";
                    strArr[8] = "gaia_id";
                    strArr[9] = "email_gaia_id";
                    amuk amukVar = g;
                    strArr[10] = "logged_in";
                    int i4 = i2;
                    strArr[11] = "logged_out";
                    amdn amdnVar3 = amdnVar2;
                    amdp amdpVar3 = amdpVar2;
                    int i5 = 0;
                    while (i5 < 12) {
                        amdjVar2.b.add(amdj.d(accountId, strArr[i5]));
                        i5++;
                        strArr = strArr;
                    }
                    aopc aopcVar = (aopc) ambp.a.createBuilder();
                    aopcVar.copyOnWrite();
                    ambp ambpVar = (ambp) aopcVar.instance;
                    ambpVar.b |= 256;
                    ambpVar.i = "google";
                    if (amdjVar2.e(accountId, "is_managed_account")) {
                        aopcVar.copyOnWrite();
                        ambp ambpVar2 = (ambp) aopcVar.instance;
                        ambpVar2.b |= 64;
                        ambpVar2.g = true;
                        String b = amdjVar2.b(accountId, "account_name");
                        aopcVar.copyOnWrite();
                        ambp ambpVar3 = (ambp) aopcVar.instance;
                        b.getClass();
                        ambpVar3.b |= 16;
                        ambpVar3.e = b;
                        String b2 = amdjVar2.b(accountId, "display_name");
                        aopcVar.copyOnWrite();
                        ambp ambpVar4 = (ambp) aopcVar.instance;
                        b2.getClass();
                        ambpVar4.b |= 2;
                        ambpVar4.d = b2;
                        String b3 = amdjVar2.b(accountId, "effective_gaia_id");
                        aopcVar.copyOnWrite();
                        ambp ambpVar5 = (ambp) aopcVar.instance;
                        b3.getClass();
                        ambpVar5.b |= 1;
                        ambpVar5.c = b3;
                        String b4 = amdjVar2.b(accountId, "gaia_id");
                        aopcVar.copyOnWrite();
                        ambp ambpVar6 = (ambp) aopcVar.instance;
                        b4.getClass();
                        ambpVar6.b |= 128;
                        ambpVar6.h = b4;
                        String b5 = amdjVar2.b(accountId, "avatar_url");
                        if (b5 != null) {
                            aopcVar.copyOnWrite();
                            ambp ambpVar7 = (ambp) aopcVar.instance;
                            ambpVar7.b |= 32;
                            ambpVar7.f = b5;
                        }
                        c = 0;
                    } else {
                        String b6 = amdjVar2.b(accountId, "account_name");
                        aopcVar.copyOnWrite();
                        ambp ambpVar8 = (ambp) aopcVar.instance;
                        b6.getClass();
                        ambpVar8.b |= 16;
                        ambpVar8.e = b6;
                        int i6 = 2;
                        c = 0;
                        String[] strArr2 = {"display_name", "account_name"};
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                str = null;
                                break;
                            }
                            str = amdjVar2.b(accountId, strArr2[i7]);
                            if (str != null) {
                                break;
                            }
                            i7++;
                            i6 = 2;
                        }
                        aopcVar.copyOnWrite();
                        ambp ambpVar9 = (ambp) aopcVar.instance;
                        str.getClass();
                        ambpVar9.b |= 2;
                        ambpVar9.d = str;
                        String b7 = amdjVar2.b(accountId, "gaia_id");
                        aopcVar.copyOnWrite();
                        ambp ambpVar10 = (ambp) aopcVar.instance;
                        b7.getClass();
                        ambpVar10.b |= 1;
                        ambpVar10.c = b7;
                        String b8 = amdjVar2.b(accountId, "profile_photo_url");
                        if (b8 != null) {
                            aopcVar.copyOnWrite();
                            ambp ambpVar11 = (ambp) aopcVar.instance;
                            ambpVar11.b |= 32;
                            ambpVar11.f = b8;
                        }
                    }
                    boolean e = amdjVar2.e(accountId, "logged_in");
                    boolean e2 = amdjVar2.e(accountId, "logged_out");
                    aopa createBuilder = amds.a.createBuilder();
                    int a2 = accountId.a();
                    createBuilder.copyOnWrite();
                    amds amdsVar = (amds) createBuilder.instance;
                    amdsVar.b |= 1;
                    amdsVar.c = a2;
                    createBuilder.copyOnWrite();
                    amds amdsVar2 = (amds) createBuilder.instance;
                    ambp ambpVar12 = (ambp) aopcVar.mo39build();
                    ambpVar12.getClass();
                    amdsVar2.d = ambpVar12;
                    amdsVar2.b |= 2;
                    int i8 = e ? 2 : e2 ? 3 : 1;
                    createBuilder.copyOnWrite();
                    amds amdsVar3 = (amds) createBuilder.instance;
                    amdsVar3.e = i8 - 1;
                    amdsVar3.b |= 4;
                    arrayList.add(anlz.q((amds) createBuilder.mo39build()));
                    i3++;
                    amdnVar2 = amdnVar3;
                    amdpVar2 = amdpVar3;
                    g = amukVar;
                    i2 = i4;
                }
                return anlz.j(arrayList).a(ammo.g(new Callable() { // from class: amdm
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        amdp amdpVar4 = amdp.this;
                        amdj amdjVar3 = amdjVar2;
                        List<ankt> list = arrayList;
                        aopa mo52toBuilder = amdpVar4.mo52toBuilder();
                        int a3 = amdjVar3.a();
                        mo52toBuilder.copyOnWrite();
                        amdp amdpVar5 = (amdp) mo52toBuilder.instance;
                        amdpVar5.b |= 1;
                        amdpVar5.c = a3;
                        for (ankt anktVar : list) {
                            amds amdsVar4 = (amds) anlz.y(anktVar);
                            mo52toBuilder.H(amdsVar4.c, amdsVar4);
                        }
                        return (amdp) mo52toBuilder.mo39build();
                    }
                }), amdnVar2.a);
            }
        }), amdnVar.a);
    }

    @Override // defpackage.vld
    public final ankt c() {
        return anii.h(anii.i(this.c.b.qp(new amdh(this)), new aefs(anii.h(this.c.c.a(), new amcf(4), anjk.a), 2), anjk.a), new ampg() { // from class: amdg
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                amdi amdiVar = amdi.this;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    amdiVar.a.set(new amdj(amdiVar.c.a.getSharedPreferences("accounts", 0)));
                }
                return bool;
            }
        }, this.c.b);
    }
}
