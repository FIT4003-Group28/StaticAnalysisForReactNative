package defpackage;

import com.google.android.filament.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: avyx  reason: default package */
/* loaded from: classes3.dex */
public class avyx {
    static final dcdc<dksb> a;
    final List<dksb> b;
    public final int c;

    static {
        dksa bZ = dksb.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dksb dksbVar = (dksb) bZ.b;
        int i = dksbVar.a | 1;
        dksbVar.a = i;
        dksbVar.b = R.styleable.AppCompatTheme_windowFixedHeightMinor;
        dksbVar.a = i | 2;
        dksbVar.c = 175;
        dksb bK = bZ.bK();
        dksa bZ2 = dksb.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dksb dksbVar2 = (dksb) bZ2.b;
        int i2 = dksbVar2.a | 1;
        dksbVar2.a = i2;
        dksbVar2.b = 510;
        dksbVar2.a = i2 | 2;
        dksbVar2.c = 250;
        dksb bK2 = bZ2.bK();
        dksa bZ3 = dksb.d.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dksb dksbVar3 = (dksb) bZ3.b;
        int i3 = dksbVar3.a | 1;
        dksbVar3.a = i3;
        dksbVar3.b = 900;
        dksbVar3.a = i3 | 2;
        dksbVar3.c = 350;
        dksb bK3 = bZ3.bK();
        dksa bZ4 = dksb.d.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dksb dksbVar4 = (dksb) bZ4.b;
        int i4 = dksbVar4.a | 1;
        dksbVar4.a = i4;
        dksbVar4.b = 1970;
        dksbVar4.a = i4 | 2;
        dksbVar4.c = 375;
        dksb bK4 = bZ4.bK();
        dksa bZ5 = dksb.d.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dksb dksbVar5 = (dksb) bZ5.b;
        int i5 = dksbVar5.a | 1;
        dksbVar5.a = i5;
        dksbVar5.b = 2025;
        dksbVar5.a = i5 | 2;
        dksbVar5.c = 400;
        dksb bK5 = bZ5.bK();
        dksa bZ6 = dksb.d.bZ();
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dksb dksbVar6 = (dksb) bZ6.b;
        int i6 = dksbVar6.a | 1;
        dksbVar6.a = i6;
        dksbVar6.b = 7801;
        dksbVar6.a = i6 | 2;
        dksbVar6.c = 500;
        dksb bK6 = bZ6.bK();
        dksa bZ7 = dksb.d.bZ();
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dksb dksbVar7 = (dksb) bZ7.b;
        int i7 = dksbVar7.a | 1;
        dksbVar7.a = i7;
        dksbVar7.b = 14551;
        dksbVar7.a = i7 | 2;
        dksbVar7.c = 750;
        dksb bK7 = bZ7.bK();
        dksa bZ8 = dksb.d.bZ();
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        dksb dksbVar8 = (dksb) bZ8.b;
        int i8 = dksbVar8.a | 1;
        dksbVar8.a = i8;
        dksbVar8.b = 34779;
        dksbVar8.a = i8 | 2;
        dksbVar8.c = 1600;
        dksb bK8 = bZ8.bK();
        dksa bZ9 = dksb.d.bZ();
        if (bZ9.c) {
            bZ9.bF();
            bZ9.c = false;
        }
        dksb dksbVar9 = (dksb) bZ9.b;
        int i9 = dksbVar9.a | 1;
        dksbVar9.a = i9;
        dksbVar9.b = 67678;
        dksbVar9.a = i9 | 2;
        dksbVar9.c = 1700;
        a = dcdc.n(bK, bK2, bK3, bK4, bK5, bK6, bK7, bK8, bZ9.bK());
    }

    public avyx(btvo btvoVar) {
        dksh offlineMapsParameters = btvoVar.getOfflineMapsParameters();
        this.b = offlineMapsParameters.p.size() == 0 ? a : offlineMapsParameters.p;
        this.c = offlineMapsParameters.q;
    }

    public final int a(long j) {
        int i = (int) (j / 1000000);
        for (dksb dksbVar : this.b) {
            if (i <= dksbVar.b) {
                return dksbVar.c;
            }
        }
        return this.c;
    }
}
