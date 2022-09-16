package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: iuz  reason: default package */
/* loaded from: classes3.dex */
public final class iuz extends abmo {
    private final ajnj r;

    public iuz(Context context, abkw abkwVar, aafo aafoVar, ajmy ajmyVar, ajxz ajxzVar, abkj abkjVar, abks abksVar, abjx abjxVar, abhz abhzVar, ajvm ajvmVar, yfp yfpVar, abiq abiqVar, abha abhaVar, yzj yzjVar) {
        super(context, ajmyVar.b(), abkwVar, aafoVar, ajxzVar, abkjVar, abksVar, abjxVar, abhzVar, ajvmVar, yfpVar, abiqVar, abhaVar, yzjVar);
        this.r = new ajnj(ajmyVar.b(), this.c);
    }

    @Override // defpackage.abmo
    public final void d(avhn avhnVar) {
        this.r.k(avhnVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ajsa] */
    @Override // defpackage.abmo, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        abkj abkjVar = this.n;
        abkjVar.f.qZ(abkjVar.b.get());
        abkjVar.f = null;
        abkjVar.i = null;
        abkjVar.h = false;
        yfo yfoVar = this.m;
        if (yfoVar != null) {
            yfoVar.qZ(ajsaVar);
        }
        this.k.a();
        this.l.a();
        this.r.a();
    }

    @Override // defpackage.abmo
    public final void e() {
        if (this.g || this.h) {
            this.f.setEnabled(false);
            this.f.setTextColor(zhn.j(this.e, R.attr.ytTextPrimaryInverse).orElse(0));
            this.f.setBackgroundColor(zhn.j(this.e, R.attr.ytIconDisabled).orElse(0));
            return;
        }
        this.f.setEnabled(true);
        this.f.setTextColor(ake.d(this.e, R.color.yt_white1));
        m();
    }
}
