package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: fcq  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fcq implements ampg {
    private final /* synthetic */ int s;
    public static final /* synthetic */ fcq r = new fcq(20);
    public static final /* synthetic */ fcq q = new fcq(19);
    public static final /* synthetic */ fcq p = new fcq(18);
    public static final /* synthetic */ fcq o = new fcq(16);
    public static final /* synthetic */ fcq n = new fcq(15);
    public static final /* synthetic */ fcq m = new fcq(14);
    public static final /* synthetic */ fcq l = new fcq(13);
    public static final /* synthetic */ fcq k = new fcq(12);
    public static final /* synthetic */ fcq j = new fcq(11);
    public static final /* synthetic */ fcq i = new fcq(10);
    public static final /* synthetic */ fcq h = new fcq(9);
    public static final /* synthetic */ fcq g = new fcq(8);
    public static final /* synthetic */ fcq f = new fcq(7);
    public static final /* synthetic */ fcq e = new fcq(6);
    public static final /* synthetic */ fcq d = new fcq(5);
    public static final /* synthetic */ fcq c = new fcq(4);
    public static final /* synthetic */ fcq b = new fcq(3);
    public static final /* synthetic */ fcq a = new fcq(2);

    public /* synthetic */ fcq() {
    }

    public /* synthetic */ fcq(int i2) {
        this.s = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        switch (this.s) {
            case 0:
                aopa mo52toBuilder = ((fda) obj).mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                fda fdaVar = (fda) mo52toBuilder.instance;
                fdaVar.b |= 16;
                fdaVar.g = true;
                return (fda) mo52toBuilder.mo39build();
            case 1:
                aopa mo52toBuilder2 = ((fda) obj).mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                fda fdaVar2 = (fda) mo52toBuilder2.instance;
                fdaVar2.b |= 8;
                fdaVar2.f = true;
                return (fda) mo52toBuilder2.mo39build();
            case 2:
                return Boolean.valueOf(((fcy) obj).c);
            case 3:
                return Boolean.valueOf(((fcy) obj).e);
            case 4:
                if (1 == (((fcy) obj).b & 1)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                return Boolean.valueOf(((fda) obj).g);
            case 6:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                amvn amvnVar = fdl.a;
                aopa createBuilder = fcy.a.createBuilder();
                sharedPreferences.getClass();
                fdk fdkVar = new fdk(sharedPreferences, 1);
                sharedPreferences.getClass();
                fdk fdkVar2 = new fdk(sharedPreferences);
                sharedPreferences.getClass();
                fdl.g(createBuilder, fdkVar, fdkVar2, new fdh(sharedPreferences));
                int[] o2 = ntr.o();
                for (int i2 = 0; i2 < 2; i2++) {
                    int i3 = o2[i2];
                    String e2 = fdl.e(i3);
                    if (sharedPreferences.contains(e2)) {
                        int i4 = i3 - 1;
                        if (i3 == 0) {
                            throw null;
                        }
                        createBuilder.g(i4, sharedPreferences.getLong(e2, 0L));
                    }
                }
                return (fcy) createBuilder.mo39build();
            case 7:
                aopa aopaVar = (aopa) obj;
                amvn amvnVar2 = fdl.a;
                aopaVar.copyOnWrite();
                fcy fcyVar = (fcy) aopaVar.instance;
                fcy fcyVar2 = fcy.a;
                fcyVar.b |= 16;
                fcyVar.h = 1;
                return aopaVar;
            case 8:
                amvn amvnVar3 = fdl.a;
                if (((fcy) obj).h > 0) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 9:
                aopa aopaVar2 = (aopa) obj;
                amvn amvnVar4 = fdl.a;
                aopaVar2.copyOnWrite();
                fda fdaVar3 = (fda) aopaVar2.instance;
                fda fdaVar4 = fda.a;
                fdaVar3.b |= 1024;
                fdaVar3.n = 1;
                return aopaVar2;
            case 10:
                amvn amvnVar5 = fdl.a;
                if (((fda) obj).n > 0) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 11:
                aopa aopaVar3 = (aopa) obj;
                aopaVar3.copyOnWrite();
                fgu fguVar = (fgu) aopaVar3.instance;
                fgu fguVar2 = fgu.a;
                fguVar.b |= 8;
                fguVar.g = true;
                return aopaVar3;
            case 12:
                return Boolean.valueOf(((fgu) obj).g);
            case 13:
                return ((airw) obj).V();
            case 14:
                return ((ajff) obj).C();
            case 15:
                fng fngVar = (fng) obj;
                fni fniVar = new fni();
                fniVar.a = fngVar.c;
                fniVar.b = fngVar.d;
                fniVar.c = Integer.valueOf(fngVar.e);
                fniVar.d = Long.valueOf(fngVar.f);
                fniVar.e = Long.valueOf(fngVar.g);
                fniVar.f = Boolean.valueOf(fngVar.h);
                Integer num = fniVar.c;
                if (num == null || fniVar.d == null || fniVar.e == null || fniVar.f == null) {
                    StringBuilder sb = new StringBuilder();
                    if (fniVar.c == null) {
                        sb.append(" playlistIndex");
                    }
                    if (fniVar.d == null) {
                        sb.append(" videoStartTime");
                    }
                    if (fniVar.e == null) {
                        sb.append(" lastCrashTimestamp");
                    }
                    if (fniVar.f == null) {
                        sb.append(" lastTimeShown");
                    }
                    String valueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(valueOf);
                    throw new IllegalStateException(sb2.toString());
                }
                return new fnj(fniVar.a, fniVar.b, num.intValue(), fniVar.d.longValue(), fniVar.e.longValue(), fniVar.f.booleanValue());
            case 16:
                lln llnVar = ((llo) obj).c;
                if (llnVar == null) {
                    llnVar = lln.a;
                }
                return Boolean.valueOf(llnVar.c);
            case 17:
                llq llqVar = (llq) obj;
                aopa mo52toBuilder3 = llqVar.mo52toBuilder();
                llr llrVar = llqVar.c;
                if (llrVar == null) {
                    llrVar = llr.a;
                }
                aopa mo52toBuilder4 = llrVar.mo52toBuilder();
                mo52toBuilder4.copyOnWrite();
                llr llrVar2 = (llr) mo52toBuilder4.instance;
                llrVar2.b = 2 | llrVar2.b;
                llrVar2.d = true;
                mo52toBuilder3.copyOnWrite();
                llq llqVar2 = (llq) mo52toBuilder3.instance;
                llr llrVar3 = (llr) mo52toBuilder4.mo39build();
                llrVar3.getClass();
                llqVar2.c = llrVar3;
                llqVar2.b |= 1;
                return (llq) mo52toBuilder3.mo39build();
            case 18:
                return Long.valueOf(((llq) obj).d);
            case 19:
                llr llrVar4 = ((llq) obj).c;
                if (llrVar4 == null) {
                    llrVar4 = llr.a;
                }
                return Boolean.valueOf(llrVar4.d);
            default:
                llr llrVar5 = ((llq) obj).c;
                if (llrVar5 == null) {
                    llrVar5 = llr.a;
                }
                return llrVar5.c;
        }
    }
}
