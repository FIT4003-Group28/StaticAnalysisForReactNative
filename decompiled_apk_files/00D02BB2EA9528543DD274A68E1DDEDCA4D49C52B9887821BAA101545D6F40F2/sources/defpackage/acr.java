package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: PG */
/* renamed from: acr  reason: default package */
/* loaded from: classes.dex */
final class acr implements acs {
    @Override // defpackage.acs
    public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String classAttribute = attributeSet.getClassAttribute();
        if (classAttribute != null) {
            try {
                Drawable drawable = (Drawable) acr.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                return drawable;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
