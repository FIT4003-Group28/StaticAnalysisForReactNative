package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: chqn  reason: default package */
/* loaded from: classes4.dex */
public final class chqn implements degu<btzx<dwmp, dwmt>> {
    final /* synthetic */ chtq a;
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ Runnable d;
    final /* synthetic */ chra e;

    public chqn(chra chraVar, chtq chtqVar, boolean z, String str, Runnable runnable) {
        this.e = chraVar;
        this.a = chtqVar;
        this.b = z;
        this.c = str;
        this.d = runnable;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (!(th instanceof btzs)) {
            dcqe dcqeVar = chra.a;
            return;
        }
        if (this.b) {
            if (!dbsj.e(this.c).equals(this.e.H.d())) {
                return;
            }
        } else if (this.e.l.containsKey(this.a) && !dbsj.e(this.c).equals(this.e.l.get(this.a).c)) {
            return;
        }
        ((btzs) th).b();
        this.e.p.add(this.a);
        this.e.af();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(btzx<dwmp, dwmt> btzxVar) {
        dcdc<chxl> c;
        Integer num;
        chvl bZ;
        chvo bK;
        dwmt b = btzxVar.b();
        int i = 2;
        int i2 = 4;
        int i3 = 1;
        if (!this.a.p() || this.b) {
            c = chsp.c(b, this.e.f);
        } else {
            chra chraVar = this.e;
            btvo btvoVar = chraVar.f;
            boolean a = chraVar.D.a();
            dwla dwlaVar = b.b;
            if (dwlaVar == null) {
                dwlaVar = dwla.m;
            }
            chvj bZ2 = chvk.d.bZ();
            int i4 = 0;
            for (dwkv dwkvVar : dwlaVar.i) {
                dwku dwkuVar = dwku.UNKNOWN_COMPONENT;
                dwku b2 = dwku.b(dwkvVar.b);
                if (b2 == null) {
                    b2 = dwku.UNKNOWN_COMPONENT;
                }
                switch (b2.ordinal()) {
                    case 1:
                        i4 += dwkvVar.c;
                        continue;
                        i = 2;
                        i2 = 4;
                        i3 = 1;
                    case 2:
                    case 4:
                    case 5:
                    case 10:
                        i = 2;
                        i2 = 4;
                        i3 = 1;
                    case 3:
                        dwrz dwrzVar = dwlaVar.e;
                        if (dwrzVar == null) {
                            dwrzVar = dwrz.d;
                        }
                        for (dwrc dwrcVar : dwrzVar.a) {
                            int a2 = dwrb.a(dwrcVar.j);
                            if (a2 == 0) {
                                a2 = 1;
                            }
                            int i5 = a2 + (-1) != i3 ? R.raw.uncover_missing_info : R.raw.check_the_facts;
                            chvl bZ3 = chvo.l.bZ();
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            chvo chvoVar = (chvo) bZ3.b;
                            chvoVar.b = i3;
                            chvoVar.a |= i3;
                            dwqz dwqzVar = dwrcVar.c;
                            if (dwqzVar == null) {
                                dwqzVar = dwqz.g;
                            }
                            String str = dwqzVar.b;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            chvo chvoVar2 = (chvo) bZ3.b;
                            str.getClass();
                            chvoVar2.a |= 2;
                            chvoVar2.c = str;
                            dwqz dwqzVar2 = dwrcVar.c;
                            if (dwqzVar2 == null) {
                                dwqzVar2 = dwqz.g;
                            }
                            String str2 = dwqzVar2.c;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            chvo chvoVar3 = (chvo) bZ3.b;
                            str2.getClass();
                            int i6 = chvoVar3.a | 8;
                            chvoVar3.a = i6;
                            chvoVar3.e = str2;
                            int i7 = i6 | 32;
                            chvoVar3.a = i7;
                            chvoVar3.g = i5;
                            dspd dspdVar = dwrcVar.b;
                            dspdVar.getClass();
                            int i8 = i7 | 64;
                            chvoVar3.a = i8;
                            chvoVar3.h = dspdVar;
                            String str3 = dwrcVar.d;
                            str3.getClass();
                            chvoVar3.a = i8 | 512;
                            chvoVar3.k = str3;
                            bZ2.a(bZ3.bK());
                            i3 = 1;
                        }
                        continue;
                        i = 2;
                        i2 = 4;
                        i3 = 1;
                    case 6:
                        if ((dwlaVar.a & 16) != 0) {
                            bZ = chvo.l.bZ();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            chvo chvoVar4 = (chvo) bZ.b;
                            chvoVar4.b = i;
                            int i9 = chvoVar4.a | i3;
                            chvoVar4.a = i9;
                            int i10 = i9 | i2;
                            chvoVar4.a = i10;
                            chvoVar4.d = R.string.RIDDLER_PROMOTION_TITLE;
                            int i11 = i10 | 16;
                            chvoVar4.a = i11;
                            chvoVar4.f = R.string.SIMPLE_YES_NO_QUESTIONS;
                            int i12 = i11 | 32;
                            chvoVar4.a = i12;
                            chvoVar4.g = R.raw.answer_questions;
                            String str4 = dwlaVar.g;
                            str4.getClass();
                            chvoVar4.a = i12 | 128;
                            chvoVar4.i = str4;
                            bK = bZ.bK();
                            break;
                        } else {
                            continue;
                            i = 2;
                            i2 = 4;
                            i3 = 1;
                        }
                    case 7:
                        if (a) {
                            bZ = chvo.l.bZ();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            chvo chvoVar5 = (chvo) bZ.b;
                            chvoVar5.b = i2;
                            int i13 = chvoVar5.a | i3;
                            chvoVar5.a = i13;
                            int i14 = i13 | i2;
                            chvoVar5.a = i14;
                            chvoVar5.d = R.string.UGC_EVENTS_ADD_EVENT;
                            int i15 = i14 | 16;
                            chvoVar5.a = i15;
                            chvoVar5.f = R.string.EVENT_CREATION_SUBTITLE_TEXT;
                            chvoVar5.a = i15 | 32;
                            chvoVar5.g = R.raw.add_a_public_event;
                            bK = bZ.bK();
                            break;
                        } else {
                            continue;
                            i = 2;
                            i2 = 4;
                            i3 = 1;
                        }
                    case 8:
                    default:
                        Object[] objArr = new Object[1];
                        dwku b3 = dwku.b(dwkvVar.b);
                        if (b3 == null) {
                            b3 = dwku.UNKNOWN_COMPONENT;
                        }
                        objArr[0] = b3;
                        bvoo.h("Unsupported ranking component: %s", objArr);
                        continue;
                        i = 2;
                        i2 = 4;
                        i3 = 1;
                    case 9:
                        if ((dwlaVar.a & 32) != 0) {
                            chvl bZ4 = chvo.l.bZ();
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            chvo chvoVar6 = (chvo) bZ4.b;
                            chvoVar6.b = 3;
                            int i16 = chvoVar6.a | i3;
                            chvoVar6.a = i16;
                            int i17 = i16 | i2;
                            chvoVar6.a = i17;
                            chvoVar6.d = R.string.TODO_SERVICE_AREA_BUSINESS_PROMO_TITLE_V2;
                            int i18 = i17 | 16;
                            chvoVar6.a = i18;
                            chvoVar6.f = R.string.TODO_SERVICE_AREA_BUSINESS_PROMO_SUBTITLE;
                            int i19 = i18 | 32;
                            chvoVar6.a = i19;
                            chvoVar6.g = R.raw.recommend_service_area_business;
                            String str5 = dwlaVar.h;
                            str5.getClass();
                            chvoVar6.a = i19 | 256;
                            chvoVar6.j = str5;
                            bK = bZ4.bK();
                            break;
                        } else {
                            continue;
                            i = 2;
                            i2 = 4;
                            i3 = 1;
                        }
                }
                bZ2.a(bK);
                i = 2;
                i2 = 4;
                i3 = 1;
            }
            if (i4 != 0) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                chvk chvkVar = (chvk) bZ2.b;
                chvkVar.a |= 1;
                chvkVar.b = i4;
            }
            chvk bK2 = bZ2.bK();
            if (chvk.d.equals(bK2)) {
                c = chsp.c(b, btvoVar);
            } else {
                ArrayList arrayList = new ArrayList(chsp.c(b, btvoVar));
                chwg bZ5 = chwh.c.bZ();
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                chwh chwhVar = (chwh) bZ5.b;
                bK2.getClass();
                chwhVar.b = bK2;
                chwhVar.a |= 1;
                chwh bK3 = bZ5.bK();
                int min = Math.min(arrayList.size(), bK2.b);
                chvz bZ6 = chxl.x.bZ();
                chxq bZ7 = chxr.e.bZ();
                int i20 = bK3.bC;
                if (i20 == 0) {
                    i20 = dsst.a.b(bK3).c(bK3);
                    bK3.bC = i20;
                }
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                chxr chxrVar = (chxr) bZ7.b;
                chxrVar.b = 4;
                chxrVar.c = Integer.valueOf(i20);
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                chxl chxlVar = (chxl) bZ6.b;
                chxr bK4 = bZ7.bK();
                bK4.getClass();
                chxlVar.b = bK4;
                chxlVar.a |= 1;
                chxi bZ8 = chxk.g.bZ();
                if (bZ8.c) {
                    bZ8.bF();
                    bZ8.c = false;
                }
                chxk chxkVar = (chxk) bZ8.b;
                bK3.getClass();
                chxkVar.c = bK3;
                chxkVar.b = 8;
                bZ6.c(bZ8);
                arrayList.add(min, bZ6.bK());
                c = dcdc.r(arrayList);
            }
        }
        if (this.b) {
            dwla dwlaVar2 = b.b;
            if (dwlaVar2 == null) {
                dwlaVar2 = dwla.m;
            }
            dwkz dwkzVar = dwlaVar2.l;
            if (dwkzVar == null) {
                dwkzVar = dwkz.k;
            }
            chtb chtbVar = this.e.H;
            chul bZ9 = chum.p.bZ();
            int i21 = dwkzVar.c;
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            chum chumVar = (chum) bZ9.b;
            int i22 = chumVar.a | 1;
            chumVar.a = i22;
            chumVar.b = i21;
            int i23 = dwkzVar.d;
            int i24 = i22 | 2;
            chumVar.a = i24;
            chumVar.c = i23;
            int i25 = dwkzVar.e;
            int i26 = i24 | 4;
            chumVar.a = i26;
            chumVar.d = i25;
            int i27 = dwkzVar.f;
            int i28 = i26 | 8;
            chumVar.a = i28;
            chumVar.e = i27;
            int i29 = dwkzVar.g;
            int i30 = i28 | 16;
            chumVar.a = i30;
            chumVar.f = i29;
            int i31 = dwkzVar.h;
            int i32 = i30 | 32;
            chumVar.a = i32;
            chumVar.g = i31;
            int i33 = i32 | 64;
            chumVar.a = i33;
            chumVar.h = 0;
            int i34 = i33 | 128;
            chumVar.a = i34;
            chumVar.i = 0;
            int i35 = i34 | 256;
            chumVar.a = i35;
            chumVar.j = 0;
            chumVar.a = i35 | 512;
            chumVar.k = 0;
            int h = chtbVar.h(dwkzVar.g, dwkzVar.h);
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            chum chumVar2 = (chum) bZ9.b;
            int i36 = chumVar2.a | 1024;
            chumVar2.a = i36;
            chumVar2.l = h;
            int i37 = i36 | 2048;
            chumVar2.a = i37;
            chumVar2.m = true;
            boolean z = dwkzVar.j;
            int i38 = i37 | 8192;
            chumVar2.a = i38;
            chumVar2.o = z;
            if ((1 & dwkzVar.a) != 0) {
                String str6 = dwkzVar.b;
                str6.getClass();
                chumVar2.a = i38 | 4096;
                chumVar2.n = str6;
            }
            chum bK5 = bZ9.bK();
            chtbVar.g(bK5.b, bK5);
            if (!chtb.e(bK5)) {
                ((ckco) chtbVar.h.a(ckdz.aL)).a(Math.min(bK5.b, 100));
            }
            num = Integer.valueOf(dwkzVar.c);
            chra chraVar2 = this.e;
            for (dwky dwkyVar : dwkzVar.i) {
                dwmk dwmkVar = dwkyVar.a;
                if (dwmkVar == null) {
                    dwmkVar = dwmk.r;
                }
                chxl d = chsp.d(dwmkVar, chraVar2.f);
                chxr chxrVar2 = d.b;
                if (chxrVar2 == null) {
                    chxrVar2 = chxr.e;
                }
                if (chraVar2.n.contains(chxrVar2)) {
                    chraVar2.H.f(dwkyVar.b);
                } else {
                    chraVar2.ah(d);
                    chtb chtbVar2 = chraVar2.H;
                    chxr chxrVar3 = d.b;
                    if (chxrVar3 == null) {
                        chxrVar3 = chxr.e;
                    }
                    chtbVar2.b.put(chxrVar3, Integer.valueOf(dwkyVar.b));
                }
            }
        } else {
            num = null;
        }
        Integer num2 = num;
        chra chraVar3 = this.e;
        chtq chtqVar = this.a;
        dccx F = dcdc.F();
        F.i(c);
        dcdc f = F.f();
        String e = dbsj.e(this.c);
        dwla dwlaVar3 = b.b;
        if (dwlaVar3 == null) {
            dwlaVar3 = dwla.m;
        }
        if (chraVar3.ag(chtqVar, f, e, dwlaVar3.c, num2)) {
            if (this.a.p()) {
                dwla dwlaVar4 = b.b;
                if (dwlaVar4 == null) {
                    dwlaVar4 = dwla.m;
                }
                if ((dwlaVar4.a & 16) != 0) {
                    final chrk chrkVar = this.e.F;
                    dwla dwlaVar5 = b.b;
                    if (dwlaVar5 == null) {
                        dwlaVar5 = dwla.m;
                    }
                    final String str7 = dwlaVar5.g;
                    if (chrkVar.j == null || !str7.equals(chrkVar.k)) {
                        chrkVar.d.b(new Runnable(chrkVar, str7) { // from class: chri
                            private final chrk a;
                            private final String b;

                            {
                                this.a = chrkVar;
                                this.b = str7;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                chrk chrkVar2 = this.a;
                                String str8 = this.b;
                                chrkVar2.j = chrkVar2.h.a().f(str8, 1, blpq.CONTRIBUTIONS_TAB_PERMANENT_ENTRY_POINT_PREFETCH);
                                chrkVar2.k = str8;
                            }
                        }, bvrj.UI_THREAD);
                    }
                }
            }
            this.e.p.remove(this.a);
        }
        Runnable runnable = this.d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
