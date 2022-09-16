package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: zzh  reason: default package */
/* loaded from: classes7.dex */
public final class zzh {
    public final akto a;
    public final alec b;
    public final akuh c;
    public final List<akta> d = new ArrayList();
    public final allx e;
    public final allw f;
    public final allw g;

    public zzh(akox akoxVar, alec alecVar, Resources resources) {
        akto aF = akoxVar.aj().aF();
        this.a = aF;
        this.b = alecVar;
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, R.drawable.distance_tool_dot);
        akvz e = aF.e();
        int c = bntp.DISTANCE_TOOL_POLYLINE.c();
        dmsk bZ = dmsl.l.bZ();
        int width = decodeResource.getWidth();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmsl dmslVar = (dmsl) bZ.b;
        int i = dmslVar.a | 4;
        dmslVar.a = i;
        dmslVar.d = width;
        dmslVar.a = i | 1;
        dmslVar.b = -1;
        this.c = e.f(c, dcdc.f(new aksq(bZ.bK(), decodeResource)));
        allx n = aF.n();
        this.e = n;
        this.f = n.c();
        this.g = n.c();
    }

    public final void a() {
        this.e.a(null);
    }

    public final void b() {
        this.f.a(null);
        this.g.a(null);
        a();
        c();
    }

    public final void c() {
        if (!this.d.isEmpty()) {
            this.b.c(this.d);
            this.d.clear();
        }
    }

    public final aktf d(List<akqq> list) {
        List<akqq> j = akqo.j(list);
        int size = j.size();
        double[] dArr = new double[size + size];
        for (int i = 0; i < j.size(); i++) {
            akqq akqqVar = j.get(i);
            int i2 = i + i;
            dArr[i2] = akqqVar.a;
            dArr[i2 + 1] = akqqVar.b;
        }
        dmqd dmqdVar = (dmqd) dmqg.p.bZ();
        dspd b = akxh.b(dArr);
        if (dmqdVar.c) {
            dmqdVar.bF();
            dmqdVar.c = false;
        }
        dmqg dmqgVar = (dmqg) dmqdVar.b;
        b.getClass();
        dmqgVar.a |= 1;
        dmqgVar.b = b;
        int size2 = j.size();
        if (dmqdVar.c) {
            dmqdVar.bF();
            dmqdVar.c = false;
        }
        dmqg dmqgVar2 = (dmqg) dmqdVar.b;
        int i3 = dmqgVar2.a | 2;
        dmqgVar2.a = i3;
        dmqgVar2.c = size2;
        int i4 = i3 | 1024;
        dmqgVar2.a = i4;
        dmqgVar2.n = 0;
        dmqgVar2.a = i4 | 2048;
        dmqgVar2.o = 0;
        int a = this.c.a();
        if (dmqdVar.c) {
            dmqdVar.bF();
            dmqdVar.c = false;
        }
        dmqg dmqgVar3 = (dmqg) dmqdVar.b;
        dmqgVar3.a |= 256;
        dmqgVar3.l = a;
        dmqg dmqgVar4 = (dmqg) dmqdVar.bK();
        aktz c = this.a.c();
        dmqh bZ = dmqi.b.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmqi dmqiVar = (dmqi) bZ.b;
        dmqgVar4.getClass();
        dmqiVar.b();
        dmqiVar.a.add(dmqgVar4);
        return c.d(bZ.bK(), this.a.e().g(), dmti.WORLD_ENCODING_LAT_LNG_DOUBLE);
    }
}
