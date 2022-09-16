package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CompactCompanionExtensionRendererOuterClass;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: lzm  reason: default package */
/* loaded from: classes3.dex */
public abstract class lzm implements wke {
    protected final Context a;
    protected final aafo b;
    public final acti c;
    public wzi d;
    public final aaar e;
    protected auuk f;
    protected boolean g;
    public boolean h;
    private final lzu i;
    private final ajmy j;
    private final ajyc k;
    private View l;
    private final ArrayList m = new ArrayList(5);
    private lzl n;
    private lzl o;

    /* JADX INFO: Access modifiers changed from: protected */
    public lzm(ajmy ajmyVar, ajyc ajycVar, aafo aafoVar, acti actiVar, Context context, aaar aaarVar, lzu lzuVar) {
        this.j = ajmyVar;
        this.k = ajycVar;
        this.b = aafoVar;
        this.c = actiVar;
        this.a = context;
        this.e = aaarVar;
        this.i = lzuVar;
    }

    private final void b() {
        View view;
        if (!this.g || this.f == null || (view = this.l) == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // defpackage.wke
    public final void a() {
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x018c, code lost:
        if (r9 <= 2) goto L50;
     */
    @Override // defpackage.wke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r14, defpackage.ajrs r15) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lzm.d(android.view.View, ajrs):void");
    }

    @Override // defpackage.wke
    public final void e(View view) {
        Object obj;
        if (view != null) {
            zag.g(view, R.id.shopping_companion_card_stub, R.id.shopping_companion_card).setVisibility(8);
        }
        View view2 = this.l;
        if (view2 != null) {
            view2.setVisibility(8);
            ((ViewGroup) this.l.findViewById(R.id.product_container)).removeAllViews();
            ArrayList arrayList = this.m;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                lzk lzkVar = (lzk) arrayList.get(i);
                lzkVar.b.setVisibility(8);
                lzkVar.d.setVisibility(8);
                lzkVar.c.setVisibility(8);
            }
            auuk auukVar = this.f;
            if (auukVar != null && (auukVar.b & 8192) != 0) {
                lzu lzuVar = this.i;
                aunb aunbVar = auukVar.n;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                if (aunbVar.qn(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer)) {
                    aunb aunbVar2 = this.f.n;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    obj = aunbVar2.qm(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer);
                } else {
                    obj = null;
                }
                lzuVar.b(obj);
            }
        }
        wzi wziVar = this.d;
        if (wziVar != null) {
            wziVar.c();
        }
        this.l = null;
        this.f = null;
        this.g = false;
    }

    @Override // defpackage.wke
    public final void f() {
        this.g = true;
        b();
    }
}
