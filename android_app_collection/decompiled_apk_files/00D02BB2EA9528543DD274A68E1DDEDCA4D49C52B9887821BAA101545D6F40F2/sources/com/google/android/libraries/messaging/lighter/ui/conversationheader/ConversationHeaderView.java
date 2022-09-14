package com.google.android.libraries.messaging.lighter.ui.conversationheader;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ConversationHeaderView extends czvg implements cvak {
    private final Toolbar e;
    private final cuvg f;
    private final TextView g;
    private final TextView h;
    private final float i;
    private final float j;
    private final float k;
    private final float l;
    private Integer m;
    private int n;

    public ConversationHeaderView(Context context) {
        this(context, null);
    }

    @Override // defpackage.cvak
    public final void a(cufp cufpVar, List<cufj> list) {
        String b = cuwg.b(getContext(), cufpVar, list);
        if (!dbsj.d(b)) {
            this.g.setText(b);
        }
        this.n = 1;
    }

    @Override // defpackage.cvak
    public final cuvg b() {
        return this.f;
    }

    @Override // defpackage.cvak
    public final void c(int i) {
        this.e.f().removeItem(i);
    }

    @Override // defpackage.cvak
    public final MenuItem d(String str, int i, byte[] bArr, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        dbsg i2;
        int i3 = this.n + 1;
        this.n = i3;
        int i4 = i3 * 50;
        TextView textView = this.g;
        textView.setPadding(i4, textView.getPaddingTop(), i4, this.g.getPaddingBottom());
        MenuItem onMenuItemClickListener2 = this.e.f().add(0, i, 0, str).setOnMenuItemClickListener(onMenuItemClickListener);
        int i5 = (int) this.k;
        int i6 = (int) this.l;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (decodeByteArray == null) {
            cstl.a("ConHeaderView");
            i2 = dbpy.a;
        } else {
            i2 = dbsg.i(new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(decodeByteArray, i5, i6, true)));
        }
        if (i2.a()) {
            onMenuItemClickListener2.setIcon((Drawable) i2.b());
        }
        return onMenuItemClickListener2.setShowAsActionFlags(1);
    }

    @Override // defpackage.cvak
    public final void e() {
        float f = getResources().getDisplayMetrics().density;
        int i = (int) (21.0f * f);
        ((czve) this.e.getLayoutParams()).setMargins(0, i, 0, i);
        ((LinearLayout.LayoutParams) this.g.getLayoutParams()).setMargins(0, (int) (f + f), 0, 0);
        this.h.setVisibility(0);
    }

    @Override // defpackage.cvak
    public final MenuItem f(int i, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this.e.f().add(0, 0, 2, i).setOnMenuItemClickListener(onMenuItemClickListener);
    }

    @Override // defpackage.cvak
    public final MenuItem g(String str, int i, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this.e.f().add(0, i, 1, str).setOnMenuItemClickListener(onMenuItemClickListener);
    }

    @Override // defpackage.czuz
    public final void h(AppBarLayout appBarLayout, int i) {
        if (this.m == null) {
            this.m = Integer.valueOf(appBarLayout.g());
        }
        float intValue = this.m.intValue() > 0 ? (this.m.intValue() + i) / this.m.intValue() : 1.0f;
        cuvg cuvgVar = this.f;
        float f = this.j;
        cuvgVar.setAvatarSize((int) (f + (intValue * (this.i - f))));
    }

    public void setNavigationBarColor(int i) {
        setBackgroundColor(i);
    }

    @Override // defpackage.cuvv
    public void setPresenter(final cvaj cvajVar) {
        Toolbar toolbar = this.e;
        cvajVar.getClass();
        toolbar.setNavigationOnClickListener(new View.OnClickListener(cvajVar) { // from class: cvao
            private final cvaj a;

            {
                this.a = cvajVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b();
            }
        });
        Toolbar toolbar2 = this.e;
        cvajVar.getClass();
        toolbar2.setOnMenuItemClickListener(new aew(cvajVar) { // from class: cvap
            private final cvaj a;

            {
                this.a = cvajVar;
            }

            @Override // defpackage.aew
            public final boolean a() {
                return this.a.a();
            }
        });
    }

    @Override // defpackage.cvak
    public void setSubtitle(CharSequence charSequence) {
        this.h.setText(charSequence);
    }

    @Override // defpackage.cvak
    public void setSubtitleContentDescription(CharSequence charSequence) {
        this.h.setContentDescription(charSequence);
    }

    @Override // defpackage.cvak
    public void setTitle(String str) {
        this.g.setText(str);
    }

    public ConversationHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // defpackage.cvak
    public void setSubtitle(CharSequence charSequence, TextView.BufferType bufferType) {
        this.h.setText(charSequence, bufferType);
    }

    public ConversationHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = null;
        this.n = 1;
        inflate(getContext(), R.layout.conversation_header_layout, this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.e = toolbar;
        Drawable g = toolbar.g();
        if (g != null) {
            g.setColorFilter(akm.c(getContext(), R.color.header_overflow_icon_color), PorterDuff.Mode.SRC_IN);
        }
        cuvg cuvgVar = (cuvg) findViewById(R.id.conversation_avatar);
        this.f = cuvgVar;
        this.g = (TextView) findViewById(R.id.header_title);
        this.h = (TextView) findViewById(R.id.header_subtitle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cvaq.a);
        try {
            this.i = obtainStyledAttributes.getDimension(1, getResources().getDimension(R.dimen.default_avatar_expanded_size));
            this.j = obtainStyledAttributes.getDimension(0, getResources().getDimension(R.dimen.default_avatar_collapsed_size));
            this.k = getResources().getDimension(R.dimen.default_toolbar_button_icon_width);
            this.l = getResources().getDimension(R.dimen.default_toolbar_button_icon_height);
            obtainStyledAttributes.recycle();
            setNavigationBarColor(-1);
            cuvgVar.d(true);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
