package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.filament.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: akck  reason: default package */
/* loaded from: classes2.dex */
final class akck extends cqtd {
    final /* synthetic */ akcl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akck(akcl akclVar, Object[] objArr) {
        super(objArr);
        this.a = akclVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        String str;
        cztc a = cztd.a(context.getApplicationContext(), this.a.f);
        btlu btluVar = this.a.o;
        dbsk.s(btluVar);
        String t = btluVar.t();
        String str2 = null;
        btlw e = t == null ? null : this.a.g.a().e(t);
        if (e != null) {
            String a2 = e.a();
            str2 = e.b();
            str = a2;
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (str != null) {
            arrayList.add(str);
        }
        if (t != null) {
            arrayList.add(t);
        }
        final String[] strArr = (String[]) arrayList.toArray(new String[0]);
        Bitmap createBitmap = Bitmap.createBitmap(R.styleable.AppCompatTheme_windowFixedHeightMajor, R.styleable.AppCompatTheme_windowFixedHeightMajor, Bitmap.Config.ARGB_8888);
        a.b(t);
        a.c(new cztb(strArr) { // from class: akcj
            private final String[] a;

            {
                this.a = strArr;
            }

            @Override // defpackage.cztb
            public final String[] a() {
                return this.a;
            }
        });
        a.a(createBitmap);
        return new BitmapDrawable(context.getResources(), createBitmap);
    }
}
