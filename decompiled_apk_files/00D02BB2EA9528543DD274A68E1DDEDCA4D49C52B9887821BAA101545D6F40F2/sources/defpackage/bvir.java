package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bvir  reason: default package */
/* loaded from: classes4.dex */
public class bvir implements bvhw {
    private final CharSequence a;
    private jic b;

    public bvir(CharSequence charSequence, @dzsi jic jicVar) {
        this.a = charSequence;
        this.b = jicVar == null ? new jic(null, ckqc.FULLY_QUALIFIED, R.drawable.guide_no_image_blue) : jicVar;
    }

    @Override // defpackage.bvhv
    public cqix<? extends cqkp> a() {
        return cqgr.fT(new bvhr(), this);
    }

    @Override // defpackage.bvhw
    public jic b() {
        return this.b;
    }

    public CharSequence c() {
        return this.a;
    }

    public void d(ckqf ckqfVar) {
        jic jicVar = this.b;
        ckqd ckqdVar = jicVar.b;
        if (ckqdVar == null) {
            this.b = new jic(null, ckqc.FULLY_QUALIFIED, R.drawable.guide_no_image_blue);
        } else {
            this.b = new jic(jicVar.a, ckqdVar, jicVar.c, jicVar.d, jicVar.e, ckqfVar, jicVar.g);
        }
    }
}
