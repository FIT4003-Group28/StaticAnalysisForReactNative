package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.ListenerEditText;
import com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.MaxHeightScrollView;
import com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChannelChip;
import com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChipInfo;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxpn  reason: default package */
/* loaded from: classes5.dex */
public final class cxpn implements cxri, cxso, cxsf {
    private String B;
    private final int F;
    public final View a;
    public final Activity b;
    public final MaxHeightScrollView c;
    public final ChipGroup d;
    public final ListenerEditText e;
    public final TextView f;
    public final cxui g;
    public final PeopleKitDataLayer h;
    public final PeopleKitSelectionModel i;
    public final cxqo j;
    public final cxse k;
    public final PeopleKitVisualElementPath l;
    public cxpm o;
    public cxsf p;
    public final boolean r;
    public boolean s;
    private final TextView u;
    private View v;
    private Chip w;
    private final View x;
    private final ViewGroup y;
    private final PeopleKitConfig z;
    public boolean m = true;
    public boolean n = true;
    private int A = -1;
    public boolean q = false;
    private cxsq C = cxsq.b();
    private boolean D = false;
    private final int E = Integer.MAX_VALUE;
    public final List<cxqh> t = new ArrayList();

    public cxpn(Activity activity, PeopleKitDataLayer peopleKitDataLayer, PeopleKitSelectionModel peopleKitSelectionModel, cxqo cxqoVar, PeopleKitConfig peopleKitConfig, cxov cxovVar, PeopleKitVisualElementPath peopleKitVisualElementPath) {
        this.b = activity;
        this.h = peopleKitDataLayer;
        this.i = peopleKitSelectionModel;
        this.j = cxqoVar;
        this.z = peopleKitConfig;
        PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath2.a(new czhc(dhjm.n));
        peopleKitVisualElementPath2.c(peopleKitVisualElementPath);
        this.l = peopleKitVisualElementPath2;
        cxqoVar.d(-1, peopleKitVisualElementPath2);
        cxqoVar.a("TimeToAutocompleteSelection").b();
        if (peopleKitConfig.n()) {
            this.B = activity.getString(R.string.peoplekit_autocomplete_hint_text);
        } else {
            this.B = activity.getString(R.string.peoplekit_autocomplete_hint_text_no_phone_number);
        }
        peopleKitSelectionModel.i(this);
        LayoutInflater from = LayoutInflater.from(activity);
        View inflate = from.inflate(R.layout.peoplekit_chipgroup_bar, (ViewGroup) null);
        this.a = inflate;
        peopleKitDataLayer.c(this);
        A();
        this.c = (MaxHeightScrollView) inflate.findViewById(R.id.peoplekit_autocomplete_chipgroup_scrollview);
        ChipGroup chipGroup = (ChipGroup) inflate.findViewById(R.id.peoplekit_autocomplete_chip_group);
        this.d = chipGroup;
        chipGroup.setChipSpacingHorizontal(activity.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_autocomplete_chip_group_spacing));
        chipGroup.setChipSpacingVertical(0);
        this.r = cxsg.j.f().booleanValue();
        this.F = activity.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_autocomplete_chip_bar_height);
        ListenerEditText listenerEditText = (ListenerEditText) from.inflate(R.layout.peoplekit_edittext, (ViewGroup) inflate, false);
        this.e = listenerEditText;
        listenerEditText.setCursorVisible(false);
        cxse cxseVar = new cxse(activity, this, peopleKitConfig.l(), cxqoVar);
        this.k = cxseVar;
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.search_view_container);
        this.y = viewGroup;
        cxui cxuiVar = new cxui(activity, peopleKitDataLayer, peopleKitSelectionModel, cxqoVar, peopleKitConfig, cxovVar, peopleKitVisualElementPath2, cxseVar);
        this.g = cxuiVar;
        cxuiVar.c.q = new cxpd(this);
        viewGroup.addView(cxuiVar.b);
        viewGroup.setVisibility(8);
        this.x = inflate.findViewById(R.id.peoplekit_autocomplete_see_others_names);
        listenerEditText.setOnEditorActionListener(new cxpe(this));
        listenerEditText.addTextChangedListener(new cxpg(this, cxqoVar));
        listenerEditText.setOnKeyListener(new cxph(this, peopleKitSelectionModel));
        listenerEditText.setEditTextListener(new cxpi(this));
        listenerEditText.setOnFocusChangeListener(new cxpj(this, cxqoVar));
        chipGroup.addView(listenerEditText);
        inflate.findViewById(R.id.peoplekit_autocomplete_overflow);
        TextView textView = (TextView) inflate.findViewById(R.id.peoplekit_autocomplete_to_prefix);
        this.f = textView;
        this.u = (TextView) inflate.findViewById(R.id.peoplekit_autocomplete_see_others_names);
        chipGroup.setOnClickListener(new cxpk(this));
        textView.setOnClickListener(new cxpl(this));
        z();
        y();
        inflate.addOnLayoutChangeListener(new cxox(this));
    }

    private final void A() {
        if (this.i.b().isEmpty()) {
            this.a.setImportantForAccessibility(2);
            return;
        }
        String str = "";
        for (Channel channel : this.i.b()) {
            if (!TextUtils.isEmpty(channel.i(this.b))) {
                str = str.concat(channel.i(this.b)).concat(",");
            }
        }
        this.a.setImportantForAccessibility(0);
        this.a.setContentDescription(this.b.getString(R.string.peoplekit_autocomplete_recipient_list, new Object[]{str}));
    }

    private final void B() {
        View findViewById = this.a.findViewById(R.id.divider);
        if (this.x.getVisibility() == 0) {
            int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(findViewById.getVisibility() == 8 ? R.dimen.peoplekit_ui_autocomplete_chip_group_spacing : R.dimen.peoplekit_ui_autocomplete_recipients_spacing);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.x.getLayoutParams();
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, dimensionPixelSize);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(int i) {
        if (this.y.getVisibility() != i) {
            this.y.setVisibility(i);
            String string = this.b.getString(i == 0 ? R.string.peoplekit_autocomplete_dropdown_opened : R.string.peoplekit_autocomplete_dropdown_closed);
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.b.getSystemService("accessibility");
            if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                return;
            }
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(32);
            obtain.getText().add(string);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    private final View D() {
        if (this.v == null) {
            View inflate = LayoutInflater.from(this.b).inflate(R.layout.peoplekit_autocomplete_plus_n_button, (ViewGroup) this.a, false);
            this.v = inflate;
            inflate.setEnabled(true);
            E().setChipBackgroundColorResource(this.C.a);
            E().setChipStrokeColorResource(this.C.l);
            E().setTextColor(akm.c(this.b, this.C.e));
        }
        return this.v;
    }

    private final Chip E() {
        if (this.w == null) {
            this.w = (Chip) D().findViewById(R.id.peoplekit_autocomplete_plus_n_chip);
        }
        return this.w;
    }

    public static boolean m(CharSequence charSequence, char c, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (charSequence.charAt(i + i3) == c) {
                return true;
            }
        }
        return false;
    }

    private final void y() {
        this.a.setBackgroundColor(akm.c(this.b, this.C.a));
        this.f.setTextColor(akm.c(this.b, this.C.f));
        this.u.setTextColor(akm.c(this.b, this.C.f));
        this.e.setTextColor(akm.c(this.b, this.C.e));
        this.e.setHintTextColor(akm.c(this.b, this.C.j));
        for (cxqh cxqhVar : this.t) {
            cxqhVar.a(this.C);
        }
        this.a.findViewById(R.id.divider).setBackgroundColor(akm.c(this.b, this.C.l));
        Drawable drawable = ((AppCompatImageView) this.a.findViewById(R.id.peoplekit_autocomplete_overflow)).getDrawable();
        ks.b(drawable);
        drawable.mutate().setTint(akm.c(this.b, this.C.p));
    }

    private final void z() {
        if (this.t.isEmpty()) {
            this.e.setHint(this.B);
            e();
        }
    }

    @Override // defpackage.cxsf
    public final void a(String[] strArr) {
        cxsf cxsfVar = this.p;
        if (cxsfVar != null) {
            cxsfVar.a(strArr);
        } else {
            this.b.requestPermissions(strArr, 1234);
        }
    }

    @Override // defpackage.cxsf
    public final boolean b() {
        cxsf cxsfVar = this.p;
        if (cxsfVar != null) {
            return cxsfVar.b();
        }
        return this.b.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS");
    }

    public final void c() {
        int size;
        if (!this.r && !this.e.hasFocus()) {
            int size2 = this.t.size();
            while (true) {
                size2--;
                if (size2 <= 1) {
                    break;
                }
                this.d.removeView(this.t.get(size2).a);
            }
            if (this.t.size() > 2) {
                if (this.r) {
                    size = this.t.size() - Integer.MAX_VALUE;
                } else {
                    size = this.t.size() - 2;
                }
                if (!TextUtils.isEmpty(this.e.mo48getText())) {
                    size++;
                }
                E().setText(this.b.getString(R.string.peoplekit_autocomplete_plus_n_text, new Object[]{Integer.valueOf(size)}));
                if (D().getParent() == null) {
                    this.d.addView(D());
                }
                this.e.setVisibility(8);
            } else if (this.t.isEmpty() || !TextUtils.isEmpty(this.e.mo48getText())) {
            } else {
                d();
            }
        }
    }

    public final void d() {
        this.e.setVisibility(8);
    }

    public final void e() {
        this.e.setVisibility(0);
    }

    public final void f() {
        if (!cxsg.i.f().booleanValue()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        if (this.t.isEmpty()) {
            layoutParams.width = -1;
            this.e.setLayoutParams(layoutParams);
        } else if (this.d.getVisibility() != 8 && this.d.getWidth() != 0) {
            int paddingLeft = this.d.getPaddingLeft();
            int width = this.d.getWidth() - this.d.getPaddingRight();
            int i = 0;
            for (int i2 = 0; i2 < this.t.size(); i2++) {
                ChannelChip channelChip = this.t.get(i2).b;
                float measureText = channelChip.getPaint().measureText(channelChip.getText().toString());
                int width2 = this.d.getWidth();
                int paddingLeft2 = this.d.getPaddingLeft();
                int min = Math.min(((int) measureText) + 1 + channelChip.getPaddingLeft() + channelChip.getPaddingRight(), (width2 - paddingLeft2) - this.d.getPaddingRight());
                if (paddingLeft + min > width) {
                    paddingLeft = this.d.getPaddingLeft();
                }
                paddingLeft += min + this.d.a;
            }
            if (!TextUtils.isEmpty(this.e.mo48getText())) {
                i = Math.max(((int) this.e.getPaint().measureText(this.e.mo48getText().toString())) + 1 + this.e.getPaddingLeft() + this.e.getPaddingRight(), this.F);
            }
            int max = Math.max(i, this.F);
            int width3 = (this.d.getWidth() - paddingLeft) - this.d.getPaddingRight();
            if (width3 < max) {
                if (layoutParams.width == -1) {
                    return;
                }
                layoutParams.width = -1;
                this.e.setLayoutParams(layoutParams);
                return;
            }
            if (layoutParams.width != -2) {
                layoutParams.width = -2;
                this.e.setLayoutParams(layoutParams);
            }
            if (this.e.getMinWidth() == width3) {
                return;
            }
            this.e.setMinWidth(width3);
        }
    }

    public final boolean g() {
        Channel o;
        if (cxsg.e.f().booleanValue() && this.z.p()) {
            String str = "";
            boolean z = false;
            for (String str2 : dbtm.d(",|:|;").e().f().g(this.e.mo48getText().toString())) {
                PeopleKitDataLayer peopleKitDataLayer = this.h;
                Activity activity = this.b;
                int indexOf = str2.indexOf(60);
                int indexOf2 = str2.indexOf(62, indexOf);
                if (indexOf == -1 || indexOf2 != str2.length() - 1) {
                    o = peopleKitDataLayer.o(str2, activity);
                } else {
                    o = peopleKitDataLayer.p(str2.substring(0, indexOf).trim(), str2.substring(indexOf + 1, indexOf2).trim(), activity);
                }
                if ((this.z.q() || !cxrc.i(o, this.z.a(), this.z.e())) && o.d() != 0) {
                    this.g.c(o);
                    List<Channel> asList = Arrays.asList(o);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Channel channel : asList) {
                        if (TextUtils.isEmpty(channel.n())) {
                            arrayList.add(channel);
                        }
                        TextUtils.isEmpty(channel.f());
                    }
                    if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                        this.h.t(arrayList, arrayList2, new cxpc(this));
                    }
                    z = true;
                } else {
                    if (!TextUtils.isEmpty(str)) {
                        String valueOf = String.valueOf(str);
                        StringBuilder sb = new StringBuilder();
                        sb.append(',');
                        sb.append(' ');
                        String valueOf2 = String.valueOf(sb.toString());
                        str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                    }
                    String valueOf3 = String.valueOf(str);
                    String valueOf4 = String.valueOf(str2);
                    str = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                }
            }
            if (z) {
                this.n = false;
                this.e.setText(str);
                ListenerEditText listenerEditText = this.e;
                listenerEditText.setSelection(listenerEditText.mo48getText().length());
                return true;
            }
        }
        return false;
    }

    public final void h(Channel channel, CoalescedChannels coalescedChannels) {
        cxqh cxqhVar = new cxqh(this.b, this.h, this.z, this.j, this.l, this.i);
        cxqhVar.k = this.q;
        if (this.s) {
            cxqhVar.l = true;
        }
        cxqhVar.a(this.C);
        cxqhVar.b.setSelectedChannel(channel);
        cxqhVar.b.setContactMethods(coalescedChannels);
        cxqhVar.b.setCheckable(false);
        cxqhVar.b.setEllipsize(TextUtils.TruncateAt.END);
        cxqhVar.b.setChipBackgroundColorResource(cxqhVar.i.a);
        cxqhVar.b.setChipStrokeColorResource(cxqhVar.i.l);
        cxqhVar.b.setTextColor(akm.c(cxqhVar.c, cxqhVar.i.e));
        if (TextUtils.isEmpty(cxqhVar.m)) {
            cxqhVar.m = channel.i(cxqhVar.c);
        }
        if (!TextUtils.isEmpty(cxqhVar.m) || !TextUtils.isEmpty(channel.b(cxqhVar.c))) {
            ChannelChip channelChip = cxqhVar.b;
            String str = cxqhVar.m;
            String b = channel.b(cxqhVar.c);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(b).length());
            sb.append(str);
            sb.append(", ");
            sb.append(b);
            channelChip.setContentDescription(sb.toString());
        }
        cxqhVar.b(channel);
        Drawable b2 = sl.b(cxqhVar.c, R.drawable.quantum_gm_ic_expand_less_vd_theme_24);
        Drawable b3 = sl.b(cxqhVar.c, R.drawable.quantum_gm_ic_expand_more_vd_theme_24);
        cxqhVar.c(cxqhVar.b, b3);
        cxqhVar.b.setCloseIconSize(cxqhVar.c.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_chip_chevron_size));
        cxqhVar.b.setCloseIconEndPadding(cxqhVar.c.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_chip_end_spacing));
        cxqhVar.b.setCloseIconContentDescription(cxqhVar.c.getString(R.string.peoplekit_expand_button_content_description, new Object[]{cxqhVar.m}));
        cxqhVar.b.setOnClickListener(new cxpy(cxqhVar, b2, channel, b3));
        cxqhVar.b.setOnCloseIconClickListener(new cxpz(cxqhVar));
        cxqo cxqoVar = cxqhVar.g;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.l));
        peopleKitVisualElementPath.c(cxqhVar.f);
        cxqoVar.d(-1, peopleKitVisualElementPath);
        cxqhVar.b.setEnabled(true);
        cxqhVar.o = new cxoy(this);
        View view = cxqhVar.a;
        int i = this.A;
        if (i != -1) {
            this.t.add(i, cxqhVar);
            if (this.r) {
                this.d.addView(view, this.A);
                c();
            } else {
                this.d.addView(view, this.A);
            }
            this.A = -1;
        } else {
            this.t.add(cxqhVar);
            if (this.r) {
                this.d.addView(view, this.t.size() - 1);
                if (this.e.hasFocus()) {
                    this.d.post(new cxoz(this));
                }
                c();
            } else {
                this.d.addView(view, this.t.size() - 1);
                this.d.post(new cxpa(this));
            }
        }
        if (this.t.size() == 1) {
            this.e.setHint((CharSequence) null);
        }
    }

    public final void i() {
        for (cxqh cxqhVar : this.t) {
            PopupWindow popupWindow = cxqhVar.j;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        }
    }

    public final void j() {
        if (this.z.k()) {
            int i = 8;
            if (!this.t.isEmpty()) {
                int i2 = 0;
                boolean z = false;
                while (true) {
                    boolean z2 = true;
                    if (i2 >= this.t.size()) {
                        break;
                    }
                    Channel a = this.t.get(i2).b.a();
                    if (!a.j() || a.k()) {
                        z2 = false;
                    }
                    z |= z2;
                    i2++;
                }
                View view = this.x;
                if (true == z) {
                    i = 0;
                }
                view.setVisibility(i);
                B();
                return;
            }
            this.x.setVisibility(8);
        }
    }

    public final ArrayList<ChipInfo> k() {
        ArrayList<ChipInfo> arrayList = new ArrayList<>();
        for (int i = 0; i < this.t.size(); i++) {
            arrayList.add(this.t.get(i).b.a);
        }
        return arrayList;
    }

    public final void l(boolean z) {
        if (!z) {
            this.m = false;
        }
        this.e.setVisibility(0);
        this.e.requestFocus();
        ListenerEditText listenerEditText = this.e;
        InputMethodManager inputMethodManager = (InputMethodManager) this.b.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(listenerEditText, 1);
        }
    }

    public final void n(boolean z) {
        View findViewById = this.a.findViewById(R.id.divider);
        int i = 0;
        if (findViewById.getVisibility() == (true != z ? 0 : 8)) {
            if (true != z) {
                i = 8;
            }
            findViewById.setVisibility(i);
            B();
        }
    }

    public final void o(String str) {
        this.B = null;
        this.e.setHint((CharSequence) null);
    }

    public final void p(cxsq cxsqVar) {
        if (!this.C.equals(cxsqVar)) {
            this.C = cxsqVar;
            cxvi cxviVar = this.g.c;
            if (!cxviVar.p.equals(cxsqVar)) {
                cxviVar.p = cxsqVar;
                cxviVar.s();
            }
            y();
        }
    }

    public final void q(boolean z) {
        this.D = false;
    }

    public final void r() {
        for (int i = 0; i < this.t.size(); i++) {
            ChannelChip channelChip = this.t.get(i).b;
            Channel a = channelChip.a();
            if (a.k()) {
                channelChip.setText(a.b(this.b));
            }
        }
        j();
    }

    @Override // defpackage.cxri
    public final void s(List<CoalescedChannels> list, cxrb cxrbVar) {
    }

    @Override // defpackage.cxri
    public final void t(List<Channel> list, cxrb cxrbVar) {
        if (TextUtils.isEmpty(this.e.mo48getText()) || !this.e.hasFocus()) {
            return;
        }
        n(true);
        C(0);
    }

    @Override // defpackage.cxri
    public final void u(List<CoalescedChannels> list, cxrb cxrbVar) {
    }

    @Override // defpackage.cxso
    public final void v(Channel channel, CoalescedChannels coalescedChannels) {
        h(channel, coalescedChannels);
        C(8);
        this.n = false;
        this.e.setText("");
        f();
        j();
        A();
        Stopwatch a = this.j.a("TimeToAutocompleteSelection");
        if (a.c && (channel.a() == 1 || channel.a() == 3)) {
            cxqo cxqoVar = this.j;
            eazd bZ = eaze.g.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaze eazeVar = (eaze) bZ.b;
            eazeVar.b = 4;
            eazeVar.a |= 1;
            eazh bZ2 = eazi.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eazi eaziVar = (eazi) bZ2.b;
            eaziVar.b = 16;
            eaziVar.a |= 1;
            long a2 = a.a();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eazi eaziVar2 = (eazi) bZ2.b;
            eaziVar2.a |= 2;
            eaziVar2.c = a2;
            int i = this.j.i();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eazi eaziVar3 = (eazi) bZ2.b;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            eaziVar3.d = i2;
            eaziVar3.a = 4 | eaziVar3.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaze eazeVar2 = (eaze) bZ.b;
            eazi bK = bZ2.bK();
            bK.getClass();
            eazeVar2.e = bK;
            eazeVar2.a = 8 | eazeVar2.a;
            eazk bZ3 = eazl.e.bZ();
            int g = this.j.g();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            eazl eazlVar = (eazl) bZ3.b;
            int i3 = g - 1;
            if (g == 0) {
                throw null;
            }
            eazlVar.b = i3;
            eazlVar.a = 1 | eazlVar.a;
            eazl eazlVar2 = (eazl) bZ3.b;
            eazlVar2.c = 2;
            eazlVar2.a |= 2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaze eazeVar3 = (eaze) bZ.b;
            eazl bK2 = bZ3.bK();
            bK2.getClass();
            eazeVar3.c = bK2;
            eazeVar3.a |= 2;
            cxqoVar.b(bZ.bK());
        }
        a.b();
    }

    @Override // defpackage.cxso
    public final void w(Channel channel) {
        int i = 0;
        while (true) {
            if (i >= this.t.size()) {
                break;
            }
            cxqh cxqhVar = this.t.get(i);
            ChannelChip channelChip = cxqhVar.b;
            if (channelChip == null || !channelChip.a().equals(channel)) {
                i++;
            } else {
                if (cxqhVar.n) {
                    this.A = i;
                }
                this.d.removeView(cxqhVar.a);
                this.t.remove(cxqhVar);
                cxqo cxqoVar = this.j;
                PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath.a(new czhc(dhjm.m));
                peopleKitVisualElementPath.c(this.l);
                cxqoVar.d(1, peopleKitVisualElementPath);
            }
        }
        z();
        f();
        j();
        A();
        if (this.y.getVisibility() == 0) {
            this.g.d(this.e.mo48getText().toString(), this.e);
        }
    }
}
