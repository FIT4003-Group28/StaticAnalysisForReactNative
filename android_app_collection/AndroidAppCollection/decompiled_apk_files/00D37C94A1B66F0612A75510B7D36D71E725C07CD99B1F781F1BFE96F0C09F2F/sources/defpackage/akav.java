package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akav  reason: default package */
/* loaded from: classes.dex */
public final class akav extends vev {
    public akav(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vev
    public final Object a(int i, View view) {
        if (((vex) getItem(i)) instanceof akaw) {
            return new akau(view);
        }
        return super.a(i, view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vev
    public final void b(int i, Object obj) {
        vex vexVar = (vex) getItem(i);
        if (vexVar instanceof akaw) {
            akaw akawVar = (akaw) vexVar;
            akau akauVar = (akau) obj;
            akauVar.a.setText(akawVar.c);
            if (!TextUtils.isEmpty(akawVar.h)) {
                TextView textView = akauVar.b;
                if (textView == null) {
                    akauVar.a.append(akawVar.h);
                } else {
                    textView.setText(akawVar.h);
                }
            }
            ColorStateList colorStateList = akawVar.d;
            if (colorStateList != null) {
                akauVar.a.setTextColor(colorStateList);
            } else {
                akauVar.a.setTextColor(zhn.j(getContext(), R.attr.ytTextPrimary).orElse(0));
            }
            Drawable drawable = akawVar.e;
            if (drawable != null) {
                akauVar.c.setImageDrawable(drawable);
                akauVar.c.setVisibility(0);
            } else {
                akauVar.c.setVisibility(8);
            }
            Drawable drawable2 = akawVar.f;
            if (drawable2 != null) {
                akauVar.d.setImageDrawable(drawable2);
                akauVar.d.setVisibility(0);
            } else {
                akauVar.d.setVisibility(8);
            }
            akauVar.a.setAccessibilityDelegate(new akat(akawVar));
            return;
        }
        super.b(i, obj);
    }
}
