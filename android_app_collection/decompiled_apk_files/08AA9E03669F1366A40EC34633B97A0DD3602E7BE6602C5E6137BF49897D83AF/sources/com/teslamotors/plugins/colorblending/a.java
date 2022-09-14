package com.teslamotors.plugins.colorblending;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.b.a.i;
import com.facebook.f.e.o;
import com.facebook.imagepipeline.n.e;
import com.facebook.react.bridge.aj;
import com.facebook.react.bridge.an;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import java.io.File;
/* compiled from: ColorBlendingImageView.java */
/* loaded from: classes.dex */
public class a extends com.facebook.f.i.d {
    private static final String k = "a";

    /* renamed from: a  reason: collision with root package name */
    private com.facebook.react.views.b.a f5355a;

    /* renamed from: b  reason: collision with root package name */
    private Drawable f5356b;

    /* renamed from: c  reason: collision with root package name */
    private o.b f5357c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5358d;
    private final com.facebook.f.c.b e;
    private com.facebook.f.c.d f;
    private final Object g;
    private int h;
    private e i;
    private c j;
    private com.facebook.react.uimanager.events.c l;
    private boolean m;

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public a(Context context, com.facebook.f.c.b bVar, Object obj) {
        super(context, new com.facebook.f.f.b(context.getResources()).s());
        this.h = -1;
        this.m = false;
        this.f5357c = com.facebook.react.views.image.d.a();
        this.e = bVar;
        this.g = obj;
    }

    public void setShouldNotifyLoadEvents(boolean z) {
        if (!z) {
            this.f = null;
        } else {
            this.l = ((UIManagerModule) ((aj) getContext()).b(UIManagerModule.class)).getEventDispatcher();
            this.f = new com.facebook.f.c.c<com.facebook.imagepipeline.i.e>() { // from class: com.teslamotors.plugins.colorblending.a.1
                @Override // com.facebook.f.c.c, com.facebook.f.c.d
                public void a(String str, Object obj) {
                    a.this.l.a(new com.facebook.react.views.image.b(a.this.getId(), 4));
                }

                @Override // com.facebook.f.c.c, com.facebook.f.c.d
                public void a(String str, com.facebook.imagepipeline.i.e eVar, Animatable animatable) {
                    if (eVar != null) {
                        a.this.l.a(new com.facebook.react.views.image.b(a.this.getId(), 2, a.this.f5355a.a(), eVar.f(), eVar.g()));
                        if (a.this.m) {
                            return;
                        }
                        a.this.l.a(new com.facebook.react.views.image.b(a.this.getId(), 3, a.this.f5355a.a(), eVar.f(), eVar.g()));
                    }
                }

                @Override // com.facebook.f.c.c, com.facebook.f.c.d
                public void b(String str, Throwable th) {
                    a.this.l.a(new com.facebook.react.views.image.b(a.this.getId(), 1));
                    a.this.l.a(new com.facebook.react.views.image.b(a.this.getId(), 3));
                }
            };
        }
        this.f5358d = true;
    }

    public void setSource(String str) {
        if (str != null) {
            this.f5355a = new com.facebook.react.views.b.a(getContext(), str);
            this.f5358d = true;
        }
    }

    public void setLoadingIndicatorSource(String str) {
        Drawable b2 = com.facebook.react.views.b.c.a().b(getContext(), str);
        this.f5356b = b2 != null ? new com.facebook.f.e.b(b2, NetstatsParserPatterns.NEW_TS_TO_MILLIS) : null;
        this.f5358d = true;
    }

    public void setFadeDuration(int i) {
        this.h = i;
    }

    public void e() {
        int i;
        com.facebook.imagepipeline.n.c a2;
        if (!this.f5358d || this.j == null || this.f5355a == null) {
            return;
        }
        com.facebook.f.f.a hierarchy = getHierarchy();
        hierarchy.a(this.f5357c);
        if (this.f5356b != null) {
            hierarchy.a(this.f5356b, o.b.e);
        }
        if (this.h >= 0) {
            i = this.h;
        } else {
            this.f5355a.d();
            i = 0;
        }
        hierarchy.a(i);
        new i(this.j.e());
        File g = this.j.g();
        if (g != null && g.exists()) {
            a2 = com.facebook.imagepipeline.n.c.a(Uri.fromFile(g));
            this.m = false;
        } else {
            a2 = com.facebook.imagepipeline.n.c.a(this.f5355a.b()).a(this.i);
            this.m = true;
        }
        com.facebook.imagepipeline.n.b n = a2.a((com.facebook.imagepipeline.e.d) null).a(false).b(false).c(false).n();
        this.e.e();
        this.e.a(true).e(this.g).b(getController()).b((com.facebook.f.c.b) n);
        this.e.a(this.f);
        setController(this.e.q());
        this.f5358d = false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        e();
    }

    public void setBlendingSpecification(an anVar) {
        this.j = new c(anVar);
        this.i = new d(this.j, this);
        setSource(this.j.c());
        e();
    }

    public void f() {
        if (this.l == null || !this.m) {
            return;
        }
        this.l.a(new com.facebook.react.views.image.b(getId(), 3, this.f5355a.a()));
    }
}
