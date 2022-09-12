package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: cqbr  reason: default package */
/* loaded from: classes5.dex */
public final class cqbr {
    public static final /* synthetic */ int a = 0;
    private static final couv b;

    static {
        couu a2 = couv.a();
        a2.a = 732;
        b = a2.a();
    }

    public static Bitmap d(Bitmap bitmap) {
        int i;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = 0;
        if (width >= height) {
            i2 = (height - width) / 2;
            width = height;
            i = 0;
        } else {
            i = (width - height) / 2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        float f = width / 2;
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, i2, i, paint);
        return createBitmap;
    }

    public final void a(Context context, final Account account, final cqbq<String> cqbqVar) {
        couw.b(context, b).a(null).i(new cnon(account, cqbqVar) { // from class: cqbo
            private final Account a;
            private final cqbq b;

            {
                this.a = account;
                this.b = cqbqVar;
            }

            @Override // defpackage.cnon
            public final void Om(cnom cnomVar) {
                Account account2 = this.a;
                cqbq cqbqVar2 = this.b;
                couj coujVar = (couj) cnomVar;
                int i = cqbr.a;
                String str = account2.name;
                try {
                    Status a2 = coujVar.a();
                    if (a2.d()) {
                        cowv c = coujVar.c();
                        String str2 = account2.name;
                        cowu cowuVar = null;
                        if (c != null) {
                            Iterator<cowu> it = c.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                cowu next = it.next();
                                if (next.b().equals(str2)) {
                                    cowuVar = next;
                                    break;
                                }
                            }
                        }
                        if (cowuVar != null && cowuVar.d()) {
                            str = cowuVar.e();
                        }
                    } else {
                        int i2 = a2.g;
                        String str3 = a2.h;
                    }
                } finally {
                    coujVar.b();
                    cqbqVar2.a(str);
                }
            }
        });
    }

    public final void b(final Context context, Account account, final cqbq<Bitmap> cqbqVar) {
        couw.a(context, b).a(account.name, 0, 0).i(new cnon(this, cqbqVar, context) { // from class: cqbp
            private final cqbr a;
            private final cqbq b;
            private final Context c;

            {
                this.a = this;
                this.b = cqbqVar;
                this.c = context;
            }

            @Override // defpackage.cnon
            public final void Om(cnom cnomVar) {
                Bitmap bitmap;
                cqbr cqbrVar = this.a;
                cqbq cqbqVar2 = this.b;
                Context context2 = this.c;
                coul coulVar = (coul) cnomVar;
                try {
                    Status a2 = coulVar.a();
                    if (a2.d()) {
                        bitmap = cqbr.d(coux.a(coulVar.c()));
                    } else {
                        int i = a2.g;
                        String str = a2.h;
                        bitmap = null;
                    }
                    if (bitmap == null) {
                        bitmap = cqbrVar.c(context2);
                    }
                    cqbqVar2.a(bitmap);
                    coulVar.b();
                } catch (Throwable th) {
                    cqbqVar2.a(cqbrVar.c(context2));
                    coulVar.b();
                    throw th;
                }
            }
        });
    }

    public final Bitmap c(Context context) {
        return d(BitmapFactory.decodeResource(context.getResources(), 2131232131));
    }
}
