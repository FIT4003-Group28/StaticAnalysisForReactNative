package defpackage;

import android.content.res.Resources;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gmm.map.model.directions.LaneGuidance;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: atnn  reason: default package */
/* loaded from: classes2.dex */
public class atnn implements atns {
    @dzsi
    public final List<LaneGuidance> a;
    @dzsi
    public final atee b;
    @dzsi
    private final atec c;
    private final int d;

    public atnn() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 0;
    }

    public atnn(@dzsi List<LaneGuidance> list, @dzsi atee ateeVar, @dzsi atec atecVar) {
        this.a = list;
        this.b = ateeVar;
        this.c = atecVar;
        this.d = 8;
    }

    public static <T extends cqkp> cqnf<T> a(cqjb<T, atnn> cqjbVar) {
        return cqjv.e(atnl.MULTI_ICON_VIEW_ICONS, cqjbVar, atnk.a);
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof atnn) {
            atnn atnnVar = (atnn) obj;
            if (dbsd.a(this.a, atnnVar.a) && dbsd.a(this.b, atnnVar.b) && dbsd.a(this.c, atnnVar.c)) {
                int i = atnnVar.d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, 8});
    }

    @Override // defpackage.atns
    public final void b(atnt atntVar) {
        dcdc<atno[]> dcdcVar;
        int i;
        int i2;
        int i3;
        atno[] atnoVarArr;
        atec atecVar;
        Resources resources;
        boolean z;
        int i4;
        atno atnoVar;
        List<LaneGuidance> list = this.a;
        atee ateeVar = this.b;
        atec atecVar2 = this.c;
        if (list == null) {
            atntVar.setIcons(dcdc.e());
            return;
        }
        dcdc<atno[]> a = atnu.a(list, 8);
        Resources resources2 = atntVar.getResources();
        ArrayList a2 = dchl.a();
        for (int i5 = 0; i5 < a.size(); i5++) {
            if (i5 > 0) {
                Picture b = ateeVar.a.b(resources2, R.raw.da_laneguidance_tick);
                bvlo bvloVar = ateeVar.b;
                bvlv f = bvlw.f();
                f.b(true);
                bvld bvldVar = (bvld) f;
                bvldVar.a = Integer.valueOf(ateeVar.c);
                bvldVar.b = Integer.valueOf(ateeVar.d);
                Drawable c = bvloVar.c(b, f.c());
                a2.add(new atnr(c, Math.round(c.getIntrinsicWidth() / 2.0f), Math.round((i5 - 0.5f) * atecVar2.d), 0, false, atecVar2.c));
            }
            atno[] atnoVarArr2 = a.get(i5);
            int length = atnoVarArr2.length;
            int i6 = 0;
            while (i6 < length) {
                atno atnoVar2 = atnoVarArr2[i6];
                int i7 = atnoVar2.c ? atecVar2.a : atecVar2.b;
                int i8 = atecVar2.d;
                int i9 = atecVar2.e;
                ateb atebVar = atnoVar2.a;
                atea ateaVar = ateeVar.g.get(atebVar);
                if (ateaVar == null) {
                    Picture b2 = ateeVar.a.b(resources2, ateeVar.f ? atebVar.n : atebVar.m);
                    dcdcVar = a;
                    float width = b2.getWidth() * ateeVar.e;
                    float height = b2.getHeight() * ateeVar.e;
                    float f2 = (ateeVar.f ? atebVar.p : atebVar.o) * width;
                    int ceil = (int) Math.ceil(f2);
                    float f3 = ceil - f2;
                    double ceil2 = Math.ceil(width + f3);
                    i3 = length;
                    atnoVarArr = atnoVarArr2;
                    int ceil3 = (int) Math.ceil(height);
                    i = i8;
                    atecVar = atecVar2;
                    atnoVar = atnoVar2;
                    i2 = i6;
                    resources = resources2;
                    z = true;
                    i4 = i9;
                    atea ateaVar2 = new atea(ateeVar, b2, (int) ceil2, ceil3, ggt.e(f3, ceil3 - height, width, height), ceil);
                    ateeVar.g.put((EnumMap<ateb, atea>) atebVar, (ateb) ateaVar2);
                    ateaVar = ateaVar2;
                } else {
                    dcdcVar = a;
                    i = i8;
                    i2 = i6;
                    i3 = length;
                    atnoVarArr = atnoVarArr2;
                    atecVar = atecVar2;
                    resources = resources2;
                    z = true;
                    i4 = i9;
                    atnoVar = atnoVar2;
                }
                bvlo bvloVar2 = ateaVar.f.b;
                Picture picture = ateaVar.a;
                bvlv f4 = bvlw.f();
                f4.b(z);
                bvld bvldVar2 = (bvld) f4;
                bvldVar2.a = Integer.valueOf(ateaVar.b);
                bvldVar2.b = Integer.valueOf(ateaVar.c);
                bvldVar2.d = ateaVar.d;
                a2.add(new atnr(bvloVar2.c(picture, f4.c()), ateaVar.e, i5 * i, -i4, atnoVar.b, i7));
                i6 = i2 + 1;
                a = dcdcVar;
                atnoVarArr2 = atnoVarArr;
                length = i3;
                atecVar2 = atecVar;
                resources2 = resources;
            }
        }
        atntVar.setIcons(dcdc.r(a2));
    }
}
