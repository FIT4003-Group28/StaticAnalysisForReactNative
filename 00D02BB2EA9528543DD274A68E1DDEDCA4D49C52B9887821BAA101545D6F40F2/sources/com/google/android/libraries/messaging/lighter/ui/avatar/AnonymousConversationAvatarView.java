package com.google.android.libraries.messaging.lighter.ui.avatar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class AnonymousConversationAvatarView extends RelativeLayout implements cuvg {
    public cuuv a;
    ImageView b;
    ImageView c;
    public int[] d;
    public int e;
    public int f;
    int g;
    Bitmap h;
    Bitmap i;
    public dbsg<Pair<Bitmap, Boolean>> j;
    cuul k;
    private int l;
    private boolean m;
    private boolean n;

    public AnonymousConversationAvatarView(Context context) {
        this(context, null);
    }

    private final void f(cufj cufjVar) {
        if (!this.m) {
            return;
        }
        Bitmap bitmap = null;
        if (cufjVar.k().a()) {
            if (cufjVar.k().b().a() != 1) {
                this.i = null;
            } else {
                bitmap = BitmapFactory.decodeResource(getContext().getResources(), 2131232965);
            }
            if (bitmap == null) {
                return;
            }
            this.i = this.a.e(new BitmapDrawable(getResources(), bitmap), (int) (this.g * 0.375f));
            return;
        }
        this.i = null;
    }

    private final boolean g() {
        if (this.n) {
            return dxzy.e() && (getResources().getConfiguration().uiMode & 48) == 32;
        }
        return false;
    }

    @Override // defpackage.cuvg
    public final void a(cufp cufpVar, cufj[] cufjVarArr) {
        dbsg<cufj> dbsgVar;
        if (cufpVar.a().c().equals(ConversationId.IdType.ONE_TO_ONE)) {
            int length = cufjVarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    cufj cufjVar = cufjVarArr[i];
                    if (cufjVar.a().equals(cufpVar.a().e())) {
                        dbsgVar = dbsg.i(cufjVar);
                        break;
                    }
                    i++;
                } else {
                    cstl.a("AnonConvAvatarView");
                    dbsgVar = dbpy.a;
                    break;
                }
            }
        } else {
            dbsgVar = dbpy.a;
        }
        Bitmap c = this.k.c(cufpVar, dbsgVar, this.l, new cuum(this), g());
        this.h = c;
        ImageView imageView = this.b;
        int i2 = this.g;
        imageView.setImageBitmap(Bitmap.createScaledBitmap(c, i2, i2, false));
        if (cufpVar.a().c() == ConversationId.IdType.ONE_TO_ONE && dbsgVar.a()) {
            f(dbsgVar.b());
        }
        Bitmap bitmap = this.i;
        if (bitmap != null) {
            this.c.setImageBitmap(bitmap);
        }
    }

    @Override // defpackage.cuww
    public final void b() {
        this.h = null;
        this.i = null;
        this.c.setImageBitmap(null);
    }

    @Override // defpackage.cuvg
    public final void c(ConversationId conversationId, cufj cufjVar) {
        if (conversationId.c() != ConversationId.IdType.ONE_TO_ONE) {
            return;
        }
        boolean g = g();
        if (this.k.b(conversationId, this.g, g) != null) {
            return;
        }
        dbsg<Pair<Bitmap, Boolean>> i = dbsg.i(Pair.create(e(cufjVar, g), Boolean.valueOf(g)));
        this.j = i;
        ImageView imageView = this.b;
        int i2 = this.g;
        imageView.setImageBitmap(Bitmap.createScaledBitmap((Bitmap) i.b().first, i2, i2, false));
        f(cufjVar);
        Bitmap bitmap = this.i;
        if (bitmap == null) {
            return;
        }
        this.c.setImageBitmap(bitmap);
    }

    @Override // defpackage.cuvg
    public final void d(boolean z) {
        this.m = z;
        this.c.setVisibility(true != z ? 8 : 0);
    }

    public final Bitmap e(cufj cufjVar, boolean z) {
        dbsg<Bitmap> dbsgVar;
        if (this.j.a() && ((Boolean) this.j.b().second).booleanValue() == z) {
            dbsgVar = dbsg.i((Bitmap) this.j.b().first);
        } else {
            dbsgVar = dbpy.a;
        }
        return this.a.d(cufjVar, this.l, this.d, z ? this.f : this.e, dbsgVar, getContext().getDrawable(2131232062));
    }

    @Override // defpackage.cuvg
    public void setAvatarSize(int i) {
        this.g = i;
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            this.b.setImageBitmap(Bitmap.createScaledBitmap(bitmap, i, i, false));
            Bitmap bitmap2 = this.i;
            if (bitmap2 == null) {
                return;
            }
            int i2 = (int) (this.g * 0.375f);
            this.c.setImageBitmap(Bitmap.createScaledBitmap(bitmap2, i2, i2, false));
        }
    }

    @Override // defpackage.cuvg
    public void setDarkModeEnabled(boolean z) {
        this.n = z;
    }

    @Override // defpackage.cuvv
    public void setPresenter(cuvf cuvfVar) {
    }

    public AnonymousConversationAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AnonymousConversationAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainTypedArray;
        this.j = dbpy.a;
        this.k = cuul.a();
        inflate(getContext(), R.layout.avatar_view_layout, this);
        this.b = (ImageView) findViewById(R.id.avatar_icon);
        this.c = (ImageView) findViewById(R.id.avatar_badge);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cuvi.a, i, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, cuwg.a(getContext(), 60.0f));
        this.l = dimensionPixelSize;
        this.g = dimensionPixelSize;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.j = dbpy.a;
        if (resourceId != 0) {
            obtainTypedArray = getResources().obtainTypedArray(resourceId);
        } else {
            obtainTypedArray = getResources().obtainTypedArray(R.array.avatar_bg_colors_default_array);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            this.e = akm.c(getContext(), resourceId2);
        } else {
            this.e = akm.c(getContext(), R.color.avatar_fg_color);
            this.f = akm.c(getContext(), R.color.avatar_fg_dark_mode_color);
        }
        this.d = new int[obtainTypedArray.length()];
        for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
            this.d[i2] = obtainTypedArray.getColor(i2, -7829368);
        }
        obtainTypedArray.recycle();
        obtainStyledAttributes.recycle();
        this.a = cuuv.a();
        int i3 = this.g;
        Bitmap createBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Paint paint = new Paint();
        paint.setColor(0);
        float f = i3 / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        ImageView imageView = this.b;
        int i4 = this.g;
        imageView.setImageBitmap(Bitmap.createScaledBitmap(createBitmap, i4, i4, false));
    }
}
