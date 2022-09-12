package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.apps.maps.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: PG */
/* renamed from: ss  reason: default package */
/* loaded from: classes.dex */
public final class ss extends sz implements kt {
    private sn d;
    private sr e;
    private int f;
    private int g;
    private boolean h;

    public ss() {
        this(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01db, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r19.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ss a(android.content.Context r17, android.content.res.Resources r18, org.xmlpull.v1.XmlPullParser r19, android.util.AttributeSet r20, android.content.res.Resources.Theme r21) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss.a(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):ss");
    }

    public static ss f(Context context) {
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(R.drawable.tristate_checkbox);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                int next = xml.next();
                if (next == 2) {
                    return a(context, resources, xml, asAttributeSet, null);
                }
                if (next == 1) {
                    throw new XmlPullParserException("No start tag found");
                }
            }
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.sz, defpackage.sw
    /* renamed from: b */
    public final sn e() {
        return new sn(this.d, this, null);
    }

    @Override // defpackage.sz, defpackage.sw
    public final void c(sv svVar) {
        super.c(svVar);
        if (svVar instanceof sn) {
            this.d = (sn) svVar;
        }
    }

    @Override // defpackage.sz, defpackage.sw, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // defpackage.sw, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        sr srVar = this.e;
        if (srVar != null) {
            srVar.b();
            this.e = null;
            g(this.f);
            this.f = -1;
            this.g = -1;
        }
    }

    @Override // defpackage.sz, defpackage.sw, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.h) {
            super.mutate();
            this.d.a();
            this.h = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00df, code lost:
        if (g(r2) != false) goto L7;
     */
    @Override // defpackage.sz, defpackage.sw, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStateChange(int[] r19) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss.onStateChange(int[]):boolean");
    }

    @Override // defpackage.sw, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        sr srVar = this.e;
        if (srVar != null && (visible || z2)) {
            if (z) {
                srVar.a();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public ss(sn snVar, Resources resources) {
        super(null);
        this.f = -1;
        this.g = -1;
        c(new sn(snVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
