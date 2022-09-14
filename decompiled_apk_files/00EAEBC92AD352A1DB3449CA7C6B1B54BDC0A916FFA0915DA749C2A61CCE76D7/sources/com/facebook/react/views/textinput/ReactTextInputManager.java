package com.facebook.react.views.textinput;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.views.text.a0;
import com.facebook.react.views.text.b0;
import com.facebook.react.views.text.w;
import com.facebook.react.views.text.y;
import com.horcrux.svg.BuildConfig;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Map;
@com.facebook.react.d0.a.a(name = ReactTextInputManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactTextInputManager extends BaseViewManager<com.facebook.react.views.textinput.c, com.facebook.react.uimanager.i> {
    private static final int AUTOCAPITALIZE_FLAGS = 28672;
    private static final int BLUR_TEXT_INPUT = 2;
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final int KEYBOARD_TYPE_FLAGS = 12339;
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    private static final int PASSWORD_VISIBILITY_FLAG = 16;
    public static final String REACT_CLASS = "AndroidTextInput";
    private static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    private static final int SET_TEXT_AND_SELECTION = 4;
    public static final String TAG = "ReactTextInputManager";
    private static final int UNSET = -1;
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];

    /* loaded from: classes.dex */
    class a implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f6325b;

        a(ReactTextInputManager reactTextInputManager, boolean z) {
            this.f6325b = z;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return this.f6325b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements View.OnFocusChangeListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0 f6326b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.views.textinput.c f6327c;

        b(ReactTextInputManager reactTextInputManager, k0 k0Var, com.facebook.react.views.textinput.c cVar) {
            this.f6326b = k0Var;
            this.f6327c = cVar;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            com.facebook.react.uimanager.events.c gVar;
            com.facebook.react.uimanager.events.d eventDispatcher = ((UIManagerModule) this.f6326b.getNativeModule(UIManagerModule.class)).getEventDispatcher();
            if (z) {
                gVar = new i(this.f6327c.getId());
            } else {
                eventDispatcher.a(new com.facebook.react.views.textinput.f(this.f6327c.getId()));
                gVar = new com.facebook.react.views.textinput.g(this.f6327c.getId(), this.f6327c.getText().toString());
            }
            eventDispatcher.a(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.views.textinput.c f6328a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0 f6329b;

        c(ReactTextInputManager reactTextInputManager, com.facebook.react.views.textinput.c cVar, k0 k0Var) {
            this.f6328a = cVar;
            this.f6329b = k0Var;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if ((i & 255) != 0 || i == 0) {
                boolean blurOnSubmit = this.f6328a.getBlurOnSubmit();
                boolean f2 = this.f6328a.f();
                ((UIManagerModule) this.f6329b.getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new n(this.f6328a.getId(), this.f6328a.getText().toString()));
                if (blurOnSubmit) {
                    this.f6328a.clearFocus();
                }
                return blurOnSubmit || !f2 || i == 5 || i == 7;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    private class d implements com.facebook.react.views.textinput.a {

        /* renamed from: a  reason: collision with root package name */
        private com.facebook.react.views.textinput.c f6330a;

        /* renamed from: b  reason: collision with root package name */
        private com.facebook.react.uimanager.events.d f6331b;

        /* renamed from: c  reason: collision with root package name */
        private int f6332c = 0;

        /* renamed from: d  reason: collision with root package name */
        private int f6333d = 0;

        public d(ReactTextInputManager reactTextInputManager, com.facebook.react.views.textinput.c cVar) {
            this.f6330a = cVar;
            this.f6331b = ((UIManagerModule) ((ReactContext) cVar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        @Override // com.facebook.react.views.textinput.a
        public void a() {
            int width = this.f6330a.getWidth();
            int height = this.f6330a.getHeight();
            if (this.f6330a.getLayout() != null) {
                width = this.f6330a.getCompoundPaddingLeft() + this.f6330a.getLayout().getWidth() + this.f6330a.getCompoundPaddingRight();
                height = this.f6330a.getCompoundPaddingTop() + this.f6330a.getLayout().getHeight() + this.f6330a.getCompoundPaddingBottom();
            }
            if (width == this.f6332c && height == this.f6333d) {
                return;
            }
            this.f6333d = height;
            this.f6332c = width;
            this.f6331b.a(new com.facebook.react.views.textinput.b(this.f6330a.getId(), q.a(width), q.a(height)));
        }
    }

    /* loaded from: classes.dex */
    private class e implements o {

        /* renamed from: a  reason: collision with root package name */
        private com.facebook.react.views.textinput.c f6334a;

        /* renamed from: b  reason: collision with root package name */
        private com.facebook.react.uimanager.events.d f6335b;

        /* renamed from: c  reason: collision with root package name */
        private int f6336c;

        /* renamed from: d  reason: collision with root package name */
        private int f6337d;

        public e(ReactTextInputManager reactTextInputManager, com.facebook.react.views.textinput.c cVar) {
            this.f6334a = cVar;
            this.f6335b = ((UIManagerModule) ((ReactContext) cVar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        @Override // com.facebook.react.views.textinput.o
        public void a(int i, int i2, int i3, int i4) {
            if (this.f6336c == i && this.f6337d == i2) {
                return;
            }
            this.f6335b.a(com.facebook.react.views.scroll.h.b(this.f6334a.getId(), com.facebook.react.views.scroll.i.SCROLL, i, i2, 0.0f, 0.0f, 0, 0, this.f6334a.getWidth(), this.f6334a.getHeight()));
            this.f6336c = i;
            this.f6337d = i2;
        }
    }

    /* loaded from: classes.dex */
    private class f implements p {

        /* renamed from: a  reason: collision with root package name */
        private com.facebook.react.views.textinput.c f6338a;

        /* renamed from: b  reason: collision with root package name */
        private com.facebook.react.uimanager.events.d f6339b;

        /* renamed from: c  reason: collision with root package name */
        private int f6340c;

        /* renamed from: d  reason: collision with root package name */
        private int f6341d;

        public f(ReactTextInputManager reactTextInputManager, com.facebook.react.views.textinput.c cVar) {
            this.f6338a = cVar;
            this.f6339b = ((UIManagerModule) ((ReactContext) cVar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        @Override // com.facebook.react.views.textinput.p
        public void a(int i, int i2) {
            int min = Math.min(i, i2);
            int max = Math.max(i, i2);
            if (this.f6340c == min && this.f6341d == max) {
                return;
            }
            this.f6339b.a(new l(this.f6338a.getId(), min, max));
            this.f6340c = min;
            this.f6341d = max;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g implements TextWatcher {

        /* renamed from: b  reason: collision with root package name */
        private com.facebook.react.uimanager.events.d f6342b;

        /* renamed from: c  reason: collision with root package name */
        private com.facebook.react.views.textinput.c f6343c;

        /* renamed from: d  reason: collision with root package name */
        private String f6344d = null;

        public g(ReactTextInputManager reactTextInputManager, ReactContext reactContext, com.facebook.react.views.textinput.c cVar) {
            this.f6342b = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
            this.f6343c = cVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f6344d = charSequence.toString();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String str;
            int i4;
            int i5;
            int i6;
            String str2;
            String str3;
            int i7 = i;
            if (this.f6343c.D) {
                return;
            }
            if (i3 == 0 && i2 == 0) {
                return;
            }
            c.d.k.a.a.a(this.f6344d);
            int i8 = i7 + i3;
            String substring = charSequence.toString().substring(i7, i8);
            int i9 = i7 + i2;
            String substring2 = this.f6344d.substring(i7, i9);
            if (i3 == i2 && substring.equals(substring2)) {
                return;
            }
            JavaOnlyMap javaOnlyMap = this.f6343c.B;
            if (javaOnlyMap == null || !javaOnlyMap.hasKey("fragments")) {
                str = substring2;
                i4 = 0;
                i5 = i2;
            } else {
                String charSequence2 = charSequence.subSequence(i7, i8).toString();
                String string = javaOnlyMap.getString("string");
                StringBuilder sb = new StringBuilder();
                sb.append(string.substring(0, i7));
                sb.append(charSequence2);
                String str4 = "";
                sb.append(string.length() > i9 ? string.substring(i9) : str4);
                javaOnlyMap.putString("string", sb.toString());
                JavaOnlyArray javaOnlyArray = (JavaOnlyArray) javaOnlyMap.getArray("fragments");
                i5 = i2;
                String str5 = charSequence2;
                boolean z = false;
                int i10 = 0;
                int i11 = i7;
                int i12 = 0;
                while (i12 < javaOnlyArray.size() && !z) {
                    JavaOnlyMap javaOnlyMap2 = (JavaOnlyMap) javaOnlyArray.mo209getMap(i12);
                    boolean z2 = z;
                    String string2 = javaOnlyMap2.getString("string");
                    JavaOnlyArray javaOnlyArray2 = javaOnlyArray;
                    int length = i10 + string2.length();
                    if (length < i11) {
                        z = z2;
                        i6 = length;
                        str2 = substring2;
                        str3 = str4;
                    } else {
                        int i13 = i11 - i10;
                        i6 = length;
                        int length2 = string2.length() - i13;
                        StringBuilder sb2 = new StringBuilder();
                        str2 = substring2;
                        str3 = str4;
                        sb2.append(string2.substring(0, i13));
                        sb2.append(str5);
                        sb2.append(string2.substring(i13 + Math.min(i5, length2)));
                        javaOnlyMap2.putString("string", sb2.toString());
                        if (length2 < i5) {
                            i11 += length2;
                            i5 -= length2;
                            str5 = str3;
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    i12++;
                    i10 = i6;
                    str4 = str3;
                    javaOnlyArray = javaOnlyArray2;
                    substring2 = str2;
                }
                str = substring2;
                i4 = 0;
                i7 = i11;
            }
            if (this.f6343c.C != null && javaOnlyMap != null) {
                WritableMap writableNativeMap = new WritableNativeMap();
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                WritableNativeArray writableNativeArray = new WritableNativeArray();
                while (i4 < javaOnlyMap.getArray("fragments").size()) {
                    ReadableMap mo209getMap = javaOnlyMap.getArray("fragments").mo209getMap(i4);
                    WritableNativeMap writableNativeMap3 = new WritableNativeMap();
                    writableNativeMap3.putDouble("reactTag", mo209getMap.getInt("reactTag"));
                    writableNativeMap3.putString("string", mo209getMap.getString("string"));
                    writableNativeArray.pushMap(writableNativeMap3);
                    i4++;
                }
                writableNativeMap2.putString("string", javaOnlyMap.getString("string"));
                writableNativeMap2.putArray("fragments", writableNativeArray);
                writableNativeMap.putInt("mostRecentEventCount", this.f6343c.e());
                writableNativeMap.putMap("textChanged", writableNativeMap2);
                this.f6343c.C.a(writableNativeMap);
            }
            this.f6342b.a(new com.facebook.react.views.textinput.e(this.f6343c.getId(), charSequence.toString(), this.f6343c.e()));
            this.f6342b.a(new h(this.f6343c.getId(), substring, str, i7, i7 + i5));
        }
    }

    private static void checkPasswordType(com.facebook.react.views.textinput.c cVar) {
        if ((cVar.getStagedInputType() & INPUT_TYPE_KEYBOARD_NUMBERED) == 0 || (cVar.getStagedInputType() & 128) == 0) {
            return;
        }
        updateStagedInputTypeFlag(cVar, 128, 16);
    }

    private com.facebook.react.views.text.q getReactTextUpdate(String str, int i, int i2, int i3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) b0.a(str, b0.UNSET));
        return new com.facebook.react.views.text.q(spannableStringBuilder, i, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, i2, i3);
    }

    private int getTextBreakStrategy(String str) {
        if (str != null) {
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1924829944) {
                if (hashCode == -902286926 && str.equals("simple")) {
                    c2 = 0;
                }
            } else if (str.equals("balanced")) {
                c2 = 1;
            }
            if (c2 == 0) {
                return 0;
            }
            if (c2 == 1) {
                return 2;
            }
        }
        return 1;
    }

    private void setAutofillHints(com.facebook.react.views.textinput.c cVar, String... strArr) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        cVar.setAutofillHints(strArr);
    }

    private void setImportantForAutofill(com.facebook.react.views.textinput.c cVar, int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        cVar.setImportantForAutofill(i);
    }

    private static void updateStagedInputTypeFlag(com.facebook.react.views.textinput.c cVar, int i, int i2) {
        cVar.setStagedInputType(((~i) & cVar.getStagedInputType()) | i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(k0 k0Var, com.facebook.react.views.textinput.c cVar) {
        cVar.addTextChangedListener(new g(this, k0Var, cVar));
        cVar.setOnFocusChangeListener(new b(this, k0Var, cVar));
        cVar.setOnEditorActionListener(new c(this, cVar, k0Var));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance  reason: collision with other method in class */
    public com.facebook.react.uimanager.i mo328createShadowNodeInstance() {
        return new m();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public com.facebook.react.views.textinput.c mo345createViewInstance(k0 k0Var) {
        com.facebook.react.views.textinput.c cVar = new com.facebook.react.views.textinput.c(k0Var);
        cVar.setInputType(cVar.getInputType() & (-131073));
        cVar.setReturnKeyType("done");
        return cVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return com.facebook.react.common.f.a("focusTextInput", 1, "blurTextInput", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        f.b a2 = com.facebook.react.common.f.a();
        a2.a("topSubmitEditing", com.facebook.react.common.f.a("phasedRegistrationNames", com.facebook.react.common.f.a("bubbled", "onSubmitEditing", "captured", "onSubmitEditingCapture")));
        a2.a("topEndEditing", com.facebook.react.common.f.a("phasedRegistrationNames", com.facebook.react.common.f.a("bubbled", "onEndEditing", "captured", "onEndEditingCapture")));
        a2.a("topTextInput", com.facebook.react.common.f.a("phasedRegistrationNames", com.facebook.react.common.f.a("bubbled", "onTextInput", "captured", "onTextInputCapture")));
        a2.a("topFocus", com.facebook.react.common.f.a("phasedRegistrationNames", com.facebook.react.common.f.a("bubbled", "onFocus", "captured", "onFocusCapture")));
        a2.a("topBlur", com.facebook.react.common.f.a("phasedRegistrationNames", com.facebook.react.common.f.a("bubbled", "onBlur", "captured", "onBlurCapture")));
        a2.a("topKeyPress", com.facebook.react.common.f.a("phasedRegistrationNames", com.facebook.react.common.f.a("bubbled", "onKeyPress", "captured", "onKeyPressCapture")));
        return a2.a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        f.b a2 = com.facebook.react.common.f.a();
        a2.a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.SCROLL), com.facebook.react.common.f.a("registrationName", "onScroll"));
        return a2.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedViewConstants() {
        return com.facebook.react.common.f.a("AutoCapitalizationType", com.facebook.react.common.f.a("none", 0, "characters", 4096, "words", 8192, "sentences", 16384));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends com.facebook.react.uimanager.i> getShadowNodeClass() {
        return m.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(com.facebook.react.views.textinput.c cVar) {
        super.onAfterUpdateTransaction((ReactTextInputManager) cVar);
        cVar.g();
        cVar.c();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.textinput.c cVar, int i, ReadableArray readableArray) {
        String str;
        if (i == 1) {
            str = "focus";
        } else if (i == 2) {
            str = "blur";
        } else if (i == 3) {
            str = "setMostRecentEventCount";
        } else if (i != 4) {
            return;
        } else {
            str = "setTextAndSelection";
        }
        receiveCommand(cVar, str, readableArray);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.textinput.c cVar, String str, ReadableArray readableArray) {
        char c2;
        switch (str.hashCode()) {
            case -1699362314:
                if (str.equals("blurTextInput")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3027047:
                if (str.equals("blur")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 97604824:
                if (str.equals("focus")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1427010500:
                if (str.equals("setTextAndSelection")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1690703013:
                if (str.equals("focusTextInput")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1813033077:
                if (str.equals("setMostRecentEventCount")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1) {
            cVar.h();
        } else if (c2 == 2 || c2 == 3) {
            cVar.b();
        } else if (c2 == 4) {
            cVar.setMostRecentEventCount(readableArray.getInt(0));
        } else if (c2 != 5) {
        } else {
            int i = readableArray.getInt(0);
            cVar.setMostRecentEventCount(i);
            if (i == -1) {
                return;
            }
            String string = readableArray.getString(1);
            int i2 = readableArray.getInt(2);
            int i3 = readableArray.getInt(3);
            if (i3 == -1) {
                i3 = i2;
            }
            cVar.b(getReactTextUpdate(string, i, i2, i3));
        }
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(com.facebook.react.views.textinput.c cVar, boolean z) {
        cVar.setAllowFontScaling(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "autoCapitalize")
    public void setAutoCapitalize(com.facebook.react.views.textinput.c cVar, Dynamic dynamic) {
        int i = 16384;
        if (dynamic.getType() == ReadableType.Number) {
            i = dynamic.asInt();
        } else if (dynamic.getType() == ReadableType.String) {
            String asString = dynamic.asString();
            if (asString.equals("none")) {
                i = 0;
            } else if (asString.equals("characters")) {
                i = 4096;
            } else if (asString.equals("words")) {
                i = 8192;
            } else {
                asString.equals("sentences");
            }
        }
        updateStagedInputTypeFlag(cVar, AUTOCAPITALIZE_FLAGS, i);
    }

    @com.facebook.react.uimanager.e1.a(name = "autoCorrect")
    public void setAutoCorrect(com.facebook.react.views.textinput.c cVar, Boolean bool) {
        updateStagedInputTypeFlag(cVar, 557056, bool != null ? bool.booleanValue() ? 32768 : 524288 : 0);
    }

    @com.facebook.react.uimanager.e1.a(name = "blurOnSubmit")
    public void setBlurOnSubmit(com.facebook.react.views.textinput.c cVar, Boolean bool) {
        cVar.setBlurOnSubmit(bool);
    }

    @com.facebook.react.uimanager.e1.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(com.facebook.react.views.textinput.c cVar, int i, Integer num) {
        float f2 = Float.NaN;
        float intValue = num == null ? Float.NaN : num.intValue() & 16777215;
        if (num != null) {
            f2 = num.intValue() >>> 24;
        }
        cVar.a(SPACING_TYPES[i], intValue, f2);
    }

    @com.facebook.react.uimanager.e1.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(com.facebook.react.views.textinput.c cVar, int i, float f2) {
        if (!com.facebook.yoga.g.a(f2)) {
            f2 = q.b(f2);
        }
        if (i == 0) {
            cVar.setBorderRadius(f2);
        } else {
            cVar.a(f2, i - 1);
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "borderStyle")
    public void setBorderStyle(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setBorderStyle(str);
    }

    @com.facebook.react.uimanager.e1.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(com.facebook.react.views.textinput.c cVar, int i, float f2) {
        if (!com.facebook.yoga.g.a(f2)) {
            f2 = q.b(f2);
        }
        cVar.a(SPACING_TYPES[i], f2);
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = BuildConfig.DEBUG, name = "caretHidden")
    public void setCaretHidden(com.facebook.react.views.textinput.c cVar, boolean z) {
        cVar.setCursorVisible(!z);
    }

    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "color")
    public void setColor(com.facebook.react.views.textinput.c cVar, Integer num) {
        if (num == null) {
            cVar.setTextColor(com.facebook.react.views.text.d.a(cVar.getContext()));
        } else {
            cVar.setTextColor(num.intValue());
        }
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = BuildConfig.DEBUG, name = "contextMenuHidden")
    public void setContextMenuHidden(com.facebook.react.views.textinput.c cVar, boolean z) {
        cVar.setOnLongClickListener(new a(this, z));
    }

    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "cursorColor")
    public void setCursorColor(com.facebook.react.views.textinput.c cVar, Integer num) {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i = declaredField.getInt(cVar);
            if (i == 0) {
                return;
            }
            Drawable c2 = a.g.e.b.c(cVar.getContext(), i);
            if (num != null) {
                c2.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            }
            Drawable[] drawableArr = {c2, c2};
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(cVar);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, drawableArr);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = BuildConfig.DEBUG, name = "disableFullscreenUI")
    public void setDisableFullscreenUI(com.facebook.react.views.textinput.c cVar, boolean z) {
        cVar.setDisableFullscreenUI(z);
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "editable")
    public void setEditable(com.facebook.react.views.textinput.c cVar, boolean z) {
        cVar.setEnabled(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "fontFamily")
    public void setFontFamily(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setFontFamily(str);
    }

    @com.facebook.react.uimanager.e1.a(defaultFloat = 14.0f, name = "fontSize")
    public void setFontSize(com.facebook.react.views.textinput.c cVar, float f2) {
        cVar.setFontSize(f2);
    }

    @com.facebook.react.uimanager.e1.a(name = "fontStyle")
    public void setFontStyle(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setFontStyle(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "fontWeight")
    public void setFontWeight(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setFontWeight(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "importantForAutofill")
    public void setImportantForAutofill(com.facebook.react.views.textinput.c cVar, String str) {
        setImportantForAutofill(cVar, "no".equals(str) ? 2 : "noExcludeDescendants".equals(str) ? 8 : "yes".equals(str) ? 1 : "yesExcludeDescendants".equals(str) ? 4 : 0);
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(com.facebook.react.views.textinput.c cVar, boolean z) {
        cVar.setIncludeFontPadding(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "inlineImageLeft")
    public void setInlineImageLeft(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setCompoundDrawablesWithIntrinsicBounds(com.facebook.react.j0.b.c.a().b(cVar.getContext(), str), 0, 0, 0);
    }

    @com.facebook.react.uimanager.e1.a(name = "inlineImagePadding")
    public void setInlineImagePadding(com.facebook.react.views.textinput.c cVar, int i) {
        cVar.setCompoundDrawablePadding(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    @com.facebook.react.uimanager.e1.a(name = "keyboardType")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setKeyboardType(com.facebook.react.views.textinput.c r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "numeric"
            boolean r0 = r0.equalsIgnoreCase(r5)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L10
            r2 = 12290(0x3002, float:1.7222E-41)
            r5 = 12290(0x3002, float:1.7222E-41)
        Le:
            r2 = 0
            goto L59
        L10:
            java.lang.String r0 = "number-pad"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L1b
            r2 = 2
            r5 = 2
            goto Le
        L1b:
            java.lang.String r0 = "decimal-pad"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L28
            r2 = 8194(0x2002, float:1.1482E-41)
            r5 = 8194(0x2002, float:1.1482E-41)
            goto Le
        L28:
            java.lang.String r0 = "email-address"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L35
            r2 = 33
            r5 = 33
            goto Le
        L35:
            java.lang.String r0 = "phone-pad"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L40
            r2 = 3
            r5 = 3
            goto Le
        L40:
            java.lang.String r0 = "visible-password"
            boolean r5 = r0.equalsIgnoreCase(r5)
            if (r5 == 0) goto L4d
            r2 = 144(0x90, float:2.02E-43)
            r5 = 144(0x90, float:2.02E-43)
            goto Le
        L4d:
            int r5 = r4.getStagedInputType()
            r5 = r5 & 28672(0x7000, float:4.0178E-41)
            if (r5 == 0) goto L57
            r5 = 1
            goto L59
        L57:
            r5 = 1
            goto Le
        L59:
            if (r2 == 0) goto L5c
            goto L5e
        L5c:
            r1 = 12339(0x3033, float:1.729E-41)
        L5e:
            updateStagedInputTypeFlag(r4, r1, r5)
            checkPasswordType(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.setKeyboardType(com.facebook.react.views.textinput.c, java.lang.String):void");
    }

    @com.facebook.react.uimanager.e1.a(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(com.facebook.react.views.textinput.c cVar, float f2) {
        cVar.setLetterSpacingPt(f2);
    }

    @com.facebook.react.uimanager.e1.a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(com.facebook.react.views.textinput.c cVar, float f2) {
        cVar.setMaxFontSizeMultiplier(f2);
    }

    @com.facebook.react.uimanager.e1.a(name = "maxLength")
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

    @com.facebook.react.uimanager.e1.a(defaultInt = 0, name = "mostRecentEventCount")
    public void setMostRecentEventCount(com.facebook.react.views.textinput.c cVar, int i) {
        cVar.setMostRecentEventCount(i);
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = BuildConfig.DEBUG, name = "multiline")
    public void setMultiline(com.facebook.react.views.textinput.c cVar, boolean z) {
        int i = 0;
        int i2 = z ? 0 : 131072;
        if (z) {
            i = 131072;
        }
        updateStagedInputTypeFlag(cVar, i2, i);
    }

    @com.facebook.react.uimanager.e1.a(defaultInt = 1, name = "numberOfLines")
    public void setNumLines(com.facebook.react.views.textinput.c cVar, int i) {
        cVar.setLines(i);
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = BuildConfig.DEBUG, name = "onContentSizeChange")
    public void setOnContentSizeChange(com.facebook.react.views.textinput.c cVar, boolean z) {
        cVar.setContentSizeWatcher(z ? new d(this, cVar) : null);
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = BuildConfig.DEBUG, name = "onKeyPress")
    public void setOnKeyPress(com.facebook.react.views.textinput.c cVar, boolean z) {
        cVar.setOnKeyPress(z);
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = BuildConfig.DEBUG, name = "onScroll")
    public void setOnScroll(com.facebook.react.views.textinput.c cVar, boolean z) {
        cVar.setScrollWatcher(z ? new e(this, cVar) : null);
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = BuildConfig.DEBUG, name = "onSelectionChange")
    public void setOnSelectionChange(com.facebook.react.views.textinput.c cVar, boolean z) {
        cVar.setSelectionWatcher(z ? new f(this, cVar) : null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(com.facebook.react.views.textinput.c cVar, int i, int i2, int i3, int i4) {
        cVar.setPadding(i, i2, i3, i4);
    }

    @com.facebook.react.uimanager.e1.a(name = "placeholder")
    public void setPlaceholder(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setHint(str);
    }

    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "placeholderTextColor")
    public void setPlaceholderTextColor(com.facebook.react.views.textinput.c cVar, Integer num) {
        if (num == null) {
            cVar.setHintTextColor(com.facebook.react.views.text.d.c(cVar.getContext()));
        } else {
            cVar.setHintTextColor(num.intValue());
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "returnKeyLabel")
    public void setReturnKeyLabel(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setImeActionLabel(str, IME_ACTION_ID);
    }

    @com.facebook.react.uimanager.e1.a(name = "returnKeyType")
    public void setReturnKeyType(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setReturnKeyType(str);
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = BuildConfig.DEBUG, name = "secureTextEntry")
    public void setSecureTextEntry(com.facebook.react.views.textinput.c cVar, boolean z) {
        int i = 0;
        int i2 = z ? 0 : 144;
        if (z) {
            i = 128;
        }
        updateStagedInputTypeFlag(cVar, i2, i);
        checkPasswordType(cVar);
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = BuildConfig.DEBUG, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(com.facebook.react.views.textinput.c cVar, boolean z) {
        cVar.setSelectAllOnFocus(z);
    }

    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(com.facebook.react.views.textinput.c cVar, Integer num) {
        cVar.setHighlightColor(num == null ? com.facebook.react.views.text.d.b(cVar.getContext()) : num.intValue());
        setCursorColor(cVar, num);
    }

    @com.facebook.react.uimanager.e1.a(name = "textAlign")
    public void setTextAlign(com.facebook.react.views.textinput.c cVar, String str) {
        if (!"justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                cVar.setJustificationMode(0);
            }
            if (str == null || "auto".equals(str)) {
                cVar.setGravityHorizontal(0);
                return;
            } else if (!"left".equals(str)) {
                if ("right".equals(str)) {
                    cVar.setGravityHorizontal(5);
                    return;
                } else if ("center".equals(str)) {
                    cVar.setGravityHorizontal(1);
                    return;
                } else {
                    throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
                }
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            cVar.setJustificationMode(1);
        }
        cVar.setGravityHorizontal(3);
    }

    @com.facebook.react.uimanager.e1.a(name = "textAlignVertical")
    public void setTextAlignVertical(com.facebook.react.views.textinput.c cVar, String str) {
        int i;
        if (str == null || "auto".equals(str)) {
            i = 0;
        } else if ("top".equals(str)) {
            i = 48;
        } else if ("bottom".equals(str)) {
            i = 80;
        } else if (!"center".equals(str)) {
            throw new JSApplicationIllegalArgumentException("Invalid textAlignVertical: " + str);
        } else {
            i = 16;
        }
        cVar.setGravityVertical(i);
    }

    @com.facebook.react.uimanager.e1.a(name = "autoCompleteType")
    public void setTextContentType(com.facebook.react.views.textinput.c cVar, String str) {
        if (str != null) {
            if ("username".equals(str)) {
                setAutofillHints(cVar, "username");
                return;
            } else if ("password".equals(str)) {
                setAutofillHints(cVar, "password");
                return;
            } else if ("email".equals(str)) {
                setAutofillHints(cVar, "emailAddress");
                return;
            } else if ("name".equals(str)) {
                setAutofillHints(cVar, "name");
                return;
            } else if ("tel".equals(str)) {
                setAutofillHints(cVar, "phone");
                return;
            } else if ("street-address".equals(str)) {
                setAutofillHints(cVar, "postalAddress");
                return;
            } else if ("postal-code".equals(str)) {
                setAutofillHints(cVar, "postalCode");
                return;
            } else if ("cc-number".equals(str)) {
                setAutofillHints(cVar, "creditCardNumber");
                return;
            } else if ("cc-csc".equals(str)) {
                setAutofillHints(cVar, "creditCardSecurityCode");
                return;
            } else if ("cc-exp".equals(str)) {
                setAutofillHints(cVar, "creditCardExpirationDate");
                return;
            } else if ("cc-exp-month".equals(str)) {
                setAutofillHints(cVar, "creditCardExpirationMonth");
                return;
            } else if ("cc-exp-year".equals(str)) {
                setAutofillHints(cVar, "creditCardExpirationYear");
                return;
            } else if (!"off".equals(str)) {
                throw new JSApplicationIllegalArgumentException("Invalid autoCompleteType: " + str);
            }
        }
        setImportantForAutofill(cVar, 2);
    }

    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "underlineColorAndroid")
    public void setUnderlineColor(com.facebook.react.views.textinput.c cVar, Integer num) {
        Drawable background = cVar.getBackground();
        if (background.getConstantState() != null) {
            try {
                background = background.mutate();
            } catch (NullPointerException e2) {
                c.d.d.e.a.b(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e2);
            }
        }
        if (num == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "showSoftInputOnFocus")
    public void showKeyboardOnFocus(com.facebook.react.views.textinput.c cVar, boolean z) {
        cVar.setShowSoftInputOnFocus(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(com.facebook.react.views.textinput.c cVar, Object obj) {
        if (obj instanceof com.facebook.react.views.text.q) {
            com.facebook.react.views.text.q qVar = (com.facebook.react.views.text.q) obj;
            int e2 = (int) qVar.e();
            int g2 = (int) qVar.g();
            int f2 = (int) qVar.f();
            int d2 = (int) qVar.d();
            if (e2 != -1 || g2 != -1 || f2 != -1 || d2 != -1) {
                if (e2 == -1) {
                    e2 = cVar.getPaddingLeft();
                }
                if (g2 == -1) {
                    g2 = cVar.getPaddingTop();
                }
                if (f2 == -1) {
                    f2 = cVar.getPaddingRight();
                }
                if (d2 == -1) {
                    d2 = cVar.getPaddingBottom();
                }
                cVar.setPadding(e2, g2, f2, d2);
            }
            if (qVar.a()) {
                y.a(qVar.j(), cVar);
            }
            cVar.c(qVar);
            if (qVar.i() == -1 || qVar.h() == -1) {
                return;
            }
            cVar.setSelection(qVar.i(), qVar.h());
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(com.facebook.react.views.textinput.c cVar, c0 c0Var, j0 j0Var) {
        ReadableNativeMap state = j0Var.getState();
        ReadableNativeMap mo210getMap = state.mo210getMap("attributedString");
        ReadableNativeMap mo210getMap2 = state.mo210getMap("paragraphAttributes");
        Spannable b2 = a0.b(cVar.getContext(), mo210getMap);
        w wVar = new w(c0Var);
        int textBreakStrategy = getTextBreakStrategy(mo210getMap2.getString("textBreakStrategy"));
        cVar.C = j0Var;
        return com.facebook.react.views.text.q.a(b2, state.getInt("mostRecentEventCount"), false, wVar.c(), textBreakStrategy, 0, mo210getMap);
    }
}
