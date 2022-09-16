package defpackage;

import android.app.Activity;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: xkg  reason: default package */
/* loaded from: classes4.dex */
public final class xkg implements aavf {
    public final aafo a;
    public xmc b;
    public dh c;
    public aavi d;
    private final WeakReference e;
    private final akfg f;
    private final xxk g;
    private final Activity h;

    public xkg(xki xkiVar, Activity activity, aafo aafoVar, akfg akfgVar, xxk xxkVar) {
        this.e = new WeakReference(xkiVar);
        this.h = activity;
        this.a = aafoVar;
        this.f = akfgVar;
        this.g = xxkVar;
    }

    private final acti g() {
        Activity activity = this.h;
        if (activity instanceof acth) {
            return ((acth) activity).oi();
        }
        return null;
    }

    @Override // defpackage.aavf
    public final aavi a() {
        return this.d;
    }

    @Override // defpackage.aavf
    public final Long b() {
        return null;
    }

    @Override // defpackage.aavf
    public final String c() {
        aavi aaviVar = this.d;
        if (aaviVar == null) {
            return null;
        }
        return aaviVar.a;
    }

    @Override // defpackage.aavf
    public final void d() {
        this.c.ku();
    }

    @Override // defpackage.aavf
    public final void e(cff cffVar) {
        xki xkiVar = (xki) this.e.get();
        if (xkiVar == null) {
            return;
        }
        zag.q(xkiVar.a, R.string.error_post_failed, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d7, code lost:
        if (r4.k != false) goto L58;
     */
    @Override // defpackage.aavf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.arnz r8) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkg.f(arnz):void");
    }
}
