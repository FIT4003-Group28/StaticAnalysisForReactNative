package com.google.android.material.datepicker;

import a.g.m.v;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.s;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public final class MaterialDatePicker<S> extends DialogFragment {
    static final Object A0 = "CONFIRM_BUTTON_TAG";
    static final Object B0 = "CANCEL_BUTTON_TAG";
    static final Object C0 = "TOGGLE_BUTTON_TAG";
    private final LinkedHashSet<h<? super S>> k0 = new LinkedHashSet<>();
    private final LinkedHashSet<View.OnClickListener> l0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnCancelListener> m0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnDismissListener> n0 = new LinkedHashSet<>();
    private int o0;
    private com.google.android.material.datepicker.d<S> p0;
    private m<S> q0;
    private com.google.android.material.datepicker.a r0;
    private MaterialCalendar<S> s0;
    private int t0;
    private CharSequence u0;
    private boolean v0;
    private TextView w0;
    private CheckableImageButton x0;
    private c.e.a.c.a0.g y0;
    private Button z0;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.k0.iterator();
            while (it.hasNext()) {
                ((h) it.next()).a(MaterialDatePicker.this.s0());
            }
            MaterialDatePicker.this.m0();
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.l0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialDatePicker.this.m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements l<S> {
        c() {
        }

        @Override // com.google.android.material.datepicker.l
        public void a(S s) {
            Button button;
            boolean z;
            MaterialDatePicker.this.v0();
            if (MaterialDatePicker.this.p0.g()) {
                button = MaterialDatePicker.this.z0;
                z = true;
            } else {
                button = MaterialDatePicker.this.z0;
                z = false;
            }
            button.setEnabled(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialDatePicker.this.x0.toggle();
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            materialDatePicker.a(materialDatePicker.x0);
            MaterialDatePicker.this.t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CheckableImageButton checkableImageButton) {
        this.x0.setContentDescription(checkableImageButton.getContext().getString(this.x0.isChecked() ? c.e.a.c.i.mtrl_picker_toggle_to_calendar_input_mode : c.e.a.c.i.mtrl_picker_toggle_to_text_input_mode));
    }

    private static Drawable b(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, a.a.k.a.a.c(context, c.e.a.c.e.ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], a.a.k.a.a.c(context, c.e.a.c.e.ic_edit_black_24dp));
        return stateListDrawable;
    }

    private static int c(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(c.e.a.c.d.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(c.e.a.c.d.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(c.e.a.c.d.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(c.e.a.c.d.mtrl_calendar_days_of_week_height);
        return dimensionPixelSize + dimensionPixelSize2 + (j.f8051f * resources.getDimensionPixelSize(c.e.a.c.d.mtrl_calendar_day_height)) + ((j.f8051f - 1) * resources.getDimensionPixelOffset(c.e.a.c.d.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(c.e.a.c.d.mtrl_calendar_bottom_padding);
    }

    private static int d(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(c.e.a.c.d.mtrl_calendar_content_padding);
        int i = i.p().f8048f;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(c.e.a.c.d.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(c.e.a.c.d.mtrl_calendar_month_horizontal_padding));
    }

    private int e(Context context) {
        int i = this.o0;
        return i != 0 ? i : this.p0.b(context);
    }

    private void f(Context context) {
        this.x0.setTag(C0);
        this.x0.setImageDrawable(b(context));
        v.a(this.x0, (a.g.m.a) null);
        a(this.x0);
        this.x0.setOnClickListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(c.e.a.c.x.b.a(context, c.e.a.c.b.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        this.s0 = MaterialCalendar.a(this.p0, e(j0()), this.r0);
        this.q0 = this.x0.isChecked() ? MaterialTextInputPicker.a(this.p0, this.r0) : this.s0;
        v0();
        s b2 = m().b();
        b2.b(c.e.a.c.f.mtrl_calendar_frame, this.q0);
        b2.c();
        this.q0.a(new c());
    }

    public static long u0() {
        return i.p().f8050h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        String r0 = r0();
        this.w0.setContentDescription(String.format(a(c.e.a.c.i.mtrl_picker_announce_current_selection), r0));
        this.w0.setText(r0);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void W() {
        super.W();
        Window window = q0().getWindow();
        if (this.v0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.y0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = y().getDimensionPixelOffset(c.e.a.c.d.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.y0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new c.e.a.c.r.a(q0(), rect));
        }
        t0();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void X() {
        this.q0.m0();
        super.X();
    }

    @Override // androidx.fragment.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.v0 ? c.e.a.c.h.mtrl_picker_fullscreen : c.e.a.c.h.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.v0) {
            inflate.findViewById(c.e.a.c.f.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(d(context), -2));
        } else {
            View findViewById = inflate.findViewById(c.e.a.c.f.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(c.e.a.c.f.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(d(context), -1));
            findViewById2.setMinimumHeight(c(j0()));
        }
        this.w0 = (TextView) inflate.findViewById(c.e.a.c.f.mtrl_picker_header_selection_text);
        v.g(this.w0, 1);
        this.x0 = (CheckableImageButton) inflate.findViewById(c.e.a.c.f.mtrl_picker_header_toggle);
        TextView textView = (TextView) inflate.findViewById(c.e.a.c.f.mtrl_picker_title_text);
        CharSequence charSequence = this.u0;
        if (charSequence != null) {
            textView.setText(charSequence);
        } else {
            textView.setText(this.t0);
        }
        f(context);
        this.z0 = (Button) inflate.findViewById(c.e.a.c.f.confirm_button);
        if (this.p0.g()) {
            this.z0.setEnabled(true);
        } else {
            this.z0.setEnabled(false);
        }
        this.z0.setTag(A0);
        this.z0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(c.e.a.c.f.cancel_button);
        button.setTag(B0);
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void c(Bundle bundle) {
        super.c(bundle);
        if (bundle == null) {
            bundle = l();
        }
        this.o0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.p0 = (com.google.android.material.datepicker.d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.r0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.t0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.u0 = bundle.getCharSequence("TITLE_TEXT_KEY");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.o0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.p0);
        a.b bVar = new a.b(this.r0);
        if (this.s0.p0() != null) {
            bVar.a(this.s0.p0().f8050h);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.t0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.u0);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog n(Bundle bundle) {
        Dialog dialog = new Dialog(j0(), e(j0()));
        Context context = dialog.getContext();
        this.v0 = g(context);
        int a2 = c.e.a.c.x.b.a(context, c.e.a.c.b.colorSurface, MaterialDatePicker.class.getCanonicalName());
        this.y0 = new c.e.a.c.a0.g(context, null, c.e.a.c.b.materialCalendarStyle, c.e.a.c.j.Widget_MaterialComponents_MaterialCalendar);
        this.y0.a(context);
        this.y0.a(ColorStateList.valueOf(a2));
        this.y0.a(v.l(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.m0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.n0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) F();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public String r0() {
        return this.p0.a(n());
    }

    public final S s0() {
        return this.p0.i();
    }
}
