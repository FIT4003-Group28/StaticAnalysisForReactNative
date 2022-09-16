package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: chtq  reason: default package */
/* loaded from: classes4.dex */
public abstract class chtq {
    public static chtq d() {
        dcen N = dcep.N();
        N.h(chxj.RATING, chxj.REVIEW, chxj.DEVICE_PHOTO_UPLOAD, chxj.TAG_PUBLISHED_PHOTOS, chxj.PUBLISH_LIST, chxj.ADD_LIST_DESCRIPTION, chxj.ADD_LIST_ITEM_NOTE, chxj.ADD_LIST_ITEM_PHOTO, chxj.ADD_LIST_ITEMS);
        N.b(chxj.ANSWER_QUESTION);
        N.b(chxj.NO_OP);
        N.b(chxj.PLACE_REOPEN);
        return new chtm(drrx.UNKNOWN_MODE, N.f(), true);
    }

    public static chtq e() {
        return new chtm(drrx.TAGGING, dcep.B(chxj.TAG_PUBLISHED_PHOTOS), false);
    }

    public static chtq f() {
        return new chtm(drrx.RATING, dcep.B(chxj.RATING), false);
    }

    public static chtq g() {
        return new chtm(drrx.REVIEW, dcep.B(chxj.REVIEW), false);
    }

    public static chtq h() {
        return new chtm(drrx.PHOTO, dcep.B(chxj.BULK_PHOTO_UPLOAD), false);
    }

    public static chtq q(drrx drrxVar) {
        chxj chxjVar = chxj.RATING;
        drrx drrxVar2 = drrx.UNKNOWN_MODE;
        switch (drrxVar.ordinal()) {
            case 1:
                return f();
            case 2:
                return g();
            case 3:
                return h();
            case 4:
                return e();
            case 5:
                return new chtm(drrx.LIST, dcep.F(chxj.PUBLISH_LIST, chxj.ADD_LIST_DESCRIPTION, chxj.ADD_LIST_ITEM_NOTE, chxj.ADD_LIST_ITEM_PHOTO, chxj.ADD_LIST_ITEMS), false);
            case 6:
                return new chtm(drrx.ANSWER_QUESTION, dcep.B(chxj.ANSWER_QUESTION), false);
            case 7:
                return new chtm(drrx.MODERATE_EDIT, dcep.B(chxj.FACTUAL_MODERATION_TASK), false);
            default:
                return d();
        }
    }

    public abstract drrx a();

    public abstract dcep<chxj> b();

    public abstract boolean c();

    public final ddho i() {
        chxj chxjVar = chxj.RATING;
        drrx drrxVar = drrx.UNKNOWN_MODE;
        int ordinal = a().ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? ordinal != 7 ? dtxl.gt : dtxl.gv : dtxl.ht : dtxl.hN : dtxl.fQ : dtxl.hB : dtxl.hv;
    }

    @dzsi
    public final dqjy j() {
        dqjx bZ = dqjy.j.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqjy dqjyVar = (dqjy) bZ.b;
        int i = dqjyVar.a | 1;
        dqjyVar.a = i;
        dqjyVar.b = false;
        dqjyVar.a = i | 2;
        dqjyVar.c = false;
        dcpd<chxj> it = b().iterator();
        boolean z = false;
        while (it.hasNext()) {
            chxj chxjVar = chxj.RATING;
            drrx drrxVar = drrx.UNKNOWN_MODE;
            switch (it.next().ordinal()) {
                case 0:
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dqjy dqjyVar2 = (dqjy) bZ.b;
                    dqjyVar2.a |= 1;
                    dqjyVar2.b = true;
                    break;
                case 1:
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dqjy dqjyVar3 = (dqjy) bZ.b;
                    dqjyVar3.a |= 2;
                    dqjyVar3.c = true;
                    break;
                case 4:
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dqjy dqjyVar4 = (dqjy) bZ.b;
                    dqjyVar4.a |= 8;
                    dqjyVar4.d = true;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dqjy dqjyVar5 = (dqjy) bZ.b;
                    dqjyVar5.a |= 16;
                    dqjyVar5.e = true;
                    break;
                case 10:
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dqjy dqjyVar6 = (dqjy) bZ.b;
                    dqjyVar6.a |= 32;
                    dqjyVar6.f = true;
                    break;
                case 12:
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dqjy dqjyVar7 = (dqjy) bZ.b;
                    dqjyVar7.a |= 128;
                    dqjyVar7.g = true;
                    continue;
                case 13:
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dqjy dqjyVar8 = (dqjy) bZ.b;
                    dqjyVar8.a |= 256;
                    dqjyVar8.h = true;
                    continue;
                case 14:
                    dpsk bZ2 = dpsl.c.bZ();
                    dqgh dqghVar = dqgh.BUSINESS_HOURS;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dpsl dpslVar = (dpsl) bZ2.b;
                    dpslVar.b = dqghVar.af;
                    dpslVar.a |= 1;
                    dpsl bK = bZ2.bK();
                    dpsk bZ3 = dpsl.c.bZ();
                    dqgh dqghVar2 = dqgh.CLOSED;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dpsl dpslVar2 = (dpsl) bZ3.b;
                    dpslVar2.b = dqghVar2.af;
                    dpslVar2.a |= 1;
                    dpsl bK2 = bZ3.bK();
                    dpsk bZ4 = dpsl.c.bZ();
                    dqgh dqghVar3 = dqgh.DOES_NOT_EXIST;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dpsl dpslVar3 = (dpsl) bZ4.b;
                    dpslVar3.b = dqghVar3.af;
                    dpslVar3.a |= 1;
                    dcdc h = dcdc.h(bK, bK2, bZ4.bK());
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dqjy dqjyVar9 = (dqjy) bZ.b;
                    dsrj<dpsl> dsrjVar = dqjyVar9.i;
                    if (!dsrjVar.a()) {
                        dqjyVar9.i = dsqw.cl(dsrjVar);
                    }
                    dsod.bv(h, dqjyVar9.i);
                    break;
            }
            z = true;
        }
        if (z) {
            return bZ.bK();
        }
        return null;
    }

    public final boolean k() {
        return b().contains(chxj.BULK_PHOTO_UPLOAD);
    }

    public final boolean l() {
        return a().equals(drrx.MODERATE_EDIT);
    }

    public final boolean m() {
        return a().equals(drrx.UNKNOWN_MODE);
    }

    public final dcdc<chva> n(btvo btvoVar, boolean z, boolean z2, boolean z3) {
        chuz chuzVar;
        chxj chxjVar = chxj.RATING;
        drrx drrxVar = drrx.UNKNOWN_MODE;
        switch (a().ordinal()) {
            case 0:
                dccx dccxVar = new dccx();
                chuv bZ = chva.j.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                chva chvaVar = (chva) bZ.b;
                chvaVar.d = 1;
                int i = chvaVar.a | 1;
                chvaVar.a = i;
                chvaVar.a = i | 2;
                chvaVar.e = R.string.EXPERIENCE_MODE_HEADER;
                dccxVar.g(bZ.bK());
                chuv bZ2 = chva.j.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                chva chvaVar2 = (chva) bZ2.b;
                chvaVar2.d = 7;
                chvaVar2.a |= 1;
                dccxVar.g(bZ2.bK());
                chuv bZ3 = chva.j.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                chva chvaVar3 = (chva) bZ3.b;
                chvaVar3.d = 4;
                chvaVar3.a |= 1;
                dccxVar.g(bZ3.bK());
                chuv bZ4 = chva.j.bZ();
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                chva chvaVar4 = (chva) bZ4.b;
                chvaVar4.d = 2;
                int i2 = chvaVar4.a | 1;
                chvaVar4.a = i2;
                chvaVar4.a = i2 | 16;
                chvaVar4.h = R.string.SOURCE_LOCATION_AND_SEARCH_HISTORY_V2;
                chva.b(chvaVar4);
                dccxVar.g(bZ4.bK());
                if (!z && (!z2 || z3)) {
                    chuv bZ5 = chva.j.bZ();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    chva chvaVar5 = (chva) bZ5.b;
                    chvaVar5.d = 3;
                    chvaVar5.a |= 1;
                    chuz chuzVar2 = chuz.CHECK_BACK_LATER;
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    chva chvaVar6 = (chva) bZ5.b;
                    chvaVar6.i = chuzVar2.h;
                    chvaVar6.a |= 128;
                    dccxVar.g(bZ5.bK());
                }
                return dccxVar.f();
            case 1:
                chuv bZ6 = chva.j.bZ();
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                chva chvaVar7 = (chva) bZ6.b;
                chvaVar7.d = 0;
                int i3 = chvaVar7.a | 1;
                chvaVar7.a = i3;
                chvaVar7.a = i3 | 2;
                chvaVar7.e = R.string.RATING_MODE_HEADER;
                chva bK = bZ6.bK();
                chuv bZ7 = chva.j.bZ();
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                chva chvaVar8 = (chva) bZ7.b;
                chvaVar8.d = 7;
                chvaVar8.a |= 1;
                chva bK2 = bZ7.bK();
                chuv bZ8 = chva.j.bZ();
                if (bZ8.c) {
                    bZ8.bF();
                    bZ8.c = false;
                }
                chva chvaVar9 = (chva) bZ8.b;
                chvaVar9.d = 4;
                chvaVar9.a |= 1;
                chva bK3 = bZ8.bK();
                chuv bZ9 = chva.j.bZ();
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                chva chvaVar10 = (chva) bZ9.b;
                chvaVar10.d = 2;
                int i4 = chvaVar10.a | 1;
                chvaVar10.a = i4;
                chvaVar10.a = i4 | 16;
                chvaVar10.h = R.string.SOURCE_LOCATION_AND_SEARCH_HISTORY_V2;
                chva.b(chvaVar10);
                chva bK4 = bZ9.bK();
                chuv bZ10 = chva.j.bZ();
                if (bZ10.c) {
                    bZ10.bF();
                    bZ10.c = false;
                }
                chva chvaVar11 = (chva) bZ10.b;
                chvaVar11.d = 3;
                chvaVar11.a |= 1;
                chuz chuzVar3 = chuz.CHECK_BACK_LATER;
                if (bZ10.c) {
                    bZ10.bF();
                    bZ10.c = false;
                }
                chva chvaVar12 = (chva) bZ10.b;
                chvaVar12.i = chuzVar3.h;
                chvaVar12.a |= 128;
                return dcdc.j(bK, bK2, bK3, bK4, bZ10.bK());
            case 2:
                chuv bZ11 = chva.j.bZ();
                if (bZ11.c) {
                    bZ11.bF();
                    bZ11.c = false;
                }
                chva chvaVar13 = (chva) bZ11.b;
                chvaVar13.d = 0;
                int i5 = chvaVar13.a | 1;
                chvaVar13.a = i5;
                chvaVar13.a = i5 | 2;
                chvaVar13.e = R.string.REVIEW_MODE_HEADER;
                chva bK5 = bZ11.bK();
                chuv bZ12 = chva.j.bZ();
                if (bZ12.c) {
                    bZ12.bF();
                    bZ12.c = false;
                }
                chva chvaVar14 = (chva) bZ12.b;
                chvaVar14.d = 7;
                chvaVar14.a |= 1;
                chva bK6 = bZ12.bK();
                chuv bZ13 = chva.j.bZ();
                if (bZ13.c) {
                    bZ13.bF();
                    bZ13.c = false;
                }
                chva chvaVar15 = (chva) bZ13.b;
                chvaVar15.d = 4;
                chvaVar15.a |= 1;
                chva bK7 = bZ13.bK();
                chuv bZ14 = chva.j.bZ();
                if (bZ14.c) {
                    bZ14.bF();
                    bZ14.c = false;
                }
                chva chvaVar16 = (chva) bZ14.b;
                chvaVar16.d = 3;
                chvaVar16.a |= 1;
                chuz chuzVar4 = chuz.RATE_BEFORE_REVIEW;
                if (bZ14.c) {
                    bZ14.bF();
                    bZ14.c = false;
                }
                chva chvaVar17 = (chva) bZ14.b;
                chvaVar17.i = chuzVar4.h;
                chvaVar17.a |= 128;
                return dcdc.i(bK5, bK6, bK7, bZ14.bK());
            case 3:
                dccx F = dcdc.F();
                chuv bZ15 = chva.j.bZ();
                if (bZ15.c) {
                    bZ15.bF();
                    bZ15.c = false;
                }
                chva chvaVar18 = (chva) bZ15.b;
                chvaVar18.d = 0;
                int i6 = chvaVar18.a | 1;
                chvaVar18.a = i6;
                chvaVar18.a = i6 | 2;
                chvaVar18.e = R.string.PHOTO_MODE_HEADER;
                F.g(bZ15.bK());
                chuv bZ16 = chva.j.bZ();
                if (bZ16.c) {
                    bZ16.bF();
                    bZ16.c = false;
                }
                chva chvaVar19 = (chva) bZ16.b;
                chvaVar19.d = 6;
                chvaVar19.a |= 1;
                F.g(bZ16.bK());
                chva[] chvaVarArr = new chva[2];
                chuv bZ17 = chva.j.bZ();
                if (bZ17.c) {
                    bZ17.bF();
                    bZ17.c = false;
                }
                chva chvaVar20 = (chva) bZ17.b;
                chvaVar20.d = 4;
                chvaVar20.a |= 1;
                chvaVarArr[0] = bZ17.bK();
                chuv bZ18 = chva.j.bZ();
                if (bZ18.c) {
                    bZ18.bF();
                    bZ18.c = false;
                }
                chva chvaVar21 = (chva) bZ18.b;
                chvaVar21.d = 2;
                int i7 = chvaVar21.a | 1;
                chvaVar21.a = i7;
                chvaVar21.a = i7 | 16;
                chvaVar21.h = R.string.TODO_PHOTO_FROM_GOOGLE_PHOTOS;
                chvaVar21.b = 5;
                chvaVar21.c = "maps_android_add_photos_contribute";
                chvaVarArr[1] = bZ18.bK();
                F.h(chvaVarArr);
                chuv bZ19 = chva.j.bZ();
                if (bZ19.c) {
                    bZ19.bF();
                    bZ19.c = false;
                }
                chva chvaVar22 = (chva) bZ19.b;
                chvaVar22.d = 3;
                chvaVar22.a |= 1;
                chuz chuzVar5 = chuz.GOOGLE_PHOTO_AUTO_BACKUP;
                if (bZ19.c) {
                    bZ19.bF();
                    bZ19.c = false;
                }
                chva chvaVar23 = (chva) bZ19.b;
                chvaVar23.i = chuzVar5.h;
                chvaVar23.a |= 128;
                F.g(bZ19.bK());
                return F.f();
            case 4:
                boolean aS = btvoVar.getUgcParameters().aS();
                chuv bZ20 = chva.j.bZ();
                if (bZ20.c) {
                    bZ20.bF();
                    bZ20.c = false;
                }
                chva chvaVar24 = (chva) bZ20.b;
                chvaVar24.d = 0;
                int i8 = chvaVar24.a | 1;
                chvaVar24.a = i8;
                chvaVar24.a = i8 | 2;
                chvaVar24.e = R.string.TAG_DISH_MODE_HEADER;
                chva bK8 = bZ20.bK();
                chuv bZ21 = chva.j.bZ();
                if (bZ21.c) {
                    bZ21.bF();
                    bZ21.c = false;
                }
                chva chvaVar25 = (chva) bZ21.b;
                chvaVar25.d = 7;
                chvaVar25.a |= 1;
                chva bK9 = bZ21.bK();
                chuv bZ22 = chva.j.bZ();
                if (bZ22.c) {
                    bZ22.bF();
                    bZ22.c = false;
                }
                chva chvaVar26 = (chva) bZ22.b;
                chvaVar26.d = 2;
                chvaVar26.a |= 1;
                chva bK10 = bZ22.bK();
                chuv bZ23 = chva.j.bZ();
                if (bZ23.c) {
                    bZ23.bF();
                    bZ23.c = false;
                }
                chva chvaVar27 = (chva) bZ23.b;
                chvaVar27.d = 3;
                chvaVar27.a |= 1;
                if (aS) {
                    chuzVar = chuz.UPLOAD_PHOTO_BEFORE_TAG_V2;
                } else {
                    chuzVar = chuz.UPLOAD_PHOTO_BEFORE_TAG;
                }
                if (bZ23.c) {
                    bZ23.bF();
                    bZ23.c = false;
                }
                chva chvaVar28 = (chva) bZ23.b;
                chvaVar28.i = chuzVar.h;
                chvaVar28.a |= 128;
                return dcdc.i(bK8, bK9, bK10, bZ23.bK());
            case 5:
                chuv bZ24 = chva.j.bZ();
                if (bZ24.c) {
                    bZ24.bF();
                    bZ24.c = false;
                }
                chva chvaVar29 = (chva) bZ24.b;
                chvaVar29.d = 0;
                int i9 = chvaVar29.a | 1;
                chvaVar29.a = i9;
                int i10 = i9 | 2;
                chvaVar29.a = i10;
                chvaVar29.e = R.string.LIST_MODE_HEADER;
                chvaVar29.a = i10 | 4;
                chvaVar29.f = R.string.LIST_MODE_HEADER_SUBTITLE;
                chva chvaVar30 = (chva) bZ24.b;
                chvaVar30.a |= 8;
                chvaVar30.g = R.string.LIST_MODE_HEADER_SUBTITLE_LEARN_HOW;
                chva chvaVar31 = (chva) bZ24.b;
                chvaVar31.b = 5;
                chvaVar31.c = "save_places_to_lists_android";
                chva bK11 = bZ24.bK();
                chuv bZ25 = chva.j.bZ();
                if (bZ25.c) {
                    bZ25.bF();
                    bZ25.c = false;
                }
                chva chvaVar32 = (chva) bZ25.b;
                chvaVar32.d = 7;
                chvaVar32.a |= 1;
                chva bK12 = bZ25.bK();
                chuv bZ26 = chva.j.bZ();
                if (bZ26.c) {
                    bZ26.bF();
                    bZ26.c = false;
                }
                chva chvaVar33 = (chva) bZ26.b;
                chvaVar33.d = 3;
                int i11 = chvaVar33.a | 1;
                chvaVar33.a = i11;
                chvaVar33.a = i11 | 2;
                chvaVar33.e = R.string.LIST_MODE_HEADER;
                chuz chuzVar6 = chuz.CREATE_NEW_LIST;
                if (bZ26.c) {
                    bZ26.bF();
                    bZ26.c = false;
                }
                chva chvaVar34 = (chva) bZ26.b;
                chvaVar34.i = chuzVar6.h;
                chvaVar34.a |= 128;
                return dcdc.h(bK11, bK12, bZ26.bK());
            case 6:
                chuv bZ27 = chva.j.bZ();
                if (bZ27.c) {
                    bZ27.bF();
                    bZ27.c = false;
                }
                chva chvaVar35 = (chva) bZ27.b;
                chvaVar35.d = 0;
                int i12 = chvaVar35.a | 1;
                chvaVar35.a = i12;
                chvaVar35.a = i12 | 2;
                chvaVar35.e = R.string.ANSWER_QUESTION_MODE_HEADER;
                chva bK13 = bZ27.bK();
                chuv bZ28 = chva.j.bZ();
                if (bZ28.c) {
                    bZ28.bF();
                    bZ28.c = false;
                }
                chva chvaVar36 = (chva) bZ28.b;
                chvaVar36.d = 7;
                chvaVar36.a |= 1;
                return dcdc.g(bK13, bZ28.bK());
            case 7:
                chuv bZ29 = chva.j.bZ();
                if (bZ29.c) {
                    bZ29.bF();
                    bZ29.c = false;
                }
                chva chvaVar37 = (chva) bZ29.b;
                chvaVar37.d = 0;
                int i13 = chvaVar37.a | 1;
                chvaVar37.a = i13;
                chvaVar37.a = i13 | 2;
                chvaVar37.e = R.string.MODERATE_EDIT_MODE_HEADER;
                chva bK14 = bZ29.bK();
                chuv bZ30 = chva.j.bZ();
                if (bZ30.c) {
                    bZ30.bF();
                    bZ30.c = false;
                }
                chva chvaVar38 = (chva) bZ30.b;
                chvaVar38.d = 7;
                chvaVar38.a |= 1;
                chva bK15 = bZ30.bK();
                chuv bZ31 = chva.j.bZ();
                if (bZ31.c) {
                    bZ31.bF();
                    bZ31.c = false;
                }
                chva chvaVar39 = (chva) bZ31.b;
                chvaVar39.d = 2;
                int i14 = chvaVar39.a | 1;
                chvaVar39.a = i14;
                chvaVar39.a = i14 | 16;
                chvaVar39.h = R.string.SOURCE_PEOPLE_EDITS_ON_NEARBY_AND_LOCATION_HISTORY;
                chva.b(chvaVar39);
                chva bK16 = bZ31.bK();
                chuv bZ32 = chva.j.bZ();
                if (bZ32.c) {
                    bZ32.bF();
                    bZ32.c = false;
                }
                chva chvaVar40 = (chva) bZ32.b;
                chvaVar40.d = 3;
                chvaVar40.a |= 1;
                chuz chuzVar7 = chuz.MODERATE_EDIT;
                if (bZ32.c) {
                    bZ32.bF();
                    bZ32.c = false;
                }
                chva chvaVar41 = (chva) bZ32.b;
                chvaVar41.i = chuzVar7.h;
                chvaVar41.a |= 128;
                return dcdc.i(bK14, bK15, bK16, bZ32.bK());
            default:
                return dcdc.e();
        }
    }

    public final dcdc<chvd> o() {
        chxj chxjVar = chxj.RATING;
        drrx drrxVar = drrx.UNKNOWN_MODE;
        switch (a().ordinal()) {
            case 1:
                return dcdc.h(chvd.CHANGE_PLACE, chvd.DISMISS_PLACE, chvd.REMOVE_FROM_TIMELINE);
            case 2:
            case 4:
            case 7:
                return dcdc.f(chvd.DISMISS_PLACE);
            case 3:
                return dcdc.f(chvd.CHANGE_PLACE);
            case 5:
                return dcdc.e();
            case 6:
                return dcdc.e();
            default:
                return dcdc.h(chvd.CHANGE_PLACE, chvd.DISMISS_PLACE, chvd.REMOVE_FROM_TIMELINE);
        }
    }

    public final boolean p() {
        chxj chxjVar = chxj.RATING;
        drrx drrxVar = drrx.UNKNOWN_MODE;
        switch (a().ordinal()) {
            case 0:
                return true;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return false;
            default:
                throw new AssertionError(a());
        }
    }
}
