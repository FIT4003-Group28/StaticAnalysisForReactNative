package com.google.android.libraries.onegoogle.accountmenu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class SelectedAccountDisc<T> extends FrameLayout {
    public final ImageView a;
    public final AccountParticleDisc<T> b;
    public View.OnClickListener c;
    public View.OnTouchListener d;
    public View.OnTouchListener e;
    public cvze<T> f;
    public boolean g;

    public SelectedAccountDisc(Context context) {
        this(context, null);
    }

    private final void a() {
        this.b.setBadgeRetriever(null);
        this.b.setRingRetriever(null);
        this.g = false;
    }

    public void setBadgeRetriever(cvvi<T> cvviVar) {
        if (this.g) {
            a();
        }
        this.b.setBadgeRetriever(cvviVar);
    }

    public void setCustomClickListener(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    @Override // android.view.View
    public void setOnClickListener(final View.OnClickListener onClickListener) {
        super.setOnClickListener(new View.OnClickListener(this, onClickListener) { // from class: cvye
            private final SelectedAccountDisc a;
            private final View.OnClickListener b;

            {
                this.a = this;
                this.b = onClickListener;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectedAccountDisc selectedAccountDisc = this.a;
                View.OnClickListener onClickListener2 = this.b;
                View.OnClickListener onClickListener3 = selectedAccountDisc.c;
                if (onClickListener3 != null) {
                    onClickListener3.onClick(view);
                }
                cvze<T> cvzeVar = selectedAccountDisc.f;
                if (cvzeVar != 0) {
                    cvzeVar.k().d(csgw.a(), view);
                }
                onClickListener2.onClick(view);
            }
        });
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.d = onTouchListener;
    }

    public void setRingRetriever(cvvn<cvvx, T> cvvnVar) {
        if (this.g) {
            a();
        }
        this.b.setRingRetriever(cvvnVar);
    }

    public SelectedAccountDisc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectedAccountDisc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.selected_account_disc, (ViewGroup) this, true);
        AccountParticleDisc<T> accountParticleDisc = (AccountParticleDisc) findViewById(R.id.og_selected_account_disc_apd);
        this.b = accountParticleDisc;
        ImageView imageView = (ImageView) findViewById(R.id.incognito_on_image_view);
        this.a = imageView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cvyc.a, i, 0);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            if (dimensionPixelSize != -1) {
                accountParticleDisc.setMaxDiscContentSize(dimensionPixelSize);
                int d = cwiz.d(context);
                if (d != 0) {
                    accountParticleDisc.setBackgroundResource(d);
                    imageView.setBackgroundResource(d);
                }
                obtainStyledAttributes.recycle();
                super.setOnTouchListener(new View.OnTouchListener(this) { // from class: cvyd
                    private final SelectedAccountDisc a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        SelectedAccountDisc selectedAccountDisc = this.a;
                        View.OnTouchListener onTouchListener = selectedAccountDisc.d;
                        boolean z = onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
                        View.OnTouchListener onTouchListener2 = selectedAccountDisc.e;
                        boolean z2 = onTouchListener2 != null && onTouchListener2.onTouch(view, motionEvent);
                        if (selectedAccountDisc.e == null || !z) {
                            return z2 || z;
                        }
                        throw new RuntimeException("customOnTouchListener may not consume the event");
                    }
                });
                return;
            }
            throw new RuntimeException("maxDiscContentSize must be set");
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
