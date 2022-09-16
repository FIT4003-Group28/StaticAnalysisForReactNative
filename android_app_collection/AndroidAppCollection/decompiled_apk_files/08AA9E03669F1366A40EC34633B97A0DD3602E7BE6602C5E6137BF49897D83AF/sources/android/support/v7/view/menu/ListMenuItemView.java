package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a;
import android.support.v7.view.menu.n;
import android.support.v7.widget.am;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements n.a {

    /* renamed from: a  reason: collision with root package name */
    private h f733a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f734b;

    /* renamed from: c  reason: collision with root package name */
    private RadioButton f735c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f736d;
    private CheckBox e;
    private TextView f;
    private ImageView g;
    private Drawable h;
    private int i;
    private Context j;
    private boolean k;
    private Drawable l;
    private int m;
    private LayoutInflater n;
    private boolean o;

    @Override // android.support.v7.view.menu.n.a
    public boolean a() {
        return false;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.C0020a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        am a2 = am.a(getContext(), attributeSet, a.j.MenuView, i, 0);
        this.h = a2.a(a.j.MenuView_android_itemBackground);
        this.i = a2.g(a.j.MenuView_android_itemTextAppearance, -1);
        this.k = a2.a(a.j.MenuView_preserveIconSpacing, false);
        this.j = context;
        this.l = a2.a(a.j.MenuView_subMenuArrow);
        a2.a();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        android.support.v4.j.s.a(this, this.h);
        this.f736d = (TextView) findViewById(a.f.title);
        if (this.i != -1) {
            this.f736d.setTextAppearance(this.j, this.i);
        }
        this.f = (TextView) findViewById(a.f.shortcut);
        this.g = (ImageView) findViewById(a.f.submenuarrow);
        if (this.g != null) {
            this.g.setImageDrawable(this.l);
        }
    }

    @Override // android.support.v7.view.menu.n.a
    public void a(h hVar, int i) {
        this.f733a = hVar;
        this.m = i;
        setVisibility(hVar.isVisible() ? 0 : 8);
        setTitle(hVar.a((n.a) this));
        setCheckable(hVar.isCheckable());
        a(hVar.f(), hVar.d());
        setIcon(hVar.getIcon());
        setEnabled(hVar.isEnabled());
        setSubMenuArrowVisible(hVar.hasSubMenu());
        setContentDescription(hVar.getContentDescription());
    }

    public void setForceShowIcon(boolean z) {
        this.o = z;
        this.k = z;
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f736d.setText(charSequence);
            if (this.f736d.getVisibility() == 0) {
                return;
            }
            this.f736d.setVisibility(0);
        } else if (this.f736d.getVisibility() == 8) {
        } else {
            this.f736d.setVisibility(8);
        }
    }

    @Override // android.support.v7.view.menu.n.a
    public h getItemData() {
        return this.f733a;
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f735c == null && this.e == null) {
            return;
        }
        if (this.f733a.g()) {
            if (this.f735c == null) {
                c();
            }
            compoundButton = this.f735c;
            compoundButton2 = this.e;
        } else {
            if (this.e == null) {
                d();
            }
            compoundButton = this.e;
            compoundButton2 = this.f735c;
        }
        if (z) {
            compoundButton.setChecked(this.f733a.isChecked());
            int i = z ? 0 : 8;
            if (compoundButton.getVisibility() != i) {
                compoundButton.setVisibility(i);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        if (this.e != null) {
            this.e.setVisibility(8);
        }
        if (this.f735c == null) {
            return;
        }
        this.f735c.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f733a.g()) {
            if (this.f735c == null) {
                c();
            }
            compoundButton = this.f735c;
        } else {
            if (this.e == null) {
                d();
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z);
    }

    private void setSubMenuArrowVisible(boolean z) {
        if (this.g != null) {
            this.g.setVisibility(z ? 0 : 8);
        }
    }

    public void a(boolean z, char c2) {
        int i = (!z || !this.f733a.f()) ? 8 : 0;
        if (i == 0) {
            this.f.setText(this.f733a.e());
        }
        if (this.f.getVisibility() != i) {
            this.f.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f733a.i() || this.o;
        if (z || this.k) {
            if (this.f734b == null && drawable == null && !this.k) {
                return;
            }
            if (this.f734b == null) {
                b();
            }
            if (drawable != null || this.k) {
                ImageView imageView = this.f734b;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f734b.getVisibility() == 0) {
                    return;
                }
                this.f734b.setVisibility(0);
                return;
            }
            this.f734b.setVisibility(8);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f734b != null && this.k) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f734b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    private void b() {
        this.f734b = (ImageView) getInflater().inflate(a.g.abc_list_menu_item_icon, (ViewGroup) this, false);
        addView(this.f734b, 0);
    }

    private void c() {
        this.f735c = (RadioButton) getInflater().inflate(a.g.abc_list_menu_item_radio, (ViewGroup) this, false);
        addView(this.f735c);
    }

    private void d() {
        this.e = (CheckBox) getInflater().inflate(a.g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        addView(this.e);
    }

    private LayoutInflater getInflater() {
        if (this.n == null) {
            this.n = LayoutInflater.from(getContext());
        }
        return this.n;
    }
}
