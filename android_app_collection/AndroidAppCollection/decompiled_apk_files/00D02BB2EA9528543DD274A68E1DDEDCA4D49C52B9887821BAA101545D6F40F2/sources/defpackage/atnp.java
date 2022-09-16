package defpackage;

import com.google.android.apps.gmm.map.model.directions.LaneGuidance;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: atnp  reason: default package */
/* loaded from: classes2.dex */
public final class atnp {
    public static final int[][] a = {new int[]{0}, new int[]{2, 1}, new int[]{16, 8}, new int[]{17}, new int[]{192, 128}, new int[]{194, 129}, new int[]{208, 136}, new int[]{209}, new int[]{1536, 1024}, new int[]{1538}, new int[]{1552}, new int[]{1553}, new int[]{1664}, new int[]{1665}, new int[]{1672}, new int[]{1672, 1665, 1553, 209}, new int[]{12288, 8192}, new int[]{12290, 8194}, new int[]{12304, 8208}, new int[]{12305, 8209}, new int[]{12480, 12416, 8384, 8320}, new int[]{12482, 12417, 8386, 8321}, new int[]{12496, 12424, 8400, 8328}, new int[]{12497, 8401}, new int[]{9728}, new int[]{9730}, new int[]{9744}, new int[]{9745}, new int[]{9856}, new int[]{9857}, new int[]{9864}, new int[]{9864, 9857, 9745, 12497, 8401}, new int[]{ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, 32768}, new int[]{ImageMetadata.CONTROL_AE_LOCK}, new int[]{ImageMetadata.CONTROL_SCENE_MODE}, new int[]{ImageMetadata.CONTROL_VIDEO_STABILIZATION_MODE}, new int[]{65728, 65664}, new int[]{65730, 65665}, new int[]{65744, 65672}, new int[]{65745}, new int[]{67072}, new int[]{67074}, new int[]{67088}, new int[]{67089}, new int[]{67200}, new int[]{67201}, new int[]{67208}, new int[]{67208, 67201, 67089, 65745}, new int[]{77824, 40960}, new int[]{77826, 40962}, new int[]{77840, 40976}, new int[]{77841, 40977}, new int[]{78016, 77952, 41152, 41088}, new int[]{78018, 77953, 41154, 41089}, new int[]{78032, 77960, 41168, 41096}, new int[]{78033, 41169}, new int[]{42496}, new int[]{42498}, new int[]{42512}, new int[]{42513}, new int[]{42624}, new int[]{42625}, new int[]{42632}, new int[]{42632, 42625, 42513, 78033, 41169}, new int[]{ImageMetadata.LENS_APERTURE, 262144}, new int[]{ImageMetadata.LENS_FOCAL_LENGTH}, new int[]{524304}, new int[]{524305}, new int[]{524480, 524416}, new int[]{524482, 524417}, new int[]{524496, 524424}, new int[]{524497}, new int[]{525824}, new int[]{525826}, new int[]{525840}, new int[]{525841}, new int[]{525952}, new int[]{525953}, new int[]{525960}, new int[]{525960, 525953, 525841, 524497}, new int[]{536576, 270336}, new int[]{536578, 270338}, new int[]{536592, 270352}, new int[]{536593, 270353}, new int[]{536768, 536704, 270528, 270464}, new int[]{536770, 536705, 270530, 270465}, new int[]{536784, 536712, 270544, 270472}, new int[]{536785, 270545}, new int[]{271872}, new int[]{271874}, new int[]{271888}, new int[]{271889}, new int[]{272000}, new int[]{272001}, new int[]{272008}, new int[]{272008, 272001, 271889, 536785, 270545}, new int[]{327680}, new int[]{327682}, new int[]{327696}, new int[]{327697}, new int[]{327872, 327808}, new int[]{327874, 327809}, new int[]{327888, 327816}, new int[]{327889}, new int[]{329216}, new int[]{329218}, new int[]{329232}, new int[]{329233}, new int[]{329344}, new int[]{329345}, new int[]{329352}, new int[]{329352, 329345, 329233, 327889}, new int[]{339968}, new int[]{339970}, new int[]{339984}, new int[]{339985}, new int[]{340160, 340096}, new int[]{340162, 340097}, new int[]{340176, 340104}, new int[]{340177}, new int[]{339968, 329216, 271872, 42496}, new int[]{339970, 329218, 271874, 42498}, new int[]{339984, 329232, 271888, 42512}, new int[]{339985, 329233, 271889, 42513}, new int[]{340160, 340096, 329344, 272000, 42624}, new int[]{340162, 340097, 329345, 272001, 42625}, new int[]{340176, 340104, 329352, 272008, 42632}, new int[]{340176, 340104, 340162, 340097, 339985, 329352, 329345, 329233, 327889, 272008, 272001, 271889, 536785, 270545, 42632, 42625, 42513, 78033, 41169}};
    public static final EnumMap<doym, Integer> b;
    public static final ateb[][] c;
    public static final LaneGuidance d;
    public static final dcqe e;

    static {
        dcdg p = dcdn.p();
        p.f(doym.STRAIGHT, 3);
        p.f(doym.SLIGHT, 2);
        p.f(doym.NORMAL, 1);
        p.f(doym.SHARP, 0);
        p.f(doym.U_TURN, 0);
        p.f(doym.MERGE, -1);
        b = new EnumMap<>(p.b());
        c = new ateb[][]{new ateb[]{null, ateb.SHARP_SHORT, ateb.SHARP, null}, new ateb[]{null, ateb.NORMAL_SHORT, ateb.NORMAL, null}, new ateb[]{null, null, ateb.SLIGHT, ateb.SLIGHT_TALL}, new ateb[]{null, null, ateb.STRAIGHT, ateb.STRAIGHT_TALL}, new ateb[]{null, null, ateb.SLIGHT, ateb.SLIGHT_TALL}, new ateb[]{null, ateb.NORMAL_SHORT, ateb.NORMAL, null}, new ateb[]{null, ateb.SHARP_SHORT, ateb.SHARP, null}};
        d = new LaneGuidance(0, dcdc.e());
        e = dcqe.c("atnp");
    }

    public static cqtv a() {
        return cqrp.d(6.0d);
    }

    public static cqtv b() {
        return cqrp.d(32.0d);
    }

    public static dcdc<LaneGuidance> c(List<LaneGuidance> list, int i) {
        List<LaneGuidance> f;
        int i2;
        int i3;
        if (list.size() <= i) {
            return dcdc.r(list);
        }
        int size = list.size() - i;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (i4 < 0 && list.get(i6).b == 1) {
                i4 = i6;
            }
            if (i5 < 0 && list.get((list.size() - i6) - 1).b == 1) {
                i5 = i6;
            }
        }
        if (i4 < 0 || i5 < 0) {
            i4 = list.size() / 2;
            i5 = i4;
        }
        ArrayList arrayList = new ArrayList(list);
        int max = Math.max(i4, i5);
        if (max >= size + 2) {
            int i7 = size + 1;
            if (max == i5) {
                f = f(arrayList, 0, i7);
            } else {
                f = f(arrayList, i7, 0);
            }
        } else if (i4 + i5 >= size + 4) {
            if (Math.min(i4, i5) == i5) {
                i2 = i5 - 1;
                i3 = (size - i2) + 2;
            } else {
                int i8 = i4 - 1;
                i2 = (size - i8) + 2;
                i3 = i8;
            }
            f = f(arrayList, i3, i2);
        } else {
            f = f(arrayList, 0, size + 1);
        }
        return dcdc.r(f);
    }

    public static atno d(int i, int i2, boolean z, boolean z2) {
        int i3 = (i2 >> (i * 3)) & 7;
        ateb atebVar = c[i][i3];
        if (z2) {
            atebVar = i3 == 2 ? ateb.UTURN : ateb.UTURN_SHORT;
        }
        return new atno(atebVar, i > 3, z);
    }

    public static atno[] e() {
        return new atno[]{new atno(ateb.STUB, false, false)};
    }

    private static List<LaneGuidance> f(List<LaneGuidance> list, int i, int i2) {
        if (i2 > 0) {
            list = list.subList(0, list.size() - i2);
            list.add(d);
        }
        if (i > 0) {
            List<LaneGuidance> subList = list.subList(i, list.size());
            subList.add(0, d);
            return subList;
        }
        return list;
    }
}
