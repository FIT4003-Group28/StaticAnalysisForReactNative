package com.google.android.libraries.youtube.mdx.smartremote;

import android.text.TextUtils;
import com.google.android.libraries.youtube.mdx.smartremote.MdxSmartRemoteDialListener;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class MdxSmartRemoteDialListener implements f {
    public static final /* synthetic */ int a = 0;
    private final adbe b;
    private final boolean c;
    private final adbb d;

    static {
        zep.a("MDX.MdxSmartRemoteDialListener");
    }

    public MdxSmartRemoteDialListener(adbe adbeVar, final adoa adoaVar, final yni yniVar, acwu acwuVar) {
        this.b = adbeVar;
        this.c = acwuVar.o;
        this.d = new adbb() { // from class: adsh
            @Override // defpackage.adbb
            public final void a(adid adidVar) {
                adoa adoaVar2 = adoa.this;
                yni yniVar2 = yniVar;
                int i = MdxSmartRemoteDialListener.a;
                if (adoaVar2.e() != null) {
                    return;
                }
                Map m = adidVar.m();
                adsi adsiVar = null;
                if (m != null && m.containsKey("smartRemoteRequestedTime")) {
                    String str = (String) m.get("smartRemoteRequestedTime");
                    if (!TextUtils.isEmpty((String) m.get("screenId")) && !TextUtils.isEmpty(str)) {
                        try {
                            adsiVar = new adsi(adidVar, Long.parseLong(str));
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                if (adsiVar == null) {
                    return;
                }
                yniVar2.d(new adsk(adsiVar.a, adsiVar.b));
            }

            @Override // defpackage.adbb
            public final /* synthetic */ void b() {
            }
        };
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        ylr.c();
        this.b.f(this.d);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (!this.c) {
            return;
        }
        ylr.c();
        this.b.c(this.d, false);
    }
}
