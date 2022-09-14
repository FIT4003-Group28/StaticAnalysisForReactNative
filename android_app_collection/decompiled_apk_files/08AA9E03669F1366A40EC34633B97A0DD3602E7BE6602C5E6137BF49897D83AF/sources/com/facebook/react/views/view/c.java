package com.facebook.react.views.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.ao;
import com.facebook.react.bridge.n;
/* compiled from: ReactDrawableHelper.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final TypedValue f4175a = new TypedValue();

    public static Drawable a(Context context, an anVar) {
        int color;
        String string = anVar.getString("type");
        if ("ThemeAttrAndroid".equals(string)) {
            String string2 = anVar.getString("attribute");
            ao.a(string2);
            int identifier = context.getResources().getIdentifier(string2, "attr", b.a.a.a.a.b.a.ANDROID_CLIENT_TYPE);
            if (identifier == 0) {
                throw new n("Attribute " + string2 + " couldn't be found in the resource list");
            } else if (context.getTheme().resolveAttribute(identifier, f4175a, true)) {
                if (Build.VERSION.SDK_INT >= 21) {
                    return context.getResources().getDrawable(f4175a.resourceId, context.getTheme());
                }
                return context.getResources().getDrawable(f4175a.resourceId);
            } else {
                throw new n("Attribute " + string2 + " couldn't be resolved into a drawable");
            }
        } else if ("RippleAndroid".equals(string)) {
            if (Build.VERSION.SDK_INT < 21) {
                throw new n("Ripple drawable is not available on android API <21");
            }
            if (anVar.hasKey("color") && !anVar.isNull("color")) {
                color = anVar.getInt("color");
            } else if (context.getTheme().resolveAttribute(16843820, f4175a, true)) {
                color = context.getResources().getColor(f4175a.resourceId);
            } else {
                throw new n("Attribute colorControlHighlight couldn't be resolved into a drawable");
            }
            return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{color}), null, (!anVar.hasKey("borderless") || anVar.isNull("borderless") || !anVar.getBoolean("borderless")) ? new ColorDrawable(-1) : null);
        } else {
            throw new n("Invalid type for android drawable: " + string);
        }
    }
}
