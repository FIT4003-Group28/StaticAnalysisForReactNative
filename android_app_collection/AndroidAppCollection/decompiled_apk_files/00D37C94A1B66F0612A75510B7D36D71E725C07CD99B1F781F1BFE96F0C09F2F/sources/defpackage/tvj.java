package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: tvj  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tvj implements anir {
    public final /* synthetic */ tvs a;
    private final /* synthetic */ int b;

    public /* synthetic */ tvj(tvs tvsVar) {
        this.a = tvsVar;
    }

    public /* synthetic */ tvj(tvs tvsVar, int i) {
        this.b = i;
        this.a = tvsVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        switch (this.b) {
            case 0:
                Void r6 = (Void) obj;
                return this.a.e.b();
            case 1:
                tvs tvsVar = this.a;
                Void r62 = (Void) obj;
                SharedPreferences b = uaw.b(tvsVar.b, "gms_icing_mdd_manager_metadata", tvsVar.m);
                if (!b.contains("gms_icing_mdd_reset_trigger")) {
                    SharedPreferences.Editor edit = b.edit();
                    tvsVar.p.y();
                    edit.putInt("gms_icing_mdd_reset_trigger", 0).commit();
                }
                int i = b.getInt("gms_icing_mdd_reset_trigger", 0);
                tvsVar.p.y();
                if (i < 0) {
                    b.edit().putInt("gms_icing_mdd_reset_trigger", 0).commit();
                    int i2 = typ.a;
                    tvsVar.c.g(1045);
                    final twv twvVar = tvsVar.f;
                    return anii.i(anii.i(twvVar.c.c(), new anir() { // from class: tws
                        @Override // defpackage.anir
                        public final ankt a(Object obj2) {
                            final twv twvVar2 = twv.this;
                            List<tqy> list = (List) obj2;
                            ArrayList arrayList = new ArrayList();
                            try {
                                for (tqy tqyVar : list) {
                                    arrayList.add(anii.i(twvVar2.c.e(tqyVar), new twu(twvVar2, tqyVar), twvVar2.k));
                                }
                            } catch (Exception e) {
                                twvVar2.b.a(e, "Failed to cancel all downloads during clear", new Object[0]);
                            }
                            return anlz.j(arrayList).b(new aniq() { // from class: twh
                                @Override // defpackage.aniq
                                public final ankt a() {
                                    return twv.this.a();
                                }
                            }, twvVar2.k);
                        }
                    }, twvVar.k), new tvj(tvsVar, 2), tvsVar.n);
                }
                return anlz.q(null);
            case 2:
                tvs tvsVar2 = this.a;
                Void r63 = (Void) obj;
                return anii.i(tvsVar2.g.a(), new tvj(tvsVar2), tvsVar2.n);
            case 3:
                Void r64 = (Void) obj;
                return this.a.e.b();
            case 4:
                tvs tvsVar3 = this.a;
                Void r65 = (Void) obj;
                return amnt.f(tvsVar3.g.a(), new tvj(tvsVar3, 3), tvsVar3.n);
            case 5:
                Void r66 = (Void) obj;
                return this.a.e.c();
            case 6:
                tvs tvsVar4 = this.a;
                Void r67 = (Void) obj;
                return amnt.f(tvsVar4.g.d(), new tvj(tvsVar4, 12), tvsVar4.n);
            case 7:
                Void r68 = (Void) obj;
                return this.a.e.f();
            case 8:
                Void r69 = (Void) obj;
                this.a.p.i();
                return anlz.q(-1);
            case 9:
                tvs tvsVar5 = this.a;
                Void r610 = (Void) obj;
                tvsVar5.p.x();
                tvsVar5.c.g(1032);
                tuk tukVar = tvsVar5.d;
                return anii.i(tukVar.d.d(), new tth(tukVar, 6), tukVar.h);
            case 10:
                tvs tvsVar6 = this.a;
                twv twvVar2 = tvsVar6.f;
                SharedPreferences b2 = uaw.b(twvVar2.a, "gms_icing_mdd_shared_file_manager_metadata", twvVar2.j);
                if (b2.contains("migrated_to_new_file_key")) {
                    if (b2.getBoolean("migrated_to_new_file_key", false)) {
                        twx.e(twvVar2.a);
                    }
                    b2.edit().remove("migrated_to_new_file_key").commit();
                }
                return amnt.f(anlz.q(true), new tvj(tvsVar6, 11), tvsVar6.n);
            case 11:
                tvs tvsVar7 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    return ankq.a;
                }
                typ.g("%s Failed to init shared file manager.", "MDDManager");
                return tvsVar7.a();
            default:
                tvs tvsVar8 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    return ankq.a;
                }
                typ.g("%s Failed to init shared file metadata.", "MDDManager");
                return tvsVar8.a();
        }
    }
}
