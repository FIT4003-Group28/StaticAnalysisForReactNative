package defpackage;

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
import com.google.android.apps.maps.R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: PG */
/* renamed from: czxy  reason: default package */
/* loaded from: classes5.dex */
public final class czxy<S> extends ex {
    public DateSelector<S> af;
    public CheckableImageButton ag;
    public Button ah;
    private int ak;
    private czyi<S> al;
    private CalendarConstraints am;
    private czxs<S> an;
    private int ao;
    private CharSequence ap;
    private boolean aq;
    private int ar;
    private TextView as;
    private dadr at;
    public final LinkedHashSet<czxz<? super S>> ad = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> ae = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnCancelListener> ai = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnDismissListener> aj = new LinkedHashSet<>();

    public static boolean aM(Context context) {
        return aN(context, 16843277);
    }

    public static boolean aN(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(dacz.b(context, R.attr.materialCalendarStyle, czxs.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    private static int aO(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        int i = Month.c().d;
        return dimensionPixelOffset + dimensionPixelOffset + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding));
    }

    private final int aP() {
        int i = this.ak;
        return i != 0 ? i : this.af.e();
    }

    public final void aJ() {
        String f = this.af.f();
        this.as.setContentDescription(String.format(Rp(R.string.mtrl_picker_announce_current_selection), f));
        this.as.setText(f);
    }

    public final void aK() {
        czyi<S> czyiVar;
        I();
        int aP = aP();
        DateSelector<S> dateSelector = this.af;
        CalendarConstraints calendarConstraints = this.am;
        czxs<S> czxsVar = new czxs<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", aP);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.d);
        czxsVar.B(bundle);
        this.an = czxsVar;
        if (this.ag.a) {
            DateSelector<S> dateSelector2 = this.af;
            CalendarConstraints calendarConstraints2 = this.am;
            czyiVar = new czyb<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", aP);
            bundle2.putParcelable("DATE_SELECTOR_KEY", dateSelector2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            czyiVar.B(bundle2);
        } else {
            czyiVar = this.an;
        }
        this.al = czyiVar;
        aJ();
        gz b = R().b();
        b.E(R.id.mtrl_calendar_frame, this.al);
        b.g();
        this.al.h(new czxw(this));
    }

    public final void aL(CheckableImageButton checkableImageButton) {
        String string;
        if (this.ag.a) {
            string = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.ag.setContentDescription(string);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(true != this.aq ? R.layout.mtrl_picker_dialog : R.layout.mtrl_picker_fullscreen, viewGroup);
        Context context = inflate.getContext();
        if (this.aq) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(aO(context), -2));
        } else {
            View findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(R.id.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(aO(context), -1));
            Resources resources = I().getResources();
            findViewById2.setMinimumHeight(resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height) + (czyd.a * resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height)) + ((czyd.a - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.as = textView;
        od.v(textView, 1);
        this.ag = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.ap;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.ao);
        }
        this.ag.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.ag;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, sl.b(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], sl.b(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.ag.setChecked(this.ar != 0);
        od.c(this.ag, null);
        aL(this.ag);
        this.ag.setOnClickListener(new czxx(this));
        this.ah = (Button) inflate.findViewById(R.id.confirm_button);
        if (this.af.b()) {
            this.ah.setEnabled(true);
        } else {
            this.ah.setEnabled(false);
        }
        this.ah.setTag("CONFIRM_BUTTON_TAG");
        this.ah.setOnClickListener(new czxu(this));
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new czxv(this));
        return inflate;
    }

    @Override // defpackage.ex, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        this.ak = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.af = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.am = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.ao = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.ap = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.ar = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // defpackage.ex, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.ai.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // defpackage.ex, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.aj.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.P;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // defpackage.ex
    public final Dialog q(Bundle bundle) {
        Context I = I();
        I();
        Dialog dialog = new Dialog(I, aP());
        Context context = dialog.getContext();
        this.aq = aM(context);
        int b = dacz.b(context, R.attr.colorSurface, czxy.class.getCanonicalName());
        dadr dadrVar = new dadr(context, null, R.attr.materialCalendarStyle, 2132018749);
        this.at = dadrVar;
        dadrVar.W(context);
        this.at.Q(ColorStateList.valueOf(b));
        this.at.aa(od.G(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // defpackage.ex, defpackage.fd
    public final void s() {
        super.s();
        Window window = h().getWindow();
        if (this.aq) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.at);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = Rn().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.at, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new czyr(h(), rect));
        }
        aK();
    }

    @Override // defpackage.ex, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.ak);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.af);
        czxd czxdVar = new czxd(this.am);
        Month month = this.an.c;
        if (month != null) {
            czxdVar.e = Long.valueOf(month.f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", czxdVar.f);
        Month a = Month.a(czxdVar.c);
        Month a2 = Month.a(czxdVar.d);
        CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = czxdVar.e;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(a, a2, dateValidator, l == null ? null : Month.a(l.longValue())));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.ao);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.ap);
    }

    @Override // defpackage.ex, defpackage.fd
    public final void u() {
        this.al.ae.clear();
        super.u();
    }
}
