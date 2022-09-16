package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bxsd  reason: default package */
/* loaded from: classes4.dex */
public class bxsd implements bxof {
    private final String a;
    private final String b;
    private final String c;
    private final cqtd d = cqrt.g(2131232509, iva.b(ibl.H(), ibl.af()));
    private final cjtd e;
    private final apkr f;

    public bxsd(Activity activity, apkr apkrVar, ddho ddhoVar) {
        this.a = activity.getString(R.string.WAA_PROMO_TITLE);
        this.b = activity.getString(R.string.WAA_PROMO_ORIGINAL_BODY);
        this.c = activity.getString(R.string.WAA_PROMO_GET_STARTED_BUTTON);
        this.e = cjtd.a(ddhoVar);
        this.f = apkrVar;
    }

    @Override // defpackage.bxof
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.bxof
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.bxof
    public CharSequence c() {
        return this.c;
    }

    @Override // defpackage.bxof
    public cqtd d() {
        return this.d;
    }

    @Override // defpackage.bxof
    @dzsi
    public CharSequence e() {
        return null;
    }

    @Override // defpackage.bxof
    public cqkl f(cjqm cjqmVar) {
        this.f.a(new apkq(), "odelay_cardui");
        return cqkl.a;
    }

    @Override // defpackage.bxof
    public cjtd g() {
        return this.e;
    }
}
