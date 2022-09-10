package defpackage;

import com.google.android.apps.maps.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
/* compiled from: PG */
/* renamed from: acer  reason: default package */
/* loaded from: classes2.dex */
public class acer implements jkh, aceo {
    private final gga a;
    private final acek b;
    private boolean c;

    public acer(gga ggaVar, jkf jkfVar, acek acekVar) {
        this.a = ggaVar;
        this.c = f(jkfVar.l().L());
        this.b = acekVar;
    }

    private static boolean f(jjn jjnVar) {
        return jjnVar.c(jjn.COLLAPSED);
    }

    @Override // defpackage.jkh
    public void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        boolean f = f(jjnVar2);
        if (f == this.c) {
            return;
        }
        this.c = f;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.a.findViewById(R.id.visual_explore_add_photo);
        if (extendedFloatingActionButton == null) {
            return;
        }
        if (!f) {
            extendedFloatingActionButton.j(extendedFloatingActionButton.i);
        } else {
            extendedFloatingActionButton.j(extendedFloatingActionButton.h);
        }
    }

    @Override // defpackage.jkh
    public void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public void O() {
    }

    @Override // defpackage.jkh
    public void P(jkj jkjVar, jjn jjnVar, float f) {
    }

    @Override // defpackage.aceo
    public cqtd a() {
        return cqrt.f(2131232135);
    }

    @Override // defpackage.aceo
    public CharSequence b() {
        return this.a.getString(R.string.UPLOAD_PHOTO);
    }

    @Override // defpackage.aceo
    public cqkl c() {
        this.b.a();
        return cqkl.a;
    }

    @Override // defpackage.aceo
    public Boolean d() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.aceo
    public cjtd e() {
        return cjtd.a(dtye.p);
    }
}
