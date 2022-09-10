package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.streetview.model.PanoramaLevel;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bxcj  reason: default package */
/* loaded from: classes4.dex */
public class bxcj implements iza {
    private final Context a;
    private final PanoramaLevel b;
    private final bxci c;
    private boolean d;
    private final cjtd e = cjtd.a(dtyb.ea);

    public bxcj(Context context, PanoramaLevel panoramaLevel, boolean z, bxci bxciVar) {
        this.a = context;
        this.b = panoramaLevel;
        this.c = bxciVar;
        this.d = z;
    }

    @Override // defpackage.iza
    public Boolean a() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.iza
    public Boolean d() {
        return false;
    }

    @Override // defpackage.iza
    public Boolean e() {
        return false;
    }

    @Override // defpackage.iza
    public cjtd f() {
        return this.e;
    }

    @Override // defpackage.iza
    /* renamed from: h */
    public String c() {
        return this.b.c;
    }

    @Override // defpackage.iza
    /* renamed from: i */
    public String g() {
        return this.a.getString(R.string.ACCESSIBILITY_FLOOR, c());
    }

    public PanoramaLevel j() {
        return this.b;
    }

    @Override // defpackage.iza
    public cqkl b() {
        if (!this.d) {
            this.d = true;
            bxci bxciVar = this.c;
            PanoramaLevel panoramaLevel = this.b;
            bxdn bxdnVar = ((bxcz) bxciVar).a;
            bwzo bwzoVar = bxdnVar.h;
            if (bwzoVar == null) {
                bxdnVar.W(panoramaLevel.a);
                cqkx.p(bxdnVar);
            } else {
                bwzoVar.aJ(panoramaLevel.a, null);
            }
        }
        return cqkl.a;
    }
}
