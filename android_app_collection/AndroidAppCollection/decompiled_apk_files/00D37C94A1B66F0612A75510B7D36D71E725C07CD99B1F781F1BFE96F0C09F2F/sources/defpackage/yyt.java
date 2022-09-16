package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: yyt  reason: default package */
/* loaded from: classes4.dex */
public final class yyt {
    public static final yyp a = new yyp();
    private static final Handler b = new Handler(Looper.getMainLooper());

    public static void a(ImageView imageView) {
        imageView.setTag(R.id.bitmap_loader_tag, null);
    }

    public static void b(yys yysVar, Uri uri, ImageView imageView, yyr yyrVar) {
        c(yysVar, a, new yyq(imageView.getContext()), uri, imageView, yyrVar);
    }

    public static void c(yys yysVar, yyn yynVar, yyo yyoVar, Uri uri, ImageView imageView, yyr yyrVar) {
        yysVar.getClass();
        imageView.getClass();
        if (yynVar != null) {
            yynVar.a(imageView);
        }
        if (yyrVar != null) {
            yyrVar.e(imageView);
        }
        yysVar.a(uri, yje.c(b, new yym(imageView, yyoVar, yyrVar)));
    }
}
