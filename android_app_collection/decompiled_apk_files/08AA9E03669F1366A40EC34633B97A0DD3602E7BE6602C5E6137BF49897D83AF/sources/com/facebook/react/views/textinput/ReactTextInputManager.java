package com.facebook.react.views.textinput;

import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.facebook.react.bridge.aj;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.af;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Map;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.crypto.tls.CipherSuite;
/* loaded from: classes.dex */
public class ReactTextInputManager extends BaseViewManager<com.facebook.react.views.textinput.c, com.facebook.react.uimanager.g> {
    private static final int BLUR_TEXT_INPUT = 2;
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    protected static final String REACT_CLASS = "AndroidTextInput";
    private static final int UNSET = -1;
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public com.facebook.react.views.textinput.c mo170createViewInstance(af afVar) {
        com.facebook.react.views.textinput.c cVar = new com.facebook.react.views.textinput.c(afVar);
        cVar.setInputType(cVar.getInputType() & (-131073));
        cVar.setReturnKeyType("done");
        cVar.setTextSize(0, (int) Math.ceil(com.facebook.react.uimanager.o.b(14.0f)));
        return cVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public com.facebook.react.uimanager.g mo168createShadowNodeInstance() {
        return new m();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends com.facebook.react.uimanager.g> getShadowNodeClass() {
        return m.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return com.facebook.react.b.f.c().a("topSubmitEditing", com.facebook.react.b.f.a("phasedRegistrationNames", com.facebook.react.b.f.a("bubbled", "onSubmitEditing", "captured", "onSubmitEditingCapture"))).a("topEndEditing", com.facebook.react.b.f.a("phasedRegistrationNames", com.facebook.react.b.f.a("bubbled", "onEndEditing", "captured", "onEndEditingCapture"))).a("topTextInput", com.facebook.react.b.f.a("phasedRegistrationNames", com.facebook.react.b.f.a("bubbled", "onTextInput", "captured", "onTextInputCapture"))).a("topFocus", com.facebook.react.b.f.a("phasedRegistrationNames", com.facebook.react.b.f.a("bubbled", "onFocus", "captured", "onFocusCapture"))).a("topBlur", com.facebook.react.b.f.a("phasedRegistrationNames", com.facebook.react.b.f.a("bubbled", "onBlur", "captured", "onBlurCapture"))).a("topKeyPress", com.facebook.react.b.f.a("phasedRegistrationNames", com.facebook.react.b.f.a("bubbled", "onKeyPress", "captured", "onKeyPressCapture"))).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return com.facebook.react.b.f.c().a(com.facebook.react.views.scroll.i.SCROLL.a(), com.facebook.react.b.f.a("registrationName", "onScroll")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return com.facebook.react.b.f.a("focusTextInput", 1, "blurTextInput", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.textinput.c cVar, int i, am amVar) {
        switch (i) {
            case 1:
                cVar.b();
                return;
            case 2:
                cVar.c();
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(com.facebook.react.views.textinput.c cVar, Object obj) {
        if (obj instanceof com.facebook.react.views.text.j) {
            com.facebook.react.views.text.j jVar = (com.facebook.react.views.text.j) obj;
            cVar.setPadding((int) jVar.d(), (int) jVar.e(), (int) jVar.f(), (int) jVar.g());
            if (jVar.c()) {
                com.facebook.react.views.text.n.a(jVar.a(), cVar);
            }
            cVar.a(jVar);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "fontSize", d = 14.0f)
    public void setFontSize(com.facebook.react.views.textinput.c cVar, float f) {
        cVar.setTextSize(0, (int) Math.ceil(com.facebook.react.uimanager.o.b(f)));
    }

    @com.facebook.react.uimanager.a.a(a = "fontFamily")
    public void setFontFamily(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setTypeface(com.facebook.react.views.text.e.a().a(str, cVar.getTypeface() != null ? cVar.getTypeface().getStyle() : 0, cVar.getContext().getAssets()));
    }

    @com.facebook.react.uimanager.a.a(a = "fontWeight")
    public void setFontWeight(com.facebook.react.views.textinput.c cVar, String str) {
        int i = -1;
        int parseNumericFontWeight = str != null ? parseNumericFontWeight(str) : -1;
        if (parseNumericFontWeight >= 500 || "bold".equals(str)) {
            i = 1;
        } else if ("normal".equals(str) || (parseNumericFontWeight != -1 && parseNumericFontWeight < 500)) {
            i = 0;
        }
        Typeface typeface = cVar.getTypeface();
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        if (i != typeface.getStyle()) {
            cVar.setTypeface(typeface, i);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "fontStyle")
    public void setFontStyle(com.facebook.react.views.textinput.c cVar, String str) {
        int i;
        if ("italic".equals(str)) {
            i = 2;
        } else {
            i = "normal".equals(str) ? 0 : -1;
        }
        Typeface typeface = cVar.getTypeface();
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        if (i != typeface.getStyle()) {
            cVar.setTypeface(typeface, i);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "selection")
    public void setSelection(com.facebook.react.views.textinput.c cVar, an anVar) {
        if (anVar != null && anVar.hasKey("start") && anVar.hasKey("end")) {
            cVar.setSelection(anVar.getInt("start"), anVar.getInt("end"));
        }
    }

    @com.facebook.react.uimanager.a.a(a = "onSelectionChange", f = false)
    public void setOnSelectionChange(com.facebook.react.views.textinput.c cVar, boolean z) {
        if (z) {
            cVar.setSelectionWatcher(new c(cVar));
        } else {
            cVar.setSelectionWatcher(null);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "blurOnSubmit")
    public void setBlurOnSubmit(com.facebook.react.views.textinput.c cVar, Boolean bool) {
        cVar.setBlurOnSubmit(bool);
    }

    @com.facebook.react.uimanager.a.a(a = "onContentSizeChange", f = false)
    public void setOnContentSizeChange(com.facebook.react.views.textinput.c cVar, boolean z) {
        if (z) {
            cVar.setContentSizeWatcher(new a(cVar));
        } else {
            cVar.setContentSizeWatcher(null);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "onScroll", f = false)
    public void setOnScroll(com.facebook.react.views.textinput.c cVar, boolean z) {
        if (z) {
            cVar.setScrollWatcher(new b(cVar));
        } else {
            cVar.setScrollWatcher(null);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "placeholder")
    public void setPlaceholder(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setHint(str);
    }

    @com.facebook.react.uimanager.a.a(a = "placeholderTextColor", b = "Color")
    public void setPlaceholderTextColor(com.facebook.react.views.textinput.c cVar, Integer num) {
        if (num == null) {
            cVar.setHintTextColor(com.facebook.react.views.text.c.a(cVar.getContext()));
        } else {
            cVar.setHintTextColor(num.intValue());
        }
    }

    @com.facebook.react.uimanager.a.a(a = "selectionColor", b = "Color")
    public void setSelectionColor(com.facebook.react.views.textinput.c cVar, Integer num) {
        if (num == null) {
            cVar.setHighlightColor(com.facebook.react.views.text.c.c(cVar.getContext()));
        } else {
            cVar.setHighlightColor(num.intValue());
        }
        setCursorColor(cVar, num);
    }

    private void setCursorColor(com.facebook.react.views.textinput.c cVar, Integer num) {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i = declaredField.getInt(cVar);
            if (i == 0) {
                return;
            }
            Drawable a2 = android.support.v4.a.a.a(cVar.getContext(), i);
            if (num != null) {
                a2.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            }
            Drawable[] drawableArr = {a2, a2};
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(cVar);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, drawableArr);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    @com.facebook.react.uimanager.a.a(a = "caretHidden", f = false)
    public void setCaretHidden(com.facebook.react.views.textinput.c cVar, boolean z) {
        cVar.setCursorVisible(!z);
    }

    @com.facebook.react.uimanager.a.a(a = "selectTextOnFocus", f = false)
    public void setSelectTextOnFocus(com.facebook.react.views.textinput.c cVar, boolean z) {
        cVar.setSelectAllOnFocus(z);
    }

    @com.facebook.react.uimanager.a.a(a = "color", b = "Color")
    public void setColor(com.facebook.react.views.textinput.c cVar, Integer num) {
        if (num == null) {
            cVar.setTextColor(com.facebook.react.views.text.c.b(cVar.getContext()));
        } else {
            cVar.setTextColor(num.intValue());
        }
    }

    @com.facebook.react.uimanager.a.a(a = "underlineColorAndroid", b = "Color")
    public void setUnderlineColor(com.facebook.react.views.textinput.c cVar, Integer num) {
        Drawable background = cVar.getBackground();
        if (background.getConstantState() != null) {
            background = background.mutate();
        }
        if (num == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "textAlign")
    public void setTextAlign(com.facebook.react.views.textinput.c cVar, String str) {
        if (str == null || "auto".equals(str)) {
            cVar.setGravityHorizontal(0);
        } else if ("left".equals(str)) {
            cVar.setGravityHorizontal(3);
        } else if ("right".equals(str)) {
            cVar.setGravityHorizontal(5);
        } else if ("center".equals(str)) {
            cVar.setGravityHorizontal(1);
        } else if ("justify".equals(str)) {
            cVar.setGravityHorizontal(3);
        } else {
            throw new com.facebook.react.bridge.n("Invalid textAlign: " + str);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "textAlignVertical")
    public void setTextAlignVertical(com.facebook.react.views.textinput.c cVar, String str) {
        if (str == null || "auto".equals(str)) {
            cVar.setGravityVertical(0);
        } else if ("top".equals(str)) {
            cVar.setGravityVertical(48);
        } else if ("bottom".equals(str)) {
            cVar.setGravityVertical(80);
        } else if ("center".equals(str)) {
            cVar.setGravityVertical(16);
        } else {
            throw new com.facebook.react.bridge.n("Invalid textAlignVertical: " + str);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "inlineImageLeft")
    public void setInlineImageLeft(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setCompoundDrawablesWithIntrinsicBounds(com.facebook.react.views.b.c.a().a(cVar.getContext(), str), 0, 0, 0);
    }

    @com.facebook.react.uimanager.a.a(a = "inlineImagePadding")
    public void setInlineImagePadding(com.facebook.react.views.textinput.c cVar, int i) {
        cVar.setCompoundDrawablePadding(i);
    }

    @com.facebook.react.uimanager.a.a(a = "editable", f = true)
    public void setEditable(com.facebook.react.views.textinput.c cVar, boolean z) {
        cVar.setEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "numberOfLines", e = 1)
    public void setNumLines(com.facebook.react.views.textinput.c cVar, int i) {
        cVar.setLines(i);
    }

    @com.facebook.react.uimanager.a.a(a = "maxLength")
    public void setMaxLength(com.facebook.react.views.textinput.c cVar, Integer num) {
        InputFilter[] filters = cVar.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        if (num == null) {
            if (filters.length > 0) {
                LinkedList linkedList = new LinkedList();
                for (int i = 0; i < filters.length; i++) {
                    if (!(filters[i] instanceof InputFilter.LengthFilter)) {
                        linkedList.add(filters[i]);
                    }
                }
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else if (filters.length > 0) {
            boolean z = false;
            for (int i2 = 0; i2 < filters.length; i2++) {
                if (filters[i2] instanceof InputFilter.LengthFilter) {
                    filters[i2] = new InputFilter.LengthFilter(num.intValue());
                    z = true;
                }
            }
            if (!z) {
                inputFilterArr = new InputFilter[filters.length + 1];
                System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                filters[filters.length] = new InputFilter.LengthFilter(num.intValue());
            } else {
                inputFilterArr = filters;
            }
        } else {
            inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(num.intValue())};
        }
        cVar.setFilters(inputFilterArr);
    }

    @com.facebook.react.uimanager.a.a(a = "autoCorrect")
    public void setAutoCorrect(com.facebook.react.views.textinput.c cVar, Boolean bool) {
        int i;
        if (bool != null) {
            i = bool.booleanValue() ? 32768 : PKIFailureInfo.signerNotTrusted;
        } else {
            i = 0;
        }
        updateStagedInputTypeFlag(cVar, 557056, i);
    }

    @com.facebook.react.uimanager.a.a(a = "multiline", f = false)
    public void setMultiline(com.facebook.react.views.textinput.c cVar, boolean z) {
        int i = 131072;
        int i2 = z ? 0 : 131072;
        if (!z) {
            i = 0;
        }
        updateStagedInputTypeFlag(cVar, i2, i);
    }

    @com.facebook.react.uimanager.a.a(a = "secureTextEntry", f = false)
    public void setSecureTextEntry(com.facebook.react.views.textinput.c cVar, boolean z) {
        int i = 0;
        int i2 = z ? 0 : CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA;
        if (z) {
            i = 128;
        }
        updateStagedInputTypeFlag(cVar, i2, i);
        checkPasswordType(cVar);
    }

    @com.facebook.react.uimanager.a.a(a = "autoCapitalize")
    public void setAutoCapitalize(com.facebook.react.views.textinput.c cVar, int i) {
        updateStagedInputTypeFlag(cVar, 28672, i);
    }

    @com.facebook.react.uimanager.a.a(a = "keyboardType")
    public void setKeyboardType(com.facebook.react.views.textinput.c cVar, String str) {
        int i;
        if (KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(str)) {
            i = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(str)) {
            i = 33;
        } else if (KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(str)) {
            i = 3;
        } else {
            i = KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(str) ? CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA : 1;
        }
        updateStagedInputTypeFlag(cVar, 12323, i);
        checkPasswordType(cVar);
    }

    @com.facebook.react.uimanager.a.a(a = "returnKeyType")
    public void setReturnKeyType(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setReturnKeyType(str);
    }

    @com.facebook.react.uimanager.a.a(a = "disableFullscreenUI", f = false)
    public void setDisableFullscreenUI(com.facebook.react.views.textinput.c cVar, boolean z) {
        cVar.setDisableFullscreenUI(z);
    }

    @com.facebook.react.uimanager.a.a(a = "returnKeyLabel")
    public void setReturnKeyLabel(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setImeActionLabel(str, IME_ACTION_ID);
    }

    @com.facebook.react.uimanager.a.b(a = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"}, c = Float.NaN)
    public void setBorderRadius(com.facebook.react.views.textinput.c cVar, int i, float f) {
        if (!com.facebook.yoga.a.a(f)) {
            f = com.facebook.react.uimanager.o.a(f);
        }
        if (i == 0) {
            cVar.setBorderRadius(f);
        } else {
            cVar.a(f, i - 1);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "borderStyle")
    public void setBorderStyle(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setBorderStyle(str);
    }

    @com.facebook.react.uimanager.a.b(a = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"}, c = Float.NaN)
    public void setBorderWidth(com.facebook.react.views.textinput.c cVar, int i, float f) {
        if (!com.facebook.yoga.a.a(f)) {
            f = com.facebook.react.uimanager.o.a(f);
        }
        cVar.a(SPACING_TYPES[i], f);
    }

    @com.facebook.react.uimanager.a.b(a = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"}, b = "Color")
    public void setBorderColor(com.facebook.react.views.textinput.c cVar, int i, Integer num) {
        float f = Float.NaN;
        float intValue = num == null ? Float.NaN : num.intValue() & 16777215;
        if (num != null) {
            f = num.intValue() >>> 24;
        }
        cVar.a(SPACING_TYPES[i], intValue, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(com.facebook.react.views.textinput.c cVar) {
        super.onAfterUpdateTransaction((ReactTextInputManager) cVar);
        cVar.a();
    }

    private static void checkPasswordType(com.facebook.react.views.textinput.c cVar) {
        if ((cVar.getStagedInputType() & INPUT_TYPE_KEYBOARD_NUMBERED) == 0 || (cVar.getStagedInputType() & 128) == 0) {
            return;
        }
        updateStagedInputTypeFlag(cVar, 128, 16);
    }

    private static int parseNumericFontWeight(String str) {
        if (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') {
            return -1;
        }
        return (str.charAt(0) - '0') * 100;
    }

    private static void updateStagedInputTypeFlag(com.facebook.react.views.textinput.c cVar, int i, int i2) {
        cVar.setStagedInputType(((~i) & cVar.getStagedInputType()) | i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements TextWatcher {

        /* renamed from: b  reason: collision with root package name */
        private com.facebook.react.uimanager.events.c f4126b;

        /* renamed from: c  reason: collision with root package name */
        private com.facebook.react.views.textinput.c f4127c;

        /* renamed from: d  reason: collision with root package name */
        private String f4128d = null;

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        public d(aj ajVar, com.facebook.react.views.textinput.c cVar) {
            this.f4126b = ((UIManagerModule) ajVar.b(UIManagerModule.class)).getEventDispatcher();
            this.f4127c = cVar;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f4128d = charSequence.toString();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i3 == 0 && i2 == 0) {
                return;
            }
            com.facebook.j.a.a.b(this.f4128d);
            String substring = charSequence.toString().substring(i, i + i3);
            int i4 = i + i2;
            String substring2 = this.f4128d.substring(i, i4);
            if (i3 == i2 && substring.equals(substring2)) {
                return;
            }
            this.f4126b.a(new e(this.f4127c.getId(), charSequence.toString(), this.f4127c.d()));
            this.f4126b.a(new h(this.f4127c.getId(), substring, substring2, i, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final af afVar, final com.facebook.react.views.textinput.c cVar) {
        cVar.addTextChangedListener(new d(afVar, cVar));
        cVar.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.facebook.react.views.textinput.ReactTextInputManager.1
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                com.facebook.react.uimanager.events.c eventDispatcher = ((UIManagerModule) afVar.b(UIManagerModule.class)).getEventDispatcher();
                if (z) {
                    eventDispatcher.a(new i(cVar.getId()));
                    return;
                }
                eventDispatcher.a(new f(cVar.getId()));
                eventDispatcher.a(new g(cVar.getId(), cVar.getText().toString()));
            }
        });
        cVar.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.facebook.react.views.textinput.ReactTextInputManager.2
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if ((i & 255) > 0 || i == 0) {
                    boolean blurOnSubmit = cVar.getBlurOnSubmit();
                    boolean z = (cVar.getInputType() & 131072) != 0;
                    ((UIManagerModule) afVar.b(UIManagerModule.class)).getEventDispatcher().a(new n(cVar.getId(), cVar.getText().toString()));
                    if (blurOnSubmit) {
                        cVar.clearFocus();
                    }
                    return blurOnSubmit || !z;
                }
                return true;
            }
        });
    }

    /* loaded from: classes.dex */
    private class a implements com.facebook.react.views.textinput.a {

        /* renamed from: b  reason: collision with root package name */
        private com.facebook.react.views.textinput.c f4114b;

        /* renamed from: c  reason: collision with root package name */
        private com.facebook.react.uimanager.events.c f4115c;

        /* renamed from: d  reason: collision with root package name */
        private int f4116d = 0;
        private int e = 0;

        public a(com.facebook.react.views.textinput.c cVar) {
            this.f4114b = cVar;
            this.f4115c = ((UIManagerModule) ((aj) cVar.getContext()).b(UIManagerModule.class)).getEventDispatcher();
        }

        @Override // com.facebook.react.views.textinput.a
        public void a() {
            int width = this.f4114b.getWidth();
            int height = this.f4114b.getHeight();
            if (this.f4114b.getLayout() != null) {
                width = this.f4114b.getCompoundPaddingLeft() + this.f4114b.getLayout().getWidth() + this.f4114b.getCompoundPaddingRight();
                height = this.f4114b.getCompoundPaddingTop() + this.f4114b.getLayout().getHeight() + this.f4114b.getCompoundPaddingBottom();
            }
            if (width == this.f4116d && height == this.e) {
                return;
            }
            this.e = height;
            this.f4116d = width;
            this.f4115c.a(new com.facebook.react.views.textinput.b(this.f4114b.getId(), com.facebook.react.uimanager.o.c(width), com.facebook.react.uimanager.o.c(height)));
        }
    }

    /* loaded from: classes.dex */
    private class c implements p {

        /* renamed from: b  reason: collision with root package name */
        private com.facebook.react.views.textinput.c f4122b;

        /* renamed from: c  reason: collision with root package name */
        private com.facebook.react.uimanager.events.c f4123c;

        /* renamed from: d  reason: collision with root package name */
        private int f4124d;
        private int e;

        public c(com.facebook.react.views.textinput.c cVar) {
            this.f4122b = cVar;
            this.f4123c = ((UIManagerModule) ((aj) cVar.getContext()).b(UIManagerModule.class)).getEventDispatcher();
        }

        @Override // com.facebook.react.views.textinput.p
        public void a(int i, int i2) {
            if (this.f4124d == i && this.e == i2) {
                return;
            }
            this.f4123c.a(new l(this.f4122b.getId(), i, i2));
            this.f4124d = i;
            this.e = i2;
        }
    }

    /* loaded from: classes.dex */
    private class b implements o {

        /* renamed from: b  reason: collision with root package name */
        private com.facebook.react.views.textinput.c f4118b;

        /* renamed from: c  reason: collision with root package name */
        private com.facebook.react.uimanager.events.c f4119c;

        /* renamed from: d  reason: collision with root package name */
        private int f4120d;
        private int e;

        public b(com.facebook.react.views.textinput.c cVar) {
            this.f4118b = cVar;
            this.f4119c = ((UIManagerModule) ((aj) cVar.getContext()).b(UIManagerModule.class)).getEventDispatcher();
        }

        @Override // com.facebook.react.views.textinput.o
        public void a(int i, int i2, int i3, int i4) {
            if (this.f4120d == i && this.e == i2) {
                return;
            }
            this.f4119c.a(com.facebook.react.views.scroll.h.a(this.f4118b.getId(), com.facebook.react.views.scroll.i.SCROLL, i, i2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, this.f4118b.getWidth(), this.f4118b.getHeight()));
            this.f4120d = i;
            this.e = i2;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedViewConstants() {
        return com.facebook.react.b.f.a("AutoCapitalizationType", com.facebook.react.b.f.a("none", 0, "characters", 4096, "words", Integer.valueOf((int) PKIFailureInfo.certRevoked), "sentences", 16384));
    }
}
