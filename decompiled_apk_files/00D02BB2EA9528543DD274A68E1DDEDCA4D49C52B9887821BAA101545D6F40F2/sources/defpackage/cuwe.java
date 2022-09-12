package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.lang.reflect.Field;
/* compiled from: PG */
/* renamed from: cuwe  reason: default package */
/* loaded from: classes5.dex */
public final class cuwe {
    public static void a(TextView textView, int i) {
        try {
            Field declaredField = TextView.class.getDeclaredField("mEditor");
            if (!declaredField.isAccessible()) {
                declaredField.setAccessible(true);
            }
            Object obj = declaredField.get(textView);
            Class<?> cls = obj.getClass();
            String[] strArr = {"mSelectHandleLeft", "mSelectHandleRight"};
            String[] strArr2 = {"mTextSelectHandleLeftRes", "mTextSelectHandleRightRes"};
            for (int i2 = 0; i2 < 2; i2++) {
                Field declaredField2 = cls.getDeclaredField(strArr[i2]);
                if (!declaredField2.isAccessible()) {
                    declaredField2.setAccessible(true);
                }
                Drawable drawable = (Drawable) declaredField2.get(obj);
                if (drawable == null) {
                    Field declaredField3 = TextView.class.getDeclaredField(strArr2[i2]);
                    if (!declaredField3.isAccessible()) {
                        declaredField3.setAccessible(true);
                    }
                    drawable = textView.getResources().getDrawable(declaredField3.getInt(textView));
                }
                if (drawable != null) {
                    Drawable mutate = drawable.mutate();
                    mutate.setColorFilter(i, PorterDuff.Mode.SRC_IN);
                    declaredField2.set(obj, mutate);
                }
            }
        } catch (IllegalAccessException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("Illegal access exception ");
            sb.append(valueOf);
            sb.toString();
            cstl.a("SELECT_HANDLE_UTILS");
        } catch (NoSuchFieldException e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
            sb2.append("No such filed exception ");
            sb2.append(valueOf2);
            sb2.toString();
            cstl.a("SELECT_HANDLE_UTILS");
        }
    }
}
