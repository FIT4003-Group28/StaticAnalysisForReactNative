package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import com.facebook.react.b.f;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.al;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public class I18nManagerModule extends ContextBaseJavaModule {
    private final a sharedI18nUtilInstance;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "I18nManager";
    }

    public I18nManagerModule(Context context) {
        super(context);
        this.sharedI18nUtilInstance = a.a();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Context context = getContext();
        Locale locale = context.getResources().getConfiguration().locale;
        HashMap a2 = f.a();
        a2.put("isRTL", Boolean.valueOf(this.sharedI18nUtilInstance.a(context)));
        a2.put("doLeftAndRightSwapInRTL", Boolean.valueOf(this.sharedI18nUtilInstance.b(context)));
        a2.put("localeIdentifier", locale.toString());
        return a2;
    }

    @al
    public void allowRTL(boolean z) {
        this.sharedI18nUtilInstance.a(getContext(), z);
    }

    @al
    public void forceRTL(boolean z) {
        this.sharedI18nUtilInstance.c(getContext(), z);
    }

    @al
    public void swapLeftAndRightInRTL(boolean z) {
        this.sharedI18nUtilInstance.b(getContext(), z);
    }
}
