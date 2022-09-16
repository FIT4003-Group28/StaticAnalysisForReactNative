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
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, su {
    public si a;
    public ImageView b;
    public boolean c;
    public boolean d;
    public boolean e;
    private ImageView f;
    private RadioButton g;
    private TextView h;
    private CheckBox i;
    private TextView j;
    private ImageView k;
    private LinearLayout l;
    private Drawable m;
    private int n;
    private Context o;
    private Drawable p;
    private LayoutInflater q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private final LayoutInflater b() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    private final void c(View view) {
        d(view, -1);
    }

    private final void d(View view, int i) {
        LinearLayout linearLayout = this.l;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    @Override // defpackage.su
    public final si a() {
        return this.a;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.b;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
        rect.top += this.b.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // defpackage.su
    public final boolean e() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.su
    public final void f(si siVar) {
        CompoundButton compoundButton;
        CheckBox checkBox;
        CheckBox checkBox2;
        ImageView imageView;
        String sb;
        this.a = siVar;
        int i = 0;
        setVisibility(true != siVar.isVisible() ? 8 : 0);
        CharSequence f = siVar.f(this);
        if (f != null) {
            this.h.setText(f);
            if (this.h.getVisibility() != 0) {
                this.h.setVisibility(0);
            }
        } else if (this.h.getVisibility() != 8) {
            this.h.setVisibility(8);
        }
        boolean isCheckable = siVar.isCheckable();
        if (isCheckable || this.g != null || this.i != null) {
            if (this.a.p()) {
                if (this.g == null) {
                    RadioButton radioButton = (RadioButton) b().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.g = radioButton;
                    c(radioButton);
                }
                compoundButton = this.g;
                CheckBox checkBox3 = this.i;
                checkBox = checkBox3;
                checkBox2 = checkBox3;
            } else {
                if (this.i == null) {
                    CheckBox checkBox4 = (CheckBox) b().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.i = checkBox4;
                    c(checkBox4);
                }
                compoundButton = this.i;
                checkBox = this.g;
                checkBox2 = compoundButton;
            }
            if (isCheckable) {
                compoundButton.setChecked(this.a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (checkBox != null && checkBox.getVisibility() != 8) {
                    checkBox.setVisibility(8);
                }
            } else {
                if (checkBox2 != null) {
                    checkBox2.setVisibility(8);
                }
                RadioButton radioButton2 = this.g;
                if (radioButton2 != null) {
                    radioButton2.setVisibility(8);
                }
            }
        }
        boolean t = siVar.t();
        siVar.e();
        int i2 = (!t || !this.a.t()) ? 8 : 0;
        if (i2 == 0) {
            TextView textView = this.j;
            si siVar2 = this.a;
            char e = siVar2.e();
            if (e == 0) {
                sb = "";
            } else {
                Resources resources = siVar2.j.a.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(siVar2.j.a).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i3 = siVar2.j.x() ? siVar2.i : siVar2.g;
                si.g(sb2, i3, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                si.g(sb2, i3, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                si.g(sb2, i3, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                si.g(sb2, i3, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                si.g(sb2, i3, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                si.g(sb2, i3, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (e == '\b') {
                    sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (e == '\n') {
                    sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (e == ' ') {
                    sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                } else {
                    sb2.append(e);
                }
                sb = sb2.toString();
            }
            textView.setText(sb);
        }
        if (this.j.getVisibility() != i2) {
            this.j.setVisibility(i2);
        }
        Drawable icon = siVar.getIcon();
        sf sfVar = this.a.j;
        boolean z = this.e;
        if ((z || this.c) && ((imageView = this.f) != null || icon != null || this.c)) {
            if (imageView == null) {
                ImageView imageView2 = (ImageView) b().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f = imageView2;
                d(imageView2, 0);
            }
            if (icon != null || this.c) {
                ImageView imageView3 = this.f;
                if (true != z) {
                    icon = null;
                }
                imageView3.setImageDrawable(icon);
                if (this.f.getVisibility() != 0) {
                    this.f.setVisibility(0);
                }
            } else {
                this.f.setVisibility(8);
            }
        }
        setEnabled(siVar.isEnabled());
        boolean hasSubMenu = siVar.hasSubMenu();
        ImageView imageView4 = this.k;
        if (imageView4 != null) {
            if (true != hasSubMenu) {
                i = 8;
            }
            imageView4.setVisibility(i);
        }
        setContentDescription(siVar.l);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        lj.O(this, this.m);
        TextView textView = (TextView) findViewById(R.id.title);
        this.h = textView;
        int i = this.n;
        if (i != -1) {
            textView.setTextAppearance(this.o, i);
        }
        this.j = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.p);
        }
        this.b = (ImageView) findViewById(R.id.group_divider);
        this.l = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.f != null && this.c) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        aad l = aad.l(getContext(), attributeSet, pm.q, i, 0);
        this.m = l.h(5);
        this.n = l.f(1, -1);
        this.c = l.p(7, false);
        this.o = context;
        this.p = l.h(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.d = obtainStyledAttributes.hasValue(0);
        l.o();
        obtainStyledAttributes.recycle();
    }
}
