package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a;
/* compiled from: PG */
/* renamed from: ord  reason: default package */
/* loaded from: classes4.dex */
public final class ord {
    public static int a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            default:
                return 0;
        }
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static final void c(a aVar, View view, TextView textView, ImageView imageView, TextView textView2, TextView textView3, ColorStateList colorStateList) {
        textView.setText(aVar.b);
        textView.setTextColor(colorStateList);
        Drawable drawable = aVar.d;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
        }
        String str = aVar.e;
        if (str == null) {
            textView2.setVisibility(8);
            textView3.setVisibility(8);
        } else {
            textView2.setText(str);
            textView2.setVisibility(0);
            aVar.e.getClass();
            if (!aVar.c) {
                textView3.setText("•");
                textView3.setVisibility(0);
            }
        }
        CharSequence charSequence = aVar.f;
        if (charSequence != null) {
            view.setContentDescription(charSequence);
        }
    }
}
