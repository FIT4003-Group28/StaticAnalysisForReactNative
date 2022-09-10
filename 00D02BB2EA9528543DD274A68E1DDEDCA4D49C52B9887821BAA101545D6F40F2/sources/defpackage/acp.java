package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acp  reason: default package */
/* loaded from: classes.dex */
public final class acp implements acs {
    @Override // defpackage.acs
    public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            return azz.b(context, context.getResources(), xmlPullParser, attributeSet, theme);
        } catch (Exception unused) {
            return null;
        }
    }
}
