package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yr  reason: default package */
/* loaded from: classes4.dex */
public final class yr implements yt {
    private final /* synthetic */ int a;

    public yr() {
    }

    public yr(int i) {
        this.a = i;
    }

    @Override // defpackage.yt
    public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i = this.a;
        if (i == 0) {
            try {
                return boq.b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        } else if (i == 1) {
            try {
                return pv.b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        } else {
            try {
                return bpb.b(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e3) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e3);
                return null;
            }
        }
    }
}
