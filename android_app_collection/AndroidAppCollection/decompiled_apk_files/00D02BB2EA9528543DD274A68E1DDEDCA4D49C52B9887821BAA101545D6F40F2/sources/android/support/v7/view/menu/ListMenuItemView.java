package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, vu {
    public vi a;
    private ImageView b;
    private RadioButton c;
    private TextView d;
    private CheckBox e;
    private TextView f;
    private ImageView g;
    private ImageView h;
    private LinearLayout i;
    private Drawable j;
    private int k;
    private Context l;
    private boolean m;
    private Drawable n;
    private boolean o;
    private LayoutInflater p;
    private boolean q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private final void c(View view) {
        d(view, -1);
    }

    private final void d(View view, int i) {
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    private final void e() {
        RadioButton radioButton = (RadioButton) h().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.c = radioButton;
        c(radioButton);
    }

    private final void g() {
        CheckBox checkBox = (CheckBox) h().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.e = checkBox;
        c(checkBox);
    }

    private final LayoutInflater h() {
        if (this.p == null) {
            this.p = LayoutInflater.from(getContext());
        }
        return this.p;
    }

    @Override // defpackage.vu
    public final vi a() {
        return this.a;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h.getLayoutParams();
        rect.top += this.h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // defpackage.vu
    public final boolean b() {
        return false;
    }

    @Override // defpackage.vu
    public final void f(vi viVar) {
        this.a = viVar;
        int i = 8;
        setVisibility(true != viVar.isVisible() ? 8 : 0);
        setTitle(viVar.j(this));
        setCheckable(viVar.isCheckable());
        setShortcut(viVar.h(), viVar.f());
        setIcon(viVar.getIcon());
        setEnabled(viVar.isEnabled());
        boolean hasSubMenu = viVar.hasSubMenu();
        ImageView imageView = this.g;
        if (imageView != null) {
            if (true == hasSubMenu) {
                i = 0;
            }
            imageView.setVisibility(i);
        }
        setContentDescription(viVar.l);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        od.U(this, this.j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.d = textView;
        int i = this.k;
        if (i != -1) {
            textView.setTextAppearance(this.l, i);
        }
        this.f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.n);
        }
        this.h = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.b != null && this.m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.c == null && this.e == null) {
            return;
        }
        if (this.a.l()) {
            if (this.c == null) {
                e();
            }
            compoundButton = this.c;
            compoundButton2 = this.e;
        } else {
            if (this.e == null) {
                g();
            }
            compoundButton = this.e;
            compoundButton2 = this.c;
        }
        if (z) {
            compoundButton.setChecked(this.a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.c;
        if (radioButton == null) {
            return;
        }
        radioButton.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.a.l()) {
            if (this.c == null) {
                e();
            }
            compoundButton = this.c;
        } else {
            if (this.e == null) {
                g();
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.q = z;
        this.m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            int i = 8;
            if (!this.o && z) {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        vf vfVar = this.a.j;
        boolean z = this.q;
        if (z || this.m) {
            ImageView imageView = this.b;
            if (imageView == null && drawable == null && !this.m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) h().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.b = imageView2;
                d(imageView2, 0);
            }
            if (drawable != null || this.m) {
                ImageView imageView3 = this.b;
                if (true != z) {
                    drawable = null;
                }
                imageView3.setImageDrawable(drawable);
                if (this.b.getVisibility() == 0) {
                    return;
                }
                this.b.setVisibility(0);
                return;
            }
            this.b.setVisibility(8);
        }
    }

    public void setShortcut(boolean z, char c) {
        String sb;
        int i = (!z || !this.a.h()) ? 8 : 0;
        if (i == 0) {
            TextView textView = this.f;
            vi viVar = this.a;
            char f = viVar.f();
            if (f == 0) {
                sb = "";
            } else {
                Resources resources = viVar.j.a.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(viVar.j.a).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = viVar.j.j() ? viVar.i : viVar.g;
                vi.g(sb2, i2, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, resources.getString(R.string.abc_menu_meta_shortcut_label));
                vi.g(sb2, i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                vi.g(sb2, i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                vi.g(sb2, i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                vi.g(sb2, i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                vi.g(sb2, i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (f == '\b') {
                    sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (f == '\n') {
                    sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (f == ' ') {
                    sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                } else {
                    sb2.append(f);
                }
                sb = sb2.toString();
            }
            textView.setText(sb);
        }
        if (this.f.getVisibility() != i) {
            this.f.setVisibility(i);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.d.setText(charSequence);
            if (this.d.getVisibility() == 0) {
                return;
            }
            this.d.setVisibility(0);
        } else if (this.d.getVisibility() == 8) {
        } else {
            this.d.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        aeq b = aeq.b(getContext(), attributeSet, sj.q, i, 0);
        this.j = b.d(5);
        this.k = b.o(1, -1);
        this.m = b.h(7, false);
        this.l = context;
        this.n = b.d(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.o = obtainStyledAttributes.hasValue(0);
        b.q();
        obtainStyledAttributes.recycle();
    }
}
