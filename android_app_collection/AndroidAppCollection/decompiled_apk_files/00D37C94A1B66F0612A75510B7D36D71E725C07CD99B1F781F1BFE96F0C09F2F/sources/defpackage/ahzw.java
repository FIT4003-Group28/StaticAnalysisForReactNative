package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayDeque;
/* compiled from: PG */
/* renamed from: ahzw  reason: default package */
/* loaded from: classes.dex */
public final class ahzw extends aizc implements View.OnClickListener, ahzm {
    private final TextView a;
    private final TextView b;
    private final TextView c;
    private final View d;
    private final ImageView e;
    private final ImageView f;
    private ahzl g;
    private int h;
    private int i;
    private CharSequence j;
    private CharSequence k;
    private final View l;
    private final TextView m;

    public ahzw(Context context) {
        super(context);
        View findViewById = LayoutInflater.from(context).inflate(R.layout.livestream_offline_slate, (ViewGroup) this, true).findViewById(R.id.livestream_offline_slate);
        this.a = (TextView) findViewById.findViewById(R.id.livestream_line1);
        this.b = (TextView) findViewById.findViewById(R.id.livestream_line2);
        this.f = (ImageView) findViewById.findViewById(R.id.livestream_channel_image);
        View findViewById2 = findViewById.findViewById(R.id.livestream_notification_button);
        this.d = findViewById2;
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.livestream_notification_icon);
        this.e = imageView;
        this.c = (TextView) findViewById.findViewById(R.id.livestream_notification_text);
        findViewById2.setOnClickListener(this);
        View findViewById3 = findViewById.findViewById(R.id.livestream_replay_button);
        this.l = findViewById3;
        this.m = (TextView) findViewById.findViewById(R.id.livestream_replay_text);
        findViewById3.setOnClickListener(this);
        setClickable(false);
        setBackgroundColor(0);
        imageView.setImageAlpha(128);
        kT();
    }

    private final void a(boolean z) {
        int i;
        this.d.setSelected(z);
        int i2 = this.h;
        if (i2 != 0 && (i = this.i) != 0) {
            ImageView imageView = this.e;
            if (!z) {
                i2 = i;
            }
            imageView.setImageResource(i2);
        }
        this.c.setText(z ? this.j : this.k);
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahzm
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.ahzm
    public final void kT() {
        setVisibility(8);
    }

    @Override // defpackage.ahzm
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.ahzm
    public final /* synthetic */ void m() {
    }

    @Override // defpackage.ahzm
    public final void o(long j) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.d;
        if (view == view2) {
            a(!view2.isSelected());
            this.g.rV();
        }
        if (view == this.l) {
            this.g.rU();
        }
    }

    @Override // defpackage.ahzm
    public final void p(Bitmap bitmap) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
            setClickable(bitmap != null);
        }
    }

    @Override // defpackage.ahzm
    public final void q(ahzl ahzlVar) {
        ahzlVar.getClass();
        this.g = ahzlVar;
    }

    @Override // defpackage.ahzm
    public final /* synthetic */ void r(boolean z) {
    }

    @Override // defpackage.ahzm
    public final void t(CharSequence charSequence, CharSequence charSequence2, boolean z, CharSequence charSequence3, int i, CharSequence charSequence4, int i2) {
        this.a.setText(charSequence);
        this.b.setText(charSequence2);
        ArrayDeque arrayDeque = new ArrayDeque();
        if (!TextUtils.isEmpty(charSequence2) || TextUtils.isEmpty(charSequence)) {
            arrayDeque.add(zgd.d(2, R.id.livestream_text_anchor));
            arrayDeque.add(zgd.n(15));
        } else {
            arrayDeque.add(zgd.n(2));
            arrayDeque.add(zgd.c(15));
        }
        zgd.t(this.a, zgd.y(arrayDeque), RelativeLayout.LayoutParams.class);
        int i3 = 0;
        setVisibility(0);
        this.h = i2;
        this.i = i;
        this.j = charSequence4;
        this.k = charSequence3;
        a(z);
        this.l.setVisibility(8);
        View view = this.d;
        if (i <= 0) {
            i3 = 8;
        }
        view.setVisibility(i3);
    }

    @Override // defpackage.ahzm
    public final /* synthetic */ void u(boolean z) {
    }

    @Override // defpackage.ahzm
    public final void v(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.a.setText(charSequence);
        this.b.setText(charSequence2);
        setVisibility(0);
        this.m.setText(charSequence3);
        this.d.setVisibility(8);
        this.l.setVisibility(0);
    }

    @Override // defpackage.ahzm
    public final /* synthetic */ void w(boolean z) {
    }
}
