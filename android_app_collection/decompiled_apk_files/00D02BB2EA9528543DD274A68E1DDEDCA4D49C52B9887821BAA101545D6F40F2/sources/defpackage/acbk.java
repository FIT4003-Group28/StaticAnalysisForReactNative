package defpackage;

import android.app.Application;
import android.view.View;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: acbk  reason: default package */
/* loaded from: classes2.dex */
public class acbk extends acbe implements acaz {
    private final Float a;
    private final jic b;

    public acbk(final dwfl dwflVar, View.OnClickListener onClickListener, Application application, String str, String str2, int i) {
        super(dwflVar, onClickListener, application, str, str2, i);
        dhkd dhkdVar;
        dbsk.a(cknv.c(dwflVar));
        dhjx dhjxVar = dwflVar.m;
        dhkd dhkdVar2 = (dhjxVar == null ? dhjx.f : dhjxVar).d;
        float f = 1.0f;
        if (((dhkdVar2 == null ? dhkd.d : dhkdVar2).a & 1) != 0) {
            dhjx dhjxVar2 = dwflVar.m;
            dhkd dhkdVar3 = (dhjxVar2 == null ? dhjx.f : dhjxVar2).d;
            if (((dhkdVar3 == null ? dhkd.d : dhkdVar3).a & 2) != 0) {
                dhjx dhjxVar3 = dwflVar.m;
                dhkd dhkdVar4 = (dhjxVar3 == null ? dhjx.f : dhjxVar3).d;
                if ((dhkdVar4 == null ? dhkd.d : dhkdVar4).c > 0) {
                    dhjx dhjxVar4 = dwflVar.m;
                    dhkd dhkdVar5 = (dhjxVar4 == null ? dhjx.f : dhjxVar4).d;
                    float f2 = (dhkdVar5 == null ? dhkd.d : dhkdVar5).b;
                    dhjx dhjxVar5 = dwflVar.m;
                    f = f2 / ((dhjxVar5 == null ? dhjx.f : dhjxVar5).d == null ? dhkd.d : dhkdVar).c;
                }
            }
        }
        Float valueOf = Float.valueOf(dece.c(f, 0.3333333f, 1.3333333f));
        this.a = valueOf;
        final float floatValue = valueOf.floatValue();
        this.b = new jic(dwflVar.h, new ckqd(floatValue, dwflVar) { // from class: acbj
            private final float a;
            private final dwfl b;

            {
                this.a = floatValue;
                this.b = dwflVar;
            }

            @Override // defpackage.ckqd
            public final String a(String str3, int i2, int i3, ImageView.ScaleType scaleType) {
                float f3 = this.a;
                dwfl dwflVar2 = this.b;
                double floor = Math.floor(i2 / f3);
                ckqc b = jfv.b(dwflVar2);
                String a = b.a(str3, i2, (int) floor, scaleType);
                if (b == ckqc.FULLY_QUALIFIED || scaleType != ImageView.ScaleType.CENTER_CROP) {
                    return a;
                }
                dsnh b2 = ckqj.b(a);
                b2.j();
                b2.a.a(dsne.CENTER_CROP);
                return ckqj.a(b2, a);
            }
        }, 0);
    }

    @Override // defpackage.acaz
    public jic a() {
        return this.b;
    }

    @Override // defpackage.acba
    public Float e() {
        return this.a;
    }
}
