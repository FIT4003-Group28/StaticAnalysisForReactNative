package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.comment.image.ImagePreviewSelectView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.HintRendererOuterClass;
import com.google.protos.youtube.api.innertube.ImagePreviewSelectRendererOuterClass;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: xqp  reason: default package */
/* loaded from: classes4.dex */
public final class xqp extends xpg implements xqi {
    public xqj a;
    public arih ae;
    public xrp af;
    public vne ag;
    private MenuItem ah;
    public snc b;
    public aafo c;
    public ImagePreviewSelectView d;
    public arig e;

    private final void o(xrp xrpVar) {
        if (this.d == null || xrpVar == null || xrpVar.c == null) {
            return;
        }
        this.ah.setEnabled(true);
        this.af = xrpVar;
        ImagePreviewSelectView imagePreviewSelectView = this.d;
        Drawable drawable = xrpVar.c;
        arif arifVar = xrpVar.d;
        imagePreviewSelectView.h = 0.0f;
        imagePreviewSelectView.j.reset();
        imagePreviewSelectView.k.reset();
        imagePreviewSelectView.l = false;
        imagePreviewSelectView.i.set(0.0f, 0.0f);
        imagePreviewSelectView.m.set(0.0f, 0.0f, 0.0f, 0.0f);
        imagePreviewSelectView.n = 0.0f;
        imagePreviewSelectView.o = 0;
        imagePreviewSelectView.p = 1;
        imagePreviewSelectView.f = drawable;
        imagePreviewSelectView.g = arifVar;
        if (drawable == null) {
            imagePreviewSelectView.p = 1;
        } else if (drawable.getIntrinsicHeight() == drawable.getIntrinsicWidth()) {
            imagePreviewSelectView.p = 4;
        } else if (drawable.getIntrinsicHeight() < drawable.getIntrinsicWidth()) {
            imagePreviewSelectView.p = 2;
        } else {
            imagePreviewSelectView.p = 3;
        }
        imagePreviewSelectView.a.setImageDrawable(drawable);
        zag.o(imagePreviewSelectView.a, false);
        zag.o(imagePreviewSelectView.b, false);
        zag.o(imagePreviewSelectView.c, false);
        zag.o(imagePreviewSelectView.d, false);
        zag.o(imagePreviewSelectView.e, false);
        int i = imagePreviewSelectView.p;
        if (i == 2) {
            zag.o(imagePreviewSelectView.a, true);
            zag.o(imagePreviewSelectView.b, true);
            zag.o(imagePreviewSelectView.c, true);
        } else if (i == 3) {
            zag.o(imagePreviewSelectView.a, true);
            zag.o(imagePreviewSelectView.d, true);
            zag.o(imagePreviewSelectView.e, true);
        } else if (i == 4) {
            zag.o(imagePreviewSelectView.a, true);
        }
        imagePreviewSelectView.requestLayout();
    }

    @Override // defpackage.xqi
    public final void g(xrp xrpVar, apoj apojVar) {
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.e = null;
        try {
            arig arigVar = (arig) aphq.i(this.m, "image_preview_select_endpoint", arig.a, aoos.b());
            this.e = arigVar;
            if ((arigVar.b & 1) != 0) {
                aunb aunbVar = arigVar.c;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                if (aunbVar.qn(ImagePreviewSelectRendererOuterClass.imagePreviewSelectRenderer)) {
                    aunb aunbVar2 = this.e.c;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    this.ae = (arih) aunbVar2.qm(ImagePreviewSelectRendererOuterClass.imagePreviewSelectRenderer);
                    return;
                }
            }
            zep.b("PreviewSelectRenderer is missing.");
        } catch (aopx e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.dp
    public final void mR() {
        this.a.f(this);
        super.mR();
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        arag aragVar;
        argc argcVar;
        View inflate = layoutInflater.inflate(R.layout.image_preview_select_fragment, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.o(R.string.accessibility_navigation_back_button);
        toolbar.l(R.menu.image_preview_select_action_menu);
        arih arihVar = this.ae;
        if ((arihVar.b & 1) != 0) {
            aragVar = arihVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        toolbar.w(ajgl.b(aragVar));
        toolbar.q = new aaj() { // from class: xqk
            /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0115  */
            @Override // defpackage.aaj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean a(android.view.MenuItem r15) {
                /*
                    Method dump skipped, instructions count: 357
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.xqk.a(android.view.MenuItem):boolean");
            }
        };
        toolbar.r(new View.OnClickListener() { // from class: xql
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xqp.this.mJ().onBackPressed();
            }
        });
        if ((this.ae.b & 2) != 0) {
            MenuItem findItem = toolbar.g().findItem(R.id.save_button);
            this.ah = findItem;
            arag aragVar2 = this.ae.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            findItem.setTitle(ajgl.b(aragVar2));
            this.ah.setEnabled(false);
        }
        final View findViewById = inflate.findViewById(R.id.tooltip);
        final TextView textView = (TextView) inflate.findViewById(R.id.tooltip_text);
        final View findViewById2 = inflate.findViewById(R.id.dismiss_button);
        zag.o(findViewById, false);
        arih arihVar2 = this.ae;
        if ((arihVar2.b & 4) != 0) {
            aunb aunbVar = arihVar2.e;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(HintRendererOuterClass.hintRenderer)) {
                aunb aunbVar2 = this.ae.e;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                final argj argjVar = (argj) aunbVar2.qm(HintRendererOuterClass.hintRenderer);
                argg arggVar = argjVar.d;
                if (arggVar == null) {
                    arggVar = argg.a;
                }
                if (arggVar.b == 106514900) {
                    argcVar = (argc) arggVar.c;
                } else {
                    argcVar = argc.a;
                }
                if ((argcVar.b & 2) != 0) {
                    ylx.n(this, anii.h(this.ag.a(), wdp.o, anjk.a), mbi.n, new zdt() { // from class: xqn
                        @Override // defpackage.zdt
                        public final void a(Object obj) {
                            argc argcVar2;
                            final xqp xqpVar = xqp.this;
                            argj argjVar2 = argjVar;
                            final View view = findViewById;
                            TextView textView2 = textView;
                            View view2 = findViewById2;
                            ampq ampqVar = (ampq) obj;
                            if (ampqVar.h()) {
                                argi argiVar = argjVar2.g;
                                if (argiVar == null) {
                                    argiVar = argi.a;
                                }
                                if ((argiVar.b & 1) == 0) {
                                    return;
                                }
                                long longValue = ((Long) ampqVar.c()).longValue();
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                argi argiVar2 = argjVar2.g;
                                if (argiVar2 == null) {
                                    argiVar2 = argi.a;
                                }
                                if (longValue + timeUnit.toMillis(argiVar2.c) >= xqpVar.b.c()) {
                                    return;
                                }
                            }
                            zag.o(view, true);
                            argg arggVar2 = argjVar2.d;
                            if (arggVar2 == null) {
                                arggVar2 = argg.a;
                            }
                            if (arggVar2.b == 106514900) {
                                argcVar2 = (argc) arggVar2.c;
                            } else {
                                argcVar2 = argc.a;
                            }
                            arag aragVar3 = argcVar2.f;
                            if (aragVar3 == null) {
                                aragVar3 = arag.a;
                            }
                            textView2.setText(aafv.a(aragVar3, xqpVar.c, false));
                            view2.setOnClickListener(new View.OnClickListener() { // from class: xqm
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    final xqp xqpVar2 = xqp.this;
                                    zag.o(view, false);
                                    ylx.n(xqpVar2, xqpVar2.ag.b(new ampg() { // from class: xqo
                                        @Override // defpackage.ampg
                                        public final Object apply(Object obj2) {
                                            xqp xqpVar3 = xqp.this;
                                            aopa mo52toBuilder = ((awtg) obj2).mo52toBuilder();
                                            long c = xqpVar3.b.c();
                                            mo52toBuilder.copyOnWrite();
                                            awtg awtgVar = (awtg) mo52toBuilder.instance;
                                            awtgVar.b |= 1;
                                            awtgVar.c = c;
                                            return (awtg) mo52toBuilder.mo39build();
                                        }
                                    }, anjk.a), mbi.m, mbi.o);
                                }
                            });
                        }
                    });
                }
            }
        }
        this.d = (ImagePreviewSelectView) inflate.findViewById(R.id.image_preview_select_view);
        this.a.c(this);
        o(this.a.d);
        return inflate;
    }

    @Override // defpackage.xqi
    public final void qW(xrp xrpVar) {
        o(xrpVar);
    }
}
