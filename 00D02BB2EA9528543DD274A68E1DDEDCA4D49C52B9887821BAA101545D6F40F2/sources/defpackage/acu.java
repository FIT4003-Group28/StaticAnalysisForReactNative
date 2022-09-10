package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acu  reason: default package */
/* loaded from: classes.dex */
public final class acu implements acs {
    @Override // defpackage.acs
    public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            return bam.c(context.getResources(), xmlPullParser, attributeSet, theme);
        } catch (Exception unused) {
            return null;
        }
    }
}
