package defpackage;

import android.content.SharedPreferences;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: adch  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adch implements ampg {
    private final /* synthetic */ int u;
    public static final /* synthetic */ adch t = new adch(20);
    public static final /* synthetic */ adch s = new adch(19);
    public static final /* synthetic */ adch r = new adch(18);
    public static final /* synthetic */ adch q = new adch(17);
    public static final /* synthetic */ adch p = new adch(16);
    public static final /* synthetic */ adch o = new adch(14);
    public static final /* synthetic */ adch n = new adch(13);
    public static final /* synthetic */ adch m = new adch(12);
    public static final /* synthetic */ adch l = new adch(11);
    public static final /* synthetic */ adch k = new adch(10);
    public static final /* synthetic */ adch j = new adch(9);
    public static final /* synthetic */ adch i = new adch(8);
    public static final /* synthetic */ adch h = new adch(7);
    public static final /* synthetic */ adch g = new adch(6);
    public static final /* synthetic */ adch f = new adch(5);
    public static final /* synthetic */ adch e = new adch(4);
    public static final /* synthetic */ adch d = new adch(3);
    public static final /* synthetic */ adch c = new adch(2);
    public static final /* synthetic */ adch b = new adch(1);
    public static final /* synthetic */ adch a = new adch();

    private /* synthetic */ adch() {
    }

    public /* synthetic */ adch(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        int i2;
        aopa mo52toBuilder;
        aopa mo52toBuilder2;
        boolean z = false;
        switch (this.u) {
            case 0:
                awtv awtvVar = (awtv) obj;
                int i3 = adci.d;
                return awtvVar == null ? "" : awtvVar.c;
            case 1:
                awtv awtvVar2 = (awtv) obj;
                int i4 = adci.d;
                String.format("ClearStore: [id=%s][ignoredCount=%s]", awtvVar2.c, Integer.valueOf(awtvVar2.d));
                return awtv.a;
            case 2:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                aopa createBuilder = awty.a.createBuilder();
                int i5 = sharedPreferences.getInt("mdx.recovery.session_type", -1);
                createBuilder.copyOnWrite();
                awty awtyVar = (awty) createBuilder.instance;
                awtyVar.b |= 1;
                awtyVar.c = i5;
                int i6 = sharedPreferences.getInt("mdx.recovery.disconnect_reason", -1);
                createBuilder.copyOnWrite();
                awty awtyVar2 = (awty) createBuilder.instance;
                awtyVar2.b = 2 | awtyVar2.b;
                awtyVar2.d = i6;
                long j2 = sharedPreferences.getLong("mdx.recovery.last_connected_time", -1L);
                createBuilder.copyOnWrite();
                awty awtyVar3 = (awty) createBuilder.instance;
                awtyVar3.b |= 4;
                awtyVar3.e = j2;
                long j3 = sharedPreferences.getLong("mdx.recovery.expiration_time", -1L);
                createBuilder.copyOnWrite();
                awty awtyVar4 = (awty) createBuilder.instance;
                awtyVar4.b |= 8;
                awtyVar4.f = j3;
                String string = sharedPreferences.getString("mdx.recovery.route_id", "");
                createBuilder.copyOnWrite();
                awty awtyVar5 = (awty) createBuilder.instance;
                string.getClass();
                awtyVar5.b |= 32;
                awtyVar5.g = string;
                String string2 = sharedPreferences.getString("mdx.recovery.ssdp_id", "");
                createBuilder.copyOnWrite();
                awty awtyVar6 = (awty) createBuilder.instance;
                string2.getClass();
                awtyVar6.b |= 4096;
                awtyVar6.m = string2;
                String string3 = sharedPreferences.getString("mdx.recovery.screen_name", "");
                createBuilder.copyOnWrite();
                awty awtyVar7 = (awty) createBuilder.instance;
                string3.getClass();
                awtyVar7.b |= 128;
                awtyVar7.h = string3;
                String string4 = sharedPreferences.getString("mdx.recovery.session_nonce", "");
                createBuilder.copyOnWrite();
                awty awtyVar8 = (awty) createBuilder.instance;
                string4.getClass();
                awtyVar8.b |= 256;
                awtyVar8.i = string4;
                int i7 = sharedPreferences.getInt("mdx.recovery.session_index", 0);
                createBuilder.copyOnWrite();
                awty awtyVar9 = (awty) createBuilder.instance;
                awtyVar9.b |= 512;
                awtyVar9.j = i7;
                long j4 = sharedPreferences.getLong("mdx.recovery.first_connected_time_ms", -1L);
                createBuilder.copyOnWrite();
                awty awtyVar10 = (awty) createBuilder.instance;
                awtyVar10.b |= 2048;
                awtyVar10.l = j4;
                long j5 = sharedPreferences.getLong("mdx.recovery.started_time_ms", -1L);
                createBuilder.copyOnWrite();
                awty awtyVar11 = (awty) createBuilder.instance;
                awtyVar11.b |= 1024;
                awtyVar11.k = j5;
                return (awty) createBuilder.mo39build();
            case 3:
                return Boolean.valueOf(((awtw) obj).f);
            case 4:
                return Boolean.valueOf(((awtw) obj).e);
            case 5:
                return Long.valueOf(((awtw) obj).d);
            case 6:
                awtw awtwVar = (awtw) obj;
                if ((awtwVar.b & 1) == 0) {
                    return null;
                }
                return awtwVar.c;
            case 7:
                aopa mo52toBuilder3 = ((awtw) obj).mo52toBuilder();
                mo52toBuilder3.copyOnWrite();
                awtw awtwVar2 = (awtw) mo52toBuilder3.instance;
                awtwVar2.b &= -5;
                awtwVar2.e = false;
                return (awtw) mo52toBuilder3.mo39build();
            case 8:
                aopa mo52toBuilder4 = ((awtw) obj).mo52toBuilder();
                mo52toBuilder4.copyOnWrite();
                awtw awtwVar3 = (awtw) mo52toBuilder4.instance;
                awtwVar3.b |= 8;
                awtwVar3.f = true;
                return (awtw) mo52toBuilder4.mo39build();
            case 9:
                String str = adjx.a;
                acxs a2 = acxt.a();
                a2.b(((Boolean) obj).booleanValue());
                return a2.a();
            case 10:
                return new Exception((Throwable) obj);
            case 11:
                aoub aoubVar = (aoub) obj;
                ArrayList arrayList = new ArrayList(aoubVar.b.size());
                for (aoua aouaVar : aoubVar.b) {
                    adia e2 = adib.e();
                    e2.f(adim.MANUAL);
                    e2.b(new ScreenId(aouaVar.c));
                    e2.d(new adit(aouaVar.e));
                    e2.e(aouaVar.d);
                    e2.a = null;
                    arrayList.add(new adif(e2.a()));
                }
                return arrayList;
            case 12:
                return ((ajff) obj).R();
            case 13:
                return ((airw) obj).V();
            case 14:
                return ((ajff) obj).u();
            case 15:
                awty awtyVar12 = (awty) obj;
                if (awtyVar12 == null || (i2 = awtyVar12.c) == -1) {
                    return amon.a;
                }
                int V = almu.V(i2);
                String str2 = awtyVar12.g;
                if ("".equals(str2)) {
                    return amon.a;
                }
                adnv a3 = adnw.a();
                a3.i(V);
                a3.e(awtyVar12.h);
                a3.d(str2);
                a3.g(awtyVar12.i);
                a3.f(awtyVar12.j);
                a3.h(awtyVar12.k);
                long j6 = awtyVar12.l;
                long j7 = awtyVar12.e;
                long j8 = awtyVar12.f;
                if (j6 != -1 && j7 != -1 && j8 != -1) {
                    if (j8 == -2) {
                        z = true;
                    }
                    admx a4 = admy.a();
                    a4.b(j6);
                    a4.c(j7);
                    if (j8 == -2) {
                        j8 = 0;
                    }
                    a4.d(j8);
                    a4.e(z);
                    a3.b(a4.a());
                }
                int i8 = awtyVar12.d;
                if (i8 != -1) {
                    a3.c(atcv.b(i8));
                }
                if (V == 3) {
                    String str3 = awtyVar12.m;
                    if ("".equals(str3)) {
                        return amon.a;
                    }
                    admz a5 = adna.a();
                    a5.b(new adit(str3));
                    a3.a = a5.a();
                }
                return ampq.j(a3.a());
            case 16:
                awty awtyVar13 = (awty) obj;
                int i9 = adra.b;
                aopa createBuilder2 = awty.a.createBuilder();
                createBuilder2.copyOnWrite();
                awty awtyVar14 = (awty) createBuilder2.instance;
                awtyVar14.b = 1 | awtyVar14.b;
                awtyVar14.c = -1;
                createBuilder2.copyOnWrite();
                awty awtyVar15 = (awty) createBuilder2.instance;
                awtyVar15.b |= 4096;
                awtyVar15.m = "";
                createBuilder2.copyOnWrite();
                awty awtyVar16 = (awty) createBuilder2.instance;
                awtyVar16.b |= 4;
                awtyVar16.e = -1L;
                createBuilder2.copyOnWrite();
                awty awtyVar17 = (awty) createBuilder2.instance;
                awtyVar17.b |= 8;
                awtyVar17.f = -1L;
                createBuilder2.copyOnWrite();
                awty awtyVar18 = (awty) createBuilder2.instance;
                awtyVar18.b |= 32;
                awtyVar18.g = "";
                createBuilder2.copyOnWrite();
                awty awtyVar19 = (awty) createBuilder2.instance;
                awtyVar19.b |= 128;
                awtyVar19.h = "";
                createBuilder2.copyOnWrite();
                awty awtyVar20 = (awty) createBuilder2.instance;
                awtyVar20.b = 2 | awtyVar20.b;
                awtyVar20.d = -1;
                createBuilder2.copyOnWrite();
                awty awtyVar21 = (awty) createBuilder2.instance;
                awtyVar21.b |= 256;
                awtyVar21.i = "";
                createBuilder2.copyOnWrite();
                awty awtyVar22 = (awty) createBuilder2.instance;
                awtyVar22.b |= 512;
                awtyVar22.j = 0;
                createBuilder2.copyOnWrite();
                awty awtyVar23 = (awty) createBuilder2.instance;
                awtyVar23.b |= 2048;
                awtyVar23.l = -1L;
                createBuilder2.copyOnWrite();
                awty awtyVar24 = (awty) createBuilder2.instance;
                awtyVar24.b |= 1024;
                awtyVar24.k = -1L;
                return (awty) createBuilder2.mo39build();
            case 17:
                return Boolean.valueOf(((awtz) obj).c);
            case 18:
                return Boolean.valueOf(((awtz) obj).d);
            case 19:
                awtz awtzVar = (awtz) obj;
                int i10 = adsg.E;
                if (awtzVar == null) {
                    mo52toBuilder = awtz.a.createBuilder();
                } else {
                    mo52toBuilder = awtzVar.mo52toBuilder();
                }
                mo52toBuilder.copyOnWrite();
                awtz awtzVar2 = (awtz) mo52toBuilder.instance;
                awtzVar2.b = 2 | awtzVar2.b;
                awtzVar2.d = true;
                return (awtz) mo52toBuilder.mo39build();
            default:
                awtz awtzVar3 = (awtz) obj;
                int i11 = adsg.E;
                if (awtzVar3 == null) {
                    mo52toBuilder2 = awtz.a.createBuilder();
                } else {
                    mo52toBuilder2 = awtzVar3.mo52toBuilder();
                }
                mo52toBuilder2.copyOnWrite();
                awtz awtzVar4 = (awtz) mo52toBuilder2.instance;
                awtzVar4.b |= 1;
                awtzVar4.c = true;
                return (awtz) mo52toBuilder2.mo39build();
        }
    }
}
